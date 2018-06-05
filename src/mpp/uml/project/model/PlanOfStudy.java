package mpp.uml.project.model;

import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
	private List<CourseOffering> courseOfferings;
	private Student student;
	
	
	public PlanOfStudy() {
		courseOfferings = new ArrayList<>();
	}
	public List<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}
	public void adCourseOffering(CourseOffering courseOffering) {
		this.courseOfferings.add(courseOffering);
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
