package co.box.giga.movie.service;


import java.sql.Date;

import lombok.Data;

/**
* 영화 상세페이지의 댓글(관람평)VO
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

@Data
public class MreplyVO {
	
	private int mrNo; //댓글 번호
	private int movieNo; //영화 번호
	private String id; // 댓글작성자
	private Date dt; // 작성일자
	private int star; // 별점 : 별 5개 ,  1개당 2 *5 = 10
	private int vpCd; // 관람포인트cd
	private String content; // 댓글내용
	
}
