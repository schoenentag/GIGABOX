package co.box.giga.event.mapper;

import java.util.List;

import co.box.giga.event.service.EventVO;

public interface EventMapper {
	// 이벤트 전체 조회
	List<EventVO> eventFindAll();

	// 이벤트 상세 조회
	EventVO eventFindOne();

	// 이벤트 등록
	int eventInsert(EventVO vo);

	// 이벤트 수정
	int eventUpdate(EventVO vo);

	// 이벤트 삭제
	int eventDelete(EventVO vo);
}
