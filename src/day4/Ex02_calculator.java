package day4;

import java.util.Scanner;

public class Ex02_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);     //계산기 예제
	
		boolean run = true;                      // 1. 이어하기 이어 계산 오류?
		double result = 0;
		
		while (run) {
			System.out.println("====계산기====");
			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 5. 나머지 ");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();
			
			if(menu < 1 || menu > 5) {
				System.out.println("0~5까지 입력가능합니다");
				continue;
				
			}
			System.out.println("첫번째 숫자입력 >");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자입력 >");
			int num2 = sc.nextInt();
			
			
			switch (menu) {
			case 1 :
				System.out.printf("%d +%d = %d\n", num1,num2, num1+num2);
				result = num1+num2;
				break;
			case 2 :
				System.out.printf("%d - %d = %d\n", num1,num2, num1-num2);
				result = num1-num2;
				break;
			case 3 :
				System.out.printf("%d * %d = %d\n", num1,num2, num1*num2);
				result = num1*num2;
				break;
			case 4 :
				System.out.printf("%d / %d = %.2f\n", num1,num2, num1/(double)num2);   // %.2f 소수점 두자리까지 출력
				result = num1/num2;
				break;
			case 5 :
				System.out.printf("%d %% %d = %d\n", num1,num2, num1%num2);   //printf (조건) 에 맞게 해당 값 출력 [%d 는 num1에 적용... 괄호상 순서대로 적용]
				result = num1%num2;
				break;
			
				
					     
			
		}
			
			System.out.println();
			System.out.println("1. 이어하기 2. 새로하기 0. 종료");
			System.out.println("메뉴선택 >");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				while(true) {
					System.out.println("1. 더하기 2. 뻬기 3. 곱하기  4. 나누기 5. 나머지");
					System.out.println("메뉴선택 >");
					menu = sc.nextInt();
					System.out.println("숫자 입력 >");
					int num = sc.nextInt();
					
		if(menu == 1) {
						System.out.printf("%.1f + %d = %.2f\n", result,num, result+num);
					
						
		}else if(menu == 2) {
						System.out.printf("%.1f - %d = %.2f\n", result,num, result-num);
		}else if(menu == 3) {
					System.out.printf("%.1f * %d = %.2f\n", result,num, result*num);
		}else if(menu == 4) {
				System.out.printf("%.1f / %d = %.2f\n", result,num, result/num);
		}else if(menu == 5) {
			System.out.printf("%.1f %% %d = %.2f\n", result,num, result%num);
			
		}
					System.out.println();
					System.out.println("1. 이어하기 2. 새로하기 0. 종료");
					System.out.println("메뉴선택 >");
					menu = sc.nextInt();
					
					if(menu ==1) {
						
						
					}else if(menu ==2) {
						
					}else if(menu ==3) {
						run = false;
						break;
					}
		
					
					
				}break;
				
				case 2:
				break;
				
				case 0:
				run=false;       // run 이 true 일때만 반복으로 false 일때는 중지
				break;
			default:System.out.println("0~2까지 입력가능");

}

}System.out.println("프로그램 종료");

}

}
