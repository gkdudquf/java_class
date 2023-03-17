package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 9;
//				
//		if(a < 0 ) {
//			System.out.println("음수입니다");
//		} else if(a > 0) {
//			System.out.println("양수입니다");
//		} else if( a == 0) {
//			System.out.println("0입니다");
//		}
//		
//		
//		int Score = 50;
//		
//		if(Score >= 90) {
//			System.out.println("A");
//		} else if (Score >= 80) {
//			System.out.println("B");
//		} else if (Score >= 70) {
//			System.out.println("C");
//		} else if (Score >= 60) {
//			System.out.println("D");
//		} else  {
//			System.out.println("F");
//		]	
		
//		
//		int num = 5;
//				
//		if(num == 0) {
//			System.out.println("0");
//		} else if (!(num % 2 == 0)) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("짝수");
//			
//		}
//		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====계산기====");
//		System.out.print("첫번째 숫자입력> ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴선택> ");
//		int menu = sc.nextInt();
//		
//		if(menu == 1) {
//			System.out.println(num1 + num2); }
//		else if(menu == 2 ) {
//			System.out.println(num1 - num2); }
//		else if(menu == 3 ) {
//			System.out.println(num1 * num2); }
//		else if(menu == 4) {
//			System.out.println(num1 / num2); }
//		else if(menu == 5) {
//			System.out.println(num1 % num2);}
//		else{
//			System.out.println("1~5까지 입력가능합니다");
//		}
		
	
		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "1234";   // id.equals(id) , 아이디 비번 일치 시 로그인, 아니면 실패
		
		
		
		System.out.println("====로그인====");
		
		System.out.println("아이디입력>");
		String loginId = sc.next();
		System.out.println("pw>");
		String loginPw = sc.next();
		
		
		if(loginId.equals(id)  && loginPw.equals(pw)) {
			System.out.println("로그인 성공");}
		
		else if (!loginId.equals(id) && !loginPw.equals(pw)) {
			System.out.println("로그인 실패");}
		
		else if (!loginId.equals(id)) {
			System.out.println("아이디 불일치");}
		
		else  {
			System.out.println("비밀번호 불일치");}
		
		
		
		// 문제) 변수 a가 3의 배수이면 3의 배수, 5의 배수이면 5의 배수, 3,5 둘다인경우
		
//		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();   //     문자입력받을 때 sc.next(), sc.nextLine()
//		
//		
//		
//		
	
		
//		
//		if (a == 0 || (a % 3 != 0 && a % 5 != 0)) {
//			System.out.println("3,5의 배수가 아님");
//		}
//		else if (a % 5 == 0 && a % 3 == 0) {
//			System.out.println("3,5의 배수");
//		}else if(a % 3 == 0) {
//			
//			System.out.println("3의 배수");
//		} else if (a % 5 == 0) {
//			System.out.println("5의 배수");
//		} else {
//				System.out.println("3,5의 배수가 아님");
//			}
//		
//		
//				
//			
//	
//		
		
				
	

}
}



	



