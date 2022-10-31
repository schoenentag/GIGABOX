package co.box.giga.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.box.giga.movie.mapper.MovieMapper;

/**
* 영화 SERVICEIMPL
* @author 김하은
* @date 2022.10.31
* @version 1.9
*/


@Service
public class MovieServiceImpl implements MovieService {
	
    @Autowired
    private MovieMapper map;
    
	// 모든 영화목록
	@Override
	public List<MovieInfoVO> movieList() {
		return map.movieList();
	}
	
	// 단건조회
	@Override
	public MovieInfoVO movieListOne(MovieInfoVO vo) {
		return map.movieListOne(vo);
	}
	
	//영화 등록
	@Override
	public int movieInsert(MovieInfoVO vo) {
		return map.movieInsert(vo);
	}
	//영화 수정
	@Override
	public int movieUpdate(MovieInfoVO vo) {
		return map.movieUpdate(vo);
	}

	//영화 삭제
	@Override
	public int movieDelete(MovieInfoVO vo) {
		return map.movieDelete(vo);
	}

}
