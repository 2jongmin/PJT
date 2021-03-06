package comeit.framework.common.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

import comeit.framework.common.enums.ServerDivisionEnum;

public class ApplicationProperty {
  protected final Logger log = LoggerFactory.getLogger(ApplicationProperty.class);
  private Properties props = new Properties();
  private Map<String, String> propertyMap = new HashMap<String, String>();
  private Map<String, String> serverInfoMap = new HashMap<String, String>();
  private ServerDivisionEnum serverDivn;
  
  public ApplicationProperty(Resource resource) throws IOException {
    // 프로퍼티 파일을 메모리에 로드
    File file = resource.getFile();
    FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
    props.load(new BufferedInputStream(fis));
    
    // 서버정보 로드
    loadServerInfo();
    
    // 현재서버의 구분을 설정 한다.
    setServerDivn();
    
    // 프로퍼티를 맵으로 로드
    loadProperties();
  }
  
  private void loadProperties() {
    Enumeration<Object> en =  props.keys();
    
    String key = null;
    String value = null;
    String varKey = null;
    String varValue = null;
    String temp = null;
    
    HashMap<String, String> varMap = new HashMap<String, String>();
    while(en.hasMoreElements()) {
      // 변수의 값들 먼저 맵에 로드
      key = (String)en.nextElement();
      
      if(key.indexOf("var") > -1) {
        varMap.put(key, props.getProperty(key));
        
        props.remove(key);
      }
    }
    
    en =  props.keys();
    
    while(en.hasMoreElements()) {
      key = (String)en.nextElement();
      value = props.getProperty(key);
      
      log.debug("==================================");
      log.debug("key : {}", key);
      log.debug("value : {}", value);
      if(value.contains("var")) {
        log.debug(" ========> 변수 발견");
        // 변수 처리
        varKey = value.substring(value.indexOf(".") + 1, value.indexOf("}"));
        
        log.info("varKey : {}", varKey);
        
        // 서버 구분에 맞게 prefix 설정
        if(serverDivn == ServerDivisionEnum.REAL_SERVER) {
          new String();
          varKey = String.format("%s.%s.%s", "var", ServerDivisionEnum.REAL_SERVER.getPrefix(), varKey);
        } else if(serverDivn == ServerDivisionEnum.STAGING_SERVER) {
          varKey = String.format("%s.%s.%s", "var", ServerDivisionEnum.STAGING_SERVER.getPrefix(), varKey);
        } else if(serverDivn == ServerDivisionEnum.DEV_SERVER) {
          varKey = String.format("%s.%s.%s", "var", ServerDivisionEnum.DEV_SERVER.getPrefix(), varKey);
        } else {
          varKey = String.format("%s.%s.%s", "var", ServerDivisionEnum.LOCAL_SERVER.getPrefix(), varKey);
        }
        
        
        // value에서 변수 스트링 제거
        temp = value.substring(value.indexOf("}") + 1, value.length());
        varValue = varMap.get(varKey);
        
        log.debug("key : " + varKey + ", value : " + varValue + temp);
        
        value = varValue + temp;
        
        log.debug("변수 property name : " + varKey);
        log.debug("완성된 property value : " + value);
      } else {
        //System.out.println("");
      }
      
      log.debug("key : " + key);
      log.debug("value : " + value);
      log.debug("==================================");
      
      propertyMap.put(key, value);
    }
  }
  
  /**
   * 프로퍼티에서 서버의 정보를 맵에 로드한 후 프로퍼티에서 제거한다.
   */
  private void loadServerInfo() {
    Enumeration<Object> en =  props.keys();
    
    String key = null;
    
    while(en.hasMoreElements()) {
      key = (String)en.nextElement();
      
      if(key.indexOf("server.info") > -1) {
        serverInfoMap.put(key, props.getProperty(key));
        
        props.remove(key);
      }
    }
    
    for(String temp : serverInfoMap.keySet() ){
      log.info("{} : {}", temp, serverInfoMap.get(temp));
    }
  }
  
  /**
   * 관리대상 프로퍼티값 반환
   * @param key
   * @return
   * <br />
   * @author  김현식
   * @version 1.0, 2011. 3. 14.
   * @since   2011. 3. 14.
   */
  public String getProperty(String key) {
    String value = propertyMap.get(key);
    
    if(StringUtils.isEmpty(value)) {
      //log.info("Get Property Key : {}.{}", serverDivn.getPrefix(), key);
      value = propertyMap.get(String.format("%s.%s", serverDivn.getPrefix(), key));
    }
    
    return value;
  }
  
  private void setServerDivn() {
    try {
      // 프로퍼티에 jar 파일 절대경로 정보가 있는 경우 경로로 개발/운영/로컬 여부를 판단한다.
      if(StringUtils.isNotEmpty(serverInfoMap.get("server.info.real.jar.path"))) {
        // 현재 클래스의 절대 경로를 가져온다.
        String path = getClass().getResource("").getPath();
        log.info(path);
        
        log.info("=============");
        if(path.indexOf(serverInfoMap.get("server.info.real.jar.path")) > -1) {
          log.info("운영");
          //propertyMap.put("serverDivn", REAL_SERVER);
          this.serverDivn = ServerDivisionEnum.REAL_SERVER;
        } else if(path.indexOf(serverInfoMap.get("server.info.dev.jar.path")) > -1) {
          log.info("개발");
          //propertyMap.put("serverDivn", DEV_SERVER);
          this.serverDivn = ServerDivisionEnum.DEV_SERVER;
        } else if(path.indexOf(serverInfoMap.get("server.info.staging.jar.path")) > -1) {
          log.info("스테이징");
          //propertyMap.put("serverDivn", STAGING_SERVER);
          this.serverDivn = ServerDivisionEnum.STAGING_SERVER;
        } else {
          log.info("로컬");
          //propertyMap.put("serverDivn", LOCAL_SERVER);
          this.serverDivn = ServerDivisionEnum.LOCAL_SERVER;
        }
        log.info("=============");
      } else {
        // 현재 서버의 정보를 알아낸다.
        InetAddress[] local = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
        
        String ipAddress = null;
        String hostName = null;
        
        if(local.length > 1) {
          ipAddress = local[1].getHostAddress();
          hostName = local[1].getHostName();
        } else {  
          ipAddress = local[0].getHostAddress();
          hostName = local[0].getHostName();
        }
        
        log.info("====================================");
        log.info("서버 IP : " + ipAddress);
        log.info("서버 HOST NAME : " + hostName);
        
        if(hostName.equals(serverInfoMap.get("server.info.real.server.host.name"))) {           // 운영
          log.info("현재 운영(real)서버 입니다.");
          //propertyMap.put("serverDivn", "2");
          this.serverDivn = ServerDivisionEnum.REAL_SERVER;
        } else if(hostName.equals(serverInfoMap.get("server.info.dev.server.host.name"))) {    // 개발
          log.info("현재 개발(dev)서버 입니다.");
          //propertyMap.put("serverDivn", "1");
          this.serverDivn = ServerDivisionEnum.DEV_SERVER;
        } else {
          log.info("현재 로컬(local)서버 입니다.");
          //propertyMap.put("serverDivn", "3");
          this.serverDivn = ServerDivisionEnum.LOCAL_SERVER;
        }
        log.info("====================================");
      }
    } catch(UnknownHostException ex) {
      log.error("", ex);
    }
  }
  
  public ServerDivisionEnum getServerDivn() {
    return this.serverDivn;
  }
}
