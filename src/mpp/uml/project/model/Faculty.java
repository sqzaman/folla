package mpp.uml.project.model;

public class Faculty {
	private String name;
	private CourseOffering courseOffering;	
	
	public Faculty(String facultyName) {
		name = facultyName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CourseOffering getCourseOffering() {
		return courseOffering;
	}
	public void setCourseOffering(CourseOffering courseOffering) {
		this.courseOffering = courseOffering;
	}
	
	
}
