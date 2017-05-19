package comeit.framework.common.aop;

import java.util.HashMap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

//@Aspect
public class ControllerAspect {
//  @Around("execution(* *..*Controller.*(..))")
  public Object test(ProceedingJoinPoint joinPoint) throws Throwable {
    String type = joinPoint.getSignature().getDeclaringTypeName();
    
    System.out.println("type : " + type);
    
    return joinPoint.proceed();
  }
  
  //@AfterReturning(pointcut="execution(* *..*Controller.*(..))", returning="retVal")
//  @AfterReturning(pointcut="execution(* *.*.controller.*.*(..))", returning="retVal")
  public void afterReturning(JoinPoint joinPoint, Object retVal) {
    @SuppressWarnings("unchecked")
    HashMap<String, String> map = (HashMap<String, String>)retVal;
    map.put("errorCode", "errorrrrrrr");
    System.out.println("AspectUsingAnnotation.afterReturningTargetMethod executed." + " return value is [" + retVal + "]");
  }
}
