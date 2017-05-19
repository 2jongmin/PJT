package comeit.framework.common.aop;

import org.aopalliance.intercept.Joinpoint;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import comeit.framework.common.exception.AuthorizedExceptionProperties;
import comeit.framework.common.exception.BizExceptionProperties;
import comeit.framework.common.exception.FrameworkException;

/**
 * BizExceptionProperties과 FrameworkException에 대한 Aspect 이다.
 * 해당 예외 발생시 코드를 추출해 코드에 해당하는 메세지를 익셉션 객체에 세팅한다.
 * 
 * @author linuxp
 *
 */
@Aspect
public class ExceptionAspect {
  //@Resource(name="message")
  //private Message message;
  
  /**
   * Service 단어가 포함된 모든 클래스에서 예외가 던져지면 여기서 잡아 예외를 가공해 다시 던진다.
   * 
   * @param joinPoint
   * @param ex
   */
  @AfterThrowing(pointcut="execution(* *..*Service.*(..))", throwing="ex")
  public void afterThrowing(Joinpoint joinPoint, Throwable ex) {
    if(ex instanceof BizExceptionProperties || ex instanceof AuthorizedExceptionProperties) {
      BizExceptionProperties be = (BizExceptionProperties)ex;
      if(StringUtils.isNotEmpty(be.getCode())) {
        //be.setMsg(message.getMessage(be.getCode()));
      }
    } else if(ex instanceof FrameworkException) {
      if(StringUtils.isNotEmpty(((FrameworkException)ex).getCode())) {
        //((FrameworkException)ex).setMsg(message.getMessage(((FrameworkException)ex).getCode()));
      }
    }
  }
}
