package in.testingInSpring.operation.rest;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.testingInSpring.operation.entity.Student;

@RestController
public class StudentRestController {

	@RequestMapping("/details")
	public String home()
	{
		return "Hello Student ! Do you want the details? Please use the API for this module";
	}
	
	@RequestMapping("/student/getStudentDetails")
	public Student getStudentDetails()
	{
		Student student = new Student();
		student.setStudentId(1);
		student.setName("Vidhan Vats");
		return student;
	}
	
	@RequestMapping("/private/getAllStudentDetails")
	public List<Student> getAllStudentDetails()
	{
		List<Student> stdList = new ArrayList<Student>();
		
		Student std1 = new Student();
		std1.setStudentId(1);
		std1.setName("Vidhan Vats");
		
		Student std2 = new Student();
		std1.setStudentId(2);
		std1.setName("ABC XYZ");
		return stdList;
	}
	
}
