package co.box.giga.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
	
	@GetMapping("/movieMain.do")
	public String movieMain() {
		return "movie/movieMain";
	}

}
