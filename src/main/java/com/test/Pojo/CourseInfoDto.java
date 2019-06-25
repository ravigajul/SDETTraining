package com.test.Pojo;

public class CourseInfoDto {
	String CourseName;
	String PurchasedDate;
	int Amount;
	String Location;
	
	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getPurchasedDate() {
		return PurchasedDate;
	}

	public void setPurchasedDate(String purchasedDate) {
		PurchasedDate = purchasedDate;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "ResultService [CourseName=" + CourseName + ", PurchasedDate=" + PurchasedDate + ", Amount=" + Amount
				+ ", Location=" + Location + "]";
	}

}
