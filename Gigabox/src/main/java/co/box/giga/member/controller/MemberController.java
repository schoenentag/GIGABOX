package co.box.giga.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.member.service.MemberService;
import co.box.giga.member.service.MemberVO;


@Controller
public class MemberController {
	@Autowired MemberService mServ;
	
	@GetMapping("/join")
	public String join(MemberVO vo) {
		mServ.join(vo);
		return "main/main";
	}
	
	@GetMapping("/joinForm.do")
	public String joinForm() {
		return "member/joinForm";
		
	}
	
	@GetMapping("/loginForm.do")
	public String loginForm() {
		return "member/loginForm";
	}
}
