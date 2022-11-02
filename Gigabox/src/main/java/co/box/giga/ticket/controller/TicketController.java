package co.box.giga.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.ticket.service.TicketService;

@Controller
public class TicketController {
	@Autowired
	private TicketService ticket;
	
	// 영화 예매 전체 조회
	@GetMapping("/ticket.do")
	public String ticketFindAll(Model model) {
		model.addAttribute("list", ticket.ticketFindAll());
		return "ticket/ticketList";
	}

}
