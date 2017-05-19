package comeit.framework.common.enums;

/**
 * ApplicationProperty에서 사용하는 서버 구분 열거형
 * @author linuxp
 *
 */
public enum ServerDivisionEnum {
  LOCAL_SERVER("LOCAL_SERVER", "local"),
  DEV_SERVER("DEV_SERVER", "dev"),
  STAGING_SERVER("STAGING_SERVER", "staging"),
  REAL_SERVER("REAL_SERVER", "real")
  ;
  
  private String value;
  private String prefix;
  
  private ServerDivisionEnum(String value, String prefix) {
    this.value = value;
    this.prefix = prefix;
  }
  
  private ServerDivisionEnum(String value) {
    this.value = value;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public String getPrefix() {
    return prefix;
  }
}
