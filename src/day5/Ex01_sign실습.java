package day5;

import java.util.Scanner;

public class Ex01_sign실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                         // 로그인성공 실패 여부 미작성

		Scanner sc = new Scanner(System.in);

		String name = "홍길동";
		String id = "test";
		String pw = "1234";

		boolean run = true;

		while (run) {
			System.out.println("====사이트====");

			System.out.println("1.회원가입 2. 로그인 0. 종료");
			System.out.println("메뉴선택 >");

			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("이름 입력 >");
				name = sc.next();
				System.out.println("아이디 입력 >");
				id = sc.next();
				System.out.println("비밀번호 입력 >");
				pw = sc.next();
				System.out.println("회원가입완료");

			} else if (menu == 2) {
				System.out.println("이름 입력 >");
				name = sc.next();
				System.out.println("아이디 입력 >");
				id = sc.next();
				System.out.println("비밀번호 입력 >");
				pw = sc.next();
				System.out.println("로그인 성공!");
				System.out.printf("1. 비밀번호 수정 2. 로그아웃(%s님)", name);
				System.out.println("메뉴선택 >");
				int loginsc = sc.nextInt();

				if (loginsc == 1) {
					System.out.println("비밀번호 입력 >");
					pw = sc.next();
					System.out.println("수정완료 ! 다시 로그인 해주세요");
				} else {
					System.out.println(name + "님 로그아웃 되었습니다");
				}

			} else {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}

}
