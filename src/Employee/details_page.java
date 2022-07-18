package Employee;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//to show detsils page
public class details_page implements ActionListener {

	JFrame frame;
	JLabel label_1, label_2;
	JButton button_1, button_2, button_3, button_4;
	
	
	details_page(){
	
		frame = new JFrame("Dashboard");
		frame.setBackground(Color.WHITE);
		frame.setLayout(null);
		
		 
		//adding employee details
		label_2 = new JLabel("Employee Details");
		label_2.setBounds(430,20,200,40);
		label_2.setFont(new Font("sans",Font.BOLD,25));
		label_2.setForeground(Color.BLUE);
		label_2.setLayout(null);
		frame.add(label_2);
		
		
		//drawing add button
		button_1 = new JButton("Add");
		button_1.setBounds(420,80,90,30);
		button_1.setBackground(Color.BLUE);
		button_1.setFont(new Font("sans",Font.BOLD,16));
		button_1.addActionListener(this);  
		frame.add(button_1);
		
		//drawing view button
		button_2 = new JButton("View");
		button_2.setBounds(540,80,90,30);
		button_2.setBackground(Color.BLUE);
		button_2.setFont(new Font("sans",Font.BOLD,16));
		button_2.addActionListener(this);   
		frame.add(button_2);
		
		//drawing remove button
		button_3 = new JButton("Remove");
		button_3.setBounds(420,140,90,30);
		button_3.setBackground(Color.BLUE);
		button_3.setFont(new Font("sans",Font.BOLD,16));
		button_3.addActionListener(this);  
		frame.add(button_3);
		
	
		//drawing modify button
		button_4 = new JButton("Modify");
		button_4.setBounds(540,140,90,30);
		button_4.setBackground(Color.BLUE);
		button_4.setFont(new Font("sans",Font.BOLD,16));
		button_4.addActionListener(this);  // perform action on button click.
		frame.add(button_4);
		
		
		frame.setVisible(true);
		frame.setSize(700,500);
		frame.setLocation(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button_1) {
			frame.setVisible(false);
			new add_employee();
		}
		else if(e.getSource() == button_2) {
			frame.setVisible(false);
			new view_employee();
		}
		else if(e.getSource() == button_3) {
			frame.setVisible(false);
			new remove_employee();
		}
		 
		
	}
	
	
	public static void main(String [] args) {
		new details_page().frame.setVisible(true);
	}
	
}
