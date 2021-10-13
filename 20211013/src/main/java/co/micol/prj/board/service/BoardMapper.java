package co.micol.prj.board.service;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> boardSelectList();

	BoardVO boardSelect(BoardVO vo);

	int boardInsert(BoardVO vo);

	int boardUpdate(BoardVO vo);

	int boardDelete(BoardVO vo);

	int updateHit(int id);
}
//이 친구는, BoardService랑 내용은 똑같지만 하는일이 달라요.
	/*
	 * 이 친구는 mybatis를 통해서 연결되어 있는 DB에서 하는 역할.
	 */