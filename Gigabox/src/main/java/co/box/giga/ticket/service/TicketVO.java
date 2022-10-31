package co.box.giga.ticket.service;

import lombok.Data;

@Data
public class TicketVO {
	int tickerNo; // 예매번호 PK
	int movieNo; // 영화번호 FK
	String id; // 아이디 FK
	int theaterNo; // 상영관 번호
	String cname; // 영화관명
	int cinemaNo; // 영화관 번호
	int seat; // 좌석수
	int hcnt; // 인원수
	String region; // 지역명
	String locCd; // 도시명
	String startDt; // 시작 시간
	String endDt; // 종료 시간
	String dt; // 영화관람일
	String tstate; // 예매상태
	int age; // 관람나이
	String grade; // 상영관 등급
}
