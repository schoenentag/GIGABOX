package co.box.giga.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.box.giga.movie.service.MovieService;


@Controller
public class MovieController {
	@Autowired
	private MovieService serv;
	
	
	@GetMapping("/movieMain.do")
	public String movieMain() {
		
		return "movie/movieMain";
	}
	
	@GetMapping("/movieListOne.do")
	public String movieListOne(Model model, @RequestParam("key") String key, @RequestParam("movieCd") int movieCd){
		
		model.addAttribute("key", key);
		model.addAttribute("movieCd", movieCd);
		
		return "movie/movieListOne";
	}

}
