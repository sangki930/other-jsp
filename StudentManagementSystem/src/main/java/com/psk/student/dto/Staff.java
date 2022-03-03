package com.psk.student.dto;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Staff {

	@Id
	@Column
	private Long id;
	//Id
	@Column
	private String name;
	//직원 이름
	
	@Column
	private String email;
	//이메일주소
	
	@Column
	private String password;
	//비밀번호
	
	@Column
	private Instant created_at;
	//생성일자
	
	@Column
	private Instant updated_at;
	//수정일자
	
	@Column
	private String address;
	//주소
	
}
