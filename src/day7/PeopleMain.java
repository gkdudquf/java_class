package day7;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체만들기
		// 1. 기본생성자 사용하여 people1 객체만들기
		// - 객체 생성후, name, age 필드 주입
		// - print 메소드 호출
		
		People People1 = new People();
		People1.setName("홍길동");
		People1.setAge(90);
		
		People1.ageUp2(7);               // 해당 숫자만큼 나이를 올리고 싶을 때,
		People1.print();
		
		

		// 2. 매개변수(String) 생성자 를 사용하여 people2 객체만들기
		// - 객체 생성후, age 필드 주입
		// - print 메소드 호출

		
		People People2 = new People("이순신");
		People2.setAge(80);
		People2.print();
		
		
		// 3. 매개변수(String,int) 생성자 사용하여 people3 객체만들기
		
		// - print 메소드 호출

		People People3 = new People("심청이", 70);
		People3.print();
		
		
		People1.ageUp4("-",50);     // 해당값에 맞춰 if 조건문에 해당하면 해당값으로 출력
		People3.ageUp4("*",3);
		
		
	}
}
