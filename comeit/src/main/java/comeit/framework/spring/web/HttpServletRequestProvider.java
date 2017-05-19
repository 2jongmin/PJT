package comeit.framework.spring.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 현재 Thread에 저장된 HttpServletRequest를 반환하는 Class
 * comeit.framework.configure.initializer.ApplicationInitializer 클래스에 listener로 등록이 되어야 한다.
 * @author linuxp
 *
 */
public abstract class HttpServletRequestProvider {
  /**
   * 현재 ThreadLocal에 저장된 HttpServletRequest를 가져온다.
   * ThreadLocal에 저장된 HttpServletRequest가 없으면 null을 반환한다.
   * @return
   */
  public static HttpServletRequest getHttpServletRequest(){
    ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
    
    if(requestAttributes != null){
      return requestAttributes.getRequest();
    }
    
    return null;
  }
}
