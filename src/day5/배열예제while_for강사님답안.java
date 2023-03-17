package day5;

import java.util.Scanner;

public class 배열예제while_for강사님답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 문제) 10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int j = 0;
		
		while(j >= 10) {
			System.out.print("숫자입력> ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				num[j] = number;
				j++;
			}
		}
		
		for(int i=0; i<num.length; i++) {
		System.out.print("숫자입력> ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				num[i] = number;
			}else {
				i--;
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}	
		
	}
}