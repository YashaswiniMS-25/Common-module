package com.wolken.wolkenapp.Service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.DAO.LoginDAO;
import com.wolken.wolkenapp.DTO.LoginDTO;
import com.wolken.wolkenapp.Entity.LoginEntity;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDAO logindao;
	@Autowired
	LoginEntity entity;
	Logger logger=Logger.getLogger("LoginServiceImpl");

	@Override
	public String validateAndlogin(LoginDTO dto) {
		if(dto!=null) {
			LoginEntity entity=logindao.getUserName(dto.getUserName());
			System.out.println(entity);
			if(entity!=null) {
				logger.info("inside usernamechecking");
				if(dto.getUserName().equals(entity.getUserName())) {
					logger.info("inside username validation");
					if(dto.getPassword().equals(entity.getPassword())) {
						logger.info("inside password validation");
						return "login successfully";
						
					}else {
						return "invalid password";
					}
					
				}else {
					return "user not found";
				}
			}
			
		}else {
			return "dto is null";
			
		}
		
		
		
		return "user not found";
	}
	

}
