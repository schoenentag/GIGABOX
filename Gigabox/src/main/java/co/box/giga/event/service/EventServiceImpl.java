package co.box.giga.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.box.giga.event.mapper.EventMapper;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private EventMapper map;
	
	@Override
	public List<EventVO> eventFindAll(EventVO evo) {
		return map.eventFindAll(evo);
	}

	@Override
	public EventVO eventFindOne() {
		return map.eventFindOne();
	}

	@Override
	public int eventInsert(EventVO vo) {
		return map.eventInsert(vo);
	}

	@Override
	public int eventUpdate(EventVO vo) {
		return map.eventUpdate(vo);
	}

	@Override
	public int eventDelete(EventVO vo) {
		return map.eventDelete(vo);
	}

	

}
