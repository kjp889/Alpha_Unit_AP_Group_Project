package Complaint_and_Query_Management_System;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Student_gui {

	
	public static void main(String[] args) {
		JFrame f = new JFrame ("STUDENT MENU");
		f.setLayout(null);
		
		JLabel studId = new JLabel("Student ID");
		JLabel fName = new JLabel("FirstName");
		JLabel lName = new JLabel("LastName");
		JLabel phone = new JLabel("Phone");
	    JLabel email = new JLabel("Email");
        JLabel password = new JLabel("Password");
		
		JTextField studIdTF = new JTextField(10);
		JTextField fNameTF = new JTextField(10);
		JTextField lNameTF = new JTextField(10);
		JTextField phoneTF = new JTextField(10);
		JTextField emailTF = new JTextField(10);
		JTextField passwordTF = new JTextField(10);
		
		
	
		JButton btn = new JButton ("Login");
		JButton clear = new JButton ("clear");
		
	
		JPanel s = new JPanel();
		s.setBounds(150, 30, 100, 500);
		s.setVisible(true);
		
		s.add(studId);
		s.add(studIdTF);
		
		s.add(fName);
		s.add(fNameTF);
		
		s.add(lName);
		s.add(lNameTF);
		
		s.add(phone);
		s.add(phoneTF);
	
		s.add(email);
		s.add(emailTF);
		
		s.add(password);
		s.add(passwordTF);
		
		btn.setBounds(100, 200, 140, 90);
		s.add(btn);
		s.add(clear);
		f.add(s);
		f.setSize(400,600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		

		 clear.addActionListener(e -> {
			 studIdTF.setText("");
			 fNameTF.setText("");
			 lNameTF.setText("");
			 phoneTF.setText("");
			 emailTF.setText("");
			 passwordTF.setText("");
			 
	    
		 });
		 

			btn.addActionListener(
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
			if (studIdTF.getText().isEmpty()){
				    
				    JOptionPane.showMessageDialog(null,"Please Complete form");

				}
		
	}


	}
					);
}
	
}