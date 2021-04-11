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
public class LoginEntity {
	@Id
	
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String UserName;
	@Column(name = "password")
	private String Password;
	
}
