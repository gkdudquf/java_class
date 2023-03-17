package day4;

import java.util.Scanner;

public class Ex03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);       // (정렬 문제)
	
		while(true) {                               //  * 숫자상 범위 지정하여 해당 값으로 차순 진행   ex) 5,10 의경우 5-10  사이의 차순으로 진행
			System.out.println("====정렬====");
			System.out.println("첫번째숫자입력 >");
			int num1 = sc.nextInt();
			System.out.println("두번째숫자입력 >");
			int num2 = sc.nextInt();
			
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
			
			
			
			System.out.println("1. 오름차순 2. 내림차순");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();
		
		if(menu == 1) {
			
			for(int i = num1 ; i<=num2  ; i++ ) {       // num1 < num2 해당 조건은 실행가능 , int tmep 를 선언하여 해당값을 바꿈 (if 상단 확인)
			System.out.println(i);
				
			}
		}else if(menu == 2) {
		
			for(int i = num1 ; i >0 ; i-- ) {
			System.out.println(i);
		}
		
		}else {
			System.out.println("다시 입력하세요");
		}
		
		
		
		}
		
		}
		
		
	
}
