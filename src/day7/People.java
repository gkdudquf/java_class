package day7;

public class People {

	private String name;
	private int age;

	// 생성자 만들기
	// 1. 기본생성자
	// 2. 매개변수(String) 생성자
	// 3. 매개변수(String, int) 생성자

	public People() { // 생성자는 클래스와 이름 동일
	}

	public People(String name) {
		this.name = name;
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;

	}
	// 메소드 만들기
	// 1. name 의 get,set 메소드
	// 2. age 의 get,set 메소드
	// 3. print 메소드 / 출력형식 홍길동의 나이는 99세 입니다.

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.printf("%s의 나이는 %d입니다\n", name, age);
	}
	public void ageUp() {
		this.age++;
	}
	public void ageUp2(int a) { // 호출하는 숫자만큼 age에 해당 호출값을 올린다.
		this.age += a;
	}
	public void ageUp3() {
		this.age *= 2 ;              //  > age 를 2배로 만드는 경우,
	}
	public void ageUp4(String o, int  num) {
		if(o.equals("+")) {
			this.age += num;
			
		}else if(o.equals("-")) {
			this.age -= num;
		}else if(o.equals("*")) {
			this.age *= num;
		}else if(o.equals("/")) {
			this.age /= num;
		}
	}
}
