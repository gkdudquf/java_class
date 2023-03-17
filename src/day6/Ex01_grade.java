package day6;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);            

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		char[] grade = new char[5];
		int cnt = 0;

		while (true) {
			System.out.println("====성적시스템====");        // 해당 입력한 성적을 저장하여 리스트 조회 시, 실행 시 입력한 모든 값을 한꺼번에 리스트로 보여준다.
			System.out.println("1. 성적등록 2. 리스트 0. 종료");
			System.out.println("메뉴선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("이름입력> ");
				name[cnt] = sc.next();                  // 처음에는 cnt 0으로 시작후, 반복 종료 후 cnt ++로 1씩 증가하여 해당 인덱스 증가하여 저장 진행
				System.out.println(" 국어점수입력>");
				kor[cnt] = sc.nextInt();
				System.out.println(" 영어점수입력>");
				eng[cnt] = sc.nextInt();
				System.out.println(" 수학점수입력>");
				mat[cnt] = sc.nextInt();
				total[cnt] = kor[cnt] + eng[cnt] + mat[cnt];
				avg[cnt] = total[cnt] / 3f;

				if (avg[cnt] >= 90) {
					grade[cnt] = 'A';
				} else if (avg[cnt] >= 80) {
					grade[cnt] = 'B';
				} else if (avg[cnt] >= 70) {
					grade[cnt] = 'C';
				} else if (avg[cnt] >= 60) {
					grade[cnt] = 'D';
				} else {
					grade[cnt] = 'F';
				}
				System.out.println("*성적등록완료* \n");
				cnt++;    //입력될때마다 계속 1씩 증가 카운트

			} else if (menu == 2) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("-------------------------------------------------------");
				for(int i= 0; i<cnt ; i++) { // name.length 로 지정되면 인덱스를 5로 저장해놔서, 미입력 null 로 조회 , 해당 입력값만 카운트 위해 조건식의 범위를 cnt로 지정 
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name[i], kor[i], eng[i],mat[i],total[i],avg[i] ,grade[i] );
				}
				
				

			} else if (menu == 0) {
				break;
				
			} else {
				System.out.println("다시입력");
			}

			System.out.println("프로그램 종료");

		}

	}

}
