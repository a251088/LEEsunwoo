package co.micol.prj.board.command;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;

public class BoardDelete implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("=======================");
		System.out.println("������ �� ��ȣ�� �Է��ϼ���");
		vo.setBId(scb.nextInt());
		int n = dao.boardDelete(vo);
		if (n != 0) {
			System.out.println("���������� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("�Խñ� ���� �����Դϴ�.");
		}
	}

}
