package day7;

public class Animal {

	String test;
	private String name; // private : 같은 클래스에서만 접근가능 /
	private String sound;
	private int leg;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;                   // this 자기자신의 객체의 이름
	}
	public String getSound() {
	return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getLeg() {
		return leg;	
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	// getAge()
	// setAge() => 실행하면 나이가 1 증가
	public int getAge() {
		return age;	
	}public void setAge(int age) {
		this.age = age;
	}
	
	public void ageUp() {
		age += 1;
	}
	
	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s 웁니다\n",leg ,name, sound );
	}
	
}
