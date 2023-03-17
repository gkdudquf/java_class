package day7;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		a.test = "테스트입니다";
		System.out.println(a.test);
		
		a.setName("강아지");
		System.out.println(a.getName());
		
		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName() + "/" + dog.getSound() + "/" + dog.getLeg());
		
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setLeg(4);
		System.out.println(cat.getName() + "/" + cat.getSound() + "/" + cat.getLeg());
	
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("꼬끼오");
		chicken.setLeg(2);
		chicken.print();
	
	 
		Animal elephant = new Animal();
		elephant.setName("꼬끼리");
		elephant.setSound("뿌우우");
		elephant.setLeg(4);
		elephant.setAge(8);              //elephant.ageUp(); > 있을때마다 1씩 증가, 식 추가 시 마다 1씩증가 / 2개 입력 시 +2 업
		elephant.ageUp();
		System.out.println("코끼리 나이는 " + elephant.getAge());
		elephant.print();
		
		
		
	}

}
