package mpp.uml.project.model;

import java.util.Date;

public class AcademicBlock {
	int id;
	String name;
	Date startDate;
	Date endDate;
	Semester semister;
	
	public AcademicBlock(int blockId, String blockName, Date blockStartDate, Date blockEndDate, Semester blockSemister) {
		id = blockId;
		name = blockName;
		startDate = blockStartDate;
		endDate = blockEndDate;
		semister = blockSemister;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Semester getSemister() {
		return semister;
	}

	public void setSemister(Semester semister) {
		this.semister = semister;
	}
	
	

}
