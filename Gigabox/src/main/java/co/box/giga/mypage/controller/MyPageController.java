package co.box.giga.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.mypage.service.MypageService;

@Controller
public class MyPageController {
	@Autowired 
	MypageService pServ;
	
	@GetMapping("/pointList.do")
	public String pointList(Model model) {
		model.addAttribute("pointList", pServ.pointList(null));
		return "myPage/myPage";
	}
}
