package co.micol.prj.board.command;

import java.sql.Date;
import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	// dao ��ü�� �������̽����� ��ӹ޾Ƽ� ����Ѵ�.
	private BoardVO vo = new BoardVO();
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("======================");
		System.out.println("�ۼ��ڸ� �Է��ϼ��� ? ");
		vo.setBWriter(scb.nextLine());
		System.out.println("������ �Է��ϼ���. ");
		vo.setBTitle(scb.nextLine());
		System.out.println("������ �Է��ϼ���.");
		vo.setBContents(scb.nextLine());
		int n = dao.boardInsert(vo);
		if (n != 0) {
			System.out.println("���������� ��� �Ǿ����ϴ�.");
		} else {
			System.out.println("����� �����߽��ϴ�.");
		}

	}

}
