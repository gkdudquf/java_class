package day4;

import java.util.Scanner;

public class Ex04_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// 클래스 생성 시만, 무조건 첫제목 대문자로 시작
		// 문제 숫자를 계속 입력받으면서 정답을 맞추는 게임
		// 정답이 입력받은 숫자보다 크면 up 출력   // 정답이 입력받은 숫자보다 작으면 dowm 출력    // 정답을 맞추면 정답! 출력 후 반복문 빠져나오기
	
		/// 숫자 랜덤 출력함수 Math.random() 0.1~0.9 까지 / *31 0부터-30까지 / 바깥에 +1    1-해당숫자까지 
//                                                                   ex)    *30)+1     1-30까지       
		
		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 4)+1;      // 1부터 4까지 랜덤적용

		System.out.println(answer);
		

		while (true) {
			
			System.out.println("숫자입력 >");
			 int num = sc.nextInt();

			if (answer ==num) {
				System.out.println("정답!");				
			}else if( answer >num)  {
				System.out.println("up");
			}else if (answer < num) {
				System.out.println("down");
			
			}
		}

		
	}

}
