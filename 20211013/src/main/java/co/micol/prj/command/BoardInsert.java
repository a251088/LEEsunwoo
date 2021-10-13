package co.micol.prj.command;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;

public class BoardInsert implements Command {

	@Override
	public void execute() {
		BoardService boardDao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
		System.out.println("***********************");
		System.out.println("작성자를 입력하세요");
		board.setBContents(GB.sc.nextLine());
		board = boardDao.boardInsert(board);
		
		
	}

}
