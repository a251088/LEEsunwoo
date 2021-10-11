package co.micol.prj.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.micol.prj.board.command.BoardDelete;
import co.micol.prj.board.command.BoardInsert;
import co.micol.prj.board.command.BoardList;
import co.micol.prj.board.command.BoardSelect;
import co.micol.prj.board.command.BoardUpdate;
import co.micol.prj.board.command.Command;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public BoardMenu() {
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
		// ���⿡ command��ü�� ������ ���� �߰��Ѵ�.

	}

	private void boardTitle() {
		System.out.println("==================");
		System.out.println("==1. �������� ��� ==");
		System.out.println("==2. �������� ��ȸ ==");
		System.out.println("==3. �������� ��� ==");
		System.out.println("==4. �������� ���� ==");
		System.out.println("==5. �������� ���� ==");
		System.out.println("==6. �׸��ϱ� ======");
		System.out.println("=================");
		System.out.println("���ϴ� �۾���ȣ�� �����ϼ���? ");
	}

	private void menu() {
		while (true) {
			boardTitle();
			int job = sc.nextInt();
			sc.nextLine();
			switch (job) {
			case 1:
				commandRun("boardList");
				break;
			case 2:
				commandRun("boardSelect");
				break;
			case 3:
				commandRun("boardInsert");
				break;
			case 4:
				commandRun("boardUpdate");
				break;
			case 5:
				commandRun("boardDelete");
				break;
			case 6:
				System.out.println("Good Bye~~~~~~");
				sc.close();
				return;
			}
		} // while end
	} // method end

	private void commandRun(String comm) {
		Command command = map.get(comm);
		command.execute();
	}

	public void run() {
		menu();
	}
} // class end
