package Employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class view_employee implements ActionListener{

    JFrame frame;
    JTextField t;
    JLabel label_1,label_2;
    JButton button_1,button_2;

    view_employee(){
        frame=new JFrame("Show Employee");
        frame.setBackground(Color.white);
        frame.setLayout(null);

      
        label_2=new JLabel("Employee Id");
        label_2.setVisible(true);
        label_2.setBounds(40,60,250,30);
        label_2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        label_2.setFont(F1); 
        label_1.add(label_2);
        frame.add(label_1);


        t=new JTextField();
        t.setFont(new Font("serif",Font.BOLD,17));
        t.setBounds(240,60,220,30);
        label_1.add(t);

        button_1=new JButton("Search");
        button_1.setBounds(240,150,100,30);
        button_1.addActionListener(this);
        label_1.add(button_1);

        button_2=new JButton("Cancel");
        button_2.setBounds(360,150,100,30);
        button_2.addActionListener(this);
        label_1.add(button_2);

        frame.setSize(500,270);
        frame.setLocation(450,250);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource()==button_2){
            frame.setVisible(false);
            details_page d=new details_page();
        }
        if(actionEvent.getSource()==button_1){
            frame.setVisible(false);
            print_data p=new print_data(t.getText());
        }

    }

    public static void main(String[]ar){
        new view_employee();
    }
}