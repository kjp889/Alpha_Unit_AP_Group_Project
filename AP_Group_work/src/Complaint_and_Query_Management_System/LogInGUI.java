package Complaint_and_Query_Management_System;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.sun.media.sound.Toolkit;

import javax.swing.ImageIcon;
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
	private JPanel panel1;
	private JPanel panel2;
	private JLabel iconLabel;
	private JLabel iconLabel2;
	private JLabel textLabel;
	private JButton submit;
	
	
	//private static final Logger Logger = LogManager.getLogger(LogInGUI.class);

	
	public LogInGUI() {
		iFrame = new JInternalFrame();
		usernameLabel = new JLabel("USERNAME");
		passwordLabel = new JLabel("PASSWORD");
		textLabel = new JLabel("Student Login");
		submit = new JButton("Submit");
		usernameTextField = new JTextField(20);
		passwordField = new JPasswordField(20);
		button = new JButton("Sign In");
		button.addActionListener(this);
		button.setSize(new Dimension(400, 30));
		//namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	//	passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
	    panel1 = new JPanel();
	    panel2 = new JPanel();
	    setSize(1000,650);
		setVisible(true);
		setBackground(Color.cyan);
		setResizable(false);
		setLayout(null);
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(LogInGUI.class.getResource("/Logo.png")));
        // set the icon image and size of the frame
        setIconImage(icon.getImage());
        iconLabel = new JLabel(icon);
        
       
        ImageIcon icon2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(LogInGUI.class.getResource("/icon2.png")));
       
      //  setIconImage(icon.getImage());
        iconLabel2 = new JLabel(icon2);
        
        
        // make the frame visible
        setVisible(true);
		Panel();
		setTitle("UTECH");
	}
	private void button() {
		submit.setBounds(170, 500, 80, 30);
	}
	private void Label() {
		usernameLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		usernameLabel.setBounds(20, 300 , 100, 50);
		passwordLabel.setBounds(20, 400 , 100,50);
		textLabel.setBounds(100, 200, 350, 30);
		textLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		passwordLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		iconLabel.setBounds(20, 0, 150, 100);
		iconLabel2.setBounds(100, 10, 200, 200);
		usernameLabel.setForeground(Color.WHITE);
		textLabel.setForeground(Color.WHITE);
		passwordLabel.setForeground(Color.WHITE);
	}

	private void Textbox() {
		usernameTextField.setBounds(20, 350 , 240, 30);
		passwordField.setBounds(20, 450 , 240, 30);
	}
	private void Panel()  {
		// TOD Auto-generated method stub
		button();
		
		Label();
		Textbox();
		panel1.setBounds(0, 0, 550, 750);
		panel1.setBackground(new Color(54,71,90));
		panel2.setBounds(550, 0, 450, 750);
		panel2.setBackground(new Color(123,123,15));
		panel2.setLayout(null);
		panel1.add(iconLabel);
		panel2.add(iconLabel2);
		panel2.add(usernameLabel);
		panel2.add(passwordLabel);
		panel2.add(usernameTextField);
		panel2.add(passwordField);
		panel2.add(textLabel);
		panel2.add(submit);
		add(panel1);
		add(panel2);
		
		//frame.add(panel1);
	//	frame.setResizable(false);
	//	namePanel.setSize(400,30);
	//	usernameLabel.setText("Username: ");
	//	namePanel.add(usernameLabel);
	//	namePanel.add(usernameTextField);
		//namePanel.setVisible(true);
		//add(namePanel);
		//add(frame);
		
	//	passwordPanel.setSize(400,30);
		//passwordLabel.setText("Password: ");
	//	passwordPanel.add(passwordLabel);
	//	passwordPanel.add(passwordField);
//		add(passwordPanel);
		
		//buttonPanel.setSize(new Dimension(450,30));
	//	buttonPanel.add(button);
		//add(buttonPanel);
			
		//add(iFrame);
		//setSize(500,420);
		//ImageIcon icon = new ImageIcon(this.getClass().getResource().getFile());
	//	add(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
		setLocationRelativeTo(null);
	}
	public void icon() {
		
		
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

	