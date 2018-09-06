package com.cg.studentdetails.dao;


import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import com.cg.studentdetails.exception.StudentException;
import com.cg.studentdetails.service.IStudentService;
import com.cg.studentdetails.service.StudentServiceImpl;

public class StudentTest {


	@Test
	public void testDatePositive() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		 LocalDate myDate=LocalDate.of(2019, Month.JANUARY, 30);
		service.validateDate(myDate);
	}
	
	@Test
	public void testagePositive() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validateage("12");
	}
	
	@Test
	public void testnamePositive() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validatename("Mouni");
	}
	@Test
	public void testmailPositive() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validatemail("mouni@gmail.com");
	}
	
	@Test
	public void testgenderPositive() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validategender("female");
		service.validategender("male");
	}
	@Test(expected=StudentException.class)
	public void testName() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validatename("mouni");
		}


@Test(expected=StudentException.class)
	public void testphnNum() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validatephnNum("4852545456");
	}

	
@Test(expected=StudentException.class)
	public void testemail() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validatemail("mouni-07@gmail.com");
	}
	
@Test(expected=StudentException.class)
	public void testage() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		service.validateage("222");
	}
	
@Test(expected=StudentException.class)
	public void testDate() throws StudentException {
		IStudentService service=new StudentServiceImpl();
		 LocalDate myDate=LocalDate.of(2017, Month.JANUARY, 30);
		service.validateDate(myDate);
	}
	


}
