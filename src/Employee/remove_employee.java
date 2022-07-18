package Employee;


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class remove_employee implements ActionListener{
    JFrame frame;
    JTextField t;
    JLabel label_1,label_2,label_3,label_4,label_5;
    JButton b,b1,b2,b3;

    remove_employee(){
        frame=new JFrame("Remove Employee");
        frame.setBackground(Color.green);   
        frame.setLayout(null);

          
        label_1=new JLabel("Input Employee Id");
        label_1.setBounds(50,50,250,30);
        label_1.setForeground(Color.white);
        Font f2 = new Font("serif",Font.BOLD,25); 
        label_1.setFont(f2);
        label_5.add(label_1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        label_5.add(t);



        b1=new JButton("Remove");
        b1.setBounds(120,300,100,30);
        b1.addActionListener(this);
        label_5.add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(300,300,100,30);
        b2.addActionListener(this);
        label_5.add(b2);
        b1.setVisible(false);
        b2.setVisible(false);

        frame.setSize(500,500);
        frame.setLocation(500,250);  
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

       
        
        // Perform delete operation after confirming id matched
        if(ae.getSource()==b1){
            try{
                conn con = new conn();
                String str = "delete from employee where emp_id = '"+t.getText()+"'";
                con.st.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted");
                 

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while deleting record "+ex);
            }
        }
        // go back to details page
        if(ae.getSource()==b2){
            frame.setVisible(false);
            details_page d=new details_page();
        }
         
    }

    
    
    public static void main(String[]ar){
        new remove_employee();
    }
}