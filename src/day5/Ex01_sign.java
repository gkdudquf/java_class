package day5;

import java.util.Scanner;

public class Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "test";
		String pw = "1234";
		boolean run = true;
		boolean loginSuccess = false;
		
		while(run) {
			System.out.println("==== 회원가입 ====");
			
			if(loginSuccess) {
				System.out.printf("1. 비밀번호수정 2. 로그아웃(%s님) 0. 종료\n", name);	
			}else {
				System.out.println("1.회원가입 2. 로그인 3. 종료");
			}
			
			
			
			
			System.out.println("메뉴선택>");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(loginSuccess) {
					System.out.println("수정할 비밀번호 입력 >");
					pw = sc.next();
					System.out.println(name + "님의 비밀번호 수정 완료!");
				}else {
					
				
				System.out.println("이름입력> ");        // 
				name = sc.next();
				
				System.out.println("아이디 입력 >");
				id = sc.next();
				System.out.println("비밀번호입력 >");
				pw = sc.next();
				System.out.println(name + "님 회원가입을 축하드립니다!");
				
				}
			}else if (menu == 2) {
				if(loginSuccess) {
					loginSuccess = false;
					System.out.println("로그아웃!");
				} else {
				System.out.println("로그인할 아이디 입력>");
				String loginId = sc.next();
				System.out.println("로그인할 비밀번호 입력>");
				String loginPw = sc.next();
				
				if(loginId.equals(id) && loginPw.equals(pw)) {
					System.out.println("로그인 성공");
					loginSuccess = true;
					
					
				}else {
					System.out.println("로그인 실패");
				}
				
				}	
			}else if(menu == 0) {
				run = false;
				
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
