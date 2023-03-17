package day5;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name1 = "홍길동";    //변수를 여러개 저장 가능한 '배열' / 변수는 원래 하나의 값만 저장가능
		String name2 = "이순신";
		String name3 = "심청이";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

///////////////////////////////////////////////////////////////////////////
		
		String[] name = new String[3];  //문자열이 들어갈 수 있는 배열3칸 만들기 (하나의 큰 곳에 3칸막이 로 나눠져있다) 
		
		name[0] = "배열홍길동";
		name[1] = "배열이순신";
		name[2] = "배열심청이";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		
		
		////////////////////////////////////////////////////////////////////////////////////
		
		
		int [] i = new int[10];         // 정수가 들어갈 수 있는 배열 10칸 만들기-- 배열의 각각의 방을 인덱스라고 부른다.0부터 시작 ex 인덱스 0-2까지 있다.
		//int [] i = {34,35,36,37,3,39,44,55,36,39} >  배열과 값을 동시에 만드는경우        //     int i[] = new int[10];    , 괄호가 i 에 붙어도 상관무 
		
		
		i[0] = 34;
		i[1] = 35;
		i[2] = 36;
		i[3] = 37;
		i[4] = 3;
		i[5] = 39;
		i[6] = 44;
		i[7] = 55;
		i[8] = 36;
		i[9] = 39;
		
		for(int j = 0 ; j<i.length; j++) {
		System.out.println(i[j]);	     //    i의 길이는 10
		}
		
		
	}

}
