package day4;

import java.util.Scanner;

public class Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // 자판기 응용 복습버전      // 해당사항없음 중복적용 , 검토요망

		int balance = 10000;
		

		
		while (true) {
			System.out.printf("====자판기====  현재잔액 : %,d원\n", balance);

			System.out.println("1. 콜라(1000) 2. 사이다(1200) 3. 우유(1500) 4.충전 0. 종료");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();

			
			if (menu == 0) {
				System.out.println("종료되었습니다");
				break;

			} else if (menu == 4) {
				System.out.print("충전금액 >");
				int coin = sc.nextInt();
				balance = coin + balance;

				continue;

			} 
			

			if (menu == 1) {
				System.out.println("수량 >");
				int quantity = sc.nextInt();
				
				if(balance >= (1000 * quantity)) {
				
				System.out.println(1000 * quantity + "원" + "\t콜라 구입성공 ");
				balance = balance - 1000 * quantity;
				
				}else {
					System.out.println("잔액이 부족합니다");
				}
				
				
			} else if (menu == 2) {
				System.out.println("수량 >");
				int quantity = sc.nextInt();
				
				
				if(balance >= (1000 * quantity)) {
				
				System.out.println(1200 * quantity + "원" + "\t사이다 구입성공 ");
				balance = balance - 1200 * quantity;
				}else {System.out.println("잔액이 부족합니다");
				}
				
				
			} else if (menu == 3) {
				System.out.println("수량 >");
				int quantity = sc.nextInt();
				
				if(balance >= (1000 * quantity)) {
				System.out.println(1500 * quantity + "원" + "\t우유 구입성공 ");
				balance = balance - 1500 * quantity;
				}else {System.out.println("잔액이 부족합니다");
				} 
				
				
				}
			System.out.println("해당 사항이 없습니다 다시 입력하세요");

			
		}

		
		
	}

}
