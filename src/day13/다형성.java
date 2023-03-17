package day13;

public class 다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		오버라이딩
//		Dog d = new Dog();
//		d.eat();
//		d.cry();
		
		//다형성
		//부모클래스의 객체에 자식생성자로 사용
		//특징. 자식객체로 생성하면 오버라이딩 된것만 자식꺼 사용
//		Animal a = new Dog();
//		a.eat(); //먹다
//		a.cry(); //멍멍
////		a.run(); //오버라이딩 안된거라 안되는거임
		
		Animal a = new Animal();
		test(a);
		
		
	}
	public static void test(Animal a) {
		a.cry();
	}
	
	

}
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void cry() {
		System.out.println("울다");
	}
}
class Dog extends Animal{
	public void cry() {
		System.out.println("멍멍");
	}
	public void run() {
		System.out.println("걷다");
	}
}
class Cat extends Animal{
	public void cry() {
		System.out.println("야옹");
	}
}