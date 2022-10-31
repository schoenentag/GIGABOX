package co.box.giga.cmmncd.mapper;

import java.util.List;

import co.box.giga.cmmncd.service.CmmncdVO;

public interface CmmnCdMapper {
	
	List<CmmncdVO> cdList(String cdIni); //공통코드 리스트
}
