package com.cg.studentdetails.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.studentdetails.dto.StudentDto;

public class StudentDaoImpl implements IstudentDao {
	public static HashMap<String, String> collegeDetails = null;
	public static HashMap<Integer, StudentDto> studentDetails = null;
	static {
		studentDetails = new HashMap<>();
		collegeDetails = new HashMap<>();
		collegeDetails.put("Delhi", "IIT-D");
		collegeDetails.put("Hyderabad", "IIT-H");
		collegeDetails.put("Chennai", "IIT-M");
		collegeDetails.put("Bombay", "IIT-B");
		collegeDetails.put("Banglore", "IISC");
	}


	@Override
	public int addStudentDetails(StudentDto student) {
		//System.out.println(collegeDetails);
		student.setCollegeName(collegeDetails.get(student.getCity()));
		 if(studentDetails.put(student.getId(),student) != null)
			 return 1;
		 else
			 return 0;
	}

	@Override
	public Map<String, String> getCollegeDetails() {
		return collegeDetails;
	}

	@Override
	public StudentDto getStatus(int id) {
		// TODO Auto-generated method stub
		return studentDetails.get(id);
	}
	
}
