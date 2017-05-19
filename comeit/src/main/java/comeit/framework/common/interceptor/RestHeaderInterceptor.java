package comeit.framework.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RestHeaderInterceptor extends HandlerInterceptorAdapter {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    
    /*@SuppressWarnings("unchecked")
    Enumeration<String> headers =  request.getHeaderNames();
        
    while(headers.hasMoreElements()) {
      String key = headers.nextElement();
      
      //log.info("header-key : {}" ,  key);
      //log.debug("header-value : {}", request.getHeader(key));
    }*/
    
    /*boolean emptyAprToken=  StringUtils.isEmpty(request.getHeader("TOKEN"));
    boolean emptyAprSeq   = StringUtils.isEmpty(request.getHeader("SEQ"));
    
    if(emptyAprToken || emptyAprSeq) {
      log.debug("필수 키가 없습니다.");
      throw new FrameworkException();
    } else {
      return true;
    }*/
    return true;
  }
}
