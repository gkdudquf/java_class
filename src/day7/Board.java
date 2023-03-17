package day7;

public class Board {

	private long no;
	private String title;
	private int cnt;
	private boolean open;

	// 생성자
	// 1. 기본생성자
	// 2. 전체 다 매개변수 생성자

	public Board() {
	}
	public Board(long no, String title, int cnt, boolean open) {   // 매개변수를 전체 다 받는 경우,

		this.no = no;                                        // long 길이제한 없는 정수의 숫자 입력, long no 해당 숫자의 no 넘버 ex) no.1234
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	// 메소드
	// 1.cnt (조회수) 1씩 올리기 메소드
	// 2. open (공개/비공개) 변경 메소드
	// 3. 전체 get, set 메소드

	public int cntUp() {      // >  단순 조회수 올림은 void 필요없음
		this.cnt++;           // 조회수를 1씩 올린다.
		return cnt;          //  조회수 결과를 확인하고 싶을 때, void 를 int 로 바꾸고 return 진행
	}
	public void toggleopen() { // toggle 디지털 신호가 0,1 되풀이 되는 상태
		open = !open;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public int getCnt() {
		return cnt;
	}
}
