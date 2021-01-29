package com.cg.student;


public class Student implements IStudent {

	public int AvgMark(int... marks) {
		
		return (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
	}

}
