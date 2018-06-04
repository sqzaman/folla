package mpp.uml.project.model;

import java.util.ArrayList;

public class PlanOfStudy {
	private ArrayList<CourseOffering> courseOfferings;
	private Student student;
	
	public PlanOfStudy() {
		
	}
	
	public ArrayList<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}
	public void addCourseOffering(CourseOffering courseOffering) {
		this.courseOfferings.add(courseOffering);
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
