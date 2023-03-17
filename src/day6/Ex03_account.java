package day6;

import java.util.Scanner;

public class Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;

		while (true) {
			System.out.println("====인천일보은행====");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 계좌이체 5.계좌목록 0. 종료");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("예금주명 > ");
				name[cnt] = sc.next();
				System.out.println("계좌번호 > ");
				account[cnt] = sc.next();
				System.out.println("초기입금금액 >");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + " 님 계좌가" + balance[cnt] + "원 개설되었습니다!");
				cnt++;

			} else if (menu == 2) {
				System.out.println("입금할계좌 > ");
				String dAaccount = sc.next();
				System.out.println("입금금액 > ");
				int deposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (dAaccount.equals(account[i])) {
						balance[i] += deposit; //
						System.out.println(deposit + "원 입금완료");
						break;

					} else if (i == cnt - 1) { // for 문의 마지막 반복/i 인덱스는 0으로 시작하기 때문에 , cnt 해당입력갯수만큼 반복하나, 자리는 cnt -1 로 진행

						System.out.println("잘못된 계좌입니다"); // 입금의 경우, if로 사용 . 불린으로도 가능
					}
				}

			} else if (menu == 3) {
				System.out.println("출금할계좌 > ");
				String wAaccount = sc.next();
				System.out.println("출금금액 > ");
				int withdraw = sc.nextInt();
				boolean accountCheck = false;

				for (int i = 0; i < cnt; i++) {
					if (wAaccount.equals(account[i])) {
						if (balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금완료");

						} else {
							System.out.println("잔액부족");
							accountCheck = true;
						}
						accountCheck = true;
						break;

					}
				}
				if (!accountCheck) {         // 계좌가 없는 경우.
					System.out.println("잘못된 계좌번호입니다");
				}

			} else if (menu == 4) { // 입금 받을 계좌, 출금될 계좌
				System.out.println("출금할 계좌 >");
				String wAccount = sc.next();
				System.out.println("입금할 계좌 >");
				String dAccount = sc.next();
				System.out.println("계좌이체 금액 > ");
				int money = sc.nextInt();

				
				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						int index = i;
						
						
						
						
					}

				}

			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("-------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}

			} else if (menu == 0) {
				break;

			} else {
				System.out.println("다시 입력");
			}
		}
	}

}
