package co.box.giga.cmmncd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.box.giga.cmmncd.mapper.CmmnCdMapper;

/**
* 공통코드 SERVICE
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/
@Service
public class CmmnCdServiceImpl implements CmmnCdService {

	@Autowired
	private CmmnCdMapper map; // 공통코드 맵퍼
	
	@Override
	public List<CmmncdVO> cdList(String val) {
		// 공통코드 리스트
		return map.cdList(val);
	}


}
