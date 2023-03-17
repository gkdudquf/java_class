









package day6;

import java.util.Scanner;

public class Ex05_타조원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//계쫘개설 후 2번에서 입금하실 금액 

		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;

		boolean check = false;
		while (true) {
			System.out.println("==========인천일보은행==========");
			System.out.println("1.계좌생성 2.입금 3.출금 4. 계좌이체 5. 계좌목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("예금주명 입력> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기 입금 금액> ");
				balance[cnt] = sc.nextInt();

				System.out.println(name[cnt] + "님의 계좌가 개설 되었습니다!");
				cnt++;

			} else if (menu == 2) {
				System.out.println("입금 할 계좌> ");
				String dAcount = sc.next();
				System.out.println("입금 금액> ");
				int deposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (dAcount.equals(account[i])) {

						balance[i] += deposit;
						System.out.println("입금완료");
						break;
						// for문의 마지막반복될때의 조건 식(밑에)
						// 마지막 반복일때 조건에 맞으면 입금완료뜨고 반복문 나가고 조건에 안맞으면 계좌없다로 뜬다
					} else if (i == cnt - 1) {
						System.out.println("계좌가 없습니다");
					}
				}

			} else if (menu == 3) {
				System.out.println("출금 할 계좌> ");
				String wAcount = sc.next();
				System.out.println("출금 금액> ");
				int withdraw = sc.nextInt();
				boolean accountCheck = false;

				for (int i = 0; i < cnt; i++) {
					if (wAcount.equals(account[i])) {
						if (balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금완료");

						} else {
							System.out.println("잔액 부족");

						}
						accountCheck = true;
						break;
					}
				}
				// false인 경우에만 잘못된 계좌번호
				if (!accountCheck) {
					System.out.println("잘못된 계좌번호입니다");
				}

			} else if (menu == 4) {

				System.out.print("출금 할 계좌번호> ");
				String wAcount = sc.next();

				System.out.println("입금 할 계좌번호> ");
				String dAcount = sc.next();
				System.out.println("계좌 이체 금액> ");
				int money = sc.nextInt();
				boolean Check = false;
				for (int i = 0; i < cnt; i++) {
					if (wAcount.equals(account[i])) {
						Check = true;
						for (int j = 0; j < cnt; j++) {
							if (dAcount.equals(account[j])) {

								if (balance[i] >= money) {
									System.out.println(money + "원 계좌이체 실행 합니다 \n");
									balance[i] = balance[i] - money;
									balance[j] = balance[j] + money;

									break;
								} else {
									System.out.println(-(balance[i] - money) + "잔액이 부족합니다");
								}
							} else if (j == cnt - 1) {
								System.out.println("계좌 이체 안됩니다!! \n");
							}
						}
					}
				}
				if (!Check) {
					System.out.println("계좌이체 실행 안됨");
				}
			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("-----------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);

				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}

		}

	}

}