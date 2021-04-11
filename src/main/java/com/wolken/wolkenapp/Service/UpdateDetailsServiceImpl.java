package com.wolken.wolkenapp.Service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.DAO.AddStudentDAO;
import com.wolken.wolkenapp.DAO.LoginDAO;
import com.wolken.wolkenapp.DTO.ClubDTO;
import com.wolken.wolkenapp.DTO.UpdateDTO;
import com.wolken.wolkenapp.Entity.ClubEntity;

@Service
public class UpdateDetailsServiceImpl implements UpdateDetails{
	@Autowired
	LoginDAO logindao;
	@Autowired
	ClubEntity entity;
@Autowired
AddStudentDAO addstudentdao;
	Logger logger=Logger.getLogger("UpdateDetailsServiceImpl");
	@Override
	public String Updatevalues(UpdateDTO updatedto) {
		logger.info("inside update service");
		if(updatedto!=null) {
			int result=logindao.updateDetails(updatedto);
			if(result >=1) {
				return "updated";
				
			}
			else {
				return "failed to updated";
			}
		}else {
			return "dto is null";
		}
		
		
		
	}
	@Override
	public String validateAndAdd(ClubDTO dto) {
		
	
		logger.info("inside validate and add");
		
		
		
		if(dto!=null) {
			logger.info("setting username");
			
			entity.setUname(dto.getUname());
			logger.info("setting branch");
			entity.setBranch(dto.getBranch());
			logger.info("setting cgpa");
			entity.setCgpa(dto.getCgpa());
			logger.info("setting role");
			entity.setRole(dto.getRole());
			logger.info("setting faculty");
			entity.setFacultyincharge(dto.getFacultyincharge());
			logger.info("calling dao function");
			
			
		   return addstudentdao.saveStudent(entity);
			
			
		}else {
			return "dto is null";
		}
		
			
		}
	@Override
	public List<ClubEntity> validateAndSearch(String role) {
		logger.info(" inside validateAndSearch ");
		if(role!=null) {
			logger.info("inside role checking");
			
			return addstudentdao.searchByRole(role);
		}
		return null;
	}
	

}
