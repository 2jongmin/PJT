package comeit.framework.common.exception;

/**
 * Exception 처리를 담당한다. <br />
 * 생성자의 인자는 message_common_언어.properties에 등록된 메세지 코드이다. <br />
 * message_common_언어.properties 파일을 사용하지 않을 경우 BizException 클래스를 사용한다. <br />
 * @author	linuxp
 * @version	1.0,   2010. 02. 03
 * @since 2010. 02. 03
 */
public class BizExceptionProperties extends Exception {
  private static final long serialVersionUID = 5008395364046355388L;
  
  /**
   * Exception 정의
   */
  protected Exception exception;

  protected String code;
  protected String msg;
  protected String[] msgArgs;

  public BizExceptionProperties() {
    super();
    this.exception = null;
  }

  /*public BizException(String msg) {
    super(msg);
    this.msg = msg;
    this.exception = null;
  }*/
  public BizExceptionProperties(String code) {
    super();
    this.code = code;
    this.exception = null;
  }
  
  public BizExceptionProperties(String code, String msg) {
    super(msg);
    this.exception = null;
    this.code = code;
    this.msg = msg;
  }
  
  public BizExceptionProperties(Exception e) {
    super();
    this.exception = e;
  }

  public BizExceptionProperties(String msg, Exception e) {
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

  public String[] getMsgArgs() {
    return msgArgs;
  }

  public void setMsgArgs(String[] msgArgs) {
    this.msgArgs = msgArgs;
  }
}

