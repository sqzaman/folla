package mpp.uml.project.model;

public class Student {
	public int id;
	public String firstName;
	public String lastName;
	public PlanOfStudy planOfStudy;
	public Barcode barcode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public PlanOfStudy getPlanOfStudy() {
		return planOfStudy;
	}
	public void setPlanOfStudy(PlanOfStudy planOfStudy) {
		this.planOfStudy = planOfStudy;
	}
	public Barcode getBarcode() {
		return barcode;
	}
	public void setBarcode(Barcode barcode) {
		this.barcode = barcode;
	}
	
	
}
