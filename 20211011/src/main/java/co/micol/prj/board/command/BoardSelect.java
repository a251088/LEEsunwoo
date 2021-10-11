package co.micol.prj.board.command;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;

public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO board = new BoardVO();
		System.out.println("=======================");
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt());
		board = dao.boardSelect(board);

		System.out.println("번호 : " + board.getBId());
		System.out.println("작성자 : " + board.getBWriter());
		System.out.println("작성일자 : " + board.getBWriteDate());
		System.out.println("제목 : " + board.getBTitle());
		System.out.println("내용 : " + board.getBContents());
		System.out.println("조회수 : " + board.getBHit());
		
		scb.close();
	}

}
