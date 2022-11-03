package co.box.giga.mypage.service;


import co.box.giga.member.service.MemberVO;

public interface MypageService {
	//포인트
		MemberVO myPoint(MemberVO vo);
		int updatePoint(MemberVO vo);
		//회원 정보수정
		int modify(MemberVO vo);
		
		//회원등급
		MemberVO myTier(MemberVO vo);
}
