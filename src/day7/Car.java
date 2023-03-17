package day7;

public class Car {

	// 메인  메소드 없음              // 0302 day7 클래스 이론 정리
	                             // 클래스(class) 란, 객체를 만들기 위해 설계도가 필요한데 그에 관한 자바에서 사용하는 설계도
	String name;                 // 클래스 타입과 클래스 객체를 선언한다. ex) Car c1 = new car();
	String tire;
	String color;               // > String color; 이런식으로 선언한 것들을 , '필드' 라고 부른다. / "객체의 고유 데이터" > 변수는 메소드 안에서 사용가능, 필드느 상관 무
	int speed;
	
	public void run() {        // > public void run() {speed = speed + 1;  }    > '메소드' 라고 부른다.=실행 상자 >(동작을 표현) / '호출'
		speed = speed + 1;     // speed += 1; 와 같다
		
	}
	public void speedRun() {      //> 메소드 뜯어보기 / public "접근제한" / "리턴타입" > 리턴하는결과의 타입을 표시, 없으면 'void' / "매개변수" (매개변수) 
		speed = speed + 2;	
	}	
	// 메소드 print 만들기
	// 기능 : 이름, 타이어, 색상, 속도를 출력
	
	public void print () {
	System.out.println(name+" = "+tire+" = "+color+"  = "+speed);	
	}
	// 문제
	// 접근제한자 public
	//리턴타입 없음
	// 메소드명 speedRun
	// 매개변수 int s
	// 실행문구 '그랜져 speedRun 메소드 호출됌' 출력
	// 스피드를 s만큼 올리기
	
	public void speedRun(int s) {
		System.out.println( name + " speedRun 메소드 호출됌 ");	
		speed += s;
	}
	
	// 문제
	// 접근제한자 public
	//리턴타입 ? > String
	// 메소드명 getColor
	// 매개변수 없음
	// 실행문구 컬러를 리턴
	
	public String getColor () {
		return color;
	}
	
}
