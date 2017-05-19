package comeit.framework.configure.spring.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthorityInfoVO implements UserDetails {
  private static final long serialVersionUID = 7260487553463607158L;

  // 올때그거 회원일련번호(ID로 사용한다.)
  private String userSeq;
  // 비밀번호
  private String password;
  // 회원명
  private String nickName;
  // 그룹코드
  private String groupCode;

  //권한목록
  private Collection<GrantedAuthority> authorities;

  public AuthorityInfoVO(AuthorityInfoVO authVo) {
    this.userSeq = authVo.userSeq;
    this.password = authVo.password;
    this.nickName = authVo.nickName;
    this.groupCode = authVo.groupCode;
  }
  
  public AuthorityInfoVO(String userSeq, String password, String nickName, String groupCode) {
    this.userSeq = userSeq;
    this.password = password;
    this.nickName = nickName;
    this.groupCode = groupCode;
  }

  public String getId() {
    return userSeq;
  }

  public void setId(String userSeq) {
    this.userSeq = userSeq;
  }
  
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getGroupCode() {
    return groupCode;
  }

  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return getId();
  }
  
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public void setAuthorities(Collection<GrantedAuthority> authorities) {
    this.authorities = Collections.unmodifiableCollection(authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

}
