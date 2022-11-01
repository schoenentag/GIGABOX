package co.box.giga.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.box.giga.member.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired 
	MemberMapper dao;
	
	
	@Override
	public int join(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.join(vo);
	}

	@Override
	public int idCheck(String id) {
		// TODO Auto-generated method stub
		return dao.idCheck(id);
	}

	@Override
	public int pwdUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.pwdUpdate(vo);
	}

	@Override
	public String findId(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.findId(vo);
	}

}
