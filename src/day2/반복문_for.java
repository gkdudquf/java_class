package day2;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {        // 세미콜론; 기준으로 구역을 나누어 변수를 선언 , i++ 는 i=i+1; 약자
			System.out.println("안녕");   // 해당 값(i)이 조건에 맞으면 해당 내용 반복 실행 , 조건 불일치하면 반복 종료 , 대부분 i=0 으로 진행
			
		}                                // i=0; i<10; 10번 반복   , i=0; i<100; 100번 반복
		System.out.println("끝");
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//1~10 까지 홀수 출력
		for(int i=1; i<=10; i=i+2) {        
			System.out.println(i);   
			
		}                                
		
		
		//1~10 까지 짝수 출력
				for(int i=2; i<=10; i=i+2) {        
					System.out.println(i);   
					
				}      
		
		
		
		
	}

}
