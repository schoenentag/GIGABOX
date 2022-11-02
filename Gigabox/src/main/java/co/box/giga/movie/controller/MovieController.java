package co.box.giga.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.movie.service.MovieAPI;
import co.box.giga.movie.service.MovieService;


@Controller
public class MovieController {
	@Autowired
	private MovieService serv;
	
	
	@GetMapping("/movieMain.do")
	public String movieMain(Model model) {
		
		//MovieAPI api = new MovieAPI();
		//api.requestAPI();
		
		return "movie/movieMain";
	}

}
