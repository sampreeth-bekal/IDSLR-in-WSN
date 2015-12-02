
import javax.swing.*;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.net.*;

public class filedetails extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel label1;
  JTextField  text1;
  Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;

JLabel imglabel;
filedetails() 
 {

setTitle("File Details");
c= getContentPane();
c.setLayout (null);


label1 = new JLabel();
label1.setText("Enter Username");

 text1 = new JTextField(20);
   property=new JButton("View Property");

   property.addActionListener(this);


//c.add(label1);
//c.add(text1);
//c.add(property);



c.setBackground(Color.ORANGE);
setSize(700,400);
setVisible(true);

try {
	 Vector heading = new Vector();
	 
	 
	 
	 heading.addElement("Sender IP");
	 heading.addElement("File Name");
	 heading.addElement("MAC");
	
	 heading.addElement("Reciever Name");
	 heading.addElement("Reciever IP");
	 heading.addElement("Date & Time");
	
	 
	 
			  Vector data=new Vector();
			  DBCon db = new DBCon();
				 Connection con = db.getConnection();
	             Statement stmt = con.createStatement();
	             
	             
	             String query = "SELECT * From source ";
	             ResultSet rs = stmt.executeQuery(query);



	    


	ResultSetMetaData rsm=rs.getMetaData();
	int col=rsm.getColumnCount();



	            while(rs.next())
	             {
	Vector row = new Vector();
	  for(int i = 1; i <=col; i++){
	                   row.addElement(rs.getObject(i));

	             }

	data.addElement(row);
	             }
			  
			JTable table = new JTable(data,heading);
			  
			  pane = new JScrollPane(table);
			 
			  pane.setBounds(10,10,650,400);
			  c.add(pane);
			 // c.add(image);
	 } 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 

  }


public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();

if(o==property)
{
		
}

}

}
