package com.cg.studentdetails.dao;

import java.util.Map;

import com.cg.studentdetails.dto.StudentDto;

public interface IstudentDao {
	public int addStudentDetails(StudentDto student);
	public Map<String, String> getCollegeDetails() ;
	public StudentDto getStatus(int id);

}
