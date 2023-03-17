package day6;

import java.util.Scanner;

public class Ex04_accountcheck형 {

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
				System.out.println(name[cnt] + " 님 계좌가 개설되었습니다! ");
				cnt++;

			} else if (menu == 2) {
				System.out.println("입금할계좌 > ");
				String dAaccount = sc.next();
				System.out.println("입금금액 > ");
				int deposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (dAaccount.equals(account[i])) {
						balance[i] += deposit;
						System.out.println("입금완료!");
						break;
					} else if (i == cnt - 1) {
						System.out.println("잘못된 계좌입니다"); // 입금의 경우, if로 사용 . 불린으로도 가능
					}
				}

			} else if (menu == 3) {
				System.out.println("출금할계좌 > ");
				String wAaccount = sc.next();
				account[cnt] = sc.next();
				System.out.println("출금금액 > ");
				int withdraw = sc.nextInt();
				int accountCheck = -1; // int accountCheck = -1; 로 사용하는 경우. >잘못된 계좌 응용

				for (int i = 0; i < cnt; i++) { //
					if (wAaccount.equals(account[i])) {
						if (balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금완료");
							accountCheck = 0;
						} else {
							accountCheck = 1;
						}
						break;

					}
				}
				if (accountCheck == -1) { // 계좌가 없는 경우.
					System.out.println("잘못된 계좌번호입니다");
				} else if (accountCheck == 1) {
					System.out.println("잔액부족입니다");
				}

			} else if (menu == 4) { // 입금 받을 계좌, 출금될 계좌

			} else if (menu == 5) {

			} else if (menu == 0) {
				break;

			} else {
				System.out.println("다시 입력");
			}
		}
	}

}
