package co.micol.prj.board.command;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;

public class BoardList implements Command { // �Խñ� ��� ���� ���
	private List<BoardVO> list = new ArrayList<BoardVO>();
	private BoardService dao = new BoardServiceImpl();
	
	public void execute() {
		list = dao.boardSelectList();
		System.out.println("���� : �ۼ���    : �ۼ�����     :      ����       :��ȸ��");
		for (BoardVO vo : list) {
			System.out.print(vo.getBId());
			System.out.print(vo.getBWriter());
			System.out.print(vo.getBWriteDate());
			System.out.print(vo.getBTitle());
			System.out.println(vo.getBHit());
			
		}
	}
}
