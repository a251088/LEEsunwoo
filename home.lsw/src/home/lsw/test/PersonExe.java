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
			System.out.println("���ϴ� �۾��� �����ϼ���.");
			System.out.println("==============================");
			System.out.println("1.�߰� 2.��ȸ 3.���� 4.���� 5.���� ");
			System.out.println("==============================");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("�߰��մϴ�. �׷��� �����ϼ���.");
				System.out.println("1.����  2.�б�  3. ���� 4. ���� �޴���");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.println("[����]�׷쿡 �߰��մϴ�.");
					System.out.println("�̸� , ����, ����ó�� �Է����ּ���.");
					
				}
				if (menu == 2) {
					System.out.println("[�б�]�׷쿡 �߰��մϴ�.");

				}
				if (menu == 3) {
					System.out.println("[����]�׷쿡 �߰��մϴ�.");

				}
				if (menu == 4) {
					System.out.println("���� �޴��� ���ƿԽ��ϴ�.");
					continue;
				}

				break;
			}
			if (menu == 2) {
				System.out.println("��ȸ�մϴ�");
				break;
			}
			if (menu == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			if (menu == 4) {
				System.out.println("�����մϴ�");
				break;
			}
			if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.printf("�Է� �����Դϴ�. 3ȸ ���� �� ����.(%dȸ)", i);
				i++;
				if (i > 3) {
					System.out.println(" �����մϴ�.");
					break;
				}
			}
		} // while end
	}
}