package Complaint_and_Query_Management_System;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Statement;
public class ComplaintGui extends JFrame implements ActionListener {
	
	private JPanel panel1,panel2,panel3,nav,welcomePanel, questions;
	
	private JLabel iconLabel,iconLabel2,welcomeLabel, messageLabel, questionsL;
	private JButton chatBut, aboutBut,homeBut,complaintBut,queryBut, submit, insertButton;
	private JTextField messageText;
	String message;
	private JComboBox<String> myComboBox;

//	JPanel Panel1, Panel2;
	public ComplaintGui() {
		

    
		
	    final String DB_URL = "jdbc:mysql://localhost:3306/utech";
        final String DB_USERNAME = "root";
        final String DB_PASSWORD = "";
        // Initialize the UI components
        String[] options = {"How can I change my password", "How can I access moodle", "Where are library doccuments"};
        myComboBox = new JComboBox <String>(options);
		submit = new JButton("SUBMIT");
	//	myComboBox = new JComboBox<String>();
		messageText = new JTextField();
		//message = messageText.getText();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		nav = new JPanel();
		panel1= new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		welcomePanel = new JPanel();
		welcomeLabel = new JLabel("Make Complaint");
		
		iconLabel = new JLabel();
		iconLabel2 =new JLabel();
		messageLabel = new JLabel("MESSAGE");
		
		chatBut = new JButton("CHAT");
		insertButton = new JButton("Insert");
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
        
    
        

        // Add an action listener to the button to handle the insert action
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the combo box
                String selectedValue = (String) myComboBox.getSelectedItem();

                try {
                    // Create a connection to your SQL database
                    Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

                    // Prepare an INSERT statement with a parameter for the selected value
                    String query = "INSERT INTO message (message) VALUES (?)";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, selectedValue);

                    // Execute the INSERT statement
                    stmt.executeUpdate();

                    // Close the statement and connection
                    stmt.close();
                    conn.close();

                    // Display a success message
                    JOptionPane.showMessageDialog(null, "Complaint sent successfully.");
                } catch (SQLException ex) {
                    // Display an error message if the insert fails
                    JOptionPane.showMessageDialog(null, "Error inserting value: " + ex.getMessage());
                }
            }
        });
        
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
	
		
		complaintBut.setBounds(335, 5, 300, 50);
		complaintBut.setBackground(new Color(5,14,35));
		complaintBut.setForeground(Color.WHITE);
		complaintBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ComplaintGui();
				setVisible(false);
			}
		});
		
		queryBut.setBounds(670, 5, 300, 50);
		queryBut.setBackground(new Color(5,14,35));
		queryBut.setForeground(Color.WHITE);
		
		submit.setBounds(300,650 , 100, 50);
		insertButton.setBounds(600, 650, 100, 50);
	//	messageText.setBounds(200, 450, 300, 150);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					message = messageText.getText();
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/utech", "root", "");
				    PreparedStatement stmt = con.prepareStatement("insert into message(message) values (?)");
				    stmt.setString(1, message); // replace name with the variable containing customer's name
				    
				    int rowsAffected = stmt.executeUpdate();
				    if (rowsAffected > 0) {
				        JOptionPane.showMessageDialog(null, "Complaint Submitted");
				    }
				    con.close();
				} catch (SQLException ex) {
				    ex.printStackTrace();
				}
				
		}});
	}

	private void label() {
		
	
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
		messageText.setBounds(200, 450, 300, 150);
		messageLabel.setBounds(100, 450, 100, 50);
		panel3.add(messageText);
		panel3.add(messageLabel);
		panel3.add(submit);
		panel3.add( myComboBox);
		panel3.add(insertButton);
		
		
		myComboBox.setBounds(600, 500, 200, 50);
		nav.setBounds(0, 270, 1000, 60);
		nav.setVisible(true);
		nav.setBackground(new Color(41,148,52));
		nav.setLayout(null);
		nav.add(homeBut);
		nav.add(complaintBut);
		nav.add(queryBut);
		welcomePanel.add(welcomeLabel);
		
		
		
		welcomePanel.setBounds(200, 370, 600, 50);
		welcomePanel.setBackground(new Color(5,14,35));
		
	} 
	
	


	public static void main(String[] args) {	
		
		new ComplaintGui();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}