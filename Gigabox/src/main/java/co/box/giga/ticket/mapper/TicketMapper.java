package co.box.giga.ticket.mapper;

import java.util.List;

import co.box.giga.ticket.service.TicketVO;

public interface TicketMapper {
	// 예매 영화 전체 조회
	List<TicketVO> tickerFindAll();

	// 예매 영화 단건 조회
	TicketVO tickerFindOne();

	// 예매 등록
	int ticketInsert(TicketVO vo);

	// 예매 수정
	int ticketUpdate(TicketVO vo);

	// 예매 삭제
	int ticketDelete(TicketVO vo);
}
