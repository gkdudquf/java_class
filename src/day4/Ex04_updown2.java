package day4;

import java.util.Scanner;

public class Ex04_updown2 {

	public static void main(String[] args) {
		// 문제) 숫자를 계속 입력받으면서 정답을 맞추는 게임
		//		정답이 입력받은 숫자보다 크면 up출력
		//		정답이 입력받은 숫자보다 작으면 down출력               // 랜덤게임 응용버전  (강사님 업글 답안)
		//		정답을 맞추면 정답! 출력 후 반복문 빠져나오기
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;        // 1-31 까지 랜덤으로 정답이 나옴, 숫자 입력 시 정답이면 시도횟수 및 점수가 나온다
		System.out.println(answer);
		int cnt = 0;
		
		while(true) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			cnt++;
			
			if(answer == num) {
				String str = "";
				if(cnt == 1) {
					str = "perfect";
				}else if(cnt <= 3) {
					str = "great";
				}else if(cnt <= 5) {
					str = "good";
				}else if(cnt <= 10) {
					str = "normal";
				}
				System.out.println("시도횟수 : "+cnt+" 정답 "+str);
				break;
			}else if(cnt >= 10) {
				System.out.println("game over");
				break;	
			}else if(answer > num) {
				System.out.println("up");
			}else if(answer < num) {
				System.out.println("down");
			}
		}
		
		// 1번시도 : perfect 
		// 3번시도 : great 
		// 5번시도 : good
		// 10번시도 : normal
		// 10번시도 넘어가면 game over
		
	}

}
