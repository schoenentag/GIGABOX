package co.box.giga.member.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.member.service.MemberService;
import co.box.giga.member.service.MemberVO;


@Controller
public class MemberController {
	@Autowired 
	MemberService mServ;
	
//	@Autowired
//	KakaoAPI k;
	
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
	
	@GetMapping("/myPage")
	public String myPage() {
		return "myPage/myPage";
	}
	
//	@RequestMapping(value="/login")
//	public ModelAndView login(@RequestParam("code") String code, HttpSession session) {
//		ModelAndView mav = new ModelAndView();
//		
//		// 인증코드 요청
//		String accessToken = k.getAccessToken(code);
//		
//		// 인증코드로 토큰 전달
//		HashMap<String, Object> userInfo = k.getUserInfo(accessToken);
//		
//		System.out.println("login info : " + userInfo.toString());
//		
//		if(userInfo.get("email") != null) {
//			session.setAttribute("id", userInfo.get("email"));
//			session.setAttribute("access_token",accessToken);
//		}
//		mav.addObject("id", userInfo.get("email"));
//		mav.setViewName("login");
//		return mav;
//	 
//	}
}
