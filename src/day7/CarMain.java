package day7;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		Car c2 = new Car();
		c1.name = "그랜저";     // c1.name = "그랜저"; > .의 개념 = ~의 / c1 '의' name 은 그랜저이다.
		c1.tire = "한국";      // 해당 String 과 int 의 기본값은 null, 0 이다.
		c1.color = "빨강";
		c1.speed = 10;
		
		// 제네시스, 넥센타이어, 검정, 20 인 경우
		c2.name = "제네시스";
		c2.tire = "넥센타이어";
		c2.color = "검정";
		c2.speed = 20;
		
	
		c1.speedRun(100);
		c2.speedRun(200);
		
		c1.print();                 
		c2.print();
		
		
		//출력예
		// c1 => 빨강
		// c2 => 검정
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());     // sysout(리턴값) 입력 / 메소드 확인하고 진행
		
		
	}

}
