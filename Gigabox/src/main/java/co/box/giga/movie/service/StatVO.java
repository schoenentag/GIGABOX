package co.box.giga.movie.service;

import java.sql.Date;

import lombok.Data;

/**
* 영화 상세페이지의 통계VO
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

@Data
public class StatVO {
	private int statNo; //통계번호
	private int movieNo; //영화번호
	private Date dt; //통계날짜
	private int rank; //순위
	private int dtView; // 일일 관람객수
	private int totalView; //누적관람객수
}
