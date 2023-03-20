package Complaint_and_Query_Management_System;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
	
	private JPanel panel1,panel2,panel3,nav,welcomePanel;
	
	private JLabel iconLabel,iconLabel2,welcomeLabel;
	private JButton chatBut, aboutBut,homeBut,complaintBut,queryBut;
	

//	JPanel Panel1, Panel2;
	public Student_gui() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		nav = new JPanel();
		panel1= new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		welcomePanel = new JPanel();
		welcomeLabel = new JLabel("Frequently Asked Questions");
		
		iconLabel = new JLabel();
		
		iconLabel2 =new JLabel();
		chatBut = new JButton("CHAT");
		aboutBut =new JButton("ABOUT");
		homeBut = new JButton("HOME");
		complaintBut = new JButton("COMPLAINT");
		queryBut = new JButton("QUERY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setSize(1300,780);
		
		int x = (dim.width - getSize().width) / 2;
		int y = (dim.height - getSize().height) / 2;
		setLocation(x, y);
		setResizable(false);
		
		
		add(panel1);
		add(panel3);
		

		Panel();
	
		
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
		chatBut.setForeground(Color.WHITE);
		
		aboutBut.setBounds(1, 321, 300, 60);
		aboutBut.setBackground(Color.BLACK);
		aboutBut.setForeground(Color.WHITE);
		
		homeBut.setBounds(5, 5, 300, 50);
		homeBut.setBackground(new Color(5,14,35));
		homeBut.setForeground(Color.WHITE);
		
		homeBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StuHomeGui();
			}
		});
		complaintBut.setBounds(335, 5, 300, 50);
		complaintBut.setBackground(new Color(5,14,35));
		complaintBut.setForeground(Color.WHITE);
		
		queryBut.setBounds(670, 5, 300, 50);
		queryBut.setBackground(new Color(5,14,35));
		queryBut.setForeground(Color.WHITE);
/*	queryBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StuHomeGui();
			}
		});*/
	}
	
	private void label() {
		
		nav.setBounds(0, 270, 1000, 60);
		nav.setVisible(true);
		nav.setBackground(new Color(41,148,52));
		iconLabel.setBackground(Color.red);
		iconLabel.setLayout(null);
		iconLabel.setBounds(50, 30, 200, 200);
		
		
		iconLabel2.setBounds(400, 25, 200, 200);
		
		welcomeLabel.setForeground(Color.WHITE);
		welcomeLabel.setFont(new Font("Calibri", Font.BOLD, 20));
	}
	
	private void Panel(){
		label();
		Button();
		panel1.setBounds(0, 0, 300, 780);
		panel1.setBackground(new Color(5,14,35));
		panel1.setVisible(true);
		panel1.setLayout(null);
		panel1.add(chatBut);
		panel1.add(aboutBut);
		
		panel2.setBounds(0, 0, 300, 300);
		panel2.setVisible(true);
		panel2.setLayout(null);
	
		
		

		panel3.setLayout(null);
		panel1.add(iconLabel);	
		panel3.setBounds(300,0,999,780);
		panel3.setBackground(new Color(182,146,37));
		panel3.add(iconLabel2);
		panel3.add(nav);
		panel3.add(welcomePanel);
		
		nav.setLayout(null);
		nav.add(homeBut);
		nav.add(complaintBut);
		nav.add(queryBut);
		
		
		welcomePanel.add(welcomeLabel);
		welcomePanel.setBounds(200, 370, 600, 50);
		welcomePanel.setBackground(new Color(5,14,35));
	} 


	public static void main(String[] args) {	
		
		new Student_gui();
}
	
}
