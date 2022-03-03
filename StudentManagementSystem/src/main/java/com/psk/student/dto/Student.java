package com.psk.student.dto;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;




@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String gender;
	
	@Column
	private byte[] profile_pic;
	
	@Column
	private String password;
	
	@Column
	private Instant created_at;
	
	@Column
	private Instant updated_at;
	
	@Column
	private String address;
	
	@Column
	private String courseId;
	
	
}
