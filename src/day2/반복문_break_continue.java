






                                                                                                                                          package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++) {                            // 조건문에서 빠지는 경우, 거짓이거나 or break 를 만나거나
//			System.out.println(i);
//			if(i == 5) {
//				break;
//				
//			}
//		}
//		

//		System.out.println("끝");

		// 구구단 1-9단까지의 경우

		for (int dan = 2; dan < 10; dan++){ // 9번 반복 4-7단까지
			
			if( dan <4) {
				continue;
				
			}else if ( dan == 8) {
				break;
			}
			
			
			System.out.println(dan +"단");
			
			
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
				

			}
			
				
				
				
				
				
				
				
				
			
			
		}
//			
//			
//			
//			System.out.println();
//			if (dan == 5) {
//				break;
//			}
//			
//			
//			
//
//		}

//		
//		for(int i=1; i<=10; i++) {
//			if( i == 5) {
//				continue;                    // continue 는 해당 조건 맞으면 이어서 진행, break 는 조건 맞으면 중지
//			}
//			System.out.println(i);
//		}
//		
//		

		

	}
}
