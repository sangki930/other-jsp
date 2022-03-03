package com.psk.student.dto;

import java.time.Instant;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leave {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Long student_staff_id;
	@Column
	private boolean is_staff;
	@Column
	private LocalDate leave_date;
	@Column
	private Instant created_at;
	@Column
	private Instant updated_at;
	
}
