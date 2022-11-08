package co.box.giga.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.box.giga.movie.service.MovieInfoVO;
import co.box.giga.movie.service.MovieService;

@RestController
public class AjaxMovieController {
	@Autowired
	private MovieService serv;
	
	@PostMapping("/ajaxMovieInfoInsert.do")
	public String ajaxMovieInfoInsert (@RequestParam(value="movieCd[]") String[] movieCdArr) {
		
		// DB 데이터값과 비교하기 위해 호출
		List<MovieInfoVO> movieList = serv.movieList();
		//System.out.println("==========movieList"+movieList.);
		
		// 이중 for문 돌면 안될거같음 좀 더 생각해보자. 
		for (int i = 0; i < movieList.size(); i++ ) {
			System.out.println("+++++++++++" + movieList.get(i).getMovieNo());
			for (int j = 0; j < movieCdArr.length; j++) {
				if( Integer.parseInt(movieCdArr[j]) != movieList.get(i).getMovieNo() ) {
					//만약 movieCd가 DB에 저장되어 있지 않으면 insert
					System.out.println("=========movieList.get(i).getMovieNo() : "+movieList.get(i).getMovieNo());
					System.out.println("=================Integer.parseInt(movieCdArr[j]) : "+ Integer.parseInt(movieCdArr[j]));
					System.out.println("DB에 등록되어있지 않음...");
					
				}
			}
		}
		
		return "일단 실행됨";
	}

}
