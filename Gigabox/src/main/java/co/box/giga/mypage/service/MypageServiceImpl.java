package co.box.giga.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.box.giga.member.service.MemberVO;
import co.box.giga.mypage.mapper.MypageMapper;

@Service
public class MypageServiceImpl implements MypageService {
	@Autowired MypageMapper dao;
	@Override
	public MemberVO myPoint(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.myPoint(vo);
	}

	@Override
	public List<MemberVO> pointList(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.pointList(vo);
	}

	@Override
	public int modify(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.modify(vo);
	}

	@Override
	public MemberVO myTier(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.myTier(vo);
	}
}
