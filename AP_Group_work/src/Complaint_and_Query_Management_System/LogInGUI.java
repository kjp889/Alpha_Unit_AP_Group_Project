package Complaint_and_Query_Management_System;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInGUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JButton button;
	private JPanel namePanel;
	private JPanel passwordPanel;
	private JPanel buttonPanel;
	private JInternalFrame iFrame;
	
	public LogInGUI() {
		iFrame = new JInternalFrame("Internal Frame", true, true, true, true);
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel();
		usernameTextField = new JTextField(20);
		passwordField = new JPasswordField(20);
		button = new JButton("Sign In");
		button.addActionListener(this);
		button.setSize(new Dimension(400, 30));
		namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		layoutComponents();
	}

	private void layoutComponents() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		iFrame.setTitle("LogIn");
		iFrame.setVisible(true);
		
		namePanel.setSize(new Dimension(450, 30));
		namePanel.add(usernameLabel);
		namePanel.add(usernameTextField);
		add(namePanel);
		
		passwordPanel.setSize(new Dimension(450,30));
		passwordLabel.setText("Password: ");
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		add(passwordPanel);
		
		buttonPanel.setSize(new Dimension(450,30));
		buttonPanel.add(button);
		add(buttonPanel);
			
		setSize(new Dimension(420,420));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Sign in button"
				+ "click...", "Flowlayout Example", JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LogInGUI();
	}


}

	