package mpp.uml.project.model;

import java.util.Date;
import java.util.List;

public class TimeSlot {
	public int id;
	public String description;
	public Date beginTime;
	public Date endTime;
	public List<BarcodeRecord> barcodeRecords;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public void setBarcodeRecords(List<BarcodeRecord> barcodeRecords) {
		this.barcodeRecords = barcodeRecords;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Date getBeginTime() {
		return this.beginTime;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	public List<BarcodeRecord> getBarcodeRecords() {
		return this.barcodeRecords;
	}
}
