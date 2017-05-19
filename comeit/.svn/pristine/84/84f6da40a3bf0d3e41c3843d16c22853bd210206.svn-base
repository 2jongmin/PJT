package comeit.framework.common.exception;

public class FrameworkException extends Exception {
  private static final long serialVersionUID = 5008395364046355388L;
  /**
   * Exception 정의
   */
  @SuppressWarnings("unused")
  private Exception exception;

  private String code;
  private String msg;

  public FrameworkException() {
    super();
    this.exception = null;
  }

  public FrameworkException(String code) {
    super();
    this.exception = null;
    this.code = code;
  }

  public FrameworkException(String code, String msg) {
    super(msg);
    this.exception = null;
    this.code = code;
    this.msg = msg;
  }

  public FrameworkException(Exception e) {
    super();
    this.exception = e;
  }

  public FrameworkException(String msg, Exception e) {
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
