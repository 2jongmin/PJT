package comeit.framework.common.enums;

/**
 * 어플리케이션 전체에서 사용되는 코드 enum
 * DB에서 관리될 필요가 없고, 자주 바뀌지 않고, 여러 업무에서 공통적으로 사용되는 코드 집합
 * @author linuxp
 *
 */
public enum LoginTypeCodeEnum {
  /**
   * 현재 어플리케이션의 회원 그룹코드
   * 올때그거는 사용자, 사장님, 관리자 서버를 물리적으로 나눠서 운영한다.
   */
  MEMBER_GROUP_CODE("00010", "MEMBER"),
  API_FACEBOOK_CODE("00001", "FACEBOOK"),
  API_KAKAO_CODE("00002", "KAKAO"),
  API_NAVER_CODE("00003", "NAVER"),
  API_COMEIT_CODE("00004", "COMEIT"),
  API_GOOGLE_CODE("00005", "GOOGLE")
  ;
  
  private String code;
  private String value;
  
  private LoginTypeCodeEnum(String code, String value) {
    this.code = code;
    this.value = value;
  }
  
  private LoginTypeCodeEnum(String code) {
    this.code = code;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getValue() {
    return value;
  }
  
  @Override
  public String toString() {
    return this.getValue();
  }
  
  /**
   * value로 enum을 찾아 반환
   * @param value
   * @return
   */
  public static LoginTypeCodeEnum getEnumByValue(String value) {
    for(LoginTypeCodeEnum e : values()) {
      if(e.getValue().equalsIgnoreCase(value)) {
        return e;
      }
    }
    
    throw new IllegalArgumentException();
  }
  
  /**
   * code로 enum을 찾아 반환
   * @param code
   * @return
   */
  public static LoginTypeCodeEnum getEnumByCode(String code) {
    for(LoginTypeCodeEnum e : values()) {
      if(e.getCode().equalsIgnoreCase(code)) {
        return e;
      }
    }
    
    throw new IllegalArgumentException();
  }
}
