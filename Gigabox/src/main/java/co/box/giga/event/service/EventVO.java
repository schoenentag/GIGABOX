package co.box.giga.event.service;

import java.util.Date;

import lombok.Data;

@Data
public class EventVO {
	int eventNo; // 이벤트 번호 PK
	int eventCd; // 카테고리
	String ttl; // 이벤트 제목
	String cntn; // 이벤트 내용
	String edt; // 이벤트 기간
	Date dt; // 작성일자
	String pic; // 사진
	String picAttach; // 사진 경로
}
