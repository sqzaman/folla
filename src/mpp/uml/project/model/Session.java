package mpp.uml.project.model;

import java.util.Date;

public class Session {
	public int id;
	public Date date;
	public AcademicBlock academicBlock;
	public CourseOffering courseOffering;
	public TimeSlot timeSlot;
	
	public Session(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public AcademicBlock getAcademicBlock() {
		return academicBlock;
	}
	public void setAcademicBlock(AcademicBlock academicBlock) {
		this.academicBlock = academicBlock;
	}
	public CourseOffering getCourseOffering() {
		return courseOffering;
	}
	public void setCourseOffering(CourseOffering courseOffering) {
		this.courseOffering = courseOffering;
	}
	public TimeSlot getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}
	
}
