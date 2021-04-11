package com.wolken.wolkenapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.DTO.UserDTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "ecoclub_table")
public class UserEntity {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
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
	@Column(name = "password")
	private String Password;
	@Transient
	private String cnfPassword;
}
