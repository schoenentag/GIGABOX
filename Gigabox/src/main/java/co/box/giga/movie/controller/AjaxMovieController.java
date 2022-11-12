package co.box.giga.movie.controller;

import java.util.ArrayList;
import java.util.Arrays;
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
	public String ajaxMovieInfoInsert (@RequestParam(value="movieCd[]") String[] movieCdArr, MovieInfoVO vo) {
		
		List<MovieInfoVO> movieNo = new ArrayList<MovieInfoVO>(); 
		System.out.println("movieNo : " +movieNo);
		
		// DB 데이터값과 비교하기 위해 호출
		List<MovieInfoVO> movieList = serv.movieList();
		List<Integer> noArr = new ArrayList<Integer>(); 
		//System.out.println("==========movieList"+movieList.);
		
		// DB에 담긴 movieNo를 list에 담음
		for (int i = 0; i < movieList.size(); i++) {
			noArr.add(movieList.get(i).getMovieNo());
		}
		System.out.println("DB에 있는 movieNo(int[] noArr) : "+ noArr);
		
		for (int j = 0; j < movieCdArr.length; j++) {
			// DB에 담긴 movieNo와 REST API movieCode를 비교하여 값이 있는지 없는지 판단...
			if(noArr.containsAll(Arrays.asList(Integer.parseInt(movieCdArr[j])))) {
		        System.out.println("DB에 등록되어있음");
			}
		
			System.out.println("DB에 등록되어있지 않음..." + noArr.containsAll(Arrays.asList(Integer.parseInt(movieCdArr[j]))));
		    
			//DB에 등록되어 있지 않으므로 insert 한다.
			//ERROR
			/*System.out.println("movieNo.get(j) : " + movieNo.get(j).getMovieNo());
			System.out.println("Integer.parseInt(movieCdArr[j]) : " + Integer.parseInt(movieCdArr[j]));
			movieNo.get(j).setMovieNo(Integer.parseInt(movieCdArr[j]));
			serv.movieInfoInsert(vo);
			System.out.println("==========movieNo : " + movieNo.get(j).getMovieNo());*/
			}	
	
		
		return "일단 실행됨";
	}

}
