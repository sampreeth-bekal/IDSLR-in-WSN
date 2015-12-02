import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.*;

import javax.swing.*;

public class Attacker extends JFrame implements ActionListener
{
	Container c;
	JButton jb,jb1,jb2,jb3;
	JLabel al;
	//JTextArea tf;
	JTextField t1,t2;
	String keyword = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	public Font f1 = new Font("Times new roman", Font.BOLD, 16);
	String hash;
	String data;
	Attacker()
	{
		JScrollPane pane = new JScrollPane();
		setTitle("Attacker");
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		al=new JLabel("Enter the False Data to Attack");
		jb = new JButton("Attack Status of Node");
		jb.setFont(f1);
		jb.setBounds(50,150,190,30);
		al.setBounds(40,-10,210,100);
		al.setFont(f1);
		
		jb3 = new JButton("Generate Sign");
		jb3.setBounds(50,150,180,30);
		jb3.setFont(f1);
		
		jb1 = new JButton("Attack Node");
		jb1.setBounds(250,150,180,30);
		jb1.setFont(f1);
		jb2 = new JButton("Exit");
		jb2.setBounds(450,150,100,30);
		jb2.setFont(f1);
		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		//c.add(jb);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(al);	
	/*	tf = new JTextArea();
		tf.setColumns(100);
		tf.setForeground(Color.black);
		tf.setFont(f1);
		tf.setRows(200);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		pane.setBounds(250, 50, 350, 350);*/
		t1=new JTextField();
		t1.setFont(f1);
		t1.setForeground(Color.blue);
		t1.setBounds(250, 90, 300, 30);
		
		t2=new JTextField();
		t2.setFont(f1);
		t2.setForeground(Color.blue);
		t2.setBounds(250, 30, 300, 30);
	
		c.add(pane, BorderLayout.CENTER);
		c.add(t1);
		c.add(t2);
		setSize(650,250);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb3)
		{

			
			
			
			
			try
			{
		
				data=t2.getText();
				PrintStream p = new PrintStream(new FileOutputStream("Attacker/Attack.txt"));
				p.print(new String(data));
				
				MessageDigest md = MessageDigest.getInstance("SHA1");
				
				
				FileInputStream fis11 = new FileInputStream("Attacker/Attack.txt");
				DigestInputStream dis1 = new DigestInputStream(fis11, md);
				BufferedInputStream bis1 = new BufferedInputStream(dis1);
	 
				//Read the bis so SHA1 is auto calculated at dis
				while (true) {
					int b1 = bis1.read();
					if (b1 == -1)
						break;
				}
	 
				BigInteger bi1 = new BigInteger(md.digest());
				String spl1 = bi1.toString();
				hash = bi1.toString(16);
				System.out.println(hash);
				
				t1.setText(hash);
				
			
				
			
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
				
		}
		
		if(e.getSource()==jb1)
		{
			
			
			
			
			try
			{
		
			
				
				String[] dsname = { "Select Nodes", "N1", "N2", "N3", "N4","N5","N6","N7","N8","N9","N10", "N11", "N12", "N13", "N14","N15","N16","N17","N18","N19","N20" };
				
				String dataname = (String) JOptionPane.showInputDialog(null,
						"Select Nodes", "Node Name",
						JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
				
				
				
				String ip = JOptionPane.showInputDialog(null,
						"Please Enter the IP Address Of Router");
				
				data=t2.getText();
				
				
				
					Socket sc1 = new Socket(ip,504);
					DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
					dout1.writeUTF(dataname);
					dout1.writeUTF(data);
					dout1.writeUTF(hash);
					DataInputStream oin = new DataInputStream(sc1.getInputStream());
					String msg1 = (String) oin.readUTF();
					if(msg1.equalsIgnoreCase("success"))
					{
						JOptionPane.showMessageDialog(null, "Attack Completed");
						
					}
				
					else if(msg1.equalsIgnoreCase("failure"))
					{
						JOptionPane.showMessageDialog(null, "Attack Failure" );
					}
					
				
				
				
				
				
				
				
				
			
				
			
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
			
			
			
			
			
			
			
		}
		if(e.getSource()==jb2)
		{
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Attacker();
			}
		});
	}

}
