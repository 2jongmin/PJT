package comeit.comeit.member.dao;

import comeit.comeit.member.vo.MemberVO;
import comeit.framework.mybatis.Mapper;

@Mapper
public interface MemberDAO {
  /**
   * 사용자 정보 조회
   * EMAIL, USER_SEQ, API_UUID의 순서로 값이 있는 조건으로 조회
   * @param inMemberVo
   * @return
   */
  MemberVO select(MemberVO inMemberVo);
  
  /**
   * email로 가입된 회원 수 조회
   * @param email
   * @return
   */
  int selectCountByEmail(String email);
  
  /**
   * USER_SEQ 채번
   * @return
   */
  String selectNextSeq();
  
  /**
   * 사용자 정보 저장
   * @param inMemberVo
   * @return
   */
  int insert(MemberVO inMemberVo);
}
