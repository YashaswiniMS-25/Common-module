package com.wolken.wolkenapp.Service;

import com.wolken.wolkenapp.DTO.UserDTO;
import com.wolken.wolkenapp.Exception.User2Exception;

public interface UserService {

	public String validateAndSave(UserDTO userdto) throws User2Exception;
	
	

}
