package mpp.uml.project.model;

import java.util.ArrayList;

public class Location {
	private String id;
	private String description;
	private ArrayList<CourseOffering> courseOfferings;
	
	public Location() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}
	public void addCourseOffering(CourseOffering courseOffering) {
		this.courseOfferings.add(courseOffering);
	}
	
	
}
