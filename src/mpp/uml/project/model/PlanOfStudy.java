package mpp.uml.project.model;

import java.util.ArrayList;

public class PlanOfStudy {
	private ArrayList<CourseOffering> courseOfferings;
	private Student student;
	
	public ArrayList<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}
	public void setCourseOfferings(ArrayList<CourseOffering> courseOfferings) {
		this.courseOfferings = courseOfferings;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
