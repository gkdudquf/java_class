package day3;

import java.util.Scanner;

public class Ex01_로그인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =  new Scanner(System.in);
		String id = "test";
		String pw = "1234";
		
		boolean run = true;
		while(true) {
			System.out.println("====로그인====");
			System.out.println("아이디 입력 > ");
			String loginId  = sc.next();
			System.out.println("비밀번호 입력 > ");
			String loginPw  = sc.next();
		
			if(loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공!");
				run = false;
			} else {
				System.out.println("로그인 실패ㅜ");
				System.out.println("다시 시도 (Y/y)");
				String restart = sc.next();
				if(!(restart.equals("Y") || restart.equals("y"))) {
				System.out.println("로그인 종료");
				break;
				
				}
				}
		}
				
}
}
