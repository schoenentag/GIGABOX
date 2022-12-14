package co.box.giga.ticket.service;

import java.util.List;

public interface TicketService {
	// 예매 영화 전체 조회
	List<TicketVO> ticketFindAll();
	
	// 예매 영화 단건 조회
	TicketVO ticketFindOne();
	
	// 예매 등록
	int ticketInsert(TicketVO vo);
	
	// 예매 수정
	int ticketUpdate(TicketVO vo);
	
	// 예매 삭제
	int ticketDelete(TicketVO vo);
}
