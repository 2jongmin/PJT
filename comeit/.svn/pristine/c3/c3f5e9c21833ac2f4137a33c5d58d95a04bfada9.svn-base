package comeit.framework.common.exception;

public class BizException extends Exception {
  private static final long serialVersionUID = 2223941889063651784L;
  
  /**
   * Exception 정의
   */
  @SuppressWarnings("unused")
  private Exception exception;

  private String code;
  private String msg;

  public BizException() {
    super();
    this.exception = null;
  }

  /*public BizException(String msg) {
    super(msg);
    this.msg = msg;
    this.exception = null;
  }*/
  public BizException(String msg) {
    super();
    this.msg = msg;
    this.exception = null;
  }

  public BizException(String code, String msg) {
    super(msg);
    this.exception = null;
    this.code = code;
    this.msg = msg;
  }

  public BizException(Exception e) {
    super();
    this.exception = e;
  }

  public BizException(String msg, Exception e) {
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
