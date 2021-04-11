package com.wolken.wolkenapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import lombok.Data;
@Controller
@Entity
@Data
@Table(name = "ecoclub_table")
public class UpdateEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String UserName;
	@Column(name = "Email_id")
	private String EmailId;

	@Column(name = "usn")
	private String Usn;
	@Column(name = "branch")
	private String Branch;
	@Column(name = "contact_no")
	private String Contactno;
	@Column(name = "dob")
	private String Dob;
	@Column(name = "gender")
	private String Gender;

}
