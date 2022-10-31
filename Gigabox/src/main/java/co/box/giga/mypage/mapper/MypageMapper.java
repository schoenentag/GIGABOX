package co.box.giga.mypage.mapper;


import java.util.List;

import co.box.giga.member.service.MemberVO;

public interface MypageMapper {
	//문의내역
	//List<qnaVO> myQna(String id);
	
	//포인트
	MemberVO myPoint(MemberVO vo);
	List<MemberVO> pointList(MemberVO vo);
	
	//회원 정보수정
	int modify(MemberVO vo);
	
	//회원등급
	MemberVO myTier(MemberVO vo);
}
