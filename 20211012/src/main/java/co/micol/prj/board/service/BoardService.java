package co.micol.prj.board.service;

import java.util.List;

public interface BoardService {  //서비스 인터페이스
	List<BoardVO> boardSelectList();  //전체글 가져오는거
	BoardVO boardSelect(BoardVO vo); //한개글 가져오는거
	int boardInsert(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardUpdate(BoardVO vo);
}
