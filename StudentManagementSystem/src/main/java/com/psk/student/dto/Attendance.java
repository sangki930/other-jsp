package com.psk.student.dto;

import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Attendance {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//출석 id
	
	@Column
	private Long subject_id;//교과목 id
	
	@Column
	private LocalDateTime date_time;//출석 시간
	
	@Column
	private Instant created_at;//생성일
	
	@Column
	private Instant updated_at;//수정일
}
