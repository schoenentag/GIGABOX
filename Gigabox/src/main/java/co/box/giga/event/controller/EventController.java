package co.box.giga.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
	// 이벤트 전체 조회
	@GetMapping("/event")
	public String eventFindAll() {
		return "event/eventList";
	}

}
