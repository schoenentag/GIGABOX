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

	@Override
	public int movieInfoInsert(MovieInfoVO vo) {
		return map.movieInfoInsert(vo);
	}

	@Override
	public int movieInfoUpdate(MovieInfoVO vo) {
		return map.movieInfoUpdate(vo);
	}

	@Override
	public int movieInfoDelete(MovieInfoVO vo) {
		return map.movieInfoDelete(vo);
	}
	

}
