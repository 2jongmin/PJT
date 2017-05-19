package comeit.framework.configure.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import comeit.comeit.member.service.MemberService;
import comeit.comeit.member.vo.MemberVO;
import comeit.framework.common.enums.LoginTypeCodeEnum;

@Service
public class ComeitUserDetailsService implements UserDetailsService {
  
  @Autowired
  private MemberService memberService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  MemberVO inMemberVo = new MemberVO();
	  inMemberVo.setUserSeq(username);
    
    // 사용자 정보 조회
    MemberVO resultMemberVo = null;
    try {
      resultMemberVo = memberService.select(inMemberVo);
      
      if(resultMemberVo == null) {
        throw new UsernameNotFoundException(String.format("User %s does not exist!", username));
      }
    } catch(Exception ex) {
      
    }
    
    AuthorityInfoVO authVo = new AuthorityInfoVO(resultMemberVo.getUserSeq(), resultMemberVo.getPassword()
        , resultMemberVo.getNickName(), LoginTypeCodeEnum.MEMBER_GROUP_CODE.getValue());
    
		return authVo;
	}
}
