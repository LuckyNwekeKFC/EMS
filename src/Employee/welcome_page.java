package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;

class welcome_page implements ActionListener {
	
	JFrame frame;JLabel label_2;
	JButton b;
	
	
	welcome_page(){
	
		frame = new JFrame("Employee Management System");
		frame.setBackground(Color.white);
		frame.setLayout(null); // absolute layout used
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		//adding employee details
		label_2 = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		label_2.setBounds(430,20,400,40);
		label_2.setFont(new Font("sans",Font.BOLD,25));
		label_2.setForeground(Color.BLUE);
		label_2.setLayout(null);
		frame.add(label_2);
				
		JButton b = new JButton("CONTINUE");
		b.setBackground(Color.BLUE);
		b.setForeground(Color.WHITE);
		b.setBounds(525,530,180,40);
		b.addActionListener(this);  // perform action on button click.
		// setting background
		//adding button
		frame.add(b);
        frame.getContentPane().setBackground(Color.WHITE); 
		
		frame.setVisible(true);
		frame.setSize(1250,650);
		frame.setLocation(50,50); // setting on window location 
		 
		
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
        //go to login page
			frame.setVisible(false);
			new login_page();   
		
	}
	
	public static void main(String [] args) {
		new welcome_page();
	}
	
}
