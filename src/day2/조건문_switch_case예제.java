package day2;

import java.util.Scanner;

public class 조건문_switch_case예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제) 변수 a 에 숫자를 입력받고, 1~12까지 각각 매월 영어로 출력해보세요.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월을 입력해주세요> ");
//		int a = sc.nextInt();
//		
//		
//	
//		
//		switch(a)  {    
//		case 1 :        
//			System.out.println("January");
//			break ;
//		case 2 :
//			System.out.println("February");
//			break ;
//		case 3 :
//			System.out.println("March");
//			break ;
//		case 4 :
//			System.out.println("April");
//			break ;
//		case 5 :
//			System.out.println("May");
//			break ;
//		case 6 :
//			System.out.println("June");
//			break ;
//		case 7 :
//			System.out.println("July");
//			break ;
//		case 8 :
//			System.out.println("August");
//			break ;
//		case 9 :
//			System.out.println("September");
//			break ;
//		case 10 :
//			System.out.println("October");
//			break ;
//		case 11 :
//			System.out.println("November");
//			break ;
//		case 12 :
//			System.out.println("December");
//			break ;
//			
//			default :
//				System.out.println("   ");
//			
//		}
		
		
		
		
		//문제_ 숫자 두개를 입력받고,
		//메뉴에서 하나를 선택하여 결과 출력 - 계산기 응용
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자입력> ");
		int num1  = sc.nextInt();
		System.out.println("두번째 숫자입력> ");
		int num2  = sc.nextInt();
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.print("메뉴선택> ");
		int menu = sc.nextInt();
		
		switch(menu)  {    
		case 1 :        
			System.out.println(num1 + "+"+ num2 + "=" + (num1 + num2));
			break ;
		case 2 :
			System.out.println(num1 + "-"+ num2 + "=" + (num1 - num2));
			break ;
		case 3 :
			System.out.println(num1 + "*"+ num2 + "=" + (num1 * num2));
			break ;
		case 4 :
			System.out.println(num1 + "/"+ num2 + "=" + (num1 / num2));
			break ;
		case 5 :
		System.out.println(num1 + "%"+ num2 + "=" + (num1 % num2));
		break ;
		default :
			System.out.println("다시 입력해주세요");

		
		}
		
		
	
		
		
	}

}
