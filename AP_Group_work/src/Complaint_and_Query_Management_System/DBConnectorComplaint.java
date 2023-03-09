package Complaint_and_Query_Management_System;

import java.sql.*;

import javax.swing.JOptionPane;

public class DBConnectorComplaint {
	
	private static Connection myConn = null;
	private static Statement myStat = null;
	private static ResultSet result = null;
	
	public static Connection getDatabaseConnection(){
		String url = "jdbc:mysql://localhost:3306/Query_Management";
		try {
			if(myConn != null) {
				JOptionPane.showMessageDialog(null, "already Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}else {
				myConn = DriverManager.getConnection(url, "root", "P@rri$889");
				JOptionPane.showMessageDialog(null, "Connected", 
						"JDBC Stat", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return myConn;
	}
	
	public static void addStudentRecord(Student stu) {
		String sql1 = "INSERT INTO student(stud_ID, fName, lName, pword, email) VALUES ("+ stu.getStudId() + ", '" + stu.getfName() + 
				"', '" + stu.getlName() + "', '" + stu.getPassword() + "', '" + stu.getEmail() + "');";
		String sql2 = "INSERT INTO phoneNum(stud_ID, phone) VALUES ("+ stu.getStudId() + ", '" + stu.getPhone1() + "');"
				+ "\nINSERT INTO phoneNum(stud_ID, phone) VALUES ("+ stu.getStudId() + ", '" + stu.getPhone2() + "');"
				+ "\nINSERT INTO phoneNum(stud_ID, phone) VALUES ("+ stu.getStudId() + ", '" + stu.getPhone3() + "');"
				+ "\nDELETE FROM phoneNum WHERE stud_ID = "+ stu.getStudId()+ " AND phone = 'null';";
		try {
			myStat = myConn.createStatement();
			result = myStat.executeQuery(sql1);
			result = myStat.executeQuery(sql2);
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
