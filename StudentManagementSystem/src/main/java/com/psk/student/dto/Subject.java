package com.psk.student.dto;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;//id
	
	@Column
	private String subject_name;
	@Column
	private Long course_id;
	@Column
	private Long staff_id;
	@Column
	private Instant created_at;
	@Column
	private Instant updated_at;
	
}
