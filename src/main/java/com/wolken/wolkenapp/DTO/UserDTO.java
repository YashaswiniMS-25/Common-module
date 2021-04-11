package com.wolken.wolkenapp.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@NoArgsConstructor
@EqualsAndHashCode


public class UserDTO {
	private String UserName;
	private String EmailId;
	private String Usn;
	
	private String Branch;
	
	private String Contactno;
	
	private String Dob;
	
	private String Gender;
	
	private String Password;
	
	private String cnfPassword;

}
