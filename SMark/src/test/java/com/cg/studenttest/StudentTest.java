package com.cg.studenttest;
import com.cg.student.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class StudentTest {

	
	@Mock
	IStudent istudent;
	
	Student student=new Student();
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testAvgMark() {
		System.out.println("**--- Test testTotalMark executed ---**");

		when(istudent.AvgMark(100,99,98,98,98)).thenReturn(98);

		assertEquals(98, student.AvgMark(100,99,98,98,98));
	}

}
