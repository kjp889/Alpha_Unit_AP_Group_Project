package Complaint_and_Query_Management_System;

public class Staff {
	private String type;
	private String staffId;
	private String fName;
	private String lName;
	private String password;
	
	public Staff() {
		this.staffId = "";
		this.fName = "";
		this.lName = "";
		this.password = "";
	}
	
	public Staff(String staffId, String fName, String lName, String password) {
		this.staffId = staffId;
		this.fName = fName;
		this.lName = lName;
		this.password = password;
	}
	
	public Staff(Staff staff) {
		this.staffId = staff.staffId;
		this.fName = staff.fName;
		this.lName = staff.lName;
		this.password = staff.password;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Staff's ID#: " + staffId + "\nStaff's Name: " + fName + " " + lName + "\n";
	}
	
	

}
