package com.te.ess_port_application;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
public class Employee_info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Employee_Id;
	private String Employee_Name;
	private String Employee_Type;
	private String Email;
	private String Password;
	
    }
