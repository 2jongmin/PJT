package comeit.comeit.member.vo;

import comeit.framework.common.abstracts.vo.BaseVO;

public class MemberVO extends BaseVO {
  private static final long serialVersionUID = 8427618394996373650L;
  private String userSeq;
  private String joinClassifyCode;
  private String email;
  private String apiUuid;
  private String accessToken;
  private String password;
  private String nickName;
  private String localeCode;
  private String intro;
  private String joinDtime;
  private String lastLoginDtime;
  private String loginType;
  
  public String getUserSeq() {
    return userSeq;
  }
  public void setUserSeq(String userSeq) {
    this.userSeq = userSeq;
  }
  public String getJoinClassifyCode() {
    return joinClassifyCode;
  }
  public void setJoinClassifyCode(String joinClassifyCode) {
    this.joinClassifyCode = joinClassifyCode;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getApiUuid() {
    return apiUuid;
  }
  public void setApiUuid(String apiUuid) {
    this.apiUuid = apiUuid;
  }
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getNickName() {
    return nickName;
  }
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
  public String getLocaleCode() {
    return localeCode;
  }
  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }
  public String getIntro() {
    return intro;
  }
  public void setIntro(String intro) {
    this.intro = intro;
  }
  public String getJoinDtime() {
    return joinDtime;
  }
  public void setJoinDtime(String joinDtime) {
    this.joinDtime = joinDtime;
  }
  public String getLastLoginDtime() {
    return lastLoginDtime;
  }
  public void setLastLoginDtime(String lastLoginDtime) {
    this.lastLoginDtime = lastLoginDtime;
  }
  public String getLoginType() {
    return loginType;
  }
  public void setLoginType(String loginType) {
    this.loginType = loginType;
  }
}
