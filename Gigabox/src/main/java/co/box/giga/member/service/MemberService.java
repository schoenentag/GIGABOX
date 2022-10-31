package co.box.giga.member.service;

public interface MemberService {

	// 회원가입
	int join(MemberVO vo);

	// 아이디 중복 체크
	int idCheck(String id);

	// 아이디 찾기
	String findId(MemberVO vo);

	// 비밀번호 변경
	int pwdUpdate(MemberVO vo);

}
