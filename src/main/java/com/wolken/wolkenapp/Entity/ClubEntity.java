package com.wolken.wolkenapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Controller;

import lombok.Data;
@Data
@Controller
@Entity
@Table(name = "club_table")
public class ClubEntity {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "id")
	private int id;
	@Column(name="unme")
	private String uname;
	@Column(name="cgpa")
	private float cgpa;
	@Column(name="role")
	private String role;
	@Column(name="branch")
	private String branch;
	@Column(name="fcharge")
	private String facultyincharge;
	
}
