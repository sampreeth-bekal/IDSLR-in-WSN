import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.crypto.Cipher;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Source implements ActionListener {

	Container c;
	JLabel l1, l2, l3, l4, img, op, op2,l77,op1;
	JButton b1, b2, b3, b4,b5;
	String filename;
	JTextField t1,t2,t3;
	JTextArea ta;
	ImageIcon ic,ic1;
	JScrollPane sp;
	JFrame jf;
	Border b, bb;
	File path;
	int y = 0;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	String path1;
    String REQ;
	Cipher encoder;
	public static Key prKey;
	public static Key pubKey;

	public Font f1 = new Font("Times new Roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new Roman", Font.BOLD, 15);
	String mac;
	// String secretkey;
	// String pk;
	String fname;
	File field;
	String SReciever = "";
	String receiver = "";
	String d = "";
	

	static String secretkey;
	static String pk;
	JMenuBar mb;
	JMenu m;
	JMenuItem m1,m2,m3,mi1;

	Source(String name,String group) {

		jf = new JFrame("Dataowner:: ALBAR Load Balancing Geographic Routing Around Connectivity Holes in WSN");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setResizable(false);

		c.setBackground(new Color(100, 150, 50));
		
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("ServiceProvider.png"));
		JLabel title = new JLabel();
		title.setIcon(banner);
		title.setBounds(3,-5, 830,70);
		

		ta = new JTextArea();
		ta.setColumns(100);
		ta.setRows(100);
		ta.setFont(f2);

		sp = new JScrollPane();
		sp.setViewportView(ta);
		sp.setBounds(140, 211, 430, 205);
		
		 Border bb = BorderFactory.createLineBorder(Color.black,4);
			op1= new JLabel();
			op1.setBorder(bb);
			op1.setBounds(50, 65, 730, 390);
			c.add(op1);


			mb = new JMenuBar();
			m = new JMenu("File");
			
			m1 = new JMenuItem("File Transfer Details");
			m2 = new JMenuItem("Request Log Details");
			m3 = new JMenuItem("Exit");
			m.add(m1);
			//m.add(m2);
			m.add(m3);
			mb.add(m);
	
	

		l2 = new JLabel("FileName :");
		l2.setFont(f1);
//		l2.setForeground(Color.orange);
		l2.setBounds(130, 150, 130, 30);
		
		l3 = new JLabel("User Name :");
		l3.setForeground(Color.orange);
		l3.setFont(f1);
		l3.setBounds(520, 190, 130, 30);
//		c.add(l3);
		
		
		l77= new JLabel("Group Name:");
		l77.setForeground(Color.orange);
		l77.setFont(f1);
		l77.setBounds(508, 140, 130, 30);
//		c.add(l77);

		t1 = new JTextField();
		t1.setBounds(220, 150, 120, 25);
	
		
		t2 = new JTextField();
		t2.setText(name);
		t2.setBounds(630, 190, 120, 25);
		t2.setEditable(false);
//		c.add(t2);
		
		t3 = new JTextField();
		t3.setText(group);
		t3.setBounds(630, 140, 120, 25);
		t3.setEditable(false);
		
//		c.add(t3);
		

		b1 = new JButton("Send");
		b1.setBounds(590, 250, 160, 30);
		b1.setFont(f1);
//		b1.setForeground(Color.red);
		
		
		
		b3 = new JButton("Browse");
		b3.setBounds(590, 200, 160, 30);
		b3.setFont(f1);
//		b3.setForeground(Color.red);
		
		
		b4 = new JButton("Initialise Nodes");
		b4.setBounds(590, 300, 160, 30);
		b4.setFont(f1);
//		b4.setForeground(Color.red);
		
		
		
		
		b1.addActionListener(this);	
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		jf.setJMenuBar(mb);
		
	
		 m1.addActionListener(this);
			
		 m2.addActionListener(this);
		 m3.addActionListener(this);

		

		c.add(l2);
		c.add(t1);
		c.add(b1);
		c.add(b4);
		c.add(b3);
		
		c.add(sp);
//		c.add(op);
//		c.add(op2);

		c.add(title);
		jf.show();
		jf.setSize(840, 560);
		
		
		int[] port = new int[] { 401, 3332};

		for (int i = 0; i < 2; i++) {
			Thread th = new Thread(new PortListener(port[i]));
			th.start();
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
				new Source("dfgd","dg");
			}
		});
	
		
	}
	
	
	
	class PortListener implements Runnable {
		DataOutputStream dos = null;
		DataInputStream in = null;

		ServerSocket server;
		Socket connection;
		int i;
		String fileid;
		Connection con;
		Statement stmt;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() 
		{
		   
			if (this.port == 3332)
		     {
				try 
				{
				   ServerSocket s1=new ServerSocket(3332);
				   while(true)
				   {
					Socket ss1=s1.accept();
					
					DataInputStream dis=new DataInputStream(ss1.getInputStream());
					String msg=dis.readUTF();
		
					System.out.println("data recived");
					
					if(msg.equals("safe"))
						
					{
						JOptionPane.showMessageDialog(null,"File is Safe");
					}else
						if(msg.equals("notsafe"))
						{
							JOptionPane.showMessageDialog(null,"File is Modified");
							
						}

					
					 DBCon db=new DBCon();
		        	 Connection con=db.getConnection();
				
					Statement stmt1 = con.createStatement();
					String sql2="select * from owner where fname='"+fname+"'";
					ResultSet rs=stmt1.executeQuery(sql2);
					String sk="";
					
					if(rs.next()==true)
					{
						 sk=rs.getString(5);
					}
					
					DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
					
					dos.writeUTF(sk);
				
					
				   }
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			
		}
			
	
	}


	public void actionPerformed(ActionEvent ae) {

		String strLine;
		String content1 = null;
		
		if (ae.getSource() == b3) 
		{
			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			int retval = chooser.showOpenDialog(b3);
			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();

				filename = field.getName();

				t1.setText(filename);

			}

			File curFile = chooser.getSelectedFile();

			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();
				while ((strLine = br.readLine()) != null) {

					buffer.append(strLine + "\n");

				}
				ta.setText(buffer.toString());
				String content = ta.getText();
				
				

				FileOutputStream fos = new FileOutputStream("owner/" + filename);
				fos.write(content.getBytes());
				fos.close();
				
				

				
				

				KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
				encoder = Cipher.getInstance("RSA");
				KeyPair kp = kg.generateKeyPair();

				prKey = kp.getPrivate();
				pubKey = kp.getPublic();

				byte[] pub = pubKey.getEncoded();
				System.out.println("PUBLIC KEY" + pub);

				pk = String.valueOf(pub);
				System.out.println("Private key" + pk);

//				KeyGenerator k = new KeyGenerator();
//				secretkey = String.valueOf(k.getKeys());
//				System.out.println("Secretkey" + secretkey);
			

				String fname1 = ta.getText();
				System.out.println("File Name" + filename);
				MessageDigest md = MessageDigest.getInstance("SHA1");
				
				FileInputStream in1 = new FileInputStream("owner\\" + filename);
				DigestInputStream dis2 = new DigestInputStream(in1, md);
				BufferedInputStream bd = new BufferedInputStream(dis2);

				while (true) {
					int b2 = bd.read();
					if (b2 == -1)
						break;
				}
				 content1 = ta.getText();

				BigInteger bi2 = new BigInteger(md.digest());
				mac = bi2.toString(16);
				System.out.println("The generated macis:" + mac);
				
		

			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}

		}

		if (ae.getSource() == b1) 
		{

			
		String[] dsname = { "Select Destination", "A", "B", "C", "D" };
		
		String dataname = (String) JOptionPane.showInputDialog(null,
				"Select Destination", "Destination Name",
				JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
	 
		String dest = JOptionPane.showInputDialog(null,
				"Please Enter the IP Address Of "+dataname);
		String ip = JOptionPane.showInputDialog(null,
				"Please Enter the IP Address Of Router");

			
			try {
				InetAddress ia = InetAddress.getLocalHost();
				String ip1= ia.getHostAddress();
				SimpleDateFormat sdfDate = new SimpleDateFormat(
						"dd/MM/yyyy");
				SimpleDateFormat sdfTime = new SimpleDateFormat(
						"HH:mm:ss");

				Date now = new Date();

				String strDate = sdfDate.format(now);
				String strTime = sdfTime.format(now);
				String dt = strDate + "   " + strTime;
				
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
	        	 
	        	 String fname=t1.getText();
	        	 String content = ta.getText();
	        	 
	        	 
	        	 Statement stmt1 = con.createStatement();
					String sql1 = "insert into source values('"+ip1+"','"+fname+"','"+mac+"','"+dataname+"','"+dest+"','"+dt+"')";
					stmt1.executeUpdate(sql1);

               Socket ss=new Socket(ip,2001);
               DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
               dos.writeUTF(fname);
               dos.writeUTF(mac);
               dos.writeUTF(content);
               dos.writeUTF(dataname);
               dos.writeUTF(dest);
               DataInputStream dii=new DataInputStream(ss.getInputStream());
               String msg=dii.readUTF();
              
            	   JOptionPane.showMessageDialog(null, msg);
              
              
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		if (ae.getSource() == b4) 
		{

			try {
				
				InetAddress ia = InetAddress.getLocalHost();
				String ip1= ia.getHostAddress();
			String[] dsname = { "Select Destination", "A", "B", "C", "D" };
			
			String dataname = (String) JOptionPane.showInputDialog(null,
					"Select Destination", "Destination Name",
					JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
		 
			String dest = JOptionPane.showInputDialog(null,
					"Please Enter the IP Address Of "+dataname);
			String ip = JOptionPane.showInputDialog(null,
					"Please Enter the IP Address Of Router");
				
			 String fname=t1.getText();
			 
			 
				Socket s = new Socket(ip, 1006);

				DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
				
				dos1.writeUTF(fname);
				dos1.writeUTF(mac);
				dos1.writeUTF(dataname);
	            dos1.writeUTF(dest);
			
		    	
		    	
		    	DataInputStream dis=new DataInputStream(s.getInputStream());
		    	String msg=dis.readUTF();
		    		JOptionPane.showMessageDialog(null, "Node Initialized Successfully");
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==m1)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new filedetails();
				}
			});
	}
		else if(ae.getSource()==m2)
		{
			
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					//new requestdetails();
				}
			});
		}
		 if(ae.getSource()== m3)
		 {
			
			 System.exit(0);
			
			 
		 }
		
	}
	}



	

