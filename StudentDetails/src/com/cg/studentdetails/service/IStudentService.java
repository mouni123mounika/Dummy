package com.cg.studentdetails.service;

import java.time.LocalDate;

import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentdetails.exception.StudentException;

public interface IStudentService {
	public int addStudentDetails(StudentDto student);

	StudentDto getStatus(int id);

	public void validatename(String name) throws StudentException;

	public  void validatephnNum(String name) throws StudentException;

	public void validatemail(String name) throws StudentException;


	public void validateage(String name) throws StudentException;

	public void validategender(String name) throws StudentException;

	public void validateDate(LocalDate myDate) throws StudentException;



}
