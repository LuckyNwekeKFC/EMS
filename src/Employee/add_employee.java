package Employee;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
 

//this class takes care of adding employees
public class add_employee implements ActionListener {

	JFrame frame;
    JLabel box,title,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JTextField text_1,text_2,text_3,text_4,text_5;
    JTextField text_6,text_7,text_8,text_9,text_10,text_11;
    JButton addBut,cancelBut;

    
    add_employee(){
        frame = new JFrame("New Employee");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        box = new JLabel();
        box.setBounds(0,0,700,700);
        box.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/add.jpg"));
        box.setIcon(img);

        title = new JLabel("Employee Details");
        title.setBounds(320,30,500,50);
        title.setFont(new Font("sans",Font.ITALIC,25));
        title.setForeground(Color.black);
        box.add(title);
        frame.add(box);

 
        label1 = new JLabel("Name");
        label1.setBounds(50,150,100,30);
        label1.setFont(new Font("sans",Font.BOLD,18));
        box.add(label1);

        text_1=new JTextField();
        text_1.setFont(new Font("sans",Font.BOLD,15));
        text_1.setBounds(200,150,150,30);
        box.add(text_1);

        label2 = new JLabel("SurName");
        label2.setBounds(400,150,180,30);
        label2.setFont(new Font("sans",Font.BOLD,18));
        box.add(label2);

        text_2=new JTextField();
        text_2.setFont(new Font("sans",Font.BOLD,15));
        text_2.setBounds(600,150,150,30);
        box.add(text_2);

        label3 = new JLabel("Age");
        label3.setBounds(50,180,100,30);
        label3.setFont(new Font("sans",Font.BOLD,18));
        box.add(label3);

        text_3=new JTextField();
        text_3.setFont(new Font("sans",Font.BOLD,15));
        text_3.setBounds(200,180,150,30);
        box.add(text_3);

        label4 = new JLabel("Date Of Birth");  
        label4.setBounds(400,180,180,30);
        label4.setFont(new Font("sans",Font.BOLD,18));
        box.add(label4);

        text_4=new JTextField();
        text_4.setFont(new Font("sans",Font.BOLD,15));
        text_4.setBounds(600,180,150,30);
        box.add(text_4);

        label5 = new JLabel("Address");
        label5.setBounds(50,250,100,30);
        label5.setFont(new Font("sans",Font.BOLD,18));
        box.add(label5);

        text_5=new JTextField();
        text_5.setFont(new Font("sans",Font.BOLD,15));
        text_5.setBounds(200,250,150,30);
        box.add(text_5);

        label6 = new JLabel("Phone");
        label6.setBounds(400,250,100,30);
        label6.setFont(new Font("sans",Font.BOLD,18));
        box.add(label6);

        text_6=new JTextField();
        text_6.setFont(new Font("sans",Font.BOLD,15));
        text_6.setBounds(600,250,150,30);
        box.add(text_6);

        label7 = new JLabel("Email");
        label7.setBounds(50,300,100,30);
        label7.setFont(new Font("sans",Font.BOLD,18));
        box.add(label7);

        text_7=new JTextField();
        text_7.setFont(new Font("sans",Font.BOLD,15));
        text_7.setBounds(200,300,150,30);
        box.add(text_7);

        label8 = new JLabel("Education");
        label8.setBounds(400,300,100,30);
        label8.setFont(new Font("sans",Font.BOLD,18));    
        box.add(label8);

        text_8=new JTextField();
        text_8.setFont(new Font("sans",Font.BOLD,15));
        text_8.setBounds(600,300,150,30);
        box.add(text_8);

        label9 = new JLabel("Job Title");
        label9.setBounds(50,350,100,30);
        label9.setFont(new Font("sans",Font.BOLD,18));
        box.add(label9);

        text_9=new JTextField();
        text_9.setFont(new Font("sans",Font.BOLD,15));
        text_9.setBounds(200,350,150,30);
        box.add(text_9);


        label10 = new JLabel("Employee No");
        label10.setBounds(400,350,100,30);
        label10.setFont(new Font("sans",Font.BOLD,18));
        box.add(label10);

        text_10=new JTextField();
        text_10.setFont(new Font("sans",Font.BOLD,15));
        text_10.setBounds(600,350,150,30);
        box.add(text_10);

        label11 = new JLabel("Employee Tag");
        label11.setBounds(50,400,150,30);
        label11.setFont(new Font("sans",Font.BOLD,18));
        box.add(label11);

        text_11=new JTextField();   
        text_11.setFont(new Font("sans",Font.BOLD,15));
        text_11.setBounds(200,400,150,30);
        box.add(text_11);

        

        label12 = new JLabel();
        label12.setBounds(200,450,250,180);
        box.add(label12);

        label13 = new JLabel("");
        label13.setBounds(600,450,250,180);
        box.add(label13);

        addBut = new JButton("Add");
        addBut.setBackground(Color.BLUE);
        addBut.setForeground(Color.WHITE);
        addBut.setBounds(250,550,150,40);
        box.add(addBut);

        cancelBut=new JButton("Cancel");   
        cancelBut.setBackground(Color.BLACK);
        cancelBut.setForeground(Color.WHITE);
        cancelBut.setBounds(450,550,150,40);
        box.add(cancelBut);
        
        addBut.addActionListener(this);
        cancelBut.addActionListener(this);
        
        frame.setVisible(true);
        frame.setSize(900,700);
        frame.setLocation(200,18);
    }


	
    
    @Override
	public void actionPerformed(ActionEvent actionEvent) {
	
		String a  = text_1.getText();
        String text2 = text_2.getText();
        String c  = text_3.getText();
        String d  = text_4.getText();
        String e  = text_5.getText();
        String ff = text_6.getText();
        String g  = text_7.getText();
        String h  = text_8.getText();
        String i  = text_9.getText();
        String j  = text_10.getText();
        String k  = text_11.getText();
        if(actionEvent.getSource() == addBut){
            try{
                conn con = new conn();
                String q = "insert into employee values('"+a+"','"+text2+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
                con.st.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Added successfully");
                //close frame
                frame.setVisible(false);  
                //open details page to view employee info
                new details_page();  
            }catch(Exception ee){
                System.out.println("Unable to add :"+ee);
            }
        }else if(actionEvent.getSource() == cancelBut){
            frame.setVisible(false);
            //go back to homepage
            new details_page();
        } 
		
		
	}
	
	

	public static void main(String[] args) {
		new add_employee();
	}
	 
	
}
