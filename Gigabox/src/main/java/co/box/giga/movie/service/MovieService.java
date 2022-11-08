package co.box.giga.movie.service;

import java.util.List;

/**
* 영화 SERVICE
* @author 김하은
* @date 2022.10.31
* @version 1.9
*/

public interface MovieService {
	/** 2022.10.31 기본 CRUD*/
	List<MovieInfoVO> movieList(); // 모든 영화목록
	MovieInfoVO movieListOne(MovieInfoVO vo); // 단건조회
	
	int movieInfoInsert(MovieInfoVO vo); //영화 등록
	int movieInfoUpdate(MovieInfoVO vo); //영화 수정
 	int movieInfoDelete(MovieInfoVO vo); //영화 삭제
	

}
