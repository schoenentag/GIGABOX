package co.box.giga.movie.mapper;

import java.util.List;

import co.box.giga.movie.service.MovieInfoVO;

public interface MovieMapper {
	
	/** 2022.10.31 기본 CRUD*/
	List<MovieInfoVO> movieList(); // 모든 영화목록
	MovieInfoVO movieListOne(MovieInfoVO vo); // 단건조회
	
	int movieInfoInsert(MovieInfoVO vo); //영화 등록
	int movieInfoUpdate(MovieInfoVO vo); //영화 수정
 	int movieInfoDelete(MovieInfoVO vo); //영화 삭제

}
