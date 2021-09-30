package co.lsw.lotto;

import java.util.Scanner;

public class Lotto {
	public void LottoNum() {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int price = 1000;
		int get = 0;
		int sw;

		boolean run = true;
		while (run) {
			System.out.println("==============================");
			System.out.println("�ζ� ���Ǳ��Դϴ�. ���� �ݾ��� �Է��ϼ���.");
			System.out.println("�����Ͻ÷��� 0�� �Է����ּ���.");
			System.out.println("==============================");
			money = sc.nextInt();
			get = money / price;

			int nam = money % price;
			if (money == 0) {
				System.out.println("�����߽��ϴ�.");
				break;
			} else if (money < price) {
				System.out.println("�ּұݾ��� 1,000�� �̻��Դϴ�. �ݾ��� �ٽ� �Է����ּ���.");
				continue;
			} else {
			}
			System.out.printf("���� �ݾ� =  %d��   ���Ű��� = %d��  ", money, get);
			System.out.printf("�Ž��� �� = %d�� \n\n", nam);

			for (int pur = 0; pur < get; pur++) {

				// 5�� ���� �������ִ� ����
				if (pur % 5 == 0) {
					System.out.println("======================================");
				}

				// ��ȣ����
				int lotto[] = new int[6];
				for (int i = 0; i < 6; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						// �ߺ���ȣ ����
						if (lotto[i] == lotto[j]) {
							i--;
						}
					}

				} // ��ȣ���� end

				// �������� ����.
				for (int i = 0; i < 6; i++) {
					for (int j = i + 1; j < 6; j++) {
						if (lotto[i] > lotto[j]) {
							sw = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = sw;
						}
					}
				}
				// ��ȣ ���
				System.out.printf("%d ��° �ζ� ��ȣ : ", pur + 1);
				for (int i = 0; i < 6; i++) {

					System.out.print(lotto[i] + "  ");
				} // ��ȣ �� �� �� ��� �Ϸ�.

				System.out.println("\n");
			} // �ζ� ���Ű��� ��ŭ ���� end
		} // while end

	} // public void LottoNum end

} // class end
