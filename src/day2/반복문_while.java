package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = 0;
//		int i = 1;
//		
//		while(i <= 10000 ) {
//			sum = sum + i;
//			i++;
//
//			
//			
//		}
//		
//		System.out.println(sum);

		// 문제 숫자를 계속 입력받다가 0이 입력되면 반복문 종료
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력> ");
//		int num = sc.nextInt();
//
//		while (num != 0) {
//			System.out.println("숫자입력> ");
//			num = sc.nextInt();
//
//		}
//
//		System.out.println("끝");
//		
//		
		// 숫자 무한반복 2탄의 경우

//		Scanner sc = new Scanner(System.in);
//		
//		int num = -1;
//		
//
//		while (num != 0) {
//			System.out.println("숫자입력> ");
//			num = sc.nextInt();
//
//		}
//
//		System.out.println("끝");
//		

		// 문제 숫자를 계속 입력받다가 3의 배수, 5의 배수, 3과5의 배수를 출력하는데 0이 입력되면 반복문을 끝내시오.

		Scanner sc = new Scanner(System.in);

		int num = -1;

		while (num != 0) {
			System.out.println("숫자입력 > ");
			num = sc.nextInt();

			if (num != 0) {
				if (num % 3 == 0 && num % 5 == 0) {
					System.out.println("3과 5의 배수입니다");
				} else if (num % 3 == 0) {
					System.out.println("3의 배수입니다");
				} else if (num % 5 == 0) {
					System.out.println("5의 배수입니다");
				} else {
					System.out.println("3과 5의 배수가 아닙니다");
				}

			}
		}
		System.out.println("끝");

	}
}
