package co.box.giga.qna.mapper;

import java.util.List;

import co.box.giga.qna.service.QnaVO;

public interface QnaMapper {
	
	int insertQna(QnaVO vo);
	int updateQna(QnaVO vo);
	int deleteQna(QnaVO vo);
	List<QnaVO> selectQna(QnaVO vo);
	List<QnaVO> searchQna(QnaVO vo);	//qna 검색
	List<QnaVO> qnaList(QnaVO vo);	//내가 쓴 qna리스트

}
