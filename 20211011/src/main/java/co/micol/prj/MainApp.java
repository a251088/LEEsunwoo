package co.micol.prj;

import java.io.IOException;

import co.micol.prj.board.command.BoardList;
import co.micol.prj.board.command.BoardSelect;
import co.micol.prj.board.command.Command;
import co.micol.prj.comm.BoardMenu;

public class MainApp {
	public static void main(String[] args) throws IOException {
		//�Խ��� ������Ʈ 1.vo��ü ���� dao ���� 2. �������̽� ���� 3. �������̽� ����ü ����
		BoardMenu boardMenu = new BoardMenu();
		boardMenu.run();
	}
}
