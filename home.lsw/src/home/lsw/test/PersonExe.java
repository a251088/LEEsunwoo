package home.lsw.test;

import java.util.Scanner;

public class PersonExe {
	Person person = new Person();

	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int menu = 0;

	public void Menu() {
		int i = 1;
		while (true) {
			System.out.println("원하는 작업을 선택하세요.");
			System.out.println("==============================");
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료 ");
			System.out.println("==============================");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("추가합니다. 그룹을 선택하세요.");
				System.out.println("1.개인  2.학교  3. 직장 4. 이전 메뉴로");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.println("[개인]그룹에 추가합니다.");
					System.out.println("이름 , 성별, 연락처를 입력해주세요.");
					
				}
				if (menu == 2) {
					System.out.println("[학교]그룹에 추가합니다.");

				}
				if (menu == 3) {
					System.out.println("[직장]그룹에 추가합니다.");

				}
				if (menu == 4) {
					System.out.println("이전 메뉴로 돌아왔습니다.");
					continue;
				}

				break;
			}
			if (menu == 2) {
				System.out.println("조회합니다");
				break;
			}
			if (menu == 3) {
				System.out.println("수정합니다.");
				break;
			}
			if (menu == 4) {
				System.out.println("삭제합니다");
				break;
			}
			if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.printf("입력 오류입니다. 3회 오류 시 종료.(%d회)", i);
				i++;
				if (i > 3) {
					System.out.println(" 종료합니다.");
					break;
				}
			}
		} // while end
	}
}