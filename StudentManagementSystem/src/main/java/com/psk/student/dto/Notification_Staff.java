package com.psk.student.dto;

import java.time.Instant;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Notification_Staff {
	
	private Long id;
	private Long staff_id;
	private String message;
	private Instant created_at;
	private Instant updated_at;
	
}
