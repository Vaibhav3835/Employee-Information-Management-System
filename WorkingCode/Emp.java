package Gui;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.DefaultCaret;

import Gui.Adm;
import Gui.Log;

//import javax.swing.text.DefaultCaret;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
@SuppressWarnings("unused")
public class Emp {
	 public static void createEmpFrame(String uname,String upass)
	   {   
	       EventQueue.invokeLater(new Runnable()
	       {
	           @Override
	           public void run()
	           {
	        	   //frame
	        	   JFrame fr=new JFrame("Home EIMS");
	        	   fr.setSize(1990,890);
	        	   fr.setLayout(null);
	               fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	   fr.setVisible(true);
	        	 
	        	   
	        	   // font 
	        	   Font f = new Font("Serif",Font.BOLD,22);
	        	   Font f1 = new Font("DIALOG",Font.PLAIN,20);
	        	   Font f2 = new Font("Bitstream Vera Sans",Font.BOLD,20);
	        	   Font f3 = new Font("DIALOG",Font.PLAIN,40);
	        	   
	        	   //Background
	        	     JLabel background= new JLabel();
	        	        fr.add(background);
	        		    background.setBounds(0,0,1990,890);
	        		    background.setBackground(new Color(88, 141, 141));
	        		    
	        	   // top header panel
	        	   JPanel heading = new JPanel();
	        	   heading.setLayout(null);
	        	   heading.setBackground(new Color(0, 204, 204));
	        	   heading.setBounds(0,0,1990,60);
	        	  
	        	   // top header text Heading text
	        	   JLabel name = new JLabel("EIMS||EMPLOYEE");
	        	   name.setLayout(null);
	        	   name.setBounds(20,2,400,40);
	        	     heading.add(name);
	        	     name.setFont(f);
	        	     name.setForeground(Color.WHITE);
	        	     background.add(heading);
	        	   
	        	     // left side panel 
	        	  JPanel leftPanel=new JPanel();
	        	  leftPanel.setLayout(null);
	        	  leftPanel.setBackground(Color.WHITE);
	        	  leftPanel.setBorder(new BevelBorder(BevelBorder.RAISED)); 
	        	  leftPanel.setBounds(0,70, 230, 830);
	        	  background.add(leftPanel);
	        	 
//	        	     // left side panel image of employee_logo.
	        	  ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/mainlogo.png"));
	       	   Image img =bg_image.getImage();
	       	   Image temp_img=img.getScaledInstance(140,120,Image.SCALE_SMOOTH);
	       	   bg_image=new ImageIcon(temp_img);
	       	   JLabel logo= new JLabel("",bg_image,JLabel.CENTER);
	        	  logo.setLayout(null);
	        	  logo.setBounds(30,10,140,120);
	        	  leftPanel.add(logo);
	        	  
//	        	 ################################################## // PANELS FOR BUTTON#########################################
	        	  
	        	  JPanel homepanel = new JPanel();
				  homepanel.setLayout(null);
				  homepanel.setBounds(250,80,1260,710);
				  homepanel.setBackground(Color.WHITE);
				  background.add(homepanel);
				  homepanel.setVisible(true);
				  
				  
	        	  JPanel propanel = new JPanel();
	        	  propanel.setLayout(null);
				  propanel.setBounds(400,140,950,600);
				  propanel.setBackground(Color.WHITE);
				  background.add(propanel);  
				  propanel.setVisible(false);
				  
				  JPanel feedpanel = new JPanel();
	        	  feedpanel.setLayout(null);
				  feedpanel.setBounds(380,140,970,620);
				  feedpanel.setBackground(Color.WHITE);
				  background.add(feedpanel);
				  feedpanel.setVisible(false);
				  
				  JPanel ratingpanel = new JPanel();
	        	  ratingpanel.setLayout(null);
				  ratingpanel.setBounds(380,140,970,620);
				  ratingpanel.setBackground(Color.WHITE);
				  background.add(ratingpanel);
				  ratingpanel.setVisible(false);
				  
				  JPanel projectpanel = new JPanel();
				  projectpanel.setLayout(null);
				  projectpanel.setBounds(380,140,970,620);
				  projectpanel.setBackground(Color.WHITE);
				  background.add(projectpanel);
				  projectpanel.setVisible(false);
				  
				  JPanel leavepanel = new JPanel();
				  leavepanel.setLayout(null);
				  leavepanel.setBounds(250,80,1260,710);
				  leavepanel.setBackground(Color.WHITE);
				  background.add(leavepanel);
				  leavepanel.setVisible(false);
				  
				  JPanel payrollpanel = new JPanel();
				  payrollpanel.setLayout(null);
				  payrollpanel.setBounds(380,140,970,620);
				  payrollpanel.setBackground(Color.WHITE);
				  background.add(payrollpanel);
				  payrollpanel.setVisible(false);
				  
				 
				  
//	        	***************************************************  // button of the left panel****************************************
	        	    JButton homebtn= new JButton("Home");
        	        homebtn.setFont(f1);
        	       homebtn.setBounds(5,140,225,50);
        	       homebtn.setBackground(Color.WHITE);
        	       homebtn.setBorder(new BevelBorder(BevelBorder.RAISED));
        	       homebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        	       leftPanel.add(homebtn);
        	       
        	       JLabel lh= new JLabel("Welcome to EIMS");
   				lh.setHorizontalAlignment(JLabel.CENTER);
   				lh.setLayout(null);
   				lh.setBounds(0, 0, 1260, 50);
   				lh.setForeground(Color.white);
   				lh.setOpaque(true);
   				lh.setBackground(new Color(0, 153, 115));
   				lh.setFont(new Font("DIALOG", Font.PLAIN, 29));
   				homepanel.add(lh);
   				
   				// background Image.
   				ImageIcon hbg_image = new ImageIcon(this.getClass().getResource("/home.png"));
   				Image himg = hbg_image.getImage();
   				Image htemp_img = himg.getScaledInstance(470, 470, Image.SCALE_SMOOTH);
   				hbg_image = new ImageIcon(htemp_img);
   				JLabel hlogo = new JLabel("", hbg_image, JLabel.CENTER);
   				hlogo.setLayout(null);
   				hlogo.setBounds(380, 120, 470, 470);
   				homepanel.add(hlogo);

   				homebtn.addActionListener(new ActionListener() {
   					public void actionPerformed(ActionEvent arg0) {

   					 propanel.setVisible(false);
					  projectpanel.setVisible(false);
					  feedpanel.setVisible(false);
					  ratingpanel.setVisible(false);
					  leavepanel.setVisible(false);
					   payrollpanel.setVisible(false);
   						
   						homepanel.setVisible(true);
   						
   						
   						
   					
   						
   					}

   				}

   				);
        	       
        	       
        	       // button of the left panel 
        	       JButton paybtn= new JButton("Payroll");
       	        leftPanel.add(paybtn);
       	        paybtn.setFont(f1);
       	       paybtn.setBounds(5,190,225,50);
       	       paybtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
       	       paybtn.setBackground(Color.WHITE);
       	       paybtn.setBorder(new BevelBorder(BevelBorder.RAISED));
       	       paybtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       	    
       	       JLabel payup = new JLabel("Your Salary Information");
			payup.setHorizontalAlignment(JLabel.CENTER);
			payup.setLayout(null);
			payup.setBounds(0, 0, 970, 50);
			payup.setForeground(Color.white);
			payup.setOpaque(true);
			payup.setBackground(new Color(0, 153, 115, 103));
			payup.setFont(new Font("DIALOG", Font.PLAIN, 29));
			payrollpanel.add(payup);    	
			
			  // label for Employee Name
		     JLabel pl1 = new JLabel("Payroll Sheet :)");
		     pl1.setBounds(400, 80, 151, 26);
		     pl1.setFont(f2);
             payrollpanel.add(pl1);
		    
             // label for salary
             JLabel pl2 = new JLabel("Salary");
            
		     pl2.setBounds(130, 130, 70, 26);
		     pl2.setFont(f1);
		     payrollpanel.add(pl2);
		     // textfield for label salary
		     JLabel ptf2 = new JLabel();
		     
		     ptf2.setBounds(205,130,140,26);
		     ptf2.setBackground(Color.WHITE);
		     ptf2.setFont(f1);
		     ptf2.setBorder(BorderFactory.createLineBorder(Color.black));
		     payrollpanel.add(ptf2);
		     
		     
		     // label for Basic Pay
             JLabel pl3 = new JLabel("Basic Pay ");
             
		     pl3.setBounds(445, 130, 100, 26);
		     pl3.setFont(f1);
		     payrollpanel.add(pl3);
		     // textfield for label salary
		     JLabel ptf3 = new JLabel();
		    
		     ptf3.setBounds(550,130,140,26);
		     ptf3.setBackground(Color.WHITE);
		     ptf3.setFont(f1);
		     ptf3.setBorder(BorderFactory.createLineBorder(Color.black));
		     payrollpanel.add(ptf3);
		     
		  // create a seperator 
		     JSeparator s1 = new JSeparator();
				s1.setBounds(0, 180, 970, 20);
				payrollpanel.add(s1);
				
				 // label for Employee Name
			     JLabel pl4 = new JLabel("Allowances");
	
			     pl4.setBounds(400, 200, 151, 26);
			     pl4.setFont(f2);
	             payrollpanel.add(pl4);
			    
				
				// label for salary
	             JLabel pl5 = new JLabel("HRA");
	             
			     pl5.setBounds(130, 245, 100, 26);
			     pl5.setFont(f1);
			     payrollpanel.add(pl5);
			     // textfield for label salary
			     JLabel ptf5 = new JLabel();
			 
			     ptf5.setBounds(210,245,140,26);
			     ptf5.setBackground(Color.WHITE);
			     ptf5.setFont(f1);
			     ptf5.setBorder(BorderFactory.createLineBorder(Color.black));
			     payrollpanel.add(ptf5);
				
				// label for Basic Pay
	             JLabel pl6 = new JLabel("Conveyence ");
	            
			     pl6.setBounds(420, 245, 130, 26);
			     pl6.setFont(f1);
			     payrollpanel.add(pl6);
			     // textfield for label salary
			     JLabel ptf6 = new JLabel();
			    
			     ptf6.setBounds(560,245,140,26);
			     ptf6.setBackground(Color.WHITE);
			     ptf6.setFont(f1);
			     ptf6.setBorder(BorderFactory.createLineBorder(Color.black));
			     payrollpanel.add(ptf6);
				
				  // create a seperator 
			     JSeparator s2 = new JSeparator();
					s2.setBounds(0, 290, 970, 20);
					payrollpanel.add(s2);
		     
					
					 // label for Employee Name
				     JLabel pl7 = new JLabel("Deduction");
				     payrollpanel.add(pl7);
				     pl7.setBounds(400, 310, 151, 26);
				     pl7.setFont(f2);
		             payrollpanel.add(pl7);
		             
		          // label for salary
		             JLabel pl8 = new JLabel("PF");
		       
				     pl8.setBounds(120, 360, 40, 26);
				     pl8.setFont(f1);
				     payrollpanel.add(pl8);
				     // textfield for label salary
				     JLabel ptf8 = new JLabel();
				    
				     ptf8.setBounds(165,360,140,26);
				     ptf8.setBackground(Color.WHITE);
				     ptf8.setFont(f1);
				     ptf8.setBorder(BorderFactory.createLineBorder(Color.black));
				     payrollpanel.add(ptf8);
				   
				     JLabel pl9 = new JLabel("ESI");
				     
				     pl9.setBounds(360, 360, 40, 26);
				     pl9.setFont(f1);
				     payrollpanel.add(pl9);
				     // textfield for label salary
				     JLabel ptf9 = new JLabel();
				     ptf9.setBounds(405,360,140,26);
				     ptf9.setBackground(Color.WHITE);
				     ptf9.setFont(f1);
				     ptf9.setBorder(BorderFactory.createLineBorder(Color.black));
				     payrollpanel.add(ptf9);
				     
				     JLabel pl10 = new JLabel("Profession Tax");
				     
				     pl10.setBounds(580, 360, 140, 26);
				     pl10.setFont(f1);
				     payrollpanel.add(pl10);
				     // textfield for label salary
				     JLabel ptf10 = new JLabel();
			
				     ptf10.setBounds(725,360,140,26);
				     ptf10.setBackground(Color.WHITE);
				     ptf10.setFont(f1);
				     ptf10.setBorder(BorderFactory.createLineBorder(Color.black));
				     payrollpanel.add(ptf10);
		             
				     // create a seperator 
				     JSeparator s3 = new JSeparator();
						s3.setBounds(0, 415, 970, 20);
						payrollpanel.add(s3);
						
						// label for Employee Name
					     JLabel pl11 = new JLabel("Net Salary");
					     pl11.setBounds(270, 470, 100, 26);
					     pl11.setFont(f2);
			             payrollpanel.add(pl11);
			             
			             JLabel ptf11 = new JLabel();
					     ptf11.setBounds(390,470,200,26);
					     ptf11.setBackground(Color.WHITE);
					     ptf11.setFont(f2);
					     ptf11.setBorder(BorderFactory.createLineBorder(Color.black));
					     payrollpanel.add(ptf11);
					     
       	       paybtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {		 
				 
					
					 propanel.setVisible(false);
					  projectpanel.setVisible(false);
					  feedpanel.setVisible(false);
					  ratingpanel.setVisible(false);
					  leavepanel.setVisible(false);
					  homepanel.setVisible(false);
					  leavepanel.setVisible(false);
					  payrollpanel.setVisible(false);
		
					  payrollpanel.setVisible(true);
				
				
				  // Connection to database :
			       try {
			    	  
			       Class.forName("com.mysql.cj.jdbc.Driver");
					  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
					  PreparedStatement q=conn.prepareStatement("select * from employeedetails where empid=? and epassword=?");
					  q.setString(1, uname);
					  q.setString(2,upass);
					  ResultSet r=q.executeQuery();
					  while(r.next())
					  {     
							long Salary=r.getLong("Salary");
							long Basicpay=(long) (Salary*0.6);
							long hra=(long) (Salary*0.20);
							long other=(long) (Salary*0.20);
							long  pf=(long) (Salary*0.06);
							long  esi=(long) (Salary*0.07);
							long  tax;
							
							if(Salary>=10000 && Salary<50000)
							{
								 tax=(long) (Salary*0.01);
							}
							else if(Salary>=50000 && Salary<100000)
							{
								 tax=(long) (Salary*0.03);
							}
							else if(Salary>=100000 && Salary<=300000)
							{
								 tax=(long) (Salary*0.05);
							}
							else
							{
								tax=(long) (Salary*0.08);
							}
							
							long netAmount=(Basicpay+hra+other-pf-esi-tax);
							 ptf2.setText(String.valueOf(Salary));
							 ptf3.setText(String.valueOf(Basicpay));
							 ptf5.setText(String.valueOf(hra));
							 ptf6.setText(String.valueOf(other));
							 ptf8.setText(String.valueOf(pf));
							 ptf9.setText(String.valueOf(esi));
							 ptf10.setText(String.valueOf(tax));
							 ptf11.setText(String.valueOf(netAmount));
			           }
			       }
			       catch(Exception e)
			       {
			    	   System.out.println(e);
			       }
				}

				
			});

      
	       
   			//leave
   			JButton leave=new JButton("Leave");
   			leave.setBounds(5,240,225,50);
   			leave.setBackground(Color.WHITE);
   			leave.setFont(f1);
   			leave.setBorder(new BevelBorder(BevelBorder.RAISED));
   			leave.setBorder(new MatteBorder(0,0,2,2,Color.GRAY));
   			leave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
   			leave.setLayout(null);
   		    leftPanel.add(leave);
   			
	        JLabel leaveup = new JLabel("Your Leave Information");
			leaveup.setHorizontalAlignment(JLabel.CENTER);
			leaveup.setLayout(null);
			leaveup.setBounds(0, 0, 1260, 50);
			leaveup.setForeground(Color.white);
			leaveup.setOpaque(true);
			leaveup.setBackground(new Color(0, 153, 115, 103));
			leaveup.setFont(new Font("DIALOG", Font.PLAIN, 29));
			leavepanel.add(leaveup);
   			
   			JLabel le2=new JLabel("Total Leave Taken");
   			le2.setBounds(100,120,180,30);
   			le2.setFont(f1);
   			le2.setLayout(null);
   			
   			JLabel led2=new JLabel();
   			led2.setBounds(300,120,180,30);
   			led2.setFont(f1);
   			led2.setBorder(BorderFactory.createLineBorder(Color.black,1));
   			led2.setHorizontalAlignment(JLabel.CENTER);
   			led2.setBackground(Color.WHITE);
   			led2.setLayout(null);
   			
   			JLabel le3=new JLabel("Medical Leave");
   			le3.setBounds(100,160,180,30);
   			le3.setFont(f1);
   			le3.setLayout(null);
   			
   			JLabel led3=new JLabel();
   			led3.setBounds(300,160,180,30);
   			led3.setFont(f1);
   			led3.setHorizontalAlignment(JLabel.CENTER);
   			led3.setBorder(BorderFactory.createLineBorder(Color.black,1));
   			led3.setBackground(Color.WHITE);
   			led3.setLayout(null);
   			
   			JLabel le4=new JLabel("Personal Leave");
   			le4.setBounds(100,200,180,30);
   			le4.setFont(f1);
   			le4.setLayout(null);
   			
   			JLabel led4=new JLabel();
   			led4.setBounds(300,200,180,30);
   			led4.setFont(f1);
   			led4.setBorder(BorderFactory.createLineBorder(Color.black,1));
   			led4.setHorizontalAlignment(JLabel.CENTER);
   			led4.setBackground(Color.WHITE);
   			led4.setLayout(null);
   			
   			JLabel le5=new JLabel("Name");
   			le5.setBounds(50,300,80,30);
   			le5.setFont(f1);
   			le5.setLayout(null);
   			
   			JTextField led5=new JTextField();
   			led5.setBounds(150,300,150,30);
   			led5.setFont(f1);
   			led5.setBackground(Color.WHITE);
   			led5.setLayout(null);
   			
   			JLabel le6=new JLabel("Type");
   			le6.setBounds(350,300,80,30);
   			le6.setFont(f1);
   			le6.setLayout(null);
   			
   			String role[]= {"Medical","Personal"};
   			JComboBox<String> led6=new JComboBox<>(role);
   			led6.setBounds(450,300,150,30);
   			led6.setBackground(Color.WHITE);
   		
   			JLabel le7=new JLabel("From");
   			le7.setBounds(50,360,80,30);
   			le7.setFont(f1);
   			le7.setLayout(null);
   		
   			UtilDateModel model1 =new UtilDateModel();
   			JDatePanelImpl datePanel1=new JDatePanelImpl(model1);
   			JDatePickerImpl datePicker1=new JDatePickerImpl(datePanel1);
   			datePicker1.setBounds(150,360,150,30);
   		
   			JLabel le8=new JLabel("To");
   			le8.setBounds(350,360,80,30);
   			le8.setFont(f1);
   			le8.setLayout(null);
   			
   			UtilDateModel model2 =new UtilDateModel();
   			JDatePanelImpl datePanel2=new JDatePanelImpl(model2);
   			JDatePickerImpl datePicker2=new JDatePickerImpl(datePanel2);
   			datePicker2.setBounds(450,360,150,30);
   			
   			JLabel le9=new JLabel("No of Days");
   			le9.setBounds(50,420,100,30);
   			le9.setFont(f1);
   			le9.setLayout(null);
   		
   			JTextField led9=new JTextField();
   			led9.setBounds(150,420,150,30);
   			led9.setFont(f1);
   			led9.setBackground(Color.WHITE);
   			led9.setLayout(null);
   		
   			JLabel le10=new JLabel("Reason");
   			le10.setBounds(350,420,80,30);
   			le10.setFont(f1);
   			le10.setLayout(null);
   		
   			JTextField led10=new JTextField();
   			led10.setBounds(450,420,150,30);
   			led10.setFont(f1);
   			led10.setBackground(Color.WHITE);
   			led10.setLayout(null);
   			
   			DefaultTableModel lmodel=new DefaultTableModel();
   			JTable ljt=new JTable(lmodel);
   			lmodel.addColumn("Type");
   			lmodel.addColumn("From");
   			lmodel.addColumn("To");
   			lmodel.addColumn("No. of Days");
   			lmodel.addColumn("Reason");
   			lmodel.addColumn("Request");
   			JScrollPane lpg=new JScrollPane(ljt);
   			lpg.setBounds(650,120,600,450);
   			lpg.setBorder(new MatteBorder(2,2,2,2,new Color(115,115,165)));
   			
   			JButton lsubmit=new JButton("Submit");
   			lsubmit.setBounds(250,520,100,30);
   			lsubmit.setBackground(new Color(0, 153, 115));
   			lsubmit.setForeground(Color.white);
   			lsubmit.setFont(f1);
   			lsubmit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
   			lsubmit.setLayout(null);
   			
   			JButton cancel=new JButton("Cancel");
   			cancel.setBounds(400,520,100,30);
   			cancel.setBackground(new Color(0, 153, 115));
   			cancel.setForeground(Color.white);
   			cancel.setFont(f1);
   			
   			cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
   			cancel.setLayout(null);
   			
   			
   			lsubmit.addActionListener(new ActionListener() {
   				public void actionPerformed(ActionEvent e) {
   					int med=0,per=0;
   					try {
   						String res,m,p;
   						Class.forName("com.mysql.cj.jdbc.Driver");
   						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
   						PreparedStatement q=con.prepareStatement("insert into empleave(EmpId,Ename,Type,FDate,TDate,Days,Reason,Request) Values(?,?,?,?,?,?,?,?)");
   						
   						res=led10.getText();
   						if(res==" ")
   							res="Not mentioned";
   						
   						q.setString(1, uname);
   						q.setString(2, led5.getText());
   						q.setString(3, (String)led6.getSelectedItem());
   						q.setString(4, datePicker1.getJFormattedTextField().getText());
   						q.setString(5, datePicker2.getJFormattedTextField().getText());
   						q.setString(6, led9.getText());
   						q.setString(7, res);
   						q.setString(8, "Pending");
   						int r=q.executeUpdate();
   						if(r>0) {
   							JOptionPane.showMessageDialog(fr, "Leave Requested ...", "Message", JOptionPane.INFORMATION_MESSAGE);
   						}
   						else {
   							JOptionPane.showMessageDialog(fr, "Leave Reqest Failed ...", "Message", JOptionPane.INFORMATION_MESSAGE);
   						}
   						
   						if(res==" ")
   							res="Not mentioned";
   						lmodel.addRow(new Object[] {(String)led6.getSelectedItem(), datePicker1.getJFormattedTextField().getText(), datePicker2.getJFormattedTextField().getText(), led9.getText(), res, "Pending"});
   						
   						led6.setSelectedIndex(-1);
   						datePicker1.getJFormattedTextField().setText("");
   						datePicker2.getJFormattedTextField().setText("");
   						led9.setText("");
   						led10.setText("");
   						
   						
   						PreparedStatement q1=con.prepareStatement("select * from empleave where Empid=?");
   						q1.setString(1, uname);
   						ResultSet r1=q1.executeQuery();
   						while(r1.next()) {
   							m="Medical"; p="Personal";
   							if(m.equals(r1.getString("Type")))
   								med++;
   							else if(p.equals(r1.getString("Type")))
   								per++;
   								
   						}
   						led2.setText(String.valueOf(med+per)+" /15");
   						led3.setText(String.valueOf(med)+" /10");
   						led4.setText(String.valueOf(per)+" /5");
   						
   					}
   					catch(Exception se)
   					{
   						System.out.println(se);
   					}
   				}
   			});
   			
   			cancel.addActionListener(new ActionListener() {
   				public void actionPerformed(ActionEvent e) {
   						led6.setSelectedIndex(-1);
   						datePicker1.getJFormattedTextField().setText("");
   						datePicker2.getJFormattedTextField().setText("");
   						led9.setText("");
   						led10.setText("");	
   						
   				}
   			});
   			
   			
   			leave.addActionListener(new ActionListener() {
   				public void actionPerformed(ActionEvent e) {
   					
					propanel.setVisible(false);
					projectpanel.setVisible(false);
					feedpanel.setVisible(false);
					ratingpanel.setVisible(false);
					homepanel.setVisible(false);
					leavepanel.setVisible(false);
					payrollpanel.setVisible(false);
					propanel.setVisible(false);

  					leavepanel.setVisible(true);
				   
   					lmodel.setRowCount(0);
   					try {
   						String m,p; int med=0,per=0;
   						Class.forName("com.mysql.cj.jdbc.Driver");
   						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
   						PreparedStatement q=con.prepareStatement("select * from employeedetails where empid=?");
   						q.setString(1, uname);
   						ResultSet r=q.executeQuery();
   						while(r.next()) {
   						led5.setText( r.getString("empname"));
   						}
   						
   						PreparedStatement q1=con.prepareStatement("select * from empleave where empid=?");
   						q1.setString(1, uname);
   						ResultSet r1=q1.executeQuery();
   						while(r1.next()) {
   							m="Medical"; p="Personal";
   							if(m.equals(r1.getString("Type")))
   								med++;
   							else if(p.equals(r1.getString("Type")))
   								per++;
   								
   							lmodel.addRow(new Object[] {r1.getString(4), r1.getString(5), r1.getString(6), r1.getString(7), r1.getString(8), r1.getString(9)});
   						}
   						led2.setText(String.valueOf(med+per)+" /15");
   						led3.setText(String.valueOf(med)+" /10");
   						led4.setText(String.valueOf(per)+" /5");
   						
   					}
   					catch(Exception se)
   					{
   						System.out.println(se);
   					}
   					
   				  
				   
   					
   					leavepanel.add(le2);
   					leavepanel.add(le3);
   					leavepanel.add(le4);
   					leavepanel.add(le5);
   					leavepanel.add(le6);
   					leavepanel.add(le7);
   					leavepanel.add(le8);
   					leavepanel.add(le9);
   					leavepanel.add(le10);
   					leavepanel.add(lsubmit);
   					leavepanel.add(cancel);
   					leavepanel.add(led2);
   					leavepanel.add(led3);
   					leavepanel.add(led4);
   					leavepanel.add(led5);
   					leavepanel.add(led6);
   					led6.setSelectedIndex(-1);
   					leavepanel.add(datePicker1);
   					leavepanel.add(datePicker2);
   					leavepanel.add(led9);
   					leavepanel.add(led10);
   					leavepanel.add(lpg);
   				}
   			});
	       // profile BUtton
	       
	       JButton probtn= new JButton("Profile");
	        leftPanel.add(probtn);
	        probtn.setFont(f1);
	       probtn.setBounds(5,290,225,50);
	       probtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
	       probtn.setBackground(Color.WHITE);
	       probtn.setBorder(new BevelBorder(BevelBorder.RAISED));
	       probtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	       
	       
			  				       // Label for Employee Profile
	       JLabel proup = new JLabel("My Profile");
	    			proup.setHorizontalAlignment(JLabel.CENTER);
	    			proup.setLayout(null);
	    			proup.setBounds(0, 0, 970, 50);
	    			proup.setForeground(Color.white);
	    			proup.setOpaque(true);
	    			proup.setBackground(new Color(0, 153, 115, 103));
	    			proup.setFont(new Font("DIALOG", Font.PLAIN, 29));
	    			propanel.add(proup);    
			
			  // label for Employee Name
		     JLabel l2 = new JLabel("Employee Name -");
		     propanel.add(l2);
		     l2.setBounds(12, 80, 460, 30);
		     l2.setFont(f1);
		     
		     
		     // textfield for label Employee Name
		     JLabel fd2 = new JLabel();
		     propanel.add(fd2);
		     fd2.setBounds(200,78,190,30);
		     fd2.setBackground(Color.WHITE);
		     fd2.setFont(f1);
		     fd2.setBorder(BorderFactory.createLineBorder(Color.black));
		    
		     
		     
		     // label l3 for the EMployee Department
		     JLabel l3 = new JLabel("Department -");
		     propanel.add(l3);
		     l3.setBounds(12, 125, 460, 30);
		     l3.setFont(f1);
		     
		     // text field fd3 for label Employee Department
		     JLabel fd3 = new JLabel();
		     propanel.add(fd3);
		     fd3.setBounds(200,123,190,30);
		     fd3.setBackground(Color.WHITE);
		     fd3.setFont(f1);
		     fd3.setBorder(BorderFactory.createLineBorder(Color.black));
		  
		     
		     
		     // label l4 for the Employee Education
		     JLabel l4 = new JLabel("Education -");
		     propanel.add(l4);
		     l4.setBounds(12, 170, 460, 30);
		     l4.setFont(f1);
		     
		     // text field fd4 for labelEmployee Education
		     JLabel fd4 = new JLabel();
		     propanel.add(fd4);
		     fd4.setBounds(200,168,190,30);
		     fd4.setBackground(Color.WHITE);
		     fd4.setFont(f1);
		     fd4.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		  // label l5 for the Employee project
		     JLabel l5 = new JLabel("Current Project -");
		     propanel.add(l5);
		     l5.setBounds(12, 215, 460, 30);
		     l5.setFont(f1);
		    
		     // text field fd5 
		     JLabel fd5 = new JLabel();
		     propanel.add(fd5);
		     fd5.setBounds(200,213,190,30);
		     fd5.setBackground(Color.WHITE);
		     fd5.setFont(f1);
		     fd5.setBorder(BorderFactory.createLineBorder(Color.black));

		     
		     // label l6 for the Employee skills
		     JLabel l6 = new JLabel("Employee Skills -");
		     propanel.add(l6);
		     l6.setBounds(12, 260, 460, 30);
		     l6.setFont(f1);
		    
		     // text field fd6 
		     JLabel fd6 = new JLabel();
		     propanel.add(fd6);
		     fd6.setBounds(200,258,190,30);
		     fd6.setBackground(Color.WHITE);
		     fd6.setFont(f1);
		     fd6.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		     // label l7 for the Employee lang
		     JLabel l7 = new JLabel("Language Known -");
		     propanel.add(l7);
		     l7.setBounds(12, 305, 460, 30);
		     l7.setFont(f1);
		     
		     // text field fd7 
		     JLabel fd7 = new JLabel();
		     propanel.add(fd7);
		     fd7.setBounds(200,304,190,30);
		     fd7.setBackground(Color.WHITE);
		     fd7.setFont(f1);
		     fd7.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		     // lable l8 for the Employee Contact
		     JLabel l8 = new JLabel("Contact No -");
		     propanel.add(l8);
		     l8.setBounds(12, 350, 460, 30);
		     l8.setFont(f1);
		     
		     // textfield fd8 
		     JLabel fd8 = new JLabel();
		     propanel.add(fd8);
		     fd8.setBounds(200,348,190,30);
		     fd8.setBackground(Color.WHITE);
		     fd8.setFont(f1);
		     fd8.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		     
		     // label l9 for the Employee Email address
		     JLabel l9 = new JLabel("Email address -");
		     propanel.add(l9);
		     l9.setBounds(12, 395, 460, 30);
		     l9.setFont(f1);
		    
		     // textfield fd9 
		     JLabel fd9 = new JLabel();
		     propanel.add(fd9);
		     fd9.setBounds(200,393,190,30);
		     fd9.setBackground(Color.WHITE);
		     fd9.setFont(f1);
		     fd9.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		  // label l10 for the Employee Date of Joining
		     JLabel l10 = new JLabel("Your DOJ -");
		     propanel.add(l10);
		     l10.setBounds(12, 440, 460, 30);
		     l10.setFont(f1);
		     
		     // text field fd10
		     JLabel fd10 = new JLabel();
		     propanel.add(fd10);
		     fd10.setBounds(200,438,190,30);
		     fd10.setBackground(Color.WHITE);
		     fd10.setFont(f1);
		     fd10.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		  // label l11 for the Employee Address
		     JLabel l11 = new JLabel("House Address-");
		     propanel.add(l11);
		     l11.setBounds(12, 485, 460, 30);
		     l11.setFont(f1);
		     
		     // text field fd11 
		     JLabel fd11 = new JLabel();
		     propanel.add(fd11);
		     fd11.setBounds(200,483,190,30);
		     fd11.setBackground(Color.WHITE);
		     fd11.setFont(f1);
		     fd11.setBorder(BorderFactory.createLineBorder(Color.black));
		     
		     
		    // label l12 for the Employee ID
		     JLabel l12 = new JLabel("Employee Id-");
		     propanel.add(l12);
		     l12.setBounds(570, 210, 300, 60);
		     l12.setFont(f3);
		     l12.setForeground(Color.RED);
		     
		     // text field fd12 
		     JLabel fd12 = new JLabel();
		     propanel.add(fd12);
		     fd12.setBounds(570,280,300,30);
		     fd12.setBackground(Color.WHITE);
		     fd12.setHorizontalAlignment(JLabel.CENTER);
		     fd12.setForeground(new Color(0, 204, 204));
		     fd12.setFont(f3);
		     
		     probtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {		 
				 
					
					  propanel.setVisible(false);
					  projectpanel.setVisible(false);
					  feedpanel.setVisible(false);
					  ratingpanel.setVisible(false);
					  leavepanel.setVisible(false);
					  homepanel.setVisible(false);
					  leavepanel.setVisible(false);
					  payrollpanel.setVisible(false);
					  
					   propanel.setVisible(true);
				
				
				  // Connection to database :
			       try {
			    	  
			       Class.forName("com.mysql.cj.jdbc.Driver");
					  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
					  PreparedStatement q=conn.prepareStatement("select * from employeedetails where empid=? and epassword=?");
					  q.setString(1, uname);
					  q.setString(2,upass);
					  ResultSet r=q.executeQuery();
					  while(r.next())
					  {     
							fd2.setText(r.getString("empName"));
							fd3.setText(r.getString("Dept"));
							fd4.setText(r.getString("Education"));
							fd5.setText(r.getString("CurrentProject"));
							fd6.setText(r.getString("EmployeeSkills"));
							fd7.setText(r.getString("language"));
							fd8.setText(String.valueOf(r.getInt("ContactNo")));
						    fd9.setText(r.getString("EmailAdd"));
							fd10.setText(r.getString("Doj"));
							fd11.setText(r.getString("House_add"));
							fd12.setText(r.getString("empid"));
							
			           }
			       }
			       catch(Exception e)
			       {
			    	   System.out.println(e);
			       }
				  
				 
				}
			});
	       
	       JButton projectbtn= new JButton("Current Project");
	        leftPanel.add(projectbtn);
	        projectbtn.setFont(f1);
	       projectbtn.setBounds(5,340,225,50);
	       projectbtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
	       projectbtn.setBackground(Color.WHITE);
	       projectbtn.setBorder(new BevelBorder(BevelBorder.RAISED));
	       projectbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	       
	       JLabel projectup = new JLabel("Complete Project Details");
			projectup.setHorizontalAlignment(JLabel.CENTER);
			projectup.setLayout(null);
			projectup.setBounds(0, 0, 970, 50);
			projectup.setForeground(Color.white);
			projectup.setOpaque(true);
			projectup.setBackground(new Color(0, 153, 115, 103));
			projectup.setFont(new Font("DIALOG", Font.PLAIN, 29));
			projectpanel.add(projectup);
			
			DefaultTableModel model3 = new DefaultTableModel();
		    JTable jtbl = new JTable(model3);
		    jtbl.setCellSelectionEnabled(true);
		    jtbl.getTableHeader().setReorderingAllowed(false);
		    model3.addColumn("Pid");
	        model3.addColumn("PName");
	        model3.addColumn("PStart");
	        model3.addColumn("PEnd");
	        model3.addColumn("PMemberID");
	        model3.addColumn("PMember");
	        model3.addColumn("PDescription");
	        JScrollPane sp = new JScrollPane(jtbl);
	        sp.setBounds(40, 140, 900, 400);
	        projectpanel.add(sp);
	        
	        
	        projectbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
                    model3.setRowCount(0);
                    
                    propanel.setVisible(false);
  				    projectpanel.setVisible(false);
  				    feedpanel.setVisible(false);
  				    ratingpanel.setVisible(false);
  				    homepanel.setVisible(false);
				     leavepanel.setVisible(false);
				     payrollpanel.setVisible(false);
  				  
					projectpanel.setVisible(true);

					try 
					{

						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
						PreparedStatement q= conn.prepareStatement("SELECT  PID from projectdetails  where PMemberID=?");
						q.setString(1, uname);
						ResultSet r = q.executeQuery();
						while(r.next())
						{
							String projectid = r.getString("PID");
						PreparedStatement pstm = conn.prepareStatement("SELECT *from  projectdetails where PID=? ");
						pstm.setString(1, projectid);
						ResultSet Rs = pstm.executeQuery();
						while (Rs.next()) {
							model3.addRow(new Object[] { Rs.getString(1), Rs.getString(2), Rs.getString(3),
									Rs.getString(4), Rs.getString(5), Rs.getString(6), Rs.getString(7) });
						}
						}
					} 
					catch (Exception e) 
					{
						System.out.println(e.getMessage());
					}

					
				}

			}

			);
//	       *********************************************FEEDBACK BUTTON**********************************************************
	       
	       JButton feedbtn= new JButton("Feedback");
	        leftPanel.add(feedbtn);
	        feedbtn.setFont(f1);
	       feedbtn.setBounds(5,390,225,50);
	       feedbtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
	       feedbtn.setBackground(Color.WHITE);
	       feedbtn.setBorder(new BevelBorder(BevelBorder.RAISED));
	       feedbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        
	       JLabel fb1= new JLabel("Campus Management");
	       fb1.setBounds(420, 30, 250, 40);
	       fb1.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
	       fb1.setForeground(new Color(30, 123, 123));
	       fb1.setFont(f1);
	      
	       
	       JSlider sl1=new JSlider(JSlider.HORIZONTAL, 0, 10,0);
	       sl1.setBounds(680,30,200,40);  
	       sl1.setBackground(Color.white);
	       sl1.setMajorTickSpacing(1);  
	       sl1.setPaintTicks(true);  
	       sl1.setPaintLabels(true);
	       sl1.setForeground(Color.black);
	       
	       JLabel sl1value= new JLabel();
	       sl1value.setBounds(890,30,100,40);
	       sl1value.setFont(new Font("DIALOG",Font.PLAIN,17));
	       sl1.addChangeListener(new ChangeListener()
	    		   {
	    	   @Override
	    	   public void stateChanged(ChangeEvent e)
	    	   {
	    		   JSlider s1source = (JSlider) e.getSource();
	    		   sl1.setForeground(Color.RED);
	    		   sl1value.setText("Rated :"+s1source.getValue());
	    	   }
	    		   });
	       feedpanel.add(sl1value);
	       feedpanel.add(sl1);
	       feedpanel.add(fb1);
//	     ***************feedback workspace environment****************************  
	       
	       JLabel fb2= new JLabel("WorkSpace Environment");
	       fb2.setBounds(420, 90, 250, 40);
	       fb2.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
	       fb2.setForeground(new Color(30, 123, 123));
	       fb2.setFont(f1);
	      
	       
	       JSlider sl2=new JSlider(JSlider.HORIZONTAL, 0, 10,0);
	       sl2.setBounds(680,90,200,40);  
	       sl2.setBackground(Color.white);
	       sl2.setMajorTickSpacing(1);  
	       sl2.setPaintTicks(true);  
	       sl2.setPaintLabels(true);
	       sl2.setForeground(Color.black);
	       
	       JLabel sl2value= new JLabel();
	       sl2value.setBounds(890,90,100,40);
	       sl2value.setFont(new Font("DIALOG",Font.PLAIN,17));
	       sl2.addChangeListener(new ChangeListener()
	    		   {
	    	   @Override
	    	   public void stateChanged(ChangeEvent e)
	    	   {
	    		   JSlider s2source = (JSlider) e.getSource();
	    		   sl2.setForeground(Color.RED);
	    		   sl2value.setText("Rated :"+s2source.getValue());
	    	   }
	    		   });
	       feedpanel.add(sl2value);
	       feedpanel.add(sl2);
	       feedpanel.add(fb2);
//		     ***************feedback Growth Opprounties**************************** 
	       JLabel fb3= new JLabel("Growth Opprounties");
	       fb3.setBounds(420, 150, 250, 40);
	       fb3.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
	       fb3.setForeground(new Color(30, 123, 123));
	       fb3.setFont(f1);
	      
	       
	       JSlider sl3=new JSlider(JSlider.HORIZONTAL, 0, 10,0);
	       sl3.setBounds(680,150,200,40);  
	       sl3.setBackground(Color.white);
	       sl3.setMajorTickSpacing(1);  
	       sl3.setPaintTicks(true);  
	       sl3.setPaintLabels(true);
	       sl3.setForeground(Color.black);
	       
	       JLabel sl3value= new JLabel();
	       sl3value.setBounds(890,150,100,40);
	       sl3value.setFont(new Font("DIALOG",Font.PLAIN,17));
	       sl3.addChangeListener(new ChangeListener()
	    		   {
	    	   @Override
	    	   public void stateChanged(ChangeEvent e)
	    	   {
	    		   JSlider s3source = (JSlider) e.getSource();
	    		   sl3.setForeground(Color.RED);
	    		   sl3value.setText("Rated :"+s3source.getValue());
	    	   }
	    		   });
	       feedpanel.add(sl3value);
	       feedpanel.add(sl3);
	       feedpanel.add(fb3);
	       
	      // ************** Work From Home**************************** 
	       JLabel fb4= new JLabel("Work From Home");
	       fb4.setBounds(420, 210, 250, 40);
	       fb4.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
	       fb4.setForeground(new Color(30, 123, 123));
	       fb4.setFont(f1);
	      
	       
	       JSlider sl4=new JSlider(JSlider.HORIZONTAL, 0, 10,0);
	       sl4.setBounds(680,210,200,40);  
	       sl4.setBackground(Color.white);
	       sl4.setMajorTickSpacing(1);  
	       sl4.setPaintTicks(true);  
	       sl4.setPaintLabels(true);
	       sl4.setForeground(Color.black);
	       
	       JLabel sl4value= new JLabel();
	       sl4value.setBounds(890,210,100,40);
	       sl4value.setFont(new Font("DIALOG",Font.PLAIN,17));
	       sl4.addChangeListener(new ChangeListener()
	    		   {
	    	   @Override
	    	   public void stateChanged(ChangeEvent e)
	    	   {
	    		   JSlider sl4source = (JSlider) e.getSource();
	    		   sl4.setForeground(Color.RED);
	    		   sl4value.setText("Rated :"+sl4source.getValue());
	    	   }
	    		   });
	       feedpanel.add(sl4value);
	       feedpanel.add(sl4);
	       feedpanel.add(fb4);
		      // ************** Overall Job Stasification*************************** 
	       JLabel fb5= new JLabel("Overall Statisfaction");
	       fb5.setBounds(420, 270, 250, 40);
	       fb5.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
	       fb5.setForeground(new Color(30, 123, 123));
	       fb5.setFont(f1);
	      
	       
	       JSlider sl5=new JSlider(JSlider.HORIZONTAL, 0, 10,0);
	       sl5.setBounds(680,270,200,40);  
	       sl5.setBackground(Color.white);
	       sl5.setMajorTickSpacing(1);  
	       sl5.setPaintTicks(true);  
	       sl5.setPaintLabels(true);
	       sl5.setForeground(Color.black);
	       
	       JLabel sl5value= new JLabel();
	       sl5value.setBounds(890,270,100,40);
	       sl5value.setFont(new Font("DIALOG",Font.PLAIN,17));
	       sl5.addChangeListener(new ChangeListener()
	    		   
  		 {
	    	   @Override
	    	   public void stateChanged(ChangeEvent e)
	    	   {
	    		   JSlider sl5source = (JSlider) e.getSource();
	    		   sl5.setForeground(Color.RED);
	    		   sl5value.setText("Rated :"+sl5source.getValue());
	    	   }
	    		   });
	       feedpanel.add(sl5value);
	       feedpanel.add(sl5);
	       feedpanel.add(fb5);
	       
//	       ***********Text box for any remark********
	     
		   JLabel fb6 = new JLabel("**Please Tell us your reasons for giving this rating");
		   fb6.setBounds(420,330,480,20);
		   feedpanel.add(fb6);
		   
		   JTextArea fb7= new JTextArea();
           fb7.setBounds(420, 350, 480, 150);
           fb7.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
           fb7.setBackground(new Color(234, 250, 250));
           feedpanel.add(fb7);
           
           JButton fsub= new JButton("Submit Feedback");
           fsub.setBounds(520,560,200,40);
           fsub.setBackground(new Color(0, 153, 115));
           fsub.setForeground(Color.WHITE);
           fsub.setFont(f1);
           feedpanel.add(fsub);
	       feedbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {		 
					  propanel.setVisible(false);
					  projectpanel.setVisible(false);
					  feedpanel.setVisible(false);
					  ratingpanel.setVisible(false);
					  homepanel.setVisible(false);
					  leavepanel.setVisible(false);
					  payrollpanel.setVisible(false);
					  
					feedpanel.setVisible(true);
					 sl1.setValue(0);
			    	 sl2.setValue(0);
			    	 sl3.setValue(0);
			    	 sl4.setValue(0);
			    	 sl5.setValue(0);
			    	 sl1value.setText(null);
			    	 sl2value.setText(null);
			    	 sl3value.setText(null);
			    	 sl4value.setText(null);
			    	 sl5value.setText(null);
			    	 fb7.setText(null);
			    	 
			    	 sl1.setForeground(Color.black);
			    	 sl2.setForeground(Color.black);
			    	 sl3.setForeground(Color.black);
			    	 sl4.setForeground(Color.black);
			    	 sl5.setForeground(Color.black);
			    	 
					ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/feedlogo.png"));
					   Image img =bg_image.getImage();
					   Image temp_img=img.getScaledInstance(400,620,Image.SCALE_SMOOTH);
					   bg_image=new ImageIcon(temp_img);
					 JLabel logo= new JLabel("",bg_image,JLabel.CENTER);
					 logo.setLayout(null);
					 logo.setBounds(0,0,400,620);
					 feedpanel.add(logo);
					 
					 
					 fsub.addActionListener(new ActionListener()
							 {
						 public void actionPerformed(ActionEvent arg0)
						 {
							 try {
						    	
						    	 
							       Class.forName("com.mysql.cj.jdbc.Driver");
									  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
									  PreparedStatement q=conn.prepareStatement("insert into empfeedback values(?,?,?,?,?,?,?);");
									  q.setString(1,uname);
									  q.setInt(2, sl1.getValue());
									  q.setInt(3, sl2.getValue());
									  q.setInt(4, sl3.getValue());
									  q.setInt(5, sl4.getValue());
									  q.setInt(6, sl5.getValue());
									  q.setString(7,fb7.getText());
									 
									  int  x=q.executeUpdate();
									  
									  if(x>0)
									  {
										  
										  feedpanel.setVisible(false);
										  JOptionPane.showMessageDialog(fr, "FeedBack Recored", "Message", JOptionPane.INFORMATION_MESSAGE);
											
							           }
							       }
							       catch(Exception e)
							       {JOptionPane.showMessageDialog(fr, "You have already Responded", "Message", JOptionPane.INFORMATION_MESSAGE);
							    	   System.out.println(e);
							       }
								  
								 
								}
							});
						 }
							 });
				  // Connection to database :
	       
	       
	       JButton ratebtn= new JButton("Rating");
	        leftPanel.add(ratebtn);
	        ratebtn.setFont(f1);
	       ratebtn.setBounds(5,440,225,50);
	       ratebtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
	       ratebtn.setBackground(Color.WHITE);
	       ratebtn.setBorder(new BevelBorder(BevelBorder.RAISED));
	       ratebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	       
	       JPanel rateup= new JPanel();
	       rateup.setBounds(0, 0, 970,50 );
	       rateup.setBackground(new Color(0, 153, 115,103));
	       ratingpanel.add(rateup);
	       
	        JLabel ratelabel= new JLabel("Your Performance Analysis");
	        ratelabel.setBounds(300, 10, 970, 40);
	        ratelabel.setForeground(Color.WHITE);
	        ratelabel.setFont(new Font("DIALOG",Font.PLAIN,24));
	        rateup.add(ratelabel);
//	         *******************************Behaviour###############################
	           JLabel afb1= new JLabel("WorkSpace Behaviour");
		       afb1.setBounds(440, 100, 250, 40);
		       afb1.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb1.setForeground(new Color(30, 123, 123));
		       afb1.setFont(f1);
		       ratingpanel.add(afb1);
		       JLabel ratevalue1= new JLabel();
		       ratevalue1.setBounds(710,100,100,40);
		       ratevalue1.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(ratevalue1);
		       
//		       *******************************Leading Skills*************************************************
		       JLabel afb2= new JLabel("Leading Skills");
		       afb2.setBounds(440, 160, 250, 40);
		       afb2.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb2.setForeground(new Color(30, 123, 123));
		       afb2.setFont(f1);
		       ratingpanel.add(afb2);
		       
		       JLabel ratevalue2= new JLabel();
		       ratevalue2.setBounds(710,160,100,40);
		       ratevalue2.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(ratevalue2);
//***************************************************Software Developing skills*****************************************
		       JLabel afb3= new JLabel("Software Dev. Approach");
		       afb3.setBounds(440, 220, 250, 40);
		       afb3.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb3.setForeground(new Color(30, 123, 123));
		       afb3.setFont(f1);
		       ratingpanel.add(afb3);
		       
		       JLabel ratevalue3= new JLabel();
		       ratevalue3.setBounds(710,220,100,40);
		       ratevalue3.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(ratevalue3);
	
		       
		       
		       
		       // *****************************************Project's Working*****************************
		       JLabel afb5= new JLabel("Team Working");
		       afb5.setBounds(440, 280, 250, 40);
		       afb5.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb5.setForeground(new Color(30, 123, 123));
		       afb5.setFont(f1);
		       ratingpanel.add(afb5);
		       
		       JLabel ratevalue5= new JLabel();
		       ratevalue5.setBounds(710,280,100,40);
		       ratevalue5.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(ratevalue5);
//		       ***************************************** Overall Rating***************************************
		       JLabel afb6= new JLabel("Overall Rating");
		       afb6.setBounds(440, 340, 250, 40);
		       afb6.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb6.setForeground(new Color(30, 123, 123));
		       afb6.setFont(f1);
		       ratingpanel.add(afb6);
		       
		       JLabel ratevalue6= new JLabel();
		       ratevalue6.setBounds(710,340,100,40);
		       ratevalue6.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(ratevalue6);
		     
		       JLabel arfb7=new JLabel("*Remark");
		       arfb7.setHorizontalAlignment(JLabel.LEFT);
		       //arfb7.setBorder(new MatteBorder(2,2,2,2,Color.RED));
		       arfb7.setBounds(440,385,100,14);
		       arfb7.setForeground(Color.RED);
		       arfb7.setFont(new Font("DIALOG",Font.PLAIN,14));
		       ratingpanel.add(arfb7);
		       
		       JLabel afb7=new JLabel();
		       afb7.setHorizontalAlignment(JLabel.LEFT);
		       afb7.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb7.setOpaque(true);
		       afb7.setBackground(new Color(234, 250, 250));
		       afb7.setBounds(440,400,450,110);
		       afb7.setForeground(new Color(30, 123, 123));
		       afb7.setFont(new Font("DIALOG",Font.PLAIN,18));
		       ratingpanel.add(afb7);
		       
		       JLabel afb8= new JLabel("**Next time definately you will give us chance for rating you better than this time. ");
		       afb8.setBounds(400, 510, 500, 40);
		      // afb7.setBorder(new MatteBorder(2,2,2,2,new Color(30, 123, 123)));
		       afb8.setForeground(new Color(0,0,0));
		       afb8.setFont(new Font("DIALOG",Font.PLAIN,13));
		       ratingpanel.add(afb8);
		       
	       ratebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {		 
				    
					 propanel.setVisible(false);
					  projectpanel.setVisible(false);
					  feedpanel.setVisible(false);
					  ratingpanel.setVisible(false);
					  homepanel.setVisible(false);
					  leavepanel.setVisible(false);
					  payrollpanel.setVisible(false);
					  
				  ratingpanel.setVisible(true);
					ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminToempFeedback.png"));
					   Image img =bg_image.getImage();
					   Image temp_img=img.getScaledInstance(400,550,Image.SCALE_SMOOTH);
					   bg_image=new ImageIcon(temp_img);
					 JLabel logo= new JLabel("",bg_image,JLabel.CENTER);
					 logo.setLayout(null);
					 logo.setBounds(0,50,400,550);
					 ratingpanel.add(logo);
					 
					  try{
						
						  
				    		Class.forName("com.mysql.cj.jdbc.Driver");
						  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
						  PreparedStatement q=conn.prepareStatement("select * from a_To_e_feedback where eid=?");
                      q.setString(1, uname);
                    ResultSet r= q.executeQuery();
                    while(r.next())
                    {
                    	
                      ratevalue1.setText("Rated"+String.valueOf(r.getInt("Workspace")));
				      ratevalue2.setText("Rated"+String.valueOf(r.getInt("leadingskills")));
					  ratevalue3.setText("Rated"+String.valueOf(r.getInt("DevelopingApproach")));
					  ratevalue5.setText("Rated"+String.valueOf(r.getInt("Teamworking")));
					  ratevalue6.setText("Rated"+String.valueOf(r.getInt("overall")));
					  afb7.setText(r.getString("remark"));
                    	
                    }
					  }
					  catch(Exception e)
					  {
						  
					  }
					 
						 }
							 });
	       
	       JButton outbtn= new JButton("Log Out");
	        leftPanel.add(outbtn);
	        outbtn.setFont(f1);
	       outbtn.setBounds(5,660,225,50);
	       outbtn.setBorder(new MatteBorder(0,0,8,0,Color.pink));
	       outbtn.setBackground(new Color(0, 204, 204));
	       outbtn.setForeground(Color.white);
	       outbtn.setBorder(new BevelBorder(BevelBorder.RAISED));
	       outbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	       outbtn.addActionListener(new ActionListener(){
	    	   public void actionPerformed(ActionEvent arg0)
	    	   {  fr.setVisible(false);
	    		   new Log();
	    		   JOptionPane.showMessageDialog(fr, "Thanks for using EIMS", "Logout", JOptionPane.INFORMATION_MESSAGE);
	    	   }
	       }
	           );
	        	    
	        	        		
	           }
	       });
	   }
public static void main(String args[])
{
	createEmpFrame("","");
}
}

