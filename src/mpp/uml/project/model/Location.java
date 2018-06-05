package mpp.uml.project.model;

import java.util.ArrayList;
import java.util.List;

public class Location {
	private int id;
	private String description;
	private List<CourseOffering> courseOfferings;
	
	public Location(int locId, String des) {
		id = locId;
		description = des;
		courseOfferings = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CourseOffering> getCourseOfferings() {
		return courseOfferings;
	}
	public void addCourseOffering(CourseOffering courseOffering) {
		this.courseOfferings.add(courseOffering);
	}
	
	
}
