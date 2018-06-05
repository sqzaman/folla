package mpp.uml.project.model;

import java.util.ArrayList;
import java.util.List;

public class CourseOffering {
	private String id;
	private Location location;
	private ArrayList<Session> sessions;
	private Course course;
	private PlanOfStudy planOfStudy;
	private List<AcademicBlock> academicBlocks;
	private Faculty faculty;
	
	
	
	public CourseOffering() {
		academicBlocks = new ArrayList<>();
	}
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
	public void addSession(Session session) {
		this.sessions.add(session);
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
	public List<AcademicBlock> getAcademicBlocks() {
		return academicBlocks;
	}
	public void addAcademicBlock(AcademicBlock academicBlock) {
		this.academicBlocks.add(academicBlock);
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
