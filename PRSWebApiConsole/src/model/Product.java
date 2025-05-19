package model;

public class Product {

	private int ID;
	private int VendorID;
	private String PartNumber;
	private String Name;
	private double Price;
	private String Unit;
	private String PhotoPath;
	
	
	public Product() {
		super();
	}
	
	public Product(int iD, int vendorID, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		ID = iD;
		VendorID = vendorID;
		PartNumber = partNumber;
		Name = name;
		Price = price;
		Unit = unit;
		PhotoPath = photoPath;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getVendorID() {
		return VendorID;
	}

	public void setVendorID(int vendorID) {
		VendorID = vendorID;
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getPhotoPath() {
		return PhotoPath;
	}

	public void setPhotoPath(String photoPath) {
		PhotoPath = photoPath;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [ID=" + ID + ", VendorID=" + VendorID + ", PartNumber=" + PartNumber + ", Name=" + Name
                + ", Price=" + Price + ", Unit=" + Unit + ", PhotoPath=" + PhotoPath + "]";
	}
	
}


