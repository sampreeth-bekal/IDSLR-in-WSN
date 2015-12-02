import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;


public class A 
{

	

	try 
	{
		AES enc = new AES();
		DBCon db=new DBCon();
		Connection con=db.getConnection();
		ServerSocket s1=new ServerSocket(2001);
		while(true)
		{
			Socket ss1=s1.accept();

			DataInputStream dis=new DataInputStream(ss1.getInputStream());
			String fname=dis.readUTF();
			String mac=dis.readUTF();
			String content=dis.readUTF();
			String destination=dis.readUTF();
			
			int data=content.length();
			Statement stmt1 = con.createStatement();
			String sql2="insert into source values('"+fname+"','"+mac+"')";
			stmt1.executeUpdate(sql2);

		
						Statement st1 = con.createStatement();
						String sq1 = "select * from Router where Nodename='N1'";
						ResultSet rs1=st1.executeQuery(sq1);
			
						if(rs1.next()==true)
						{
			
							cost1=Integer.parseInt(rs1.getString(2));
							bw1=Integer.parseInt(rs1.getString(3));
							mac1=rs1.getString(5);
							state1=rs1.getString(6);
							
							val1=Integer.toString(cost1);
			
						}
			
						Statement st2 = con.createStatement();
						String sq2 = "select * from Router where Nodename='N2'";
						ResultSet rs2=st2.executeQuery(sq2);
			
						if(rs2.next()==true)
						{
			
							cost2=Integer.parseInt(rs2.getString(2));
							bw2=Integer.parseInt(rs2.getString(3));
							mac2=rs2.getString(5);
							state2=rs2.getString(6);
							val2=Integer.toString(cost2);
			
						}
			
			
						Statement st3 = con.createStatement();
						String sq3 = "select * from Router where Nodename='N3'";
						ResultSet rs3=st3.executeQuery(sq3);
			
						if(rs3.next()==true)
						{
			
							cost3=Integer.parseInt(rs3.getString(2));
							bw3=Integer.parseInt(rs3.getString(3));
							mac3=rs3.getString(5);
							state3=rs3.getString(6);
							
							val3=Integer.toString(cost3);
			
						}
			
						Statement st4 = con.createStatement();
						String sq4 = "select * from Router where Nodename='N4'";
						ResultSet rs4=st4.executeQuery(sq4);
			
						if(rs4.next()==true)
						{
			
							cost4=Integer.parseInt(rs4.getString(2));
							bw4=Integer.parseInt(rs4.getString(3));
							mac4=rs4.getString(5);
							state4=rs4.getString(6);
							
							val4=Integer.toString(cost4);
			
						}
			
			
						Statement st5 = con.createStatement();
						String sq5 = "select * from Router where Nodename='N5'";
						ResultSet rs5=st5.executeQuery(sq5);
			
						if(rs5.next()==true)
						{
			
							cost5=Integer.parseInt(rs5.getString(2));
							bw5=Integer.parseInt(rs5.getString(3));
							mac5=rs5.getString(5);
							state5=rs5.getString(6);
							
							val5=Integer.toString(cost5);
			
						}
			
						Statement st6 = con.createStatement();
						String sq6 = "select * from Router where Nodename='N6'";
						ResultSet rs6=st6.executeQuery(sq6);
			
						if(rs6.next()==true)
						{
			
							cost6=Integer.parseInt(rs6.getString(2));
							bw6=Integer.parseInt(rs6.getString(3));
							mac6=rs6.getString(5);
							state6=rs6.getString(6);
							
							val6=Integer.toString(cost6);
			
						}
			
			
						Statement st7 = con.createStatement();
						String sq7 = "select * from Router where Nodename='N7'";
						ResultSet rs7=st7.executeQuery(sq7);
			
						if(rs7.next()==true)
						{
			
							cost7=Integer.parseInt(rs7.getString(2));
							bw7=Integer.parseInt(rs7.getString(3));
							mac7=rs7.getString(5);
							state7=rs7.getString(6);
							
							val7=Integer.toString(cost7);
			
						}
			
			
						Statement st8 = con.createStatement();
						String sq8 = "select * from Router where Nodename='N8'";
						ResultSet rs8=st8.executeQuery(sq8);
			
						if(rs8.next()==true)
						{
			
							cost8=Integer.parseInt(rs8.getString(2));
							bw8=Integer.parseInt(rs8.getString(3));
							mac8=rs8.getString(5);
							state8=rs8.getString(6);
							
							val8=Integer.toString(cost8);
			
						}
			
			
						Statement st9 = con.createStatement();
						String sq9 = "select * from Router where Nodename='N9'";
						ResultSet rs9=st9.executeQuery(sq9);
			
						if(rs9.next()==true)
						{
			
							cost9=Integer.parseInt(rs9.getString(2));
							bw9=Integer.parseInt(rs9.getString(3));
							mac9=rs9.getString(5);
							state9=rs9.getString(6);
							
							val9=Integer.toString(cost9);
						}
			
						Statement st10 = con.createStatement();
						String sq10 = "select * from Router where Nodename='N10'";
						ResultSet rs10=st10.executeQuery(sq10);
			
						if(rs10.next()==true)
						{
			
							cost10=Integer.parseInt(rs10.getString(2));
							bw10=Integer.parseInt(rs10.getString(3));
							mac10=rs10.getString(5);
							state10=rs10.getString(6);
							
							val10=Integer.toString(cost10);
			
						}
			
						Statement st11 = con.createStatement();
						String sq11 = "select * from Router where Nodename='N11'";
						ResultSet rs11=st11.executeQuery(sq11);
			
						if(rs11.next()==true)
						{
			
							cost11=Integer.parseInt(rs11.getString(2));
							bw11=Integer.parseInt(rs11.getString(3));
							mac11=rs11.getString(5);
							state11=rs11.getString(6);
							
							val11=Integer.toString(cost11);
			
						}
			
			
			
						Statement st12 = con.createStatement();
						String sq12 = "select * from Router where Nodename='N12'";
						ResultSet rs12=st12.executeQuery(sq12);
			
						if(rs12.next()==true)
						{
			
							cost12=Integer.parseInt(rs12.getString(2));
							bw12=Integer.parseInt(rs12.getString(3));
							mac12=rs12.getString(5);
							state12=rs12.getString(6);
							
							val12=Integer.toString(cost12);
			
						}
			
						Statement st13 = con.createStatement();
						String sq13 = "select * from Router where Nodename='N13'";
						ResultSet rs13=st13.executeQuery(sq13);
			
						if(rs13.next()==true)
						{
			
							cost13=Integer.parseInt(rs13.getString(2));
							bw13=Integer.parseInt(rs13.getString(3));
							mac13=rs13.getString(5);
							state13=rs13.getString(6);
							val13=Integer.toString(cost13);
			
						}
			
						Statement st14 = con.createStatement();
						String sq14 = "select * from Router where Nodename='N14'";
						ResultSet rs14=st14.executeQuery(sq14);
			
						if(rs14.next()==true)
						{
			
							cost14=Integer.parseInt(rs14.getString(2));
							bw14=Integer.parseInt(rs14.getString(3));
							mac14=rs14.getString(5);
							state14=rs14.getString(6);
							
							val14=Integer.toString(cost14);
						}
			
			
						Statement st15 = con.createStatement();
						String sq15 = "select * from Router where Nodename='N15'";
						ResultSet rs15=st15.executeQuery(sq15);
			
						if(rs15.next()==true)
						{
			
							cost15=Integer.parseInt(rs15.getString(2));
							bw15=Integer.parseInt(rs15.getString(3));
							mac15=rs15.getString(5);
							state15=rs15.getString(6);
							
							val15=Integer.toString(cost15);
			
						}
			
						Statement st16 = con.createStatement();
						String sq16 = "select * from Router where Nodename='N16'";
						ResultSet rs16=st16.executeQuery(sq16);
			
						if(rs16.next()==true)
						{
			
							cost16=Integer.parseInt(rs16.getString(2));
							bw16=Integer.parseInt(rs16.getString(3));
							mac16=rs16.getString(5);
							state16=rs16.getString(6);
							
							val16=Integer.toString(cost16);
						}
			
			
						Statement st17 = con.createStatement();
						String sq17 = "select * from Router where Nodename='N17'";
						ResultSet rs17=st17.executeQuery(sq17);
			
						if(rs17.next()==true)
						{
			
							cost17=Integer.parseInt(rs17.getString(2));
							bw17=Integer.parseInt(rs17.getString(3));
							mac17=rs17.getString(5);
							state17=rs17.getString(6);
							
							val17=Integer.toString(cost17);
						}
			
			
						Statement st18 = con.createStatement();
						String sq18 = "select * from Router where Nodename='N18'";
						ResultSet rs18=st18.executeQuery(sq18);
			
						if(rs18.next()==true)
						{
			
							cost18=Integer.parseInt(rs18.getString(2));
							bw18=Integer.parseInt(rs18.getString(3));
							mac18=rs18.getString(5);
							state18=rs18.getString(6);
							
							
							val18=Integer.toString(cost18);
						}
			
			
						Statement st19 = con.createStatement();
						String sq19 = "select * from Router where Nodename='N19'";
						ResultSet rs19=st19.executeQuery(sq19);
			
						if(rs19.next()==true)
						{
			
							cost19=Integer.parseInt(rs19.getString(2));
							bw19=Integer.parseInt(rs19.getString(3));
							mac19=rs19.getString(5);
							state19=rs19.getString(6);
							
							
							val19=Integer.toString(cost19);
						}
			
			
			
						Statement st20 = con.createStatement();
						String sq20 = "select * from Router where Nodename='N20'";
						ResultSet rs20=st20.executeQuery(sq20);
			
						if(rs20.next()==true)
						{
			
							cost20=Integer.parseInt(rs20.getString(2));
							bw20=Integer.parseInt(rs20.getString(3));
							mac20=rs20.getString(5);
							state20=rs20.getString(6);
							
							val20=Integer.toString(cost20);
			
							System.out.println("Cost1  "+cost20  +bw20    +mac20    +state20);
			
						}
						
						p1.setText(val1);
						p2.setText(val2);
						p3.setText(val3);
						p4.setText(val4);
						p5.setText(val5);
						p6.setText(val6);
						p7.setText(val7);
						p8.setText(val8);
						p9.setText(val9);
						p10.setText(val10);
						p11.setText(val11);
						p12.setText(val12);
						p13.setText(val13);
						p14.setText(val14);
						p15.setText(val15);
						p16.setText(val16);
						p17.setText(val17);
						p18.setText(val18);
						p19.setText(val19);
						p20.setText(val20);
		

			Statement stmt= con.createStatement();
			String sql= "select * from Router where Nodename IN('N1','N2') order by cost asc";
			ResultSet rs = stmt.executeQuery(sql);

			int count=0;

			while(rs.next()==true)             
			{

				count++;
				if(count==1)   //Main Count 1
				{
					String node=rs.getString(1);
					Thread.sleep(3000);
					ImageIcon i50=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Source
					con1.setIcon(i50);

					if(node.equals("N1"))
					{
						Thread.sleep(3000);
						ImageIcon i72=new ImageIcon(this.getClass().getResource("Greenline1.png"));  //line 1
						l1.setIcon(i72);
						
						Thread.sleep(3000);
						ImageIcon i51=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //node 1
						l3.setIcon(i51);
					
					
						if(state1.equals("ON"))
						{

							if(bw1>data && mac1.equals(mac))
							{
								Thread.sleep(3000);
								ImageIcon i73=new ImageIcon(this.getClass().getResource("Greenline3.png"));  //line 3
								l5.setIcon(i73);
								
								Thread.sleep(3000);
								ImageIcon i52=new ImageIcon(this.getClass().getResource("Greennodes.png"));  
								l7.setIcon(i52);

								if(state3.equals("ON"))
								{
									if(bw3>data && mac3.equals(mac))
									{
										if(cost6<cost5)
										{
											Thread.sleep(3000);
											ImageIcon i96=new ImageIcon(this.getClass().getResource("Greenline6.png"));  //Line 6
											l10.setIcon(i96);
											
											Thread.sleep(3000);
											ImageIcon i53=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 6
											l11.setIcon(i53);
											
											if(state6.equals("ON"))
											{
												if(bw6>data && mac6.equals(mac))
												{
													if(cost7<cost8)
													{
														Thread.sleep(3000);
														ImageIcon i75=new ImageIcon(this.getClass().getResource("Greenline8.png"));  //Line 8
														l14.setIcon(i75);
														
														Thread.sleep(3000);
														ImageIcon i54=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 7
														l16.setIcon(i54);
														
														send(mac,data,destination);
													}

													if(cost8<cost7)
													{
														
														Thread.sleep(3000);
														ImageIcon i76=new ImageIcon(this.getClass().getResource("Greenline9.png"));  //Line 9
														l15.setIcon(i76);
														
														Thread.sleep(3000);
														ImageIcon i55=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 8
														l17.setIcon(i55);

														if(state8.equals("ON"))
														{
															if(bw8>data && mac8.equals(mac))
															{
																if(mac9.equals(mac))
																{
																	
																	
																	Thread.sleep(3000);
																	ImageIcon i77=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 10
																	l18.setIcon(i77);
																	
																	Thread.sleep(3000);
																	ImageIcon i56=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 9
																	l19.setIcon(i56);
																	
																	
																	if(mac10.equals(mac))
																	{
																		Thread.sleep(3000);
																		ImageIcon i78=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 11
																		l20.setIcon(i78);
																		
																		Thread.sleep(3000);
																		ImageIcon i57=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 10
																		l21.setIcon(i57);
																		
																		if(cost11<cost12)     //From Node 11
																		{
																			Thread.sleep(3000);
																			ImageIcon i79=new ImageIcon(this.getClass().getResource("Greenline13.png"));  //Line 13
																			l22.setIcon(i79);
																			
																			
																			Thread.sleep(3000);
																			ImageIcon i58=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 11
																			l25.setIcon(i58);
																			
																				if(bw11>data && mac11.equals(mac) && state11.equals("ON"))
																				{
																					if(cost13<cost14)
																					{
																						Thread.sleep(3000);
																						ImageIcon i80=new ImageIcon(this.getClass().getResource("Greenline13.png"));  //Line 14 same as 13
																						l26.setIcon(i80);
																						
																						Thread.sleep(3000);
																						ImageIcon i59=new ImageIcon(this.getClass().getResource("Greennodes.png")); // Node 13
																						l48.setIcon(i59);

																						if(state13.equals("ON"))
																						{

																							if(bw13>data && mac13.equals(mac))
																							{
																								Thread.sleep(3000);
																								ImageIcon i81=new ImageIcon(this.getClass().getResource("Greenline15.png"));  //Line 15
																								l55.setIcon(i81);
																								
																								Thread.sleep(3000);
																								ImageIcon i60=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																								l28.setIcon(i60);

																								if(state14.equals("ON"))
																								{
																									if(bw14>data && mac14.equals(mac))
																									{
																										if(cost15<cost16)
																										{	
																											
																											Thread.sleep(3000);
																											ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																											l29.setIcon(i82);


																											Thread.sleep(3000);
																											ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																											l30.setIcon(i62);
																				
																											
																											Thread.sleep(3000);
																											ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																											l34.setIcon(i83);
																											
																											Thread.sleep(3000);
																											ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																											l31.setIcon(i63);
																											
																											if(state16.equals("ON"))
																											{
																												if(bw16>data && mac16.equals(mac))
																												{
																													if(cost18<cost17)
																													{
																														//Data towards Node 18
																														Thread.sleep(3000);
																														ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																														l35.setIcon(i84);
																														
																														Thread.sleep(3000);
																														ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																														l37.setIcon(i64);

																														if(state18.equals("ON"))
																														{

																															if(bw18>data && mac18.equals(mac))
																															{

																																if(cost19<cost20)
																																{
																																	Thread.sleep(3000);
																																	ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																	l39.setIcon(i86);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																	l40.setIcon(i65);
																																	
																																	
																																		if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																		{
																																			//data at node 19
																																			Thread.sleep(3000);
																																			ImageIcon i87=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																			l43.setIcon(i87);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																			l42.setIcon(i66);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																			l44.setIcon(i85);
																																			
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																			l45.setIcon(i67);

																																			


																																		}else  //else of nofe 19
																																		{
																																			if(bw19<data || !mac19.equals(mac) || state19.equals("OFF") )
																																			{
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																			}

																																		}

																																}

																																if(cost20<cost19)
																																{
																															
																																	Thread.sleep(3000);
																																	ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																	l41.setIcon(i92);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																	l44.setIcon(i85);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																	
																																}

																															}

																														}
																													}

																													if(cost17<cost18)
																													{
																														Thread.sleep(3000);
																														ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																														l36.setIcon(i88);
																														
																														Thread.sleep(3000);
//																														
																														ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																														l38.setIcon(i68);
																														

																														
																															if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																															{

																																if(state18.equals("ON"))
																																{
																																	//Data towards Node 18
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																	l56.setIcon(i89);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																				

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON") )
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);
																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																						}

																											
																																					}

																																				
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																			}

																																		}

																																	}
																																}

																															}else
																															{
																																if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																{
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																				

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																						


																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																						}

																																						
																																					}
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				
																																			}

																																		}

																																	}
																																

																																	
																																}
																																
																															}

																													}

																												}

																											}

																										

																										}

																										if(cost16<cost15)
																										{
																											//data towards Node 16
																											Thread.sleep(3000);
																											ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																											l32.setIcon(i94);
																											
																											
																											Thread.sleep(3000);
																											ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																											l31.setIcon(i63);
																											
																											if(state16.equals("ON"))
																											{
																												if(bw16>data && mac16.equals(mac))
																												{
																													//data at node 16

																													if(cost18<cost17)
																													{
																														//Data towards Node 18
																														
																														Thread.sleep(3000);
																														ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																														l35.setIcon(i84);
																														
																														Thread.sleep(3000);
																														ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																														l37.setIcon(i64);

																														if(state18.equals("ON"))
																														{

																															if(bw18>data && mac18.equals(mac))
																															{

																																//data at node 18

																																if(cost19<cost20)
																																{
																																	//data towards 19
																																	Thread.sleep(3000);
																																	ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																	l39.setIcon(i86);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																	l40.setIcon(i65);
																																	
																																	

																																		if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																		{
																																			//data at node 19
																																			
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																			l42.setIcon(i66);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																			l45.setIcon(i67);

																																			


																																		}else  //else of nofe 19
																																		{
																																			if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																			{
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																			}

																																			
																																		}

																																	
																																}

																																if(cost20<cost19)
																																{
																																	//data towards 20
																																	Thread.sleep(3000);
																																	ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																	l41.setIcon(i92);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																	l44.setIcon(i85);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);
																																}

																															}

																														}
																													}

																													if(cost17<cost18)
																													{
																														//Data towards Node 17
																														Thread.sleep(3000);
																														ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																														l36.setIcon(i88);
																														
																														Thread.sleep(3000);
																														ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																														l38.setIcon(i68);

																														
																															if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																															{

																																//Data at node 17

																																if(state18.equals("ON"))
																																{
																																	//Starts from Node 18
																													
																																	//Data towards Node 18
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																	l56.setIcon(i89);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																				

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);


																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							

																																						}

																																						
																																					}

																																			
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				
																																			}

																																		}

																																	}
																																

																																	
																																
																																
																																	
																																}

																															}else
																															{
																																if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																{
																																	//Enter here Node 18 Code
																																	

																																	//Data towards Node 18
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																				
																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																						


																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							
																																							
																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}

																																						}

																																						
																																					}

																																				
																																				

																																				
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																			}

																																		}

																																	}
																																

																																	
																																}
																																
																															}

																													
																														


																														

																													}

																												}

																											}

																										}


																									
																										
																										
																									}else
																									{
																										if(bw14<data)
																										{
																											//Enter Here node 12 code 
																		
																											Thread.sleep(3000);
																											ImageIcon i61=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 12
																											l24.setIcon(i61);
																											
																											if(state12.equals("ON"))
																											{
																												if(bw12>data && mac12.equals(mac))
																												{
																													//data at Node 12

																													if(cost14<cost16)
																													{
																														Thread.sleep(3000);
																														ImageIcon i93=new ImageIcon(this.getClass().getResource("Greenline12.png"));  //Line 16 same as 12
																														l27.setIcon(i93);
																														
																														
																														Thread.sleep(3000);
																														ImageIcon i69=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																														l28.setIcon(i69);

																														
																															if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																															{
																																//data at node 14
																																if(cost15<cost16)
																																{
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																																	l29.setIcon(i82);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																																	l30.setIcon(i62);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																																	l34.setIcon(i83);
																																	
																						
																																	//data towards Node 16
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																								


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);
																																				

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17

																																						if(state18.equals("ON"))
																																						{
																																							//Starts from Node 18
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);

																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																											


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													

																																												}

																																												
																																											}

																																										
																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													

																																												}

																																									
																																											}

																																									
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				
																																				


																																				

																																			}

																																		}

																																	}

																																

																																}

																																if(cost16<cost15)
																																{
																																	//data towards Node 16
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																																	l32.setIcon(i94);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("ON"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										

																																									}

																																									
																																								}

																																						
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);
																																				

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17

																																						if(state18.equals("ON"))
																																						{
																																							//Starts from Node 18
																																							
																																							
																																							
																																							

																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																											


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													

																																												}

																																												
																																											}

																																									
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										
																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				
																																				


																																				

																																			}

																																		}

																																	}

																																}


																															}
																															else  //else of node 14 State
																															{
																																if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																																{
																																	//enter here Node 16 code
																																	
																																System.out
																																		.println("Low BW");
																																	//data towards Node 16
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);
																																				

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17
																																						
																																						

																																						if(state18.equals("ON"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																											


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
					
																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													

																																												}

																																											
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										
																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				
																																				


																																				

																																			}

																																		}

																																	}

																																

																																}

																																
																															}

																													
																													}

																													if(cost16<cost14)
																													{
																														//Data towards Node 16
																														
																														Thread.sleep(3000);
																														ImageIcon i95=new ImageIcon(this.getClass().getResource("Greenline17.png"));  //Line 17
																														l33.setIcon(i95);
																														
																														Thread.sleep(3000);
																														ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																														l31.setIcon(i63);

																														if(state16.equals("ON"))
																														{
																															if(bw16>data && mac16.equals(mac))
																															{
																																//data at node 16
																																
																																

																																//data towards Node 16
																																
																																if(state16.equals("ON"))
																																{
																																	if(bw16>data && mac16.equals(mac))
																																	{
																																		//data at node 16

																																		if(cost18<cost17)
																																		{
																																			//Data towards Node 18
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																			l35.setIcon(i84);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																			l37.setIcon(i64);

																																			if(state18.equals("ON"))
																																			{

																																				if(bw18>data && mac18.equals(mac))
																																				{

																																					//data at node 18

																																					if(cost19<cost20)
																																					{
																																						//data towards 19
																																						Thread.sleep(3000);
																																						ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																						l39.setIcon(i86);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																						l40.setIcon(i65);
																																						
																																						

																																							if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																							{
																																								//data at node 19
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								


																																							}else  //else of nofe 19
																																							{
																																								if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																								{
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);
																																									

																																								}

																																								
																																							}

																																						
																																						

																																						
																																					}

																																					if(cost20<cost19)
																																					{
																																						//data towards 20
																																						Thread.sleep(3000);
																																						ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																						l41.setIcon(i92);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																						l44.setIcon(i85);
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																					}

																																				}

																																			}
																																		}

																																		if(cost17<cost18)
																																		{
																																			//Data towards Node 17
																																			Thread.sleep(3000);
																																			ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																			l36.setIcon(i88);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																			l38.setIcon(i68);

																																			
																																				if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																				{

																																					//Data at node 17
																																					
																																					

																																					if(state18.equals("ON"))
																																					{
																																						//Starts from Node 18
																																						

																																						//Enter here Node 18 Code
																																						

																																						//Data towards Node 18
																																						Thread.sleep(3000);
																																						ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																						l56.setIcon(i89);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																						l37.setIcon(i64);

																																						if(state18.equals("ON"))
																																						{

																																							if(bw18>data && mac18.equals(mac))
																																							{

																																								//data at node 18

																																								if(cost19<cost20)
																																								{
																																									//data towards 19
																																									Thread.sleep(3000);
																																									ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																									l39.setIcon(i86);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																									l40.setIcon(i65);
																																									
																																									

																																										if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																										{
																																											//data at node 19
																																											
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);

																																											


																																										}else  //else of nofe 19
																																										{
																																											if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																											{
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);
																																												

																																											}

																																											
																																										}

																																									
																																									

																																									
																																								}

																																								if(cost20<cost19)
																																								{
																																									//data towards 20
																																									Thread.sleep(3000);
																																									ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																									l41.setIcon(i92);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																									l44.setIcon(i85);
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																								}

																																							}

																																						}
																																					

																																						
																																					
																																					}

																																				}else
																																				{
																																					if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																					{
																																						//Enter here Node 18 Code
																																						

																																						//Data towards Node 18
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																						l37.setIcon(i64);

																																						if(state18.equals("ON"))
																																						{

																																							if(bw18>data && mac18.equals(mac))
																																							{

																																								//data at node 18

																																								if(cost19<cost20)
																																								{
																																									//data towards 19
																																									Thread.sleep(3000);
																																									ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																									l39.setIcon(i86);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																									l40.setIcon(i65);
																																									
																																									

																																										if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																										{
																																											//data at node 19
																																											
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);

																																											


																																										}else  //else of nofe 19
																																										{
																																											if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																											{
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);
																																												

																																											}

																																											
																																										}

																																									
																																									

																																									
																																								}

																																								if(cost20<cost19)
																																								{
																																									//data towards 20
																																									Thread.sleep(3000);
																																									ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																									l41.setIcon(i92);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																									l44.setIcon(i85);
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									
																																								}

																																							}

																																						}
																																					

																																						
																																					}
																																					
																																				}

																																			
																																			


																																			

																																		}

																																	}

																																}

																															
																																
																																

																															}
																														}
																													}
																												}
																												else  //else of node N12 State																			{
																												{
																													if(bw12<data)
																													{
																														
																														//Enter Here Node 11 Code

																													}
																													if(!mac12.equals(mac))
																													{

																														//Enter Here Node 11 Code
																													}
																												}

																											}
																										
																											
																										}
																										
																										if(!mac14.equals(mac))
																										{
																											//Enter Here node 12 code 
																											

																											//Enter Here node 12 code 
																		
																											Thread.sleep(3000);
																											ImageIcon i61=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 12
																											l24.setIcon(i61);
																											
																											if(state12.equals("ON"))
																											{
																												if(bw12>data && mac12.equals(mac))
																												{
																													//data at Node 12

																													if(cost14<cost16)
																													{
																														//Data towards Node 14
																														
																														Thread.sleep(3000);
																														ImageIcon i91=new ImageIcon(this.getClass().getResource("Greenline15.png"));  //Line 15
																														l55.setIcon(i91);
																														
																														
																														Thread.sleep(3000);
																														ImageIcon i69=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																														l28.setIcon(i69);

																														
																															if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																															{
																																//data at node 14
																																if(cost15<cost16)
																																{
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																																	l29.setIcon(i82);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																																	l30.setIcon(i62);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																																	l34.setIcon(i83);
																																	
																						
																																	//data towards Node 16
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									
																																									


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										
																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);
																																				

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17
																																						
																																						

																																						if(state18.equals("ON"))
																																						{
																																							//Starts from Node 18
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);

																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("ON"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				
																																				


																																				

																																			}

																																		}

																																	}

																																

																																}

																																if(cost16<cost15)
																																{
																																	//data towards Node 16
																																	Thread.sleep(3000);
																																	ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																																	l32.setIcon(i94);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))

																																									{

																																										//data send to detination//////
																																									}


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										
																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17

																																						if(state18.equals("ON"))
																																						{
																																							//Starts from Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("ON"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				
																																				


																																				

																																			}

																																		}

																																	}

																																}


																															}
																															else  //else of node 14 State
																															{
																																if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																																{
																																	//enter here Node 16 code
																																	
																																System.out
																																		.println("Low BW");
																																	//data towards Node 16
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																																	l31.setIcon(i63);
																																	
																																	if(state16.equals("ON"))
																																	{
																																		if(bw16>data && mac16.equals(mac))
																																		{
																																			//data at node 16

																																			if(cost18<cost17)
																																			{
																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																				l35.setIcon(i84);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))

																																									{

																																										//data send to detination//////
																																									}


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										
																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}
																																						}

																																					}

																																				}
																																			}

																																			if(cost17<cost18)
																																			{
																																				//Data towards Node 17
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																				l36.setIcon(i88);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																				l38.setIcon(i68);
																																				

																																				
																																					if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																					{

																																						//Data at node 17

																																						if(state18.equals("ON"))
																																						{
																																							//Starts from Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																							l56.setIcon(i89);
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						
																																						}

																																					}else
																																					{
																																						if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																						{
																																							//Enter here Node 18 Code
																																							

																																							//Data towards Node 18
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																							l37.setIcon(i64);

																																							if(state18.equals("ON"))
																																							{

																																								if(bw18>data && mac18.equals(mac))
																																								{

																																									//data at node 18

																																									if(cost19<cost20)
																																									{
																																										//data towards 19
																																										Thread.sleep(3000);
																																										ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																										l39.setIcon(i86);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																										l40.setIcon(i65);
																																										
																																										

																																											if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																											{
																																												//data at node 19
																																												
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);

																																												if(state20.equals("ON"))

																																												{

																																													//data send to detination//////
																																												}


																																											}else  //else of nofe 19
																																											{
																																												if(bw19<data || !mac19.equals(mac) || state19.equals("OFF") )
																																												{
																																													Thread.sleep(3000);
																																													ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																													l42.setIcon(i66);
																																													
																																													Thread.sleep(3000);
																																													ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																													l45.setIcon(i67);
																																													
																																													
																																													if(state20.equals("ON"))
																																													{
																																														//data send to detination////
																																													}

																																												}

																																												
																																											}

																																										
																																										

																																										
																																									}

																																									if(cost20<cost19)
																																									{
																																										//data towards 20
																																										Thread.sleep(3000);
																																										ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																										l41.setIcon(i92);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																										l44.setIcon(i85);
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}
																																									}

																																								}

																																							}
																																						

																																							
																																						}
																																						
																																					}

																																				

																																			}

																																		}

																																	}

																																

																																}

																																
																															}

																														
																													}

																													if(cost16<cost14)
																													{
																														//Data towards Node 16
																														
																														Thread.sleep(3000);
																														ImageIcon i95=new ImageIcon(this.getClass().getResource("Greenline17.png"));  //Line 17
																														l33.setIcon(i95);
																														
																														Thread.sleep(3000);
																														ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																														l31.setIcon(i63);

																														if(state16.equals("ON"))
																														{
																															if(bw16>data && mac16.equals(mac))
																															{
																																//data at node 16
																																
																																

																																//data towards Node 16
																																
																																if(state16.equals("ON"))
																																{
																																	if(bw16>data && mac16.equals(mac))
																																	{
																																		//data at node 16

																																		if(cost18<cost17)
																																		{
																																			//Data towards Node 18
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																			l35.setIcon(i84);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																			l37.setIcon(i64);

																																			if(state18.equals("ON"))
																																			{

																																				if(bw18>data && mac18.equals(mac))
																																				{

																																					//data at node 18

																																					if(cost19<cost20)
																																					{
																																						//data towards 19
																																						Thread.sleep(3000);
																																						ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																						l39.setIcon(i86);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																						l40.setIcon(i65);
																																						
																																						

																																							if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																							{
																																								//data at node 19
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))

																																								{

																																									//data send to detination//////
																																								}


																																							}else  //else of nofe 19
																																							{
																																								if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																								{
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);
																																									
																																									
																																									if(state20.equals("ON"))
																																									{
																																										//data send to detination////
																																									}

																																								}

																																								
																																							}

																																						
																																						

																																						
																																					}

																																					if(cost20<cost19)
																																					{
																																						//data towards 20
																																						Thread.sleep(3000);
																																						ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																						l41.setIcon(i92);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																						l44.setIcon(i85);
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																						if(state20.equals("ON"))
																																						{
																																							//data send to detination////
																																						}
																																					}

																																				}

																																			}
																																		}

																																		if(cost17<cost18)
																																		{
																																			//Data towards Node 17
																																			Thread.sleep(3000);
																																			ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																			l36.setIcon(i88);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																			l38.setIcon(i68);

																																			
																																				if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																				{

																																					//Data at node 17

																																					if(state18.equals("ON"))
																																					{
																																						//Starts from Node 18
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																						l56.setIcon(i89);
																																						//Data towards Node 18
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																						l37.setIcon(i64);

																																						if(state18.equals("ON"))
																																						{

																																							if(bw18>data && mac18.equals(mac))
																																							{

																																								//data at node 18

																																								if(cost19<cost20)
																																								{
																																									//data towards 19
																																									Thread.sleep(3000);
																																									ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																									l39.setIcon(i86);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																									l40.setIcon(i65);
																																									
																																									

																																										if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																										{
																																											//data at node 19
																																											
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);

																																											if(state20.equals("ON"))

																																											{

																																												//data send to detination//////
																																											}


																																										}else  //else of nofe 19
																																										{
																																											if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																											{
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);
																																												
																																												
																																												if(state20.equals("ON"))
																																												{
																																													//data send to detination////
																																												}

																																											}

																																											
																																										}

																																									
																																									

																																									
																																								}

																																								if(cost20<cost19)
																																								{
																																									//data towards 20
																																									Thread.sleep(3000);
																																									ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																									l41.setIcon(i92);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																									l44.setIcon(i85);
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))
																																									{
																																										//data send to detination////
																																									}
																																								}

																																							}

																																						}
																																					

																																						
																																					
																																					}

																																				}else
																																				{
																																					if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																					{
																																						//Enter here Node 18 Code
																																						

																																						//Data towards Node 18
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																						l37.setIcon(i64);

																																						if(state18.equals("ON"))
																																						{

																																							if(bw18>data && mac18.equals(mac))
																																							{

																																								//data at node 18

																																								if(cost19<cost20)
																																								{
																																									//data towards 19
																																									Thread.sleep(3000);
																																									ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																									l39.setIcon(i86);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																									l40.setIcon(i65);
																																									
																																								

																																										if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																										{
																																											//data at node 19
																																											
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);

																																											if(state20.equals("ON"))

																																											{

																																												//data send to detination//////
																																											}


																																										}else  //else of nofe 19
																																										{
																																											if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																											{
																																												Thread.sleep(3000);
																																												ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																												l42.setIcon(i66);
																																												
																																												Thread.sleep(3000);
																																												ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																												l45.setIcon(i67);
																																												
																																												
																																												if(state20.equals("ON"))
																																												{
																																													//data send to detination////
																																												}

																																											}

																																										
																																										}

																																									
																																									

																																									
																																								}

																																								if(cost20<cost19)
																																								{
																																									//data towards 20
																																									Thread.sleep(3000);
																																									ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																									l41.setIcon(i92);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																									l44.setIcon(i85);
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))
																																									{
																																										//data send to detination////
																																									}
																																								}

																																							}

																																						}
																																					

																																						
																																					}
																																					
																																				}

																																			
																																			


																																			

																																		}

																																	}

																																}

																															
																																
																																

																															}
																														}
																													}
																												}
																												else  //else of node N12 State																			{
																												{
																													if(bw12<data)
																													{
																														
																														//Enter Here Node 11 Code

																													}
																													if(!mac12.equals(mac))
																													{

																														//Enter Here Node 11 Code
																													}
																												}

																											}
																										
																											
																										
																										}
																									}
																								}
																							
																								
																								

																							}else
																							{
																								if(bw13<data)
																								{
																									
																									//Enter here  node 14 code
																									
																									

																								}

																								if(!mac13.equals(mac))
																								{
																									//Enter here  node 14 code
																									
																									

																								}
																							}

																						}else
																						{

																						}

																					}
																					if(cost14<cost13)
																					{
																						//Data towards Node 14
																						
																						Thread.sleep(3000);
																						ImageIcon i91=new ImageIcon(this.getClass().getResource("Greenline15.png"));  //Line 15
																						l55.setIcon(i91);
																						
																						Thread.sleep(3000);
																						ImageIcon i60=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																						l28.setIcon(i60);

																						
																							if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																							{
																								//data at Node 14
											
																								//data at node 14
																								if(cost15<cost16)
																								{
																									
																									Thread.sleep(3000);
																									ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																									l29.setIcon(i82);
																									
																									Thread.sleep(3000);
																									ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																									l30.setIcon(i62);
																									
																									
																									Thread.sleep(3000);
																									ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																									l34.setIcon(i83);
																									
														
																									//data towards Node 16
																									
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);
																									
																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16

																											if(cost18<cost17)
																											{
																												//Data towards Node 18
																												Thread.sleep(3000);
																												ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																												l35.setIcon(i84);
																												
																												Thread.sleep(3000);
																												ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																												l37.setIcon(i64);

																												if(state18.equals("ON"))
																												{

																													if(bw18>data && mac18.equals(mac))
																													{

																														//data at node 18

																														if(cost19<cost20)
																														{
																															//data towards 19
																															Thread.sleep(3000);
																															ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																															l39.setIcon(i86);
																															
																															Thread.sleep(3000);
																															ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																															l40.setIcon(i65);
																															
																															

																																if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																{
																																	//data at node 19
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																	if(state20.equals("ON"))

																																	{

																																		//data send to detination//////
																																	}


																																}else  //else of nofe 19
																																{
																																	if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																	{
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																		
																																		
																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}

																																	}

																																	
																																}

																															
																															

																															
																														}

																														if(cost20<cost19)
																														{
																															//data towards 20
																															Thread.sleep(3000);
																															ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																															l41.setIcon(i92);
																															
																															Thread.sleep(3000);
																															ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																															l42.setIcon(i66);
																															
																															Thread.sleep(3000);
																															ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																															l44.setIcon(i85);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																															l45.setIcon(i67);

																															if(state20.equals("ON"))
																															{
																																//data send to detination////
																															}
																														}

																													}

																												}
																											}

																											if(cost17<cost18)
																											{
																												//Data towards Node 17
																												Thread.sleep(3000);
																												ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																												l36.setIcon(i88);
																												
																												
																												Thread.sleep(3000);
																												ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																												l38.setIcon(i68);
																												

																												
																													if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																													{

																														//Data at node 17

																														if(state18.equals("ON"))
																														{
																															//Starts from Node 18
																															Thread.sleep(3000);
																															ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																															l56.setIcon(i89);
																															
																															Thread.sleep(3000);
																															ImageIcon i71=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																															l38.setIcon(i71);
																															

													
																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))

																																				{

																																					//data send to detination//////
																																				}


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}
																																	}

																																}

																															}
																														

																															
																														
																														}

																													}else
																													{
																														if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																														{
																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))

																																				{

																																					//data send to detination//////
																																				}


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}
																																	}

																																}

																															}
																														

																															
																														}
																														
																													}

																												
																												


																												

																											}

																										}

																									}

																								

																								}

																								if(cost16<cost15)
																								{
																									//data towards Node 16
																									Thread.sleep(3000);
																									ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																									l32.setIcon(i94);
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);
																									
																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16

																											if(cost18<cost17)
																											{
																												//Data towards Node 18
																												Thread.sleep(3000);
																												ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																												l35.setIcon(i84);
																												
																												Thread.sleep(3000);
																												ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																												l37.setIcon(i64);

																												if(state18.equals("ON"))
																												{

																													if(bw18>data && mac18.equals(mac))
																													{

																														//data at node 18

																														if(cost19<cost20)
																														{
																															//data towards 19
																															Thread.sleep(3000);
																															ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																															l39.setIcon(i86);
																															
																															Thread.sleep(3000);
																															ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																															l40.setIcon(i65);
																															
																															

																																if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																{
																																	//data at node 19
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																	if(state20.equals("ON"))

																																	{

																																		//data send to detination//////
																																	}


																																}else  //else of nofe 19
																																{
																																	if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																	{
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																		
																																		
																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}

																																	}

																																	
																																}

																															
																															

																															
																														}

																														if(cost20<cost19)
																														{
																															//data towards 20
																															Thread.sleep(3000);
																															ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																															l41.setIcon(i92);
																															
																															Thread.sleep(3000);
																															ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																															l42.setIcon(i66);
																															
																															Thread.sleep(3000);
																															ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																															l44.setIcon(i85);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																															l45.setIcon(i67);

																															if(state20.equals("ON"))
																															{
																																//data send to detination////
																															}
																														}

																													}

																												}
																											}

																											if(cost17<cost18)
																											{
																												//Data towards Node 17
																												
																												Thread.sleep(3000);
																												ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																												l36.setIcon(i88);
																												
																												Thread.sleep(3000);
																												ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																												l38.setIcon(i68);

																												
																													if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																													{

																														//Data at node 17

																														if(state18.equals("ON"))
																														{
																															//Starts from Node 18
																											
																															//Data towards Node 18
																															Thread.sleep(3000);
																															ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																															l56.setIcon(i89);
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))

																																				{

																																					//data send to detination//////
																																				}


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}

																																				}

																																				if(!mac19.equals(mac))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}
																																				}
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}
																																	}

																																}

																															}
																														

																															
																														
																														
																															
																														}

																													}else
																													{
																														if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																														{
																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))

																																				{

																																					//data send to detination//////
																																				}


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}
																																	}

																																}

																															}
																														

																															
																														}
																														
																													}

																											
																												


																												

																											}

																										}

																									}

																								}


																							
																								
																								
																							}else
																							{
																								if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																								{
																									//Enter Here node 12 code 
																
																									Thread.sleep(3000);
																									ImageIcon i61=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 12
																									l24.setIcon(i61);
																									
																									if(state12.equals("ON"))
																									{
																										if(bw12>data && mac12.equals(mac))
																										{
																											//data at Node 12

																											if(cost14<cost16)
																											{
																												//Data towards Node 14
																												
																												Thread.sleep(3000);
																												ImageIcon i93=new ImageIcon(this.getClass().getResource("Greenline12.png"));  //Line 16 same as 12
																												l27.setIcon(i93);
																												
																												Thread.sleep(3000);
																												ImageIcon i69=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																												l28.setIcon(i69);

																												if(state14.equals("ON"))
																												{
																													if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																													{
																														//data at node 14
																														if(cost15<cost16)
																														{
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																															l29.setIcon(i82);
																															
																															Thread.sleep(3000);
																															ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																															l30.setIcon(i62);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																															l34.setIcon(i83);
																															
																				
																															//data towards Node 16
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																															l31.setIcon(i63);
																															
																															if(state16.equals("ON"))
																															{
																																if(bw16>data && mac16.equals(mac))
																																{
																																	//data at node 16

																																	if(cost18<cost17)
																																	{
																																		//Data towards Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																		l35.setIcon(i84);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))

																																							{

																																								//data send to detination//////
																																							}


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}
																																				}

																																			}

																																		}
																																	}

																																	if(cost17<cost18)
																																	{
																																		//Data towards Node 17
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																		l36.setIcon(i88);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																		l38.setIcon(i68);
																																		

																																		
																																			if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																			{

																																				//Data at node 17

																																				if(state18.equals("ON"))
																																				{
																																					//Starts from Node 18
																																					Thread.sleep(3000);
																																					ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																					l56.setIcon(i89);
																																					
																																					

																																					//Enter here Node 18 Code
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				
																																				}

																																			}else
																																			{
																																				if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																				{
																																					//Enter here Node 18 Code
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				}
																																				
																																			}

																																	
																																		


																																		

																																	}

																																}

																															}

																														

																														}

																														if(cost16<cost15)
																														{
																															//data towards Node 16
																															Thread.sleep(3000);
																															ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																															l32.setIcon(i94);
																															
																															Thread.sleep(3000);
																															ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																															l31.setIcon(i63);
																															
																															if(state16.equals("ON"))
																															{
																																if(bw16>data && mac16.equals(mac))
																																{
																																	//data at node 16

																																	if(cost18<cost17)
																																	{
																																		//Data towards Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																		l35.setIcon(i84);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) || state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))

																																							{

																																								//data send to detination//////
																																							}


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}
																																				}

																																			}

																																		}
																																	}

																																	if(cost17<cost18)
																																	{
																																		//Data towards Node 17
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																		l36.setIcon(i88);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																		l38.setIcon(i68);
																																		

																																		
																																			if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																			{

																																				//Data at node 17

																																				if(state18.equals("ON"))
																																				{
																																					//Starts from Node 18
																																					Thread.sleep(3000);
																																					ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																					l56.setIcon(i89);
																																					
																																					
																																					

																																					//Enter here Node 18 Code
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				
																																				}

																																			}else
																																			{
																																				if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																				{
																																					//Enter here Node 18 Code
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				}
																																				
																																			}

																																		
																																		


																																		

																																	}

																																}

																															}

																														}


																													}
																													else  //else of node 14 State
																													{
																														if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																														{
																															//enter here Node 16 code
																															
																														System.out
																																.println("Low BW");
																															//data towards Node 16
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																															l31.setIcon(i63);
																															
																															if(state16.equals("ON"))
																															{
																																if(bw16>data && mac16.equals(mac))
																																{
																																	//data at node 16

																																	if(cost18<cost17)
																																	{
																																		//Data towards Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																		l35.setIcon(i84);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))

																																							{

																																								//data send to detination//////
																																							}


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}
																																				}

																																			}

																																		}
																																	}

																																	if(cost17<cost18)
																																	{
																																		//Data towards Node 17
																																		Thread.sleep(3000);
																																		ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																		l36.setIcon(i88);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																		l38.setIcon(i68);
																																		

																																		
																																			if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																			{

																																				//Data at node 17
																																				
																																				

																																				if(state18.equals("ON"))
																																				{
																																					//Starts from Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																					l56.setIcon(i89);
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("ON"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				
																																				}

																																			}else
																																			{
																																				if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																				{
																																					//Enter here Node 18 Code
																																					

																																					//Data towards Node 18
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																					l37.setIcon(i64);

																																					if(state18.equals("ON"))
																																					{

																																						if(bw18>data && mac18.equals(mac))
																																						{

																																							//data at node 18

																																							if(cost19<cost20)
																																							{
																																								//data towards 19
																																								Thread.sleep(3000);
																																								ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																								l39.setIcon(i86);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																								l40.setIcon(i65);
																																								
																																								

																																									if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																									{
																																										//data at node 19
																																										
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);

																																										if(state20.equals("ON"))

																																										{

																																											//data send to detination//////
																																										}


																																									}else  //else of nofe 19
																																									{
																																										if(bw19<data || !mac19.equals(mac) || state19.equals("ON"))
																																										{
																																											Thread.sleep(3000);
																																											ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																											l42.setIcon(i66);
																																											
																																											Thread.sleep(3000);
																																											ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																											l45.setIcon(i67);
																																											
																																											
																																											if(state20.equals("ON"))
																																											{
																																												//data send to detination////
																																											}

																																										}

																																										
																																									}

																																								
																																								

																																								
																																							}

																																							if(cost20<cost19)
																																							{
																																								//data towards 20
																																								Thread.sleep(3000);
																																								ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																								l41.setIcon(i92);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																								l44.setIcon(i85);
																																								
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);

																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}
																																							}

																																						}

																																					}
																																				

																																					
																																				}
																																				
																																			}

																																
																																		


																																		

																																	}

																																}

																															}

																														

																														}

																														if(!mac14.equals(mac))
																														{

																														}
																													}

																												}
																											}

																											if(cost16<cost14)
																											{
																												//Data towards Node 16
																												
																												Thread.sleep(3000);
																												ImageIcon i95=new ImageIcon(this.getClass().getResource("Greenline17.png"));  //Line 17
																												l33.setIcon(i95);
																												
																												Thread.sleep(3000);
																												ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																												l31.setIcon(i63);

																												if(state16.equals("ON"))
																												{
																													if(bw16>data && mac16.equals(mac))
																													{
																														//data at node 16
																														
																														

																														//data towards Node 16
																														
																														if(state16.equals("ON"))
																														{
																															if(bw16>data && mac16.equals(mac))
																															{
																																//data at node 16

																																if(cost18<cost17)
																																{
																																	//Data towards Node 18
																																	Thread.sleep(3000);
																																	ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																																	l35.setIcon(i84);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																			

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																						if(state20.equals("ON"))

																																						{

																																							//data send to detination//////
																																						}


																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							
																																							
																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}

																																						}

																																						
																																					}

																																				
																																				

																																				
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))
																																				{
																																					//data send to detination////
																																				}
																																			}

																																		}

																																	}
																																}

																																if(cost17<cost18)
																																{
																																	//Data towards Node 17
																																	Thread.sleep(3000);
																																	ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																																	l36.setIcon(i88);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																																	l38.setIcon(i68);

																																	
																																		if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																		{

																																			//Data at node 17
																																			
																																			

																																			if(state18.equals("ON"))
																																			{
																																				//Starts from Node 18
																																				Thread.sleep(3000);
																																				ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																				l56.setIcon(i89);

																																				//Enter here Node 18 Code
																																				

																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))

																																									{

																																										//data send to detination//////
																																									}


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										
																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}

																																									}

																																									
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}
																																						}

																																					}

																																				}
																																			

																																				
																																			
																																			}

																																		}else
																																		{
																																			if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																			{
																																				//Enter here Node 18 Code
																																				

																																				//Data towards Node 18
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																				l37.setIcon(i64);

																																				if(state18.equals("ON"))
																																				{

																																					if(bw18>data && mac18.equals(mac))
																																					{

																																						//data at node 18

																																						if(cost19<cost20)
																																						{
																																							//data towards 19
																																							Thread.sleep(3000);
																																							ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																							l39.setIcon(i86);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																							l40.setIcon(i65);
																																							
																																							

																																								if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																								{
																																									//data at node 19
																																									
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																									l42.setIcon(i66);
																																									
																																									Thread.sleep(3000);
																																									ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																									l45.setIcon(i67);

																																									if(state20.equals("ON"))

																																									{

																																										//data send to detination//////
																																									}


																																								}else  //else of nofe 19
																																								{
																																									if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																									{
																																										Thread.sleep(3000);
																																										ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																										l42.setIcon(i66);
																																										
																																										Thread.sleep(3000);
																																										ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																										l45.setIcon(i67);
																																										
																																										
																																										if(state20.equals("ON"))
																																										{
																																											//data send to detination////
																																										}

																																									}

																																								
																																								}

																																							
																																							

																																							
																																						}

																																						if(cost20<cost19)
																																						{
																																							//data towards 20
																																							Thread.sleep(3000);
																																							ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																							l41.setIcon(i92);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																							l44.setIcon(i85);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))
																																							{
																																								//data send to detination////
																																							}
																																						}

																																					}

																																				}
																																			

																																				
																																			}
																																			
																																		}

																															
																																	


																																	

																																}

																															}

																														}

																													
																														
																														

																													}
																												}
																											}
																										}
																										else  //else of node N12 State																			{
																										{
																											if(bw12<data)
																											{
																												
																												//Enter Here Node 11 Code

																											}
																											if(!mac12.equals(mac))
																											{

																												//Enter Here Node 11 Code
																											}
																										}

																									}
																								
																									
																								}
																								
																								
																							}
																						
																					}

																				}
																				else  //else of node N11
																				{
																					if(bw11<data || !mac11.equals(mac) || state11.equals("OFF"))
																					{
												
																						Thread.sleep(3000);
																						ImageIcon i61=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 12
																						l24.setIcon(i61);
																						
																						if(state12.equals("ON"))
																						{
																							if(bw12>data && mac12.equals(mac))
																							{
																								//data at Node 12

																								if(cost14<cost16)
																								{
																									//Data towards Node 14
																									
																									Thread.sleep(3000);
																									ImageIcon i93=new ImageIcon(this.getClass().getResource("Greenline12.png"));  //Line 16 same as 12
																									l27.setIcon(i93);
																									
																									Thread.sleep(3000);
																									ImageIcon i60=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																									l28.setIcon(i60);

																									
																										if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																										{
																											//data at node 14
																											if(cost15<cost16)
																											{
																												
																												
																												Thread.sleep(3000);
																												ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																												l29.setIcon(i82);
																												
																												Thread.sleep(3000);
																												ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																												l30.setIcon(i62);
																												
																												
																												Thread.sleep(3000);
																												ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																												l34.setIcon(i83);
																												
																	
																												//data towards Node 16
																												
																												
																												Thread.sleep(3000);
																												ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																												l31.setIcon(i63);
																												
																												if(state16.equals("ON"))
																												{
																													if(bw16>data && mac16.equals(mac))
																													{
																														//data at node 16

																														if(cost18<cost17)
																														{
																															//Data towards Node 18
																															Thread.sleep(3000);
																															ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																															l35.setIcon(i84);
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				if(state20.equals("ON"))

																																				{

																																					//data send to detination//////
																																				}


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		if(state20.equals("ON"))
																																		{
																																			//data send to detination////
																																		}
																																	}

																																}

																															}
																														}

																														if(cost17<cost18)
																														{
																															//Data towards Node 17
																															Thread.sleep(3000);
																															ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																															l36.setIcon(i88);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																															l38.setIcon(i68);
																															

																															
																																if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																{

																																	//Data at node 17

																																	if(state18.equals("ON"))
																																	{
																																		//Starts from Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																		l56.setIcon(i89);

																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							if(state20.equals("ON"))

																																							{

																																								//data send to detination//////
																																							}


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					if(state20.equals("ON"))
																																					{
																																						//data send to detination////
																																					}
																																				}

																																			}

																																		}
																																	

																																		
																																	
																																	}

																																}else
																																{
																																	if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																	{
																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							

																														
																																							


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								

																																							}

																																					
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																					
																																				}

																																			}

																																		}
																																	

																																		
																																	}
																																	
																																}

																														
																															


																															

																														}

																													}

																												}

																											

																											}

																											if(cost16<cost15)
																											{
																												//data towards Node 16
																												Thread.sleep(3000);
																												ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																												l32.setIcon(i94);
																												
																												Thread.sleep(3000);
																												ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																												l31.setIcon(i63);
																												
																												if(state16.equals("ON"))
																												{
																													if(bw16>data && mac16.equals(mac))
																													{
																														//data at node 16

																														if(cost18<cost17)
																														{
																															//Data towards Node 18
																															Thread.sleep(3000);
																															ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																															l35.setIcon(i84);
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																				}

																																			
																																			}

																																	
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																	}

																																}

																															}
																														}

																														if(cost17<cost18)
																														{
																															//Data towards Node 17
																															Thread.sleep(3000);
																															ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																															l36.setIcon(i88);
																															
																														
																															Thread.sleep(3000);
																															ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																															l38.setIcon(i68);

																															
																																if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																{

																																	//Data at node 17

																																	if(state18.equals("ON"))
																																	{
																																		//Starts from Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																		l56.setIcon(i89);

																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18hg
																																				

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																							

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																				}

																																			}

																																		}
																																	

																																		
																																	
																																	}

																																}else
																																{
																																	if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																	{
																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																				
																																					
																																					
																																					
																																				}

																																			}

																																		}
																																	

																																		
																																	}
																																	
																																}

																														
																															


																															

																														}

																													}

																												}

																											}


																										}
																										else  //else of node 14 State
																										{
																											if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																											{
																												//enter here Node 16 code
																												
																											System.out
																													.println("Low BW");
																												//data towards Node 16
																												
																												
																												Thread.sleep(3000);
																												ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																												l31.setIcon(i63);
																												
																												if(state16.equals("ON"))
																												{
																													if(bw16>data && mac16.equals(mac))
																													{
																														//data at node 16

																														if(cost18<cost17)
																														{
																															//Data towards Node 18
																															Thread.sleep(3000);
																															ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																															l35.setIcon(i84);
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																	}

																																}

																															}
																														}

																														if(cost17<cost18)
																														{
																															//Data towards Node 17
																															Thread.sleep(3000);
																															ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																															l36.setIcon(i88);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																															l38.setIcon(i68);
																															

																															
																																if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																																{

																																	//Data at node 17

																																	if(state18.equals("ON"))
																																	{
																																		//Starts from Node 18
																																		Thread.sleep(3000);
																																		ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																		l56.setIcon(i89);

																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																						

																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																								
																																								if(state20.equals("ON"))
																																								{
																																									//data send to detination////
																																								}

																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																				}

																																			}

																																		}
																																	

																																		
																																	
																																	}

																																}else
																																{
																																	if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																	{
																																		//Enter here Node 18 Code
																																		

																																		//Data towards Node 18
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																		l37.setIcon(i64);

																																		if(state18.equals("ON"))
																																		{

																																			if(bw18>data && mac18.equals(mac))
																																			{

																																				//data at node 18

																																				if(cost19<cost20)
																																				{
																																					//data towards 19
																																					Thread.sleep(3000);
																																					ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																					l39.setIcon(i86);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																					l40.setIcon(i65);
																																					
																																					

																																						if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																						{
																																							//data at node 19
																																							
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);

																																							


																																						}else  //else of nofe 19
																																						{
																																							if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																							{
																																								Thread.sleep(3000);
																																								ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																								l42.setIcon(i66);
																																								
																																								Thread.sleep(3000);
																																								ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																								l45.setIcon(i67);
																																								
																																							}

																																							
																																						}

																																					
																																					

																																					
																																				}

																																				if(cost20<cost19)
																																				{
																																					//data towards 20
																																					Thread.sleep(3000);
																																					ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																					l41.setIcon(i92);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																					l44.setIcon(i85);
																																					
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);

																																				
																																					
																																						
																																					
																																				}

																																			}

																																		}
																																	

																																		
																																	}
																																	
																																}

																														
																															


																															

																														}

																													}

																												}

																											

																											}

																											
																										}

																								
																								}

																								if(cost16<cost14)
																								{
																									//Data towards Node 16
																									
																									Thread.sleep(3000);
																									ImageIcon i95=new ImageIcon(this.getClass().getResource("Greenline17.png"));  //Line 17
																									l33.setIcon(i95);
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);

																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16
																											
																											

																											//data towards Node 16
																											
																											if(state16.equals("ON"))
																											{
																												if(bw16>data && mac16.equals(mac))
																												{
																													//data at node 16

																													if(cost18<cost17)
																													{
																														//Data towards Node 18
																														
																														Thread.sleep(3000);
																														ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																														l35.setIcon(i84);
																														
																														Thread.sleep(3000);
																														ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																														l37.setIcon(i64);

																														if(state18.equals("ON"))
																														{

																															if(bw18>data && mac18.equals(mac))
																															{

																																//data at node 18

																																if(cost19<cost20)
																																{
																																	//data towards 19
																																	Thread.sleep(3000);
																																	ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																	l39.setIcon(i86);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																	l40.setIcon(i65);
																																	
																																	

																																		if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																		{
																																			//data at node 19
																																			
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																			l42.setIcon(i66);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																			l45.setIcon(i67);
																																		}else  //else of nofe 19
																																		{
																																			if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																			{
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																				
																																			}

																																			
																																		}

																																	
																																	

																																	
																																}

																																if(cost20<cost19)
																																{
																																	//data towards 20
																																	Thread.sleep(3000);
																																	ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																	l41.setIcon(i92);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																	l44.setIcon(i85);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																	
																																}

																															}

																														}
																													}

																													if(cost17<cost18)
																													{
																														//Data towards Node 17
																														Thread.sleep(3000);
																														ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																														l36.setIcon(i88);
																														
																														Thread.sleep(3000);
																														ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																														l38.setIcon(i68);

																														
																															if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																															{

																																//Data at node 17

																																if(state18.equals("ON"))
																																{
																																	//Starts from Node 18
																																	Thread.sleep(3000);
																																	ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																																	l56.setIcon(i89);
																																	
																																	

																																	//Enter here Node 18 Code
																																	

																																	//Data towards Node 18
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																				

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																					


																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							

																																						}

																																					
																																					}

																																				
																																				

																																				
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																					
																																				
																																			}

																																		}

																																	}
																																

																																	
																																
																																}

																															}else
																															{
																																if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																																{
																																	//Enter here Node 18 Code
																																	

																																	//Data towards Node 18
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																																	l37.setIcon(i64);

																																	if(state18.equals("ON"))
																																	{

																																		if(bw18>data && mac18.equals(mac))
																																		{

																																			//data at node 18

																																			if(cost19<cost20)
																																			{
																																				//data towards 19
																																				Thread.sleep(3000);
																																				ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																				l39.setIcon(i86);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																				l40.setIcon(i65);
																																				
																																			

																																					if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																					{
																																						//data at node 19
																																						
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																						l42.setIcon(i66);
																																						
																																						Thread.sleep(3000);
																																						ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																						l45.setIcon(i67);

																																					

																																					}else  //else of nofe 19
																																					{
																																						if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																						{
																																							Thread.sleep(3000);
																																							ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																							l42.setIcon(i66);
																																							
																																							Thread.sleep(3000);
																																							ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																							l45.setIcon(i67);
																																							

																																						}

																																					
																																					}

																																				
																																				

																																				
																																			}

																																			if(cost20<cost19)
																																			{
																																				//data towards 20
																																				Thread.sleep(3000);
																																				ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																				l41.setIcon(i92);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																				l44.setIcon(i85);
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																				
																																			}

																																		}

																																	}
																																

																																	
																																}
																															
																															}

																													
																														


																														

																													}

																												}

																											}

																										
																											
																											

																										}
																									}
																								}
																							}
																							else  //else of node N12 State																			{
																							{
																								if(bw12<data)
																								{
																									
																									//Enter Here Node 11 Code

																								}
																								if(!mac12.equals(mac))
																								{

																									//Enter Here Node 11 Code
																								}
																							}

																						}
																					
																					}
																					
																					

																				}
																	
																		}
																		

																		if(cost12<cost11)     //from Node 12
																		{
																			Thread.sleep(3000);
																			ImageIcon i90=new ImageIcon(this.getClass().getResource("Greenline12.png"));  //Line 12
																			l23.setIcon(i90);
																			
																			Thread.sleep(3000);
																			ImageIcon i61=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 12
																			l24.setIcon(i61);
																			
																			if(state12.equals("ON"))
																			{
																				if(bw12>data && mac12.equals(mac))
																				{
																					//data at Node 12

																					if(cost14<cost16)
																					{
																						//Data towards Node 14
																						Thread.sleep(3000);
																						ImageIcon i93=new ImageIcon(this.getClass().getResource("Greenline12.png"));  //Line 16 same as 12
																						l27.setIcon(i93);
																						
																						Thread.sleep(3000);
																						ImageIcon i60=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 14
																						l28.setIcon(i60);

																						
																							if(bw14>data && mac14.equals(mac) && state14.equals("ON"))
																							{
																								//data at node 14
																								if(cost15<cost16)
																								{
																									
																									Thread.sleep(3000);
																									ImageIcon i82=new ImageIcon(this.getClass().getResource("Greenline10.png"));  //Line 18 same as 10
																									l29.setIcon(i82);
																									
																									Thread.sleep(3000);
																									ImageIcon i62=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 15
																									l30.setIcon(i62);
																									
																									
																									Thread.sleep(3000);
																									ImageIcon i83=new ImageIcon(this.getClass().getResource("Greenline20.png"));  //Line 20
																									l34.setIcon(i83);
																									
														
																									//data towards Node 16
																									
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);
																									
																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16

																											if(cost18<cost17)
																											{
																												//Data towards Node 18
																												Thread.sleep(3000);
																												ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																												l35.setIcon(i84);
																												
																												Thread.sleep(3000);
																												ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																												l37.setIcon(i64);

																												if(state18.equals("ON"))
																												{

																													if(bw18>data && mac18.equals(mac))
																													{

																														//data at node 18

																														if(cost19<cost20)
																														{
																															//data towards 19
																															Thread.sleep(3000);
																															ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																															l39.setIcon(i86);
																															
																															Thread.sleep(3000);
																															ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																															l40.setIcon(i65);
																															
																															

																																if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																{
																																	//data at node 19
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																


																																}else  //else of nofe 19
																																{
																																	if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																	{
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																		

																																	}

																																	
																																}

																															
																															

																															
																														}

																														if(cost20<cost19)
																														{
																															//data towards 20
																															Thread.sleep(3000);
																															ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																															l41.setIcon(i92);
																															
																															Thread.sleep(3000);
																															ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																															l42.setIcon(i66);
																															
																															Thread.sleep(3000);
																															ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																															l44.setIcon(i85);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																															l45.setIcon(i67);

																														
																														}

																													}

																												}
																											}

																											if(cost17<cost18)
																											{
																												//Data towards Node 17
																												Thread.sleep(3000);
																												ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																												l36.setIcon(i88);
																												
																												Thread.sleep(3000);
																												ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																												l38.setIcon(i68);
																												

																												
																													if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																													{

																														//Data at node 17

																														if(state18.equals("ON"))
																														{
																															//Starts from Node 18
																															Thread.sleep(3000);
																															ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																															l56.setIcon(i89);

																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																			


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																	}

																																}

																															}
																														

																															
																														
																														}

																													}else
																													{
																														if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																														{
																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																		
																																	}

																																}

																															}
																														

																															
																														}
																														
																													}
																											}

																										}

																									}

																								

																								}

																								if(cost16<cost15)
																								{
																									//data towards Node 16
																									Thread.sleep(3000);
																									ImageIcon i94=new ImageIcon(this.getClass().getResource("Greenline19.png"));  //Line 19
																									l32.setIcon(i94);
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);
																									
																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16

																											if(cost18<cost17)
																											{
																												//Data towards Node 18
																												Thread.sleep(3000);
																												ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																												l35.setIcon(i84);
																												
																												Thread.sleep(3000);
																												ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																												l37.setIcon(i64);

																												if(state18.equals("ON"))
																												{

																													if(bw18>data && mac18.equals(mac))
																													{

																														//data at node 18

																														if(cost19<cost20)
																														{
																															//data towards 19
																															Thread.sleep(3000);
																															ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																															l39.setIcon(i86);
																															
																															Thread.sleep(3000);
																															ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																															l40.setIcon(i65);
																															
																															

																																if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																{
																																	//data at node 19
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																


																																}else  //else of nofe 19
																																{
																																	if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																	{
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																		
																																		

																																	}

																																
																																}

																														
																															

																															
																														}

																														if(cost20<cost19)
																														{
																															//data towards 20
																															Thread.sleep(3000);
																															ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																															l41.setIcon(i92);
																															
																															Thread.sleep(3000);
																															ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																															l42.setIcon(i66);
																															
																															Thread.sleep(3000);
																															ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																															l44.setIcon(i85);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																															l45.setIcon(i67);

																														
																															
																																
																															
																														}

																													}

																												}
																											}

																											if(cost17<cost18)
																											{
																												//Data towards Node 17
																												
																												Thread.sleep(3000);
																												ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																												l36.setIcon(i88);
																												
																												Thread.sleep(3000);
																												ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																												l38.setIcon(i68);
																												

																												
																													if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																													{

																														//Data at node 17

																														if(state18.equals("ON"))
																														{
																															Thread.sleep(3000);
																														ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																														l56.setIcon(i89);
																					
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																		

																																				

																																				
																																				


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																		
																																					
																																			
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																	
																																		
																																			
																																		
																																	}

																																}

																															}
																														

																															
																														
																														}

																													}else
																													{
																														if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																														{
																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																			

																																				

																																			
																																				


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																			
																																					
																																						
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																	
																																		
																																			
																																		
																																	}

																																}

																															}
																														

																															
																														}
																														
																													}	

																											}

																										}

																									}

																								}


																							}
																							else  //else of node 14 State
																							{
																								if(bw14<data || !mac14.equals(mac) || state14.equals("OFF"))
																								{
																									//enter here Node 16 code
																									
																								System.out
																										.println("Low BW");
																									//data towards Node 16
																									
																									
																									Thread.sleep(3000);
																									ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																									l31.setIcon(i63);
																									
																									if(state16.equals("ON"))
																									{
																										if(bw16>data && mac16.equals(mac))
																										{
																											//data at node 16

																											if(cost18<cost17)
																											{
																												//Data towards Node 18
																												Thread.sleep(3000);
																												ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																												l35.setIcon(i84);
																												
																												Thread.sleep(3000);
																												ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																												l37.setIcon(i64);

																												if(state18.equals("ON"))
																												{

																													if(bw18>data && mac18.equals(mac))
																													{

																														//data at node 18

																														if(cost19<cost20)
																														{
																															//data towards 19
																															Thread.sleep(3000);
																															ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																															l39.setIcon(i86);
																															
																															Thread.sleep(3000);
																															ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																															l40.setIcon(i65);
																															
																															

																																if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																{
																																	//data at node 19
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																

																																	

																																		
																																	


																																}else  //else of nofe 19
																																{
																																	if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																	{
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);
																																		
																																		
																																
																																		
																																			
																																		

																																	}

																																	
																																}

																															
																															

																															
																														}

																														if(cost20<cost19)
																														{
																															//data towards 20
																															Thread.sleep(3000);
																															ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																															l41.setIcon(i92);
																															
																															Thread.sleep(3000);
																															ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																															l42.setIcon(i66);
																															
																															Thread.sleep(3000);
																															ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																															l44.setIcon(i85);
																															
																															
																															Thread.sleep(3000);
																															ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																															l45.setIcon(i67);

																															
																															
																																
																															
																														}

																													}

																												}
																											}

																											if(cost17<cost18)
																											{
																												//Data towards Node 17
																												
																												Thread.sleep(3000);
																												ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																												l36.setIcon(i88);
																												
																												Thread.sleep(3000);
																												ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																												l38.setIcon(i68);

																												
																													if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																													{

																														//Data at node 17

																														if(state18.equals("ON"))
																														{
																															//Starts from Node 18
																															Thread.sleep(3000);
																															ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																															l56.setIcon(i89);
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																			

																																				

																																			
																																				


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																		
																																					
																																					
																																					

																																				}

																																				
																																			}

																																		
																																		

																																		
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																
																																		
																																		
																																		
																																	}

																																}

																															}
																														

																															
																														
																														}

																													}else
																													{
																														if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																														{
																															//Enter here Node 18 Code
																															

																															//Data towards Node 18
																															
																															Thread.sleep(3000);
																															ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																															l37.setIcon(i64);

																															if(state18.equals("ON"))
																															{

																																if(bw18>data && mac18.equals(mac))
																																{

																																	//data at node 18

																																	if(cost19<cost20)
																																	{
																																		//data towards 19
																																		Thread.sleep(3000);
																																		ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																		l39.setIcon(i86);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																		l40.setIcon(i65);
																																		
																																		

																																			if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																			{
																																				//data at node 19
																																				
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);

																																	

																																				

																																				
																																				


																																			}else  //else of nofe 19
																																			{
																																				if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																				{
																																					Thread.sleep(3000);
																																					ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																					l42.setIcon(i66);
																																					
																																					Thread.sleep(3000);
																																					ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																					l45.setIcon(i67);
																																					
																																					
																																				
																																					
																																						
																																					

																																				}

																																				
																																			}

																										
																																	}

																																	if(cost20<cost19)
																																	{
																																		//data towards 20
																																		Thread.sleep(3000);
																																		ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																		l41.setIcon(i92);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																		l42.setIcon(i66);
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																		l44.setIcon(i85);
																																		
																																		
																																		Thread.sleep(3000);
																																		ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																		l45.setIcon(i67);

																																
																																		
																																			
																																		
																																	}

																																}

																															}
																														

																															
																														}
																														
																													}
																											}

																										}

																									}

																								

																								}

															
																							}

																						
																					}

																					if(cost16<cost14)
																					{
																						//Data towards Node 16
																						
																						Thread.sleep(3000);
																						ImageIcon i95=new ImageIcon(this.getClass().getResource("Greenline17.png"));  //Line 17
																						l33.setIcon(i95);
																						
																						Thread.sleep(3000);
																						ImageIcon i63=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 16
																						l31.setIcon(i63);

																						if(state16.equals("ON"))
																						{
																							if(bw16>data && mac16.equals(mac))
																							{
																								//data at node 16
																								
																								

																								//data towards Node 16
																								
																								if(state16.equals("ON"))
																								{
																									if(bw16>data && mac16.equals(mac))
																									{
																										//data at node 16

																										if(cost18<cost17)
																										{
																											//Data towards Node 18
																											Thread.sleep(3000);
																											ImageIcon i84=new ImageIcon(this.getClass().getResource("Greenline22.png"));  //Line 22
																											l35.setIcon(i84);
																											
																											Thread.sleep(3000);
																											ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																											l37.setIcon(i64);

																											if(state18.equals("ON"))
																											{

																												if(bw18>data && mac18.equals(mac))
																												{

																													//data at node 18

																													if(cost19<cost20)
																													{
																														//data towards 19
																														Thread.sleep(3000);
																														ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																														l39.setIcon(i86);
																														
																														Thread.sleep(3000);
																														ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																														l40.setIcon(i65);
																														
																														

																															if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																															{
																																//data at node 19
																																
																																
																																Thread.sleep(3000);
																																ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																l42.setIcon(i66);
																																
																																Thread.sleep(3000);
																																ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																l45.setIcon(i67);

																															

																																

																																


																															}else  //else of nofe 19
																															{
																																if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																{
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);
																																	
																																	
																																
																																	
																																		
																																	

																																}

																																
																															}

																														
																														
																													}

																													if(cost20<cost19)
																													{
																														//data towards 20
																														Thread.sleep(3000);
																														ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																														l41.setIcon(i92);
																														
																														Thread.sleep(3000);
																														ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																														l42.setIcon(i66);
																														
																														Thread.sleep(3000);
																														ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																														l44.setIcon(i85);
																														
																														
																														Thread.sleep(3000);
																														ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																														l45.setIcon(i67);

																													
																														
																														
																														
																													}

																												}

																											}
																										}

																										if(cost17<cost18)
																										{
																											//Data towards Node 17
																											
																											Thread.sleep(3000);
																											ImageIcon i88=new ImageIcon(this.getClass().getResource("Greenline21.png"));  //Line 21
																											l36.setIcon(i88);
																											
																											
																											Thread.sleep(3000);
																											ImageIcon i68=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 17
																											l38.setIcon(i68);

																											
																												if(bw17>data && mac17.equals(mac) && state17.equals("ON"))
																												{

																													//Data at node 17

																													if(state18.equals("ON"))
																													{
																														//Starts from Node 18
																	
																														//Data towards Node 18
																														Thread.sleep(3000);
																														ImageIcon i89=new ImageIcon(this.getClass().getResource("Greenline26.png"));  //Line 26
																														l56.setIcon(i89);
																														
																														Thread.sleep(3000);
																														ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																														l37.setIcon(i64);

																														if(state18.equals("ON"))
																														{

																															if(bw18>data && mac18.equals(mac))
																															{

																																//data at node 18

																																if(cost19<cost20)
																																{
																																	//data towards 19
																																	Thread.sleep(3000);
																																	ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																	l39.setIcon(i86);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																	l40.setIcon(i65);
																																	
																																	

																																		if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																		{
																																			//data at node 19
																																			
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																			l42.setIcon(i66);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																			l45.setIcon(i67);

																																		


																																		}else  //else of nofe 19
																																		{
																																			if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																			{
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																					
																																				

																																			}

																																			
																																		}
																																	
																																}

																																if(cost20<cost19)
																																{
																																	//data towards 20
																																	Thread.sleep(3000);
																																	ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																	l41.setIcon(i92);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																	l44.setIcon(i85);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);
																																}

																															}

																														}
																													
																													}

																												}else
																												{
																													if(bw17<data || !mac17.equals(mac) || state17.equals("OFF"))
																													{
																														
																														Thread.sleep(3000);
																														ImageIcon i64=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 18
																														l37.setIcon(i64);

																														if(state18.equals("ON"))
																														{

																															if(bw18>data && mac18.equals(mac))
																															{

																																//data at node 18

																																if(cost19<cost20)
																																{
																																	//data towards 19
																																	Thread.sleep(3000);
																																	ImageIcon i86=new ImageIcon(this.getClass().getResource("Greenline23.png"));  //Line 23
																																	l39.setIcon(i86);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i65=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 19
																																	l40.setIcon(i65);
																																	
																																	

																																		if(bw19>data && mac19.equals(mac) && state19.equals("ON"))
																																		{
																																			//data at node 19
																																			
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																			l42.setIcon(i66);
																																			
																																			Thread.sleep(3000);
																																			ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																			l45.setIcon(i67);

																																			


																																		}else  //else of nofe 19
																																		{
																																			if(bw19<data || !mac19.equals(mac) || state19.equals("OFF"))
																																			{
																																				Thread.sleep(3000);
																																				ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																				l42.setIcon(i66);
																																				
																																				Thread.sleep(3000);
																																				ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																				l45.setIcon(i67);
																																				

																																			}

																																			
																																		}

																																	
																																	

																																	
																																}

																																if(cost20<cost19)
																																{
																																	//data towards 20
																																	Thread.sleep(3000);
																																	ImageIcon i92=new ImageIcon(this.getClass().getResource("Greenline24.png"));  //line 24
																																	l41.setIcon(i92);
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i66=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 20
																																	l42.setIcon(i66);
																																	
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i85=new ImageIcon(this.getClass().getResource("Greenline25.png"));  //Line 25
																																	l44.setIcon(i85);
																																	
																																	
																																	Thread.sleep(3000);
																																	ImageIcon i67=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Destination
																																	l45.setIcon(i67);

																																
																																		
																																	
																																}

																															}

																														}
																													

																														
																													}
																													
																												}

																										}

																									}

																								}

																							}
																						}
																					}
																				}
																				
																			}
																		}
																	}
																}

															}
														}else  //else of node N8 State
														{

														}

													}
												}
											}

										}else
											if(cost5<cost6)
											{
												//towards N5
												
												Thread.sleep(3000);
												ImageIcon i13=new ImageIcon(this.getClass().getResource("Greennodes.png"));  //Node 5
												l13.setIcon(i13);
												
												if(state5.equals("ON"))
												{
													if(bw5>data && mac5.equals(mac))
													{
														//Enter Node 6 all code here
														
														send1(mac,data,destination);
													}
													
													else
													{
														
														if(bw5<data || !mac5.equals(mac))
														{
															
															send1(mac,data,destination);
														}
														
														
													}
												}
											}

									}else
									{
										if(bw3<data)
										{

										}
										if(!mac3.equals(mac))
										{

										}
									}

								}else  //else of State node N3
								{

								}

							}else
							{
								if(bw1<data)
								{

								}
								if(!mac1.equals(mac))
								{

								}
							}


						}else  //else of node N1 State
						{


						}

					}else
						if(node.equals("N2"))
						{


							if(state2.equals("ON"))
							{

								if(bw2>data && mac2.equals(mac))
								{
									//data at node N2


									//data moving towards Node 5
									if(state5.equals("ON"))
									{
										if(bw5>data && mac5.equals(mac))
										{

											//Data at node N5

										}else
										{
											if(bw5<data)
											{

											}
											if(!mac5.equals(mac))
											{

											}
										}

									}else
									{

									}

								}else
								{
									if(bw2<data)
									{

									}
									if(!mac2.equals(mac))
									{

									}
								}


							}else  //else of node N1 State
							{


							}


						}
				}
			}
	
		
			DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
			dos.writeUTF("success");
			

		}
	} catch (Exception e) {
		// TODO: handle exception
	}



	
}
}
