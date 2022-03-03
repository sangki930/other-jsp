package com.psk.student.dto;

import java.time.Instant;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Attendance_Report {

	
	private Long id;
	
	private Long student_id;
	
	private Long attendance_id;
	
	private boolean status;
	//true : 출석, false : 결석
	
	
	private Instant created_at;
	
	private Instant updated_at;
}
