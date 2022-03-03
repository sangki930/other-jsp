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
public class Course {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//id
	@Column
	private String course_name;
	//과목명
	@Column
	private Instant created_at;
	//생성일
	@Column
	private Instant updated_at;
	//수정일
	
}
