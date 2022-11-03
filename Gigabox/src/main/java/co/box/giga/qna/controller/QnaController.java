package co.box.giga.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.box.giga.qna.service.QnaService;
import co.box.giga.qna.service.QnaVO;

public class QnaController {
@Autowired
QnaService qServ;

@PostMapping("/insertQna")
public String insertQna(@ModelAttribute QnaVO vo) {
	boolean isReply = vo.getQnaNo() != 0;
	if(isReply) {
		
	}
	//QnaVO result = qServ.insertQna(vo);
	return null;
}

}
