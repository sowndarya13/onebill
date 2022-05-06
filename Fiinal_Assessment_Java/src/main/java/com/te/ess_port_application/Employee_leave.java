package com.te.ess_port_application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
@Data
public class Employee_leave {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int serial;
	private int Employee_ID;
	private String Leave_Date;
	private String Leave_Status;
	

	
}
