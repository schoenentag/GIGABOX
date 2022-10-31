package co.box.giga.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {
	// 영화 예매 전체 조회
	@GetMapping("/ticket")
	public String ticketFindAll() {
		return "ticket/ticketList";
	}

}
