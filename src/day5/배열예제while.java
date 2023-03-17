package day5;

import java.util.Scanner;

public class 배열예제while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // 배열예제 while 버전

		int[] num = new int[10];

		
		int j = 0;

		while (true) {                                 //while(j>=10)      // 출력 재확인요망
			System.out.println("숫자 입력 >");
			int number = sc.nextInt();

			if (number % 2 == 0) {
				num[j] = number;
				j++;
			}
			if (j == 10) {
				break;
			}

		}

	}
}
