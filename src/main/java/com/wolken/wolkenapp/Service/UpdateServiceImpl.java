package com.wolken.wolkenapp.Service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.DAO.LoginDAO;
import com.wolken.wolkenapp.Entity.UserEntity;
@Service
public class UpdateServiceImpl implements UpdateService {
@Autowired
LoginDAO logindao;
Logger  logger=Logger.getLogger("UpdateServiceImpl");
	@Override
	public UserEntity validateAndUpdate(String email) {
		logger.info("inside validateandupdate");
		logger.info(email);
		if(email!=null) {
			logger.info("inside email checking");
			UserEntity entity=logindao.getByEmailId(email);
			 
				
				
				
			
			return entity;
		}
		
		
		return null;
	}

}
