package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.UpdateDTO;
import com.wolken.wolkenapp.Entity.ClubEntity;
import com.wolken.wolkenapp.Entity.LoginEntity;
import com.wolken.wolkenapp.Entity.UpdateEntity;
import com.wolken.wolkenapp.Entity.UserEntity;

public interface LoginDAO {
	public LoginEntity getUserName(String Username);

	public UserEntity getByEmailId(String email);

	public int updateDetails(UpdateDTO updatedto);

	

}
