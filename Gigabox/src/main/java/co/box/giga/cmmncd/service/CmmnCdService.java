package co.box.giga.cmmncd.service;

import java.util.List;

/**
* 공통코드 SERVICE
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

public interface CmmnCdService {
	List<CmmncdVO> cdList(String cdIni); //공통코드 리스트
}
