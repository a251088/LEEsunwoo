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
//BoardVO에서 가지고 있는 필드값들을 통해서 실제로 처리할 기능들.
	// 이클립스에서 우리가 하는 코드에서 하는 역할.