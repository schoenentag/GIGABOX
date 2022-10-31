package co.box.giga.cmmncd.service;

import lombok.Data;

/**
* 공통코드 VO
* @author 김하은
* @date 2022.10.31
* @version 1.0
*/

@Data
public class CmmncdVO {
	// 공통코드 VO
		private String cdIni; // 주코드
		private String cdNo;  // 부코드 
		private String cdName; // 설명
}
