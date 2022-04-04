package com.tys.assessment;
import java.util.*;
public class Student {
	private int id;
	private String name;
	private float marks;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void add(int id,String name,float marks,String course)
	{
		
		setMarks(marks);
		setId(id);
		setName(name);
		setCourse(course);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	

}
