package day5;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 ) 문자열 배열에 문자열 5개를 할당하고, 전체 출력
//		String[] str = { "홍", "김", "이", "최", "차" }; // 1.문자열을 0,1,2... 번으로 i[0] = "홍"; 선 나열후, for 문 반복으로 진행하거나,
//													// 2.한꺼번에 {해당 값 나열} 후, for 문 반복 실행하여 출력할 수도 있다.
//
//		for (int j = 0; j < str.length; j++) {       //
//			System.out.println(str[j]);
//		}

		// 문제 ) int 배열 10칸에 값을 할당하고, 총 합계 출력

//		int[] num = { 1, 2, 98, 4, 75, 10, 7, 8, 12, 13 };   // 인덱스 i가 짝수의 합 // 
//		
//		int sum = 0;
//		for (int i = 0; i < num.length; i++) {
//	
//		if(num[i] % 2 == 0) {
//			sum = sum + num[i];       // sum += num[i];  동일
//			
//		}
//		}
//		System.out.println(sum);

		// 문제) 1-100까지 만들기 배열

//		int [] num = new int[100];
//		
//		for (int i =0 ; i < num.length; i++) {
//			num[i] = i+1;      // i 상으로는 99까지 출력되기에 i+1 입력 및 100까지 출력가능 / 인덱스 넘 0부터 -99번째방에 최대 100이 들어감
//		
//		}
//
//		for (int i =0 ; i < num.length; i++) {
//			System.out.println(num[i]);
//	}
		// 10개의 방을 생성

//		Scanner sc = new Scanner(System.in); 
//		
//		int[] num = new int[10];
//		
//
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자입력 >");
//			num[i] = sc.nextInt();			
//			
//		}
//		
//		for (int i = 0; i < num.length; i++) {     //int 는 0을 기본으로 출력, String 은 null
//			System.out.println(num[i]);
//			
//		}
// 문제) 10칸짜리 정수배열 선언 후 값을 입력받고, 값이 3의 배수의 합 출력

//		Scanner sc = new Scanner(System.in);
//		
//		
//		int [] num = new int [10];
//		
//		
//		for(int i = 0; i <num.length; i++) {
//			System.out.println("숫자입력 >");
//			num[i] = sc.nextInt();
//			
//		}                                 
//		int sum = 0;                                                                                                                                          
//		for(int i=0;i<num.length;i++) {
//			if(num[i] % 3 ==0) {
//				sum += num[i];
//			}
//		}	
//		System.out.println(sum);

		// 3의배수,5의배수만 출력, 해당 갯수도 확인가능하게 만들기(3,5, 3,5배수 개수)
//		Scanner sc = new Scanner(System.in);                            
//
//		int[] num = new int[10];
//		int cnt3 = 0;
//		int cnt5 = 0;
//		int cnt35 = 0;
//
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자입력 >");
//			num[i] = sc.nextInt();
//
//		}
//
//		for (int i = 0; i < num.length; i++) {              //1. 중복 카운트 로 출력할 때, 전부 각각의 if 로 조건(else if가 아닌)  or 
//			if (num[i] % 3 == 0 && num[i] % 5 ==0) {	    //2.  중복되야하는 cnt 에 해당 변수 증감을 전부 입력  ex)cnt 35++; cnt3++; cnt5++;
//				cnt35++; 
//				cnt3++;
//				cnt5++;
//			
//
//			} else if (num[i] % 3 == 0) {
//				
//				cnt3++;
//				
//				
//			} else if (num[i] % 5 ==0) {
//				cnt5++;  
//				
//			}
//		}
//		System.out.println("3,5의 배수의 갯수는" +cnt35);
//		System.out.println("3의 배수의 갯수는 " +cnt3);
//		System.out.println("5의 배수의 갯수는 " +cnt5);

		/////////////////////////////////////////////
		// 문제) 10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력 (짝수가 끝날때까지 무한반복) ,

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {    //i 가 0-9까지 반복을 한다.
			System.out.println("숫자 입력 >");
			int number = sc.nextInt();
			if(number % 2== 0) {
			num [i] = number;	                // 만약 숫자가 짝수인 경우에는 해당 인덱스로 들어간다로 조건문 생성
			} else {
				i--;                            // 홀수인 경우에는 인덱스가 증감이 아닌 감소로 진행 / 해당 인덱스가 끝날때까지 무한반복
			}
		}

		
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}

			

	}
}
