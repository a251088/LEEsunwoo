package co.micol.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelecList();

	BoardVO boardSelect(BoardVO vo);

	int boardInsert(BoardVO vo);

	int boardDelete(BoardVO vo);

	int boardUpdate(BoardVO vo);

	List<BoardVO> boardSelectList();

}
