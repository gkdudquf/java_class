import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectService objectservice = new ObjectService();

		while (true) {
			System.out.println("=====윤하's 쁘띠 쇼핑몰=====");
			System.out.println("1.상품리스트 2.장바구니 3.로그아웃 0.종료");
			System.out.println("메뉴선택> ");
			int menu1 = sc.nextInt();

			if (menu1 == 1) {
				objectservice.findAll();
				while (true) {
					System.out.println("-----------------------------");
					System.out.println("1.구매하기 2.뒤로가기");
					System.out.println("선택> ");
					int menu2 = sc.nextInt();
					if (menu2 == 1) {
						objectservice.buy();
					} else if (menu2 == 2) {
						break;
					} else {
						System.out.println("다시입력");
					}
				}

				System.out.println();

			} else if (menu1 == 2) {
				objectservice.save();

			} else if (menu1 == 3) {

			} else if (menu1 == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}
	}
}
