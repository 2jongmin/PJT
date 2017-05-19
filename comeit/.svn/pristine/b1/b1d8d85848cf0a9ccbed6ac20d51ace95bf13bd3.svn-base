package comeit.framework.common.enums;

import org.springframework.http.HttpStatus;

public enum HttpReturnCodeEnum {
  SUCCESS("Y", "SUCCESS", HttpStatus.OK),
  FAIL("N", "FAIL", HttpStatus.INTERNAL_SERVER_ERROR),
  LOGIN_FAIL("N", "FAIL", HttpStatus.UNAUTHORIZED);
  
  private String resultCode;
  private String resultLongCode;
  private HttpStatus httpStatusCode;
  
  private HttpReturnCodeEnum(String resultCode, String resultLongCode, HttpStatus httpStatusCode) {
    this.resultCode = resultCode;
    this.resultLongCode = resultLongCode;
    this.httpStatusCode = httpStatusCode;
  }

  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public String getResultLongCode() {
    return resultLongCode;
  }

  public void setResultLongCode(String resultLongCode) {
    this.resultLongCode = resultLongCode;
  }

  public HttpStatus getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(HttpStatus httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }
}
