package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.ClubDTO;
import com.wolken.wolkenapp.Entity.ClubEntity;

public interface AddStudentDAO {

	public String saveStudent(ClubEntity entity);

	public List<ClubEntity> searchByRole(String role);

}
