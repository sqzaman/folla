package mpp.uml.project.model;

public class Course {
	
	int id;
	String name;
	String description;
		
	public Course(int courseId, String courseName, String courseDescription) {
		id = courseId;
		name = courseName;
		description = courseDescription;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
