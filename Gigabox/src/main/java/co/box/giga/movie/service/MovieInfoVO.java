package co.box.giga.movie.service;


import java.sql.Date;

import lombok.Data;

/**
* 영화정보 VO
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

@Data
public class MovieInfoVO {
	
	private int movieNo; //영화 번호
	private String title; //영화 제목
	private String director; //감독
	private String actor; // 주연배우
	private int ageCd;  //관람등급cd
	private String ageCdName; //관람등급네임
	private int genreCd; //장르cd
	private String genreCdName; //장르cd네임
	private int rtime; //러닝타임
	private String nation; //국가
	private Date dt;  //개봉날짜
	private String pic; //사진(썸네일)
	private String picAttach; //사진경로
	private int mtab_cd; // 카테고리
	private int wish; //찜기능

}
