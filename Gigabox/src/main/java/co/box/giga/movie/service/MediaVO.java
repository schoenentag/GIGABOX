package co.box.giga.movie.service;


import lombok.Data;

/**
* 영화의 미디어 정보VO
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

@Data
public class MediaVO {
	
	private int mediaNo; // 미디어번호
	private int movieNo; // 영화번호
	private String media; //미디어
	private String mediaAttach; //미디어경로

}
