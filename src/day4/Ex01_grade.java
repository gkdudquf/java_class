package day4;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {                                    //while 이 true 인경우, break 여야 중지가능
			System.out.println("====성적====");
			System.out.println("이름입력 >");
			String name = sc.next();			
			System.out.println("국어점수 입력 >");
			int kor = sc.nextInt();
			System.out.println("영어점수 입력 > ");
			int eng = sc.nextInt();
			System.out.println("수학점수 입력 >");
			int mat = sc.nextInt();
			int total = kor + eng + mat;
			double avg = total / 3f; // 3f =3.0
			char grade = ' ';

			if (avg >= 90) {                   // 반복문 빠지는경우, 조건 false 거나 break;거나
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';

			} else if (avg >= 60) {
				grade = 'D';

			} else {
				grade = 'F';

			}

			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name, kor, eng, mat, total,avg, grade);

			// %d = 숫자, %s = 문자열, %f = 실수, %c= 문자

			System.out.print("/n다시 입력(Y/y) > ");
			String reStart = sc.next();
			
			if(!(reStart.equals("Y") || reStart.equals("y"))) {     //Y,y 를 누르지 않았을떄, 종료 후 멈춤
				System.out.println(" 종료 ");                        // reStart 시행하면 무조건 다시 실행하나, 중지를 원할 때 ! 부정 사용
				break;
				
				}

			
		}
		
		
		

	}

}
