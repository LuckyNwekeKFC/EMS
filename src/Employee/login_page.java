package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


class login_page implements ActionListener {

	JFrame frame;
	JLabel label_1, label_2;
	JTextField text_1;
	JPasswordField passText;
	JButton addBut, cancelBut;
	
	login_page(){
	
		frame = new JFrame("Login Page");
		frame.setBackground(Color.WHITE);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(380,230);
		
		label_1 = new JLabel("Username");
		label_1.setBounds(40,20,100,30);
		frame.add(label_1);
		
		
		label_2 = new JLabel("Password");
		label_2.setBounds(40,70,100,30);
		frame.add(label_2);
		
		text_1 = new JTextField();
		text_1.setBounds(150,20,150,30);
		frame.add(text_1);
		
		
		passText = new JPasswordField();
		passText.setBounds(150,70,150,30);
		frame.add(passText);
		
		
		addBut = new JButton("Login");
		addBut.setBackground(Color.BLACK);
		addBut.setForeground(Color.WHITE);
		addBut.setBounds(40,140,120,30);
		addBut.setFont(new Font("serif",Font.BOLD,15));
		addBut.addActionListener(this);   
		frame.add(addBut);
		
		
		cancelBut = new JButton("Cancel");
		cancelBut.setBackground(Color.BLACK);
		cancelBut.setForeground(Color.WHITE);
		cancelBut.setBounds(180,140,120,30);
		cancelBut.setFont(new Font("serif",Font.BOLD,15));
		cancelBut.addActionListener(this);   
		frame.add(cancelBut);
		
		
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setVisible(true);
		frame.setSize(600,300);
		
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cancelBut) {
			frame.setVisible(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		try {
			conn c1 = new conn();
			String uname = text_1.getText();
			String pass = passText.getText();
			
			String q = "select * from login where username='"+uname+"' and password='"+pass+"' ";
			ResultSet ress = c1.st.executeQuery(q); // used to retrieve data from database using conn.s.executeQuery()
            if(ress.next()) {  
                //login exists
				new details_page();  
				frame.setVisible(false); // close this page
			}else {
                //login details not work
				JOptionPane.showMessageDialog(null, "Invalid details");  
				frame.setVisible(false); // close login page
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		login_page login =  new login_page();
	}
	
}
