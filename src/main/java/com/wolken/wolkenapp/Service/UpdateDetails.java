package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.DTO.ClubDTO;
import com.wolken.wolkenapp.DTO.UpdateDTO;
import com.wolken.wolkenapp.Entity.ClubEntity;

public interface UpdateDetails {
	public String Updatevalues(UpdateDTO updatedto);

	public String validateAndAdd(ClubDTO dto);

	public List<ClubEntity> validateAndSearch(String role);

	

}
