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
public class Admin_Hod {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//id
	
	@Column
	private String name;//관리자명
	
	@Column
	private String email;//이메일
	
	@Column
	private String password;//비밀번호
	
	@Column
	private Instant created_at;//생성일
	
	@Column
	private Instant updated_at;//수정일
}
