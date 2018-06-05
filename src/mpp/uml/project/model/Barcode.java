package mpp.uml.project.model;

public class Barcode {
	int id;
	String barcode;	
	
	public Barcode(int barcodeId, String barcode) {
		id = barcodeId;
		this.barcode = barcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
