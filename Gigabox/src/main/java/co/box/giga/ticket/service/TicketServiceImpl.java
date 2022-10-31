package co.box.giga.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.box.giga.ticket.mapper.TicketMapper;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketMapper map;
	
	@Override
	public List<TicketVO> tickerFindAll() {
		return map.tickerFindAll();
	}

	@Override
	public TicketVO tickerFindOne() {
		return map.tickerFindOne();
	}

	@Override
	public int ticketInsert(TicketVO vo) {
		return map.ticketInsert(vo);
	}

	@Override
	public int ticketUpdate(TicketVO vo) {
		return map.ticketUpdate(vo);
	}

	@Override
	public int ticketDelete(TicketVO vo) {
		return map.ticketDelete(vo);
	}

}
