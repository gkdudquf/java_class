package day13;
//예외클래스
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(9/0); //에러

		try { // 에러가 들어갈 가능성이 있는 코드를 넣음
			int[] array = new int[5];
			System.out.println(array[5]); //에러가 안나면 0이 뜨고 빠져나가서 맨밑 프로그램 끝 뜸
			System.out.println(9/0); // 위에 에러 먼저 캐치하기 때문에 밑에 있는 에러는 안뜸
		}catch(ArithmeticException a) {
			System.out.println("0으로 나눌수없습니다");
		} catch (Exception e) { // 그 에러가 잡혔을 때 무엇을 할지 적용
			System.out.println("인덱스 초과");
		}finally { //오류가있든없든 무조건 실행
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 끝");
	}
}
