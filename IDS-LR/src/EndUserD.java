

import java.awt.BorderLayout;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;











import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EndUserD extends JFrame implements ActionListener {

	
	Socket socket;
	ServerSocket serverSocket;

	public Font f = new Font("Times new roman", Font.BOLD, 22);
	public Font f1 = new Font("Times new roman", Font.BOLD, 15);
	public Font f2 = new Font("Arial", Font.BOLD, 14);
	public Font f3 = new Font("Times new roman", Font.BOLD, 18);
	public JButton b1=new JButton("Request File");
	public JButton b2=new JButton("Exit");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	
	public JLabel imagelabel = new JLabel();
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;
	String keyword = "2d2b3bef2bfa3a8cfdb0277b25ed94d79ca0cb99";
	
	EndUserD() {
		StringBuffer buffer = new StringBuffer();

		ImageIcon img1 = new ImageIcon(this.getClass().getResource("d.png"));
		imagelabel.setIcon(img1);
		imagelabel.setBounds(150, -50, 200, 200);

		jf = new JFrame("EndUser D :: ALBAR Load Balancing Geographic Routing Around Connectivity Holes in WSN");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(470, 550);
		//jf.setResizable(false);
		c.setBackground(new Color(150,120,100));
	
		Border b11=BorderFactory.createLineBorder(Color.black,2);
		
		
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("File Receiving");
		b22.setTitleColor(Color.blue);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
		bord.setBounds(10, 110, 440, 310);
		c.add(bord);
	
//		TitledBorder b23=new TitledBorder(b11);
//		JLabel bord1 =new JLabel();
//		bord1.setBorder(b23);
//		bord1.setBackground(Color.black);
//		bord1.setBounds(10, 430, 440, 50);
//		c.add(bord1);
	
		b1.setBounds(50, 440, 100, 30);
		b2.setBounds(300, 440, 100, 30);
//		c.add(b1);
//		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		pane.setBounds(30, 130, 410, 280);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		tf.setEditable(false);
		pane.setName("pane");
		pane.setViewportView(tf);
		
		
		jf.show();
		
		c.add(pane, BorderLayout.CENTER);
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		int[] ports = new int[] {104};
		for(int i=0;i<1;i++)
		{
			Thread th = new Thread(new PortListener(ports[i]));
			th.start();
		}
		c.add(imagelabel);
	
	}
	
	class PortListener implements Runnable
	{
		
		int port;
		
		public PortListener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{
			if(this.port==104)
			{
				try {
						
	
					ServerSocket serverSocket = new ServerSocket(104);
					System.out.println("i am Receiver & listening...");

					while (true) {
						socket = serverSocket.accept();
						ObjectInputStream dis = new ObjectInputStream(socket
								.getInputStream());
						String filename =(String) dis.readObject();
						if (filename.toLowerCase().endsWith(".java")
								|| filename.toLowerCase().endsWith(".txt")
								|| filename.toLowerCase().endsWith(".log"))
						{
						String data =(String) dis.readObject();
						
						tf.setText(data);
						
						ObjectOutputStream d = new ObjectOutputStream(socket.getOutputStream());
						d.writeObject("Data Received successfully ");
						}
						else
						{
							byte[] content = (byte[])dis.readObject();
							tf.setText(filename);
							FileOutputStream fos = new FileOutputStream("user/"+ filename);
							fos.write(content);
							fos.close();
							
							JOptionPane.showMessageDialog(null, "FileDownloaded Successfully");
							int i = JOptionPane.showConfirmDialog(null, "Do you want to open file Downloaded Folder");
							if(i==0)
							{
								File f= new File("user");
								Desktop desktop = Desktop.getDesktop();
								 desktop.open(f);
								
							}
							else if(i==1)
							{
								
							}
							ObjectOutputStream d = new ObjectOutputStream(socket.getOutputStream());
							d.writeObject("Data Received successfully ");
						}
						

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
		//new NodeC();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EndUserD();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		if(e.getSource()==b1)
		{
			Timer timer=new Timer(100, null);
			try
			{
			InetAddress ia = InetAddress.getLocalHost();
			String ip = ia.getHostAddress();
			
			
				String filename=JOptionPane.showInputDialog("Enter the Filename");
				String sec=JOptionPane.showInputDialog("Enter Secretkey");
				String ip1=JOptionPane.showInputDialog("Enter Router Ip address");
				
				Socket sc1 = new Socket(ip1,302);
				ObjectOutputStream dout1 = new ObjectOutputStream(sc1.getOutputStream());
				long stime=System.currentTimeMillis();
				timer.start();
				
				
				dout1.writeObject(filename);
				dout1.writeObject(sec);
				dout1.writeObject(ip);
				dout1.writeObject("C");
				
				ObjectInputStream oin = new ObjectInputStream(sc1.getInputStream());
				String msg1 =(String)oin.readObject();
				System.out.println(msg1);
				
				
				if(msg1.equalsIgnoreCase("success"))
				{
					if (filename.toLowerCase().endsWith(".java")
							|| filename.toLowerCase().endsWith(".txt")
							|| filename.toLowerCase().endsWith(".log"))
					{
					String data =(String) oin.readObject();
					tf.setText(data);
					
					
					}
					else
					{
						byte[] content = (byte[])oin.readObject();
						tf.setText(filename);
						FileOutputStream fos = new FileOutputStream("user/"+ filename);
						fos.write(content);
						fos.close();
						
						JOptionPane.showMessageDialog(null, "FileDownloaded Successfully");
						int i = JOptionPane.showConfirmDialog(null, "Do you want to open file Downloaded Folder");
						if(i==0)
						{
							File f= new File("user");
							Desktop desktop = Desktop.getDesktop();
							 desktop.open(f);
							
						}
						else if(i==1)
						{
							
						}
						
					}
					long etime=System.currentTimeMillis();      
		            long ttime=etime-stime;      
		            
		            JOptionPane.showMessageDialog(null, "Total Time Delay="+ttime);
		            
		            DBCon db = new DBCon();
					 Connection con = db.getConnection();
						
						SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						Date now = new Date();

						String strDate = sdfDate.format(now);
						String strTime = sdfTime.format(now);
						String dt = strDate + "   " + strTime;
																		
						Statement stmt1 = con.createStatement();
						String sql1 = "insert into delay values('"+ttime+"','"+dt+"','C')";
						stmt1.executeUpdate(sql1);
				}
				else if(msg1.equalsIgnoreCase("failure"))
				{
					JOptionPane.showMessageDialog(null, "Filename or Secretkey is Mismatch" );
				}
				else if(msg1.equalsIgnoreCase("not"))
				{
					JOptionPane.showMessageDialog(null, "File Not Found in NLC, and Service Provider not Responded " );
				}
				
				
				
			
			}
			
			
			
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		


	}

}
