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
			System.out.println("로또 자판기입니다. 투입 금액을 입력하세요.");
			System.out.println("종료하시려면 0을 입력해주세요.");
			System.out.println("==============================");
			money = sc.nextInt();
			get = money / price;

			int nam = money % price;
			if (money == 0) {
				System.out.println("종료했습니다.");
				break;
			} else if (money < price) {
				System.out.println("최소금액은 1,000원 이상입니다. 금액을 다시 입력해주세요.");
				continue;
			} else {
			}
			System.out.printf("투입 금액 =  %d원   구매개수 = %d개  ", money, get);
			System.out.printf("거스름 돈 = %d원 \n\n", nam);

			for (int pur = 0; pur < get; pur++) {

				// 5개 마다 구분해주는 라인
				if (pur % 5 == 0) {
					System.out.println("======================================");
				}

				// 번호생성
				int lotto[] = new int[6];
				for (int i = 0; i < 6; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						// 중복번호 제거
						if (lotto[i] == lotto[j]) {
							i--;
						}
					}

				} // 번호생성 end

				// 오름차순 설정.
				for (int i = 0; i < 6; i++) {
					for (int j = i + 1; j < 6; j++) {
						if (lotto[i] > lotto[j]) {
							sw = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = sw;
						}
					}
				}
				// 번호 출력
				System.out.printf("%d 번째 로또 번호 : ", pur + 1);
				for (int i = 0; i < 6; i++) {

					System.out.print(lotto[i] + "  ");
				} // 번호 한 개 줄 출력 완료.

				System.out.println("\n");
			} // 로또 구매개수 만큼 실행 end
		} // while end

	} // public void LottoNum end

} // class end
