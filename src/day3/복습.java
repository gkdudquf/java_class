package day3;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 for 문으로 1~100 까지 짝수의 합 * 변수 초기화(값이 생성된다) 는 반드시 구문 밖에서 사용한다.[변수의 참조 - 스코프]

//
//		int sum = 0;
//
//		for (int i = 2; i <= 100; i++) {           //   int sum;
//			if (i % 2 == 0) {                      //   sum = 10;    으로 선언 가능  / 구문 밖 사용  (구문 안에서 생성된 변수는 중괄호 단위로서 그 내에서만 사용가능)
//				sum = sum + i;
//			}
//
//		}
//
//		System.out.println(sum);

//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum + 1;
//			
//		}
//
//		System.out.println(sum);

 //1-100 까지 홀수의 합

		int sum = 0;
		int i = 1;

		while (i <= 100) {
			if (i % 2 != 0) {
			
			sum += i;                     // sum = sum + i
			
		}
			i++;
		}
		
		System.out.println(sum);

		
		
		
		// 문제 숫자를 계속 입력받다가 0이 입력되면 '끝' 출력
		
		
		
//		Scanner sc= new Scanner(System.in);
//		
//		
//		
//		boolean run = true ;
//		while(run) {
//		System.out.print("숫자입력 >");
//		int num = sc.nextInt();
//		if(num == 0) {
//			run =  false;
//		}
//		System.out.println(".");
//		}
//		
//		
//		
//
//		
//		
//		System.out.println("끝");
		
		
//		
//		int menu = -1;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		long money = 10000l;
//		
//		while(menu != 0) {
//			
//			System.out.println("====자판기====\t 현재잔액 : "+money +"원");
//			System.out.println("1. 콜라(1000) 2. 사이다(1200) 3. 우유(1500) 0. 종료 ");
//			System.out.println("메뉴 선택> ");
//			menu = sc.nextInt();
//		
//			if(menu == 1) {
//				money = money -1000;
//			System.out.println(" 콜라 구입성공");
//			}else if(menu == 2) {
//				money -= 1200;                // -= 마이너스 처리 줄임말
//			System.out.println("사이다 구입 성공");
//			}else if(menu == 3) {
//				money = money -1300;
//			System.out.println("3. 우유 선택");
//			}else if(menu == 0) {
//				money = money - 900;
//				System.out.println("종료");
//				break;
//				
//			
//			}
//		}   
//		
//	
//		System.out.println();
	}

}
