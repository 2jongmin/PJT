package comeit.framework.common.exception;

public class AuthorizedExceptionProperties extends BizExceptionProperties {
  private static final long serialVersionUID = -2039217087691705421L;

  /**
   * Exception 정의
   */
  @SuppressWarnings("unused")
  private Exception exception;

  public AuthorizedExceptionProperties() {
    super();
    this.exception = null;
  }
  
  public AuthorizedExceptionProperties(String code) {
    super();
    this.exception = null;
    this.code = code;
  }
  
  public AuthorizedExceptionProperties(String code, String msg) {
    super();
    this.exception = null;
    this.code = code;
    this.msg = msg;
  }
  
  public AuthorizedExceptionProperties(Exception e) {
    super();
    this.exception = e;
  }

  public AuthorizedExceptionProperties(String msg, Exception e) {
    super(msg);
    this.exception = e;
    this.msg = msg;
  }
  
  /**
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * @return the msg
   */
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
