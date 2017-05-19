package comeit.framework.common.exception;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import comeit.framework.common.enums.HttpReturnCodeEnum;
import comeit.framework.common.utils.ComeitMessage;

@ControllerAdvice
public class RestExceptionHandler {
  private Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);
  
  @Autowired
  private ComeitMessage message;
  
  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Map<String, Object> handleNoSuchRequestHandlingMethodException(Exception ex) {
    // 500에러
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), message.getMessage("err.system.msg001"));  
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.system.msg001"));
  }
  
  @ExceptionHandler(BizException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Map<String, Object> handleBizException(BizException ex) {
    // 500에러
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), message.getMessage("err.system.msg001"));  
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), ex.getMsg());
  }
  
  @ExceptionHandler(BizExceptionProperties.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Map<String, Object> handleBizExceptionForMessage(BizExceptionProperties ex) {
    // 500에러
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), message.getMessage("err.system.msg001"));  
    //return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), ex.getMsg());
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage(ex.getCode()));
  }
  
  @ExceptionHandler(FrameworkException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Map<String, Object> handleFrameworkException(FrameworkException ex) {
    // 500에러
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), message.getMessage("err.system.msg001"));  
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), ex.getMsg());
  }
  
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public Map<String, Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
    //logger.debug("400 에러(Exception)");
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.CONFLICT.value(), message.getMessage("err.system.msg001"));  
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.system.msg001"));
  }
  
  @ExceptionHandler(BadRequestException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public Map<String, Object> handleBadRequestException(BadRequestException ex) {
    // 400에러
    //log.error("", ex);
    
    //return createErrorMap(HttpStatus.BAD_REQUEST.value(), message.getMessage("err.http.400"));
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.http.400"));
  }
  
  @ExceptionHandler(TypeMismatchException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public Map<String, Object> handleTypeMismatchException(TypeMismatchException ex) {
    // 400에러
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.BAD_REQUEST.value(), message.getMessage("err.http.400"));
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.http.400"));
  }
  
  /*@ExceptionHandler(NoSuchRequestHandlingMethodException.class)
  @ResponseStatus(HttpStatus.FORBIDDEN)
  @ResponseBody
  public Map<String, Object> handleNoSuchRequestHandlingMethodException(NoSuchRequestHandlingMethodException ex) {
    //logger.debug("404 에러");
    
    return createErrorMap(HttpStatus.NOT_FOUND.value(), message.getMessage("err.http.404"));
  }*/
  
  @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ResponseBody
  public Map<String, Object> handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException ex) {
    //logger.debug("404 에러");
    
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.http.404"));
  }
  
  @ExceptionHandler(NoSuchRequestHandlingMethodException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ResponseBody
  public Map<String, Object> handleNoSuchRequestHandlingMethodException(NoSuchRequestHandlingMethodException ex) {
    //logger.debug("404 에러");
    
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.http.404"));
  }
  
  @ExceptionHandler(JsonParseException.class)
  @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
  @ResponseBody
  public Map<String, Object> handleJsonParseException(JsonParseException ex) {
    //logger.debug("409 에러(Exception)");
    log.error("", ex);
    
    //return createErrorMap(HttpStatus.CONFLICT.value(), message.getMessage("err.system.msg001"));  
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.system.msg001"));
  }
  
  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
  @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
  @ResponseBody
  public Map<String, Object> handleMethodNotAllowedException(HttpRequestMethodNotSupportedException ex) {
    // 405
    log.error("", ex);
    
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), message.getMessage("err.http.405"));
  }
  
  @ExceptionHandler(AuthorizedExceptionProperties.class)
  @ResponseStatus(HttpStatus.UNAUTHORIZED)
  @ResponseBody
  public Map<String, Object> handleAuthorizedExceptionException(AuthorizedExceptionProperties ex) {
    // 401
    log.error("", ex);
    
    return createErrorMap(HttpReturnCodeEnum.FAIL.getResultCode(), ex.getMsg());
  }
  
  /**
   * 
   * Excpetion 맵을 생성
   * 
   * @param value
   * @param movedPermanentlyCode
   * @param errorMessage
   * @return
   */
  private Map<String, Object> createErrorMap(String resultCode, String resultMessage) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("resultCode", resultCode);
    map.put("resultMessage", resultMessage);
    
    return map;
  }
}