package day5;

public class 배열예제w숙제버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 문제_ 배열 num의 값을 앞으로 한칸씩 당기시오.      // 응용 문제 / 과감히 스킵하기 - 참고용//

		// {2,3,4,5,6,7,8,9,10,1}   로 출력되도록 진행
		
		
//		int [] num = {1,2,3,4,5,6,7,8,9,10};
//		int num0 = num[0];
//	
//		for(int i = 0; i<num.length; i++) {
//			System.out.println(num[i]);
//			if(i == num.length-1) {
//				num[i] = num0;         // //   2. num 의 마지막 인덱스는  i == num.length-1  는 해당 마지막 인덱스로 num 0 칸일때 해당 값을 넣도록 진행
//				break;                                      //  break 대신   else{num[i] = num[i+1]; }  도 가능
//			}
//			
//			num[i] = num[i+1];        //    1.  i의 0의 인덱스 칸에  num i+1 값을 진행
//			                         
//		}
//		
//		for(int i = 0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//출력값을 한칸씩 당기시오. {10,1,2,3,4,5,6,7,8,9}
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};                       //
		
		int lastNum = num[num.length-1];      // int lastNum = num[9];  도 가능
		                                      //num.length =  10  , num.length-1 =  i 인덱스 9번째방
		
		for(int i = num.length-1; i>=0 ;i-- ) {
			
			if(i == 0) {
				num[i] = lastNum;
				break;                           //  break;  대신  >     else{ num[i] = num[i-1]; }   가능 
			}
			
			
			num[i] = num[i-1];                   // num[i] = num[i-1]; > num[9] = num [8]; .... 으로 진행 
		
		}
	
		
		
	}

}
