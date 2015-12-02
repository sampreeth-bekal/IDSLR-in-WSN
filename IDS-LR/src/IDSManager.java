
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class IDSManager extends JFrame implements ActionListener
{
	
	
	Container c;
	
	FileOutputStream fileOS=null;
	FileInputStream fileIS = null;
	
	Font f1 = new Font("Times New Roman",Font.BOLD,18);
	
	Font f3 = new Font("Times New Roman",Font.BOLD,16);
	
	Font f2 = new Font("Times New Roman",Font.BOLD,25);
	
	
	JLabel status,info;
	JMenuBar mb;
	JMenu m;
	JMenuItem m1,m2,m3,m4,m5,mi1;
	
	

	
	ImageIcon bmr = new ImageIcon(this.getClass().getResource("bmr.png"));
	ImageIcon bt = new ImageIcon(this.getClass().getResource("bt.png"));
	ImageIcon bta1 = new ImageIcon(this.getClass().getResource("bta1.png"));
	ImageIcon gmr = new ImageIcon(this.getClass().getResource("gmr.png"));
	ImageIcon gt = new ImageIcon(this.getClass().getResource("gt.png"));
	ImageIcon gta1 = new ImageIcon(this.getClass().getResource("gta1.png"));
	
	
	JLabel lbmr,lbt,lbta1,lms,lcs,leu1,leu2,leu3,leu4;
	String destip,filename;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JLabel r1,r2,r3,r4,r5,r6,r7,r8;
	
	int tn1,tn2,tn3;
	
	IDSManager()
	{
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(50, 250, 150));
		
		mb = new JMenuBar();
		m = new JMenu("File");
		mi1 = new JMenuItem("View Energy Problems");
		m1 = new JMenuItem("View Malicious Nodes");
		m2 = new JMenuItem("View Connection Hole Problems");
		m4 = new JMenuItem("Exit");
		m.add(mi1);
		m.add(m1);
		m.add(m2);
		//m.add(m3);
		m.add(m4);
		mb.add(m);
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("IDSManager.png"));
		JLabel title = new JLabel();
		title.setIcon(banner);
		title.setBounds(3,-5, 550,100);
		
		
		
		lbmr=new JLabel();
		lbmr.setIcon(bmr);
		lbmr.setBounds(10, 100, 150, 150);
		c.add(lbmr);
		
		lbt=new JLabel();
		lbt.setIcon(bt);
		lbt.setBounds(260, 100, 150, 150);
		c.add(lbt);
		
		lbta1=new JLabel();
		lbta1.setIcon(bta1);
		lbta1.setBounds(110, 100, 150, 150);
		c.add(lbta1);
		c.add(title);

		 setJMenuBar(mb);
		 m1.addActionListener(this);
		 mi1.addActionListener(this);
		 m2.addActionListener(this);
		
		 m4.addActionListener(this);
		setTitle("IDS Manager::ALBAR Load Balancing Geographic Routing Around Connectivity Holes in WSN");
		setSize(560,400);
		setVisible(true);
		int[] ports = new int[]{901,902,903,904,905,942,9016};
		for(int i=0;i<7;i++)
		{
			Thread th = new Thread(new portlistener(ports[i]));
			th.start();
		}
	}
	
	
	public class portlistener implements Runnable
	{
		int port;
		
		portlistener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{

			if(this.port==903)
			{
				try
				{
				ServerSocket sc = new ServerSocket(903);
				while(true)
				{
					Socket s = sc.accept();
					DataInputStream din = new DataInputStream(s.getInputStream());
					
					String nname=din.readUTF();
					
					
					
					
					SimpleDateFormat sdfDate = new SimpleDateFormat(
							"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
							"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;
					
					DBCon db = new DBCon();
					Connection con = db.getConnection();
					
					
					lbmr.setVisible(false);
					 lbmr.setIcon(gmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(gta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					
					 lbt.setVisible(false);
					 lbt.setIcon(gt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
											
					Statement stmt2 = con.createStatement();
					String sql2 = "insert into chproblem values('"+nname+"','"+dt+"','Connection Hole Found in Node')";
					stmt2.executeUpdate(sql2);
					
					
					DataOutputStream dout4 = new DataOutputStream(s.getOutputStream());
					dout4.writeUTF("Successfully");
					
					Thread.sleep(3000);
					 lbt.setVisible(false);
					 lbt.setIcon(bt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(bta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbmr.setVisible(false);
					 lbmr.setIcon(bmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			if(this.port==902)
			{
				try
				{
				ServerSocket sc = new ServerSocket(902);
				while(true)
				{
					Socket s = sc.accept();
					DataInputStream din = new DataInputStream(s.getInputStream());
					
					String nname=din.readUTF();
					String filename=din.readUTF();
					
					String imac=din.readUTF();
					String fmac=din.readUTF();
					
					
					
					SimpleDateFormat sdfDate = new SimpleDateFormat(
							"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
							"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;
					
					DBCon db = new DBCon();
					Connection con = db.getConnection();
					
					
					lbmr.setVisible(false);
					 lbmr.setIcon(gmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(gta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					
					 lbt.setVisible(false);
					 lbt.setIcon(gt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
											
					Statement stmt2 = con.createStatement();
					String sql2 = "insert into mproblem values('"+nname+"','"+filename+"','"+imac+"','"+fmac+"','"+dt+"','Malicious Data in Node')";
					stmt2.executeUpdate(sql2);
					
					
					DataOutputStream dout4 = new DataOutputStream(s.getOutputStream());
					dout4.writeUTF("Successfully");
					
					Thread.sleep(3000);
					 lbt.setVisible(false);
					 lbt.setIcon(bt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(bta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbmr.setVisible(false);
					 lbmr.setIcon(bmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			if(this.port==901)
			{
				try
				{
				ServerSocket sc = new ServerSocket(901);
				while(true)
				{
					Socket s = sc.accept();
					DataInputStream din = new DataInputStream(s.getInputStream());
					
					String nname=din.readUTF();
					String filename=din.readUTF();
					String len=din.readUTF();
					String cbw=din.readUTF();
					String ubw=din.readUTF();
					
					
					
					SimpleDateFormat sdfDate = new SimpleDateFormat(
							"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
							"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;
					
					DBCon db = new DBCon();
					Connection con = db.getConnection();
					
					
					lbmr.setVisible(false);
					 lbmr.setIcon(gmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(gta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					
					 lbt.setVisible(false);
					 lbt.setIcon(gt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
											
					Statement stmt2 = con.createStatement();
					String sql2 = "insert into eproblem values('"+nname+"','"+filename+"','"+len+"','"+cbw+"','"+ubw+"','"+dt+"','Less Energy in Node')";
					stmt2.executeUpdate(sql2);
					
					
					DataOutputStream dout4 = new DataOutputStream(s.getOutputStream());
					dout4.writeUTF("Successfully");
					
					Thread.sleep(3000);
					 lbt.setVisible(false);
					 lbt.setIcon(bt);
					 lbt.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbta1.setVisible(false);
					 lbta1.setIcon(bta1);
					 lbta1.setVisible(true);
					 Thread.sleep(1000);
					 
					 lbmr.setVisible(false);
					 lbmr.setIcon(bmr);
					 lbmr.setVisible(true);
					 Thread.sleep(1000);
					
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			if(this.port==202)
			{}
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
			
		if(e.getSource()==m4)
		{
		System.exit(0);
			
		}
		if(e.getSource()==mi1)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new vieweproblem();
				}
			});
		}
		
		if(e.getSource()==m2)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new viewchproblem();
				}
			});
		}
		
		else if(e.getSource()==m1)
		{
			//Nodesinfo i2 = new Nodesinfo();
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new viewmproblem();
				}
			});
		}
		else if(e.getSource()==m3)
		{}
		
		
	}
	
	public void refresh()
	{
//		try
//		{
//			
//			
//			l10.setVisible(false);
//			l11.setVisible(false);
//			l12.setVisible(false);
//			r1.setVisible(false);
//			r1.setIcon(i2);
//			r1.setVisible(true);
//			
//			r2.setVisible(false);
//			r2.setIcon(i12);
//			r2.setVisible(true);
//			
//			r3.setVisible(false);
//			r3.setIcon(i17);
//			r3.setVisible(true);
//			
//			r4.setVisible(false);
//			r4.setIcon(t2);
//			r4.setVisible(true);
//			
//			r5.setVisible(false);
//			r5.setIcon(t2);
//			r5.setVisible(true);
//			
//			r6.setVisible(false);
//			r6.setIcon(i17);
//			r6.setVisible(true);
//			
//			r7.setVisible(false);
//			r7.setIcon(t3);
//			r7.setVisible(true);
//			
//			r8.setVisible(false);
//			r8.setIcon(t3);
//			r8.setVisible(true);
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		
//		
}
	
	
	public static void main(String[] args) {
		//new Router();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new IDSManager();
			}
		});
	}
	
	

}
