package com.cg.studentmarktest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cg.studentmark.*;

class StudentMarkTest {

	Student s;
	
	@BeforeEach
	public void setup() {
		s=new Student();
		s.setName("Dharani");
		List<Mark> marks=new ArrayList<Mark>();
		Mark m1=Mockito.mock(Mark.class);
		Mark m2=Mockito.mock(Mark.class);
		Mark m3=Mockito.mock(Mark.class);
		Mark m4=Mockito.mock(Mark.class);
		Mark m5=Mockito.mock(Mark.class);
		
		s.setMarks(marks);
		when(m1.getName()).thenReturn("Rice");
		when(m2.getName()).thenReturn("Tea");
		when(m3.getName()).thenReturn("Wheat");
		when(m1.getTotal("Rice")).thenReturn(100);
		when(m2.getTotal("Tea")).thenReturn(200);
		when(m3.getTotal("Wheat")).thenReturn(300);
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
