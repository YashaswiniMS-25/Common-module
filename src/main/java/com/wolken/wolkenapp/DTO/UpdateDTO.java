package com.wolken.wolkenapp.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateDTO {
	private String UserName;
	private String EmailId;
	private String Usn;
	
	private String Branch;
	
	private String Contactno;
	
	private String Dob;
	
	private String Gender;

}
