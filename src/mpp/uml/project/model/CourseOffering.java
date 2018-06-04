package mpp.uml.project.model;

import java.util.ArrayList;

public class CourseOffering {
	private String id;
	private Location location;
	private ArrayList<Session> sessions;
	private Course course;
	private PlanOfStudy planOfStudy;
	private ArrayList<AcademicBlock> academicBlocks;
	private Faculty faculty;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ArrayList<Session> getSessions() {
		return sessions;
	}
	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public PlanOfStudy getPlanOfStudy() {
		return planOfStudy;
	}
	public void setPlanOfStudy(PlanOfStudy planOfStudy) {
		this.planOfStudy = planOfStudy;
	}
	public ArrayList<AcademicBlock> getAcademicBlocks() {
		return academicBlocks;
	}
	public void setAcademicBlocks(ArrayList<AcademicBlock> academicBlocks) {
		this.academicBlocks = academicBlocks;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
