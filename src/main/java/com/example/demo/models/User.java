package com.example.demo.models;

import lombok.Data;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.*;

@entity
@Data
@Table(name = "User")
public class User {
	
	@Id
	@column(name = "id", nullable = false, columnDefinition = "INT")
	private Integer id;
	
	@Basic
	@column(name = "user", nullable = false, columnDefinition = "TEXT")
	private String user;
	
	@Basic
	@column(name = "desc", nullable = false, columnDefinition = "TEXT")
	private String desc;
	
	@Basic
	@column(name = "targetDate", nullable = false, columnDefinition = "DATE")
	private Date targetDate;
	
	@Basic
	@column(name = "done", nullable = false, columnDefinition = "BOOLEAN")
	private Boolean done;
	
}
