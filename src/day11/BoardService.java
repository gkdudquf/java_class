package day11;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());sc.nextLine();
		boolean success = br.save(boardDTO);
		if(success) {
			System.out.println("\n게시글 등록완료!");
		}else {
			System.out.println("\n게시글 등록실패..");
		}
	}
	public void findAll() {
		List<BoardDTO> list = br.findAll();
		System.out.println("\n글번호\t제목\t\t작성자\t조회수\t게시일");
		System.out.println("----------------------------------------------------------");
		for(BoardDTO b : list) {
			b.print();
		}
	}
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		BoardDTO boardDTO = br.findById(bno);
		if(boardDTO == null) {
			System.out.println("\n찾을 수 없는 글번호 입니다.");
		}else {
			boardDTO.increaseCnt();
			System.out.println("\n글번호\t제목\t\t작성자\t조회수\t게시일");
			System.out.println("----------------------------------------------------------");
			boardDTO.print();
		}
	}
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next();sc.nextLine();
		BoardDTO b = br.findById(bno);
		if(b == null) {
			System.out.println("\n찾을 수 없는 글번호 입니다.");
		}else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자> ");
			boardDTO.setWriter(sc.next());
			if(br.update(boardDTO, bno)) {
				System.out.println("\n업데이트 성공!");
			}else {
				System.out.println("\n업데이트 실패..");
			}
		}
	}
	public void delete() {
		System.out.print("삭제할 글번호> ");
		String bno = sc.next();
		if(br.delete(bno)) {
			System.out.println("\n게시글이 삭제되었습니다.");
		}else {
			System.out.println("\n찾을 수 없는 글번호 입니다.");
		}
	}

}
