package mpp.uml.project.model;

import java.util.Date;

public class BarcodeRecord {
	Barcode barcode;
	Date date;
	TimeSlot timeSlot;
	Student student;
	Location location;
	
	public Barcode getBarcode() {
		return barcode;
	}
	public void setBarcode(Barcode barcode) {
		this.barcode = barcode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TimeSlot getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
