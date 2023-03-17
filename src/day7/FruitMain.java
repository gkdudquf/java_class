package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit(); // Fruit apple = new "Fruit"(); > " Fruit" 가 생성자

		apple.setName("사과");           // setName 은 필드. getName 은 메소드
		apple.color = "빨강";           // 메소드를 만들어 놔야 sysout 에서 출력가능  , 생성자는 필드 값을 집어넣고 객체를 만들고 싶을 때 사용한다.
		apple.isSeed = true;
		System.out.println(apple.getName() + apple.color + apple.isSeed);

		Fruit apple1 = new Fruit("사과", "빨강", true);
		System.out.println(apple1.getName() + apple1.color + apple1.isSeed);
//		Fruit banana = new Fruit();
//		banana.setName("바나나");
//		banana.color = "노랑";
//		banana.isSeed = false;
		
// 문제 ) 생성자를 통해 출력 - 멜론		                           //  ☆오버로딩 > 매개 변수를 다르게 하는 생성자를 여러 개 선언하는 것☆ >중요!!!
		Fruit melon = new Fruit("멜론", "초록", true) ;      //  *  메소드 이름 동일하게 쓰게 만드는 경우 (원래는 안됨), 매개변수가 다른경우 가능 "오버로딩"
		                                                  //  1)  public String getName(String s) {retrun null; }  
// 문제) 오렌지=                                              //  2) public String getName(String s, String i) {retrun null; }  , 사용가능
		Fruit orange = new Fruit();                        // 같은 타입의 매개변수를 순서만 바꾸는 것은 오버로딩이 아님
		orange.setName("오렌지");
		orange.color = "주황";
		orange.isSeed = true;		
	}
}
