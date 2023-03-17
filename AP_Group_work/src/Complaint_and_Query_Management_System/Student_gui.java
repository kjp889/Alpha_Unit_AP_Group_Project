package Complaint_and_Query_Management_System;


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Student_gui extends JFrame  {
	
	private JPanel panel1,panel2,panel3,nav;
	
	private JLabel iconLabel,iconLabel2;
	private JButton chatBut, aboutBut,homeBut,complaintBut,queryBut;
	


//	JPanel Panel1, Panel2;
	public Student_gui() {
		
		nav = new JPanel();
		panel1= new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		iconLabel = new JLabel();
		iconLabel2 =new JLabel();
		chatBut = new JButton("CHAT");
		aboutBut =new JButton("ABOUT");
		homeBut = new JButton("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setSize(1300,780);
		setResizable(false);
		panel1 = new JPanel();
		add(panel1);
		//add(panel2);
		add(panel3);
		
	//	setBackground(Color.BLUE);
		Panel();
		label();
		
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(LogInGUI.class.getResource("/Logo.png")));
        // set the icon image and size of the frame
        setIconImage(icon.getImage());
        
        ImageIcon icon2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(LogInGUI.class.getResource("/icon2.png")));
       // iconLabel = new JLabel(icon2);
        ImageIcon icon3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(LogInGUI.class.getResource("/logoi.png")));
        iconLabel.setIcon(icon2);
        iconLabel2.setIcon(icon3);
       
	}
	private void Button() {
		chatBut.setBounds(1, 270, 300, 60);
		chatBut.setBackground(Color.BLACK);
		aboutBut.setBounds(1, 321, 300, 60);
		aboutBut.setBackground(Color.BLACK);
		
		homeBut.setBounds(5, 5, 333, 50);
		homeBut.setBackground(new Color(5,14,35));
	}
	
	private void label() {
		
		nav.setBounds(0, 270, 1000, 60);
		nav.setVisible(true);
		nav.setBackground(new Color(41,148,52));
		iconLabel.setBackground(Color.red);
		iconLabel.setLayout(null);
		iconLabel.setBounds(50, 30, 200, 200);
	//	iconLabel.setVisible(true);
		iconLabel2.setBounds(400, 25, 200, 200);
	}
	
	private void Panel(){
		label();
		Button();
		panel1.setBounds(0, 0, 300, 780);
		panel1.setBackground(new Color(5,14,35));
		panel1.setVisible(true);
		panel1.setLayout(null);
		panel2.setBounds(0, 0, 300, 300);
		//panel2.setBackground(Color.blue);
		//panel1.add(iconLabel);
		panel2.setVisible(true);
		panel2.setLayout(null);
		//panel1.add(panel2);
		panel1.add(chatBut);
		panel1.add(aboutBut);
		
		
		//panel1.add(panel2);
		panel3.setLayout(null);
		panel1.add(iconLabel);	
		panel3.setBounds(300,0,999,780);
		panel3.setBackground(new Color(182,146,37));
		panel3.add(iconLabel2);
		panel3.add(nav);
		nav.setLayout(null);
		nav.add(homeBut);
		
	} 


	public static void main(String[] args) {	
		
		new Student_gui();
}
	
}
