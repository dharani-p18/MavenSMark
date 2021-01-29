package com.cg.studentmark;

import java.util.List;

public class Student {

	String name;
	List<Mark> marks;
	
	public int TotalMsrks()
	{
		int total = 0;
		for (Mark m:marks) {
			total+=m.getTotal(m.getName());
		}
		return total;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
 
}
