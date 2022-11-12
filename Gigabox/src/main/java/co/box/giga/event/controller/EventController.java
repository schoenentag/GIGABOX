package co.box.giga.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import co.box.giga.event.service.EventService;
import co.box.giga.event.service.EventVO;

@Controller
public class EventController {
	@Autowired
	private EventService event;
	
	// 이벤트 전체 조회
//	@GetMapping("/event.do")
//	public String eventFindAll(Model model, EventVO evo,
//			@RequestParam(required = false, defaultValue = "1") int pageNum,
//			@RequestParam(required = false, defaultValue = "5") int pageSize) {
//		PageHelper.startPage(pageNum, pageSize); // 페이징처리
//		List<EventVO> el = event.eventFindAll(evo);
//		model.addAttribute("eventList", PageInfo.of(el));
//		return "event/eventList";
//	}
	
	@GetMapping("/event.do")
	public String eventFindAll(Model model, EventVO evo) {
		List<EventVO> el = event.eventFindAll(evo);
		model.addAttribute("eventList", el);
		return "event/eventList";
	}

}
