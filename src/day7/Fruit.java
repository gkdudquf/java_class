package day7;

public class Fruit {

	private String name;
	String color;
	boolean isSeed;

	// 생성자는 1.리턴타입이 없음, 생성자는 2.클래스이름과 동일
	public Fruit() {
		System.out.println("기본생성자"); // 생성자는 객체가 생성되면 자동적으로 호출 (숨겨져있음, 기본생성자) /모든 클래스에 기본적으로 하나 이상 있음
	} // ex) public Fruit () { } 기본 생성자로 숨겨져 있음.

	
	public Fruit(String name, String color, boolean isSeed) {
		System.out.println("생성자 1");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
