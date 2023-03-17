package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//싱글톤 객체 (객체 하나 만들어서 돌려쓸때)
public class UserService {
	private static UserService service = new UserService();
  
	
	private UserService() {
	}

	public static UserService getInstance() {
		return service;
	}

	UserRepository repository = UserRepository.getInstance();
	Scanner sc = new Scanner(System.in);
	String loginEmail = null;
	String loginPassword = null;



	public void save() {
		UserDTO userDTO = new UserDTO();
		
		String email = Util.overlapCheck(repository.findAll(), "이메일");
		
		System.out.print("이메일 입력> ");
		userDTO.setEmail(sc.next());
		System.out.print("비밀번호 입력> ");
		userDTO.setPassword(sc.next());
		System.out.print("이름 입력> ");
		userDTO.setName(sc.next());
		System.out.print("나이 입력> ");
		userDTO.setAge(sc.nextInt());
		
		userDTO.setGender(Util.genderCheck());
		if (repository.save(userDTO)) {
			System.out.println("등록 완료!");
		} else {
			System.out.println("등록 실패");
		}
	}

	public boolean loginCheck() {
		System.out.print("이메일 입력> ");
		String email = sc.next();
		System.out.print("비밀번호 입력> ");
		String password = sc.next();

		if (repository.loginCheck(email, password)) {
			System.out.println("로그인 성공");
			loginEmail = email;
			loginPassword = password;
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}

	}

	public void findAll() {
		List<UserDTO> list = repository.findAll();
		System.out.println("이메일\t\t비밀번호\t이름\t성별\t나이");
		System.out.println("----------------------------------------------");
		for (UserDTO userDTO : list) {
			System.out.println(userDTO.toString());
		}
	}

	public void findById() {
		if(loginEmail == null || loginPassword == null) {
			System.out.println("로그인 오류");
			return;
		} // -> 있어도되고 없어도되고
		UserDTO userDTO = repository.findById(loginEmail, loginPassword); // 로그인된 이메일과 비밀번호를 넘길거임
		if (userDTO == null) {
			System.out.println("세션오류");
		} else {
			System.out.println("이메일\t\t비밀번호\t이름\t나이\t성별\t가입일");
			System.out.println("----------------------------------------------");
			System.out.println(userDTO.toString());
		}

	}
	public void logout() {
		loginEmail = null;
		loginPassword = null;
		System.out.println("로그아웃");
	}
	public void update() {
		UserDTO userDTO = new UserDTO();
		System.out.print("수정할 비밀번호> ");
		userDTO.setPassword(sc.next());
		System.out.print("수정할 이름> ");
		userDTO.setName(sc.next());
		System.out.print("나이> ");
		userDTO.setAge(sc.nextInt());
		if(repository.update(loginEmail, loginPassword,userDTO)) {
			System.out.println("업데이트 완료!");
			loginPassword = userDTO.getPassword(); //이 클래스의 세션의 값도 같이 변경해줘야함
		}else {
			System.out.println("업데이트 실패");
		}
		
		
	}
	public boolean delete() {
		if(repository.delete(loginEmail, loginPassword)) {
			System.out.println("삭제성공");
			loginEmail = null;
			loginPassword = null;
			return false;
		}else {
			System.out.println("삭제실패");
			return true;
		}
	}
	
	
	
	
	

	public void domainChange() {
		String before = UserDTO.getDomain();
		System.out.println("변경할 도메인> ");
		UserDTO.setDomain(sc.next());
		System.out.println(before + " => " + UserDTO.getDomain() + " 변경완료!");
	}

}
