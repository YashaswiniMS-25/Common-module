package com.wolken.wolkenapp.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ClubDTO {
	private String uname;
	private float cgpa;
	private String role;
	private String branch;
	private String facultyincharge;
	

}
