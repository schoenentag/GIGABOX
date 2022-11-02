package co.box.giga.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.box.giga.event.service.EventService;

@Controller
public class EventController {
	@Autowired
	private EventService event;
	
	// 이벤트 전체 조회
	@GetMapping("/event.do")
	public String eventFindAll(Model model) {
		model.addAttribute("list", event.eventFindAll());
		return "event/eventList";
	}

}
