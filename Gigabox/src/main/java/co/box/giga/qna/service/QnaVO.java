package co.box.giga.qna.service;

import java.sql.Date;

import lombok.Data;

@Data
public class QnaVO {
	int qnaNo;
	String id;
	int catCd;
	String ttl;
	String cntn;
	String picAttach;
	String pic;
	Date dt;
	int oriNo;	//원글 번호
	int oriOrd;	//원글에 대한 순서(답글 포함)
	int orlLayer;	//답글계층
	
	//검색
	String key;
	String val;
}
