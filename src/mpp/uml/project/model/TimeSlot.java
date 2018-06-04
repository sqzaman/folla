package mpp.uml.project.model;

import java.util.Date;
import java.util.List;

public class TimeSlot {
	public int id;
	public String description;
	public Date beginTime;
	public Date endTime;
	public List<BarcodeRecord> barcodeRecords;
}
