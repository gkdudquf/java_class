package day11;

import java.util.*;

public class UserRepository {
	List<UserDTO> list = new ArrayList<>();
	
	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}
	public List<UserDTO> findAll() {
		return list;
	}
	public boolean loginCheck(String email,String password) {
		for(UserDTO userDTO : list) {
			if(email.equals(userDTO.getEmail()) && password.equals(userDTO.getPassword())) {
				return true;
			}
		}
		return false;
	}
	public UserDTO findById(String email, String password) {
		for(UserDTO u : list) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return  null;
	}
}
