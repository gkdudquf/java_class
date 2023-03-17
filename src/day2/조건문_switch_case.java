package day2;

public class 조건문_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 4;      //해당 a(키 값) 값에 따라 그 해당하는 케이스 번호로 실행됨.   (case 별로 실행, break 가 있어야 이후는 실행되지 않음)
		switch(a)  {    // String 의 경우에는 문자를 실행하기 때문에 해당 값 그대로 케이스 진행 ex) str= "1" , "안녕" , case "1" , "안녕" :
		case 1 :        // 스위치는 범위 선택이 안됨
			System.out.println("1입니다");
			break ;
		case 2 :
			System.out.println("2입니다");
			break ;
		case 3 :
			System.out.println("3입니다");
			break ;
			default :
				System.out.println("1~3까지 입력해주세요");
			
		}
		
		
		
		
		
	}

}
