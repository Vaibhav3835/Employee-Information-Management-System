package Gui;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;

import Gui.Emp;
import Gui.Log;

//import javax.swing.text.DefaultCaret;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

@SuppressWarnings("unused")
public class Adm {

	public static void createAdminFrame() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// frame
				JFrame fr = new JFrame("Home ADMIN");
				fr.setSize(1990, 890);
				fr.setLayout(null);
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr.setVisible(true);

				// Background
				JLabel background = new JLabel();
				// background.add(login);
				background.setBounds(0, 0, 1990, 890);
				background.setBackground(new Color(88, 141, 141));
				fr.add(background);

				// font
				Font f = new Font("Serif", Font.BOLD, 22);
				Font f1 = new Font("DIALOG", Font.PLAIN, 20);
				Font f2 = new Font("Bitstream Vera Sans",Font.BOLD, 20);
				Font f3 = new Font("DIALOG", Font.PLAIN, 40);

				// top header panel
				JPanel heading = new JPanel();
				heading.setLayout(null);
				heading.setBackground(new Color(255, 77, 77));
				heading.setBounds(0, 0, 1990, 60);

				// top header text Heading text
				JLabel name = new JLabel("EIMS|| Admin");
				name.setLayout(null);
				name.setBounds(20, 2, 400, 40);
				heading.add(name);
				name.setFont(f);
				name.setForeground(Color.WHITE);
				background.add(heading);

				// left side panel
				JPanel leftPanel = new JPanel();
				leftPanel.setLayout(null);
				leftPanel.setBackground(Color.WHITE);
				leftPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
				leftPanel.setBounds(0, 60, 230, 830);
				background.add(leftPanel);

//	        	     // left side panel image of employee_logo.
				ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/adminLogo1.png"));
				Image img = bg_image.getImage();
				Image temp_img = img.getScaledInstance(140, 120, Image.SCALE_SMOOTH);
				bg_image = new ImageIcon(temp_img);
				JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
				logo.setLayout(null);
				logo.setBounds(30, 10, 140, 120);
				leftPanel.add(logo);
				// ********************************************************ALL PANLES  DETAILS**************************
				// a panel for search eid(all panel for employee info button)
				
				 JPanel homepanel = new JPanel();
				  homepanel.setLayout(null);
				  homepanel.setBounds(250,80,1260,710);
				  homepanel.setBackground(Color.WHITE);
				  background.add(homepanel);
				  homepanel.setVisible(true);
				  
				  
				
				
				JPanel epropanel = new JPanel();
				background.add(epropanel);
				epropanel.setLayout(null);
				epropanel.setBounds(400, 140, 950, 600);
				epropanel.setBackground(Color.WHITE);
				epropanel.setVisible(false);
				
				
				
				JPanel infopropanel = new JPanel();
				background.add(infopropanel);
				infopropanel.setLayout(null);
				infopropanel.setBounds(400, 140, 950, 600);
				infopropanel.setBackground(Color.WHITE);
				infopropanel.setVisible(false);

				// panels for add button
				JPanel addpanel = new JPanel();
				background.add(addpanel);
				addpanel.setLayout(null);
				addpanel.setBounds(400, 140, 950, 600);
				addpanel.setBackground(Color.WHITE);
				addpanel.setVisible(false);

				// panels for update button
				JPanel upanel = new JPanel(); // for search panel
				JPanel u1panel = new JPanel(); // for update information panel
				background.add(upanel);
				upanel.setLayout(null);
				upanel.setBounds(400, 140, 950, 600);
				upanel.setBackground(Color.WHITE);
				upanel.setVisible(false);

				background.add(u1panel);
				u1panel.setLayout(null);
				u1panel.setBounds(400, 140, 950, 600);
				u1panel.setBackground(Color.WHITE);
				u1panel.setVisible(false);

				// panels for deletion panels
				JPanel dpanel = new JPanel();
				background.add(dpanel);
				dpanel.setLayout(null);
				dpanel.setBounds(400, 140, 950, 600);
				dpanel.setBackground(Color.WHITE);
				dpanel.setVisible(false);
				
				// panel for employee review
				JPanel reviewpanel = new JPanel();
				background.add(reviewpanel);
				reviewpanel.setLayout(null);
				reviewpanel.setBounds(400, 140, 950, 600);
				reviewpanel.setBackground(Color.WHITE);
				reviewpanel.setVisible(false);

				// panel for checking employee review
				JPanel reviewinpanel = new JPanel();
				background.add(reviewinpanel);
				reviewinpanel.setLayout(null);
				reviewinpanel.setBounds(400, 140, 950, 600);
				reviewinpanel.setBackground(Color.WHITE);
				reviewinpanel.setVisible(false);

				// panel for giving Feedback

				JPanel feedpanel1 = new JPanel();
				feedpanel1.setLayout(null);
				feedpanel1.setBounds(380, 140, 970, 620);
				feedpanel1.setBackground(Color.WHITE);
				background.add(feedpanel1);
				feedpanel1.setVisible(false);

				JPanel feedpanel = new JPanel();
				feedpanel.setLayout(null);
				feedpanel.setBounds(380, 140, 970, 620);
				feedpanel.setBackground(Color.WHITE);
				background.add(feedpanel);
				feedpanel.setVisible(false);

				// panel for ProjectDetails

				JPanel projectpanel = new JPanel();
				projectpanel.setLayout(null);
				projectpanel.setBounds(380, 140, 970, 620);
				projectpanel.setBackground(Color.WHITE);
				background.add(projectpanel);
				projectpanel.setVisible(false);
				
				JPanel payrollpanel = new JPanel();
				payrollpanel.setLayout(null);
				payrollpanel.setBounds(380, 140, 970, 620);
				payrollpanel.setBackground(Color.WHITE);
				background.add(payrollpanel);
				payrollpanel.setVisible(false);
				
				 JPanel leavepanel = new JPanel();
				  leavepanel.setLayout(null);
				  leavepanel.setBounds(250,80,1260,710);
				  leavepanel.setBackground(Color.WHITE);
				  background.add(leavepanel);
				  leavepanel.setVisible(false);
				// *********************************************************************************************************
				// ******************************************* button of the left
				// panel***************************
				
				JButton b1 = new JButton("Home");
				b1.setFont(f1);
				b1.setBounds(5, 140, 225, 50);
				b1.setBackground(Color.WHITE);
				b1.setBorder(new BevelBorder(BevelBorder.RAISED));
				b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				leftPanel.add(b1);
				
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

				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						leavepanel.setVisible(false);  
						epropanel.setVisible(false);
						
						homepanel.setVisible(true);
						
						
						
					
						
					}

				}

				);
				
				// button of the left panel

//        	       ****************************************************************************************************************************
//        	       EMPLOYEE INFO BUTTON
				JButton b2 = new JButton("Employee Info");
				leftPanel.add(b2);
				b2.setFont(f1);
				b2.setBounds(5, 190, 225, 50);
				b2.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b2.setBackground(Color.WHITE);
				b2.setBorder(new BevelBorder(BevelBorder.RAISED));
				b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				
				
				JLabel infoup = new JLabel("Employee Details");
				infoup.setHorizontalAlignment(JLabel.CENTER);
				infoup.setLayout(null);
				infoup.setBounds(0, 0, 950, 50);
				infoup.setForeground(Color.white);
				infoup.setOpaque(true);
				infoup.setBackground(new Color(0, 153, 115, 103));
				infoup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				epropanel.add(infoup);
				
				// label for Entering the EID
				JLabel Seid = new JLabel("Enter EID");
				Seid.setLayout(null);
				epropanel.add(Seid);
				Seid.setBounds(310, 340, 120, 30);
				Seid.setFont(new Font("Serif", Font.BOLD, 26));
//					 Seid.setBackground(255, 102, 102);

				// text field of teid
				JTextField teid = new JTextField();
				teid.setLayout(null);
				epropanel.add(teid);
				teid.setBounds(450, 340, 170, 30);
				teid.setFont(new Font("Serif", Font.BOLD, 26));
				teid.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 115,103)));

				// button for Searching
				JButton iSearch = new JButton("Search");
				iSearch.setLayout(null);
				epropanel.add(iSearch);
				iSearch.setBounds(365, 395, 190, 32);
				iSearch.setFont(new Font("Serif", Font.BOLD, 30));
				iSearch.setBackground(new Color(0, 153, 115));
				iSearch.setForeground(Color.WHITE);
				iSearch.setBorder(null);
				iSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


				JLabel eup = new JLabel("Employee Complete Information");
				eup.setHorizontalAlignment(JLabel.CENTER);
				eup.setLayout(null);
				eup.setBounds(0, 0, 950, 50);
				eup.setForeground(Color.white);
				eup.setOpaque(true);
				eup.setBackground(new Color(0, 153, 115, 103));
				eup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				infopropanel.add(eup);

				
				// label for Employee Name
				JLabel el2 = new JLabel("Employee Name :");
				infopropanel.add(el2);
				el2.setBounds(12, 80, 180, 30);
				el2.setFont(f1);
				

				// for label Employee Name
				JLabel efd2 = new JLabel();
				infopropanel.add(efd2);
				efd2.setBounds(200, 78, 190, 30);
//				efd2.setOpaque(true)
				efd2.setBorder(BorderFactory.createLineBorder(Color.black));
				efd2.setBackground(Color.WHITE);
				efd2.setFont(f1);
				
				// label l3 for the EMployee Department
				JLabel el3 = new JLabel("Department :");
				infopropanel.add(el3);
				el3.setBounds(12, 125, 460, 30);
				el3.setFont(f1);
				
				// text field efd3 for label Employee Department
				JLabel efd3 = new JLabel();
				infopropanel.add(efd3);
				efd3.setBounds(200, 123, 190, 30);
				efd3.setBackground(Color.WHITE);
				efd3.setBorder(BorderFactory.createLineBorder(Color.black));
				efd3.setFont(f1);
			

				// label el4 for the Employee Education
				JLabel el4 = new JLabel("Education :");
				infopropanel.add(el4);
				el4.setBounds(12, 170, 460, 30);
				el4.setFont(f1);
				
				// text field efd4 for labelEmployee Education
				JLabel efd4 = new JLabel();
				infopropanel.add(efd4);
				efd4.setBounds(200, 168, 190, 30);
				efd4.setBackground(Color.WHITE);
				efd4.setFont(f1);
				efd4.setBorder(BorderFactory.createLineBorder(Color.black));
				
				// label el5 for the Employee project
				JLabel el5 = new JLabel("Current Project :");
				infopropanel.add(el5);
				el5.setBounds(12, 215, 460, 30);
				el5.setFont(f1);
				
				// text field efd5
				JLabel efd5 = new JLabel();
				infopropanel.add(efd5);
				efd5.setBounds(200, 213, 190, 30);
				efd5.setBorder(BorderFactory.createLineBorder(Color.black));
				efd5.setBackground(Color.WHITE);
				efd5.setFont(f1);
				

				// label l6 for the Employee skills
				JLabel el6 = new JLabel("Employee Skills :");
				infopropanel.add(el6);
				el6.setBounds(12, 260, 460, 30);
				el6.setFont(f1);
								// text field efd6
				JLabel efd6 = new JLabel();
				infopropanel.add(efd6);
				efd6.setBounds(200, 258, 190, 30);
				efd6.setBackground(Color.WHITE);
				efd6.setBorder(BorderFactory.createLineBorder(Color.black));
				efd6.setFont(f1);
				

				// label l7 for the Employee lang
				JLabel el7 = new JLabel("Language Known :");
				infopropanel.add(el7);
				el7.setBounds(12, 305, 460, 30);
				el7.setFont(f1);
				
				// text field efd7
				JLabel efd7 = new JLabel();
				infopropanel.add(efd7);
				efd7.setBounds(200, 304, 190, 30);
				efd7.setBackground(Color.WHITE);
				efd7.setBorder(BorderFactory.createLineBorder(Color.black));
				efd7.setFont(f1);
				

				// label l8 for the Employee Contact
				JLabel el8 = new JLabel("Contact No :");
				infopropanel.add(el8);
				el8.setBounds(12, 350, 460, 30);
				el8.setFont(f1);
				
				// textfield efd8
				JLabel efd8 = new JLabel();
				infopropanel.add(efd8);
				efd8.setBounds(200, 348, 190, 30);
				efd8.setBorder(BorderFactory.createLineBorder(Color.black));
				efd8.setBackground(Color.WHITE);
				efd8.setFont(f1);
				

				// label l9 for the Employee Email address
				JLabel el9 = new JLabel("Email address :");
				infopropanel.add(el9);
				el9.setBounds(12, 395, 460, 30);
				el9.setFont(f1);
				
				// textfield efd9
				JLabel efd9 = new JLabel();
				infopropanel.add(efd9);
				efd9.setBounds(200, 393, 190, 30);
				efd9.setBackground(Color.WHITE);
				efd9.setBorder(BorderFactory.createLineBorder(Color.black));
				efd9.setFont(f1);
				

				// label l10 for the Employee Date of Joining
				JLabel el10 = new JLabel(" DOJ :");
				infopropanel.add(el10);
				el10.setBounds(12, 440, 460, 30);
				el10.setFont(f1);
		
				// text field efd10
				JLabel efd10 = new JLabel();
				infopropanel.add(efd10);
				efd10.setBounds(200, 438, 190, 30);
				efd10.setBackground(Color.WHITE);
				efd10.setBorder(BorderFactory.createLineBorder(Color.black));
				efd10.setFont(f1);
				

				// label l11 for the Employee Address
				JLabel el11 = new JLabel("House Address:");
				infopropanel.add(el11);
				el11.setBounds(12, 485, 460, 30);
				el11.setFont(f1);
				
				// text field efd11
				JLabel efd11 = new JLabel();
				infopropanel.add(efd11);
				efd11.setBorder(BorderFactory.createLineBorder(Color.black));
				efd11.setBounds(200, 483, 190, 30);
				efd11.setBackground(Color.WHITE);
				efd11.setFont(f1);
				

				// label l12 for the Employee ID
				JLabel el12 = new JLabel("Employee Id:");
				infopropanel.add(el12);
				el12.setBounds(600, 210, 300, 60);
				el12.setFont(f3);
				el12.setForeground(Color.RED);
				
				// text field efd12
				JLabel efd12 = new JLabel();
				infopropanel.add(efd12);
				efd12.setHorizontalAlignment(JLabel.CENTER);
				efd12.setBounds(570, 280, 280, 30);
				efd12.setBackground(Color.WHITE);
				efd12.setForeground(new Color(0, 204, 204));
				efd12.setFont(f3);
				
				// label for Employee salary
				JLabel el1 = new JLabel("Net Salary");
				infopropanel.add(el1);
				el1.setBounds(12, 530, 460, 30);
				el1.setFont(f1);
				
				// label for Employee salary
				JLabel efdl1 = new JLabel();
				infopropanel.add(efdl1);
				efdl1.setBorder(BorderFactory.createLineBorder(Color.black));
				efdl1.setBounds(200, 530, 190, 30);
				efdl1.setFont(f1);
				
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
						  
						epropanel.setVisible(true);
						teid.setText(null);
						// background Image.
						ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminEmp_img.png"));
						Image img = bg_image.getImage();
						Image temp_img = img.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
						bg_image = new ImageIcon(temp_img);
						JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
						logo.setLayout(null);
						logo.setBounds(380, 120, 170, 170);
						epropanel.add(logo);

						iSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								try {

									String uid = teid.getText();
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection(
											"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
									PreparedStatement q = conn
											.prepareStatement("select * from employeedetails where empid=?");
									q.setString(1, uid);
									ResultSet r = q.executeQuery();
									if (r.next()) {

										epropanel.setVisible(false);
										infopropanel.setVisible(false);
										addpanel.setVisible(false);
										upanel.setVisible(false);
										u1panel.setVisible(false);
										dpanel.setVisible(false);
										reviewpanel.setVisible(false);
										reviewinpanel.setVisible(false);
										feedpanel1.setVisible(false);
										feedpanel.setVisible(false);
										projectpanel.setVisible(false);
										payrollpanel.setVisible(false);
										  leavepanel.setVisible(false);
										  homepanel.setVisible(false);

										infopropanel.setVisible(true);
										efd2.setText(r.getString("empName"));
										efd3.setText(r.getString("Dept"));
										efd4.setText(r.getString("Education"));
										efd5.setText(r.getString("CurrentProject"));
										efd6.setText(r.getString("EmployeeSkills"));
										efd7.setText(r.getString("language"));
										efd8.setText(String.valueOf(r.getInt("ContactNo")));
										efd9.setText(r.getString("EmailAdd"));
										efd10.setText(r.getString("Doj"));
										efd11.setText(r.getString("House_add"));
										efd12.setText(r.getString("empid"));
										efdl1.setText(r.getString("salary"));

									}
									else
									{
										JOptionPane.showMessageDialog(fr, "Enter Valid Id", "Message",JOptionPane.INFORMATION_MESSAGE);

									}
								} catch (Exception e) {
									System.out.println(e);
								}
							}
						});

					}

				}

				);
				// *********************************************************************************************************************
				// ADD BUTTON
				JButton b3 = new JButton("Add Employee");
				leftPanel.add(b3);
				b3.setFont(f1);
				b3.setBounds(5, 240, 225, 50);
				b3.setBorder(new MatteBorder(0, 0, 8, 0, Color.PINK));
				b3.setBackground(Color.WHITE);
				b3.setBorder(new BevelBorder(BevelBorder.RAISED));
				b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel addup = new JLabel("Add Employee");
				addup.setHorizontalAlignment(JLabel.CENTER);
				addup.setLayout(null);
				addup.setBounds(0, 0, 950, 50);
				addup.setForeground(Color.white);
				addup.setOpaque(true);
				addup.setBackground(new Color(0, 153, 115, 103));
				addup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				addpanel.add(addup);

				// label for Employee Name
				JLabel al2 = new JLabel("Employee Name :");
				addpanel.add(al2);
				al2.setBounds(12, 80, 460, 30);
				al2.setFont(f1);
				

				// textfield for label Employee Name
				JTextField afd2 = new JTextField();
				addpanel.add(afd2);
				afd2.setBounds(200, 78, 190, 30);
				afd2.setBackground(Color.WHITE);
				afd2.setFont(f2);
				afd2.setBorder(BorderFactory.createLineBorder(Color.black));
				// label al3 for the EMployee Department
				JLabel al3 = new JLabel("Department :");
				addpanel.add(al3);
				al3.setBounds(12, 125, 460, 30);
				al3.setFont(f1);
				
				// text field afd3 for label Employee Department
				JTextField afd3 = new JTextField();
				addpanel.add(afd3);
				afd3.setBounds(200, 123, 190, 30);
				afd3.setBackground(Color.WHITE);
				afd3.setFont(f2);
				afd3.setBorder(BorderFactory.createLineBorder(Color.black));
				
				// label eal4 for the Employee Education
				JLabel eal4 = new JLabel("Education :");
				addpanel.add(eal4);
				eal4.setBounds(12, 170, 460, 30);
				eal4.setFont(f1);
				
				// text field afd4 for labelEmployee Education
				JTextField afd4 = new JTextField();
				addpanel.add(afd4);
				afd4.setBounds(200, 168, 190, 30);
				afd4.setBackground(Color.WHITE);
				afd4.setFont(f2);
				afd4.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al5 for the Employee project
				JLabel al5 = new JLabel("Current Project :");
				addpanel.add(al5);
				al5.setBounds(12, 215, 460, 30);
				al5.setFont(f1);
				
				// text field afd5
				JTextField afd5 = new JTextField();
				addpanel.add(afd5);
				afd5.setBounds(200, 213, 190, 30);
				afd5.setBackground(Color.WHITE);
				afd5.setFont(f2);
				afd5.setBorder(BorderFactory.createLineBorder(Color.black));
				
				// label al6 for the Employee skills
				JLabel al6 = new JLabel("Employee Skills :");
				addpanel.add(al6);
				al6.setBounds(12, 260, 460, 30);
				al6.setFont(f1);
				
				// text field afd6
				JTextField afd6 = new JTextField();
				addpanel.add(afd6);
				afd6.setBounds(200, 258, 190, 30);
				afd6.setBackground(Color.WHITE);
				afd6.setFont(f2);
				afd6.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al7 for the Employee lang
				JLabel al7 = new JLabel("Language Known :");
				addpanel.add(al7);
				al7.setBounds(12, 305, 460, 30);
				al7.setFont(f1);
				
				// text field afd7
				JTextField afd7 = new JTextField();
				addpanel.add(afd7);
				afd7.setBounds(200, 304, 190, 30);
				afd7.setBackground(Color.WHITE);
				afd7.setFont(f2);
				afd7.setBorder(BorderFactory.createLineBorder(Color.black));

				// lable al8 for the Employee Contact
				JLabel al8 = new JLabel("Contact No :");
				addpanel.add(al8);
				al8.setBounds(12, 350, 460, 30);
				al8.setFont(f1);
			
				// textfield afd8
				JTextField afd8 = new JTextField();
				addpanel.add(afd8);
				afd8.setBounds(200, 348, 190, 30);
				afd8.setBackground(Color.WHITE);
				afd8.setFont(f2);
				afd8.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al9 for the Employee Email address
				JLabel al9 = new JLabel("Email address :");
				addpanel.add(al9);
				al9.setBounds(12, 395, 460, 30);
				al9.setFont(f1);
				
				// textfield afd9
				JTextField afd9 = new JTextField();
				addpanel.add(afd9);
				afd9.setBounds(200, 393, 190, 30);
				afd9.setBackground(Color.WHITE);
				afd9.setFont(f2);
				afd9.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al10 for the Employee Date of Joining
				JLabel al10 = new JLabel("Your DOJ :");
				addpanel.add(al10);
				al10.setBounds(12, 440, 460, 30);
				al10.setFont(f1);
				
				// text field afd10
				JTextField afd10 = new JTextField();
				addpanel.add(afd10);
				afd10.setBounds(200, 438, 190, 30);
				afd10.setBackground(Color.WHITE);
				afd10.setFont(f2);
				afd10.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al11 for the Employee Address
				JLabel al11 = new JLabel("House Address:");
				addpanel.add(al11);
				al11.setBounds(12, 485, 460, 30);
				al11.setFont(f1);
				
				// text field afd11
				JTextField afd11 = new JTextField();
				addpanel.add(afd11);
				afd11.setBounds(200, 483, 190, 30);
				afd11.setBackground(Color.WHITE);
				afd11.setFont(f2);
				afd11.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al12 for the Employee ID
				JLabel al12 = new JLabel("Employee Id:");
				addpanel.add(al12);
				al12.setBounds(570, 210, 300, 60);
				al12.setFont(f1);
				al12.setForeground(Color.RED);
				// text field afd12
				JTextField afd12 = new JTextField();
				addpanel.add(afd12);
				afd12.setBounds(570, 280, 280, 30);
				afd12.setBackground(Color.WHITE);
				afd12.setForeground(new Color(0, 204, 204));
				afd12.setFont(f1);
				afd12.setBorder(BorderFactory.createLineBorder(Color.black));

				// label al12 for the Employee password
				JLabel al13 = new JLabel("Employee password:");
				addpanel.add(al13);
				al13.setBounds(570, 320, 300, 60);
				al13.setFont(f1);
				al13.setForeground(Color.RED);

				// text field afd12
				JTextField afd13 = new JTextField();
				addpanel.add(afd13);
				afd13.setBounds(570, 390, 280, 30);
				afd13.setBackground(Color.WHITE);
				afd13.setForeground(new Color(0, 204, 204));
				afd13.setFont(f1);
				afd13.setBorder(BorderFactory.createLineBorder(Color.black));
				
				// label al12 for the Employee password
				JLabel al14 = new JLabel("Employee Salary:");
				addpanel.add(al14);
				al14.setBounds(570, 120, 300, 60);
				al14.setFont(f1);
				al14.setForeground(Color.RED);

				// text field afd12
				JTextField afd14 = new JTextField();
				addpanel.add(afd14);
				afd14.setBounds(570, 180, 280, 30);
				afd14.setBackground(Color.WHITE);
				afd14.setForeground(new Color(0, 204, 204));
				afd14.setFont(f1);
				afd14.setBorder(BorderFactory.createLineBorder(Color.black));
				
				// BUTTON FOR ADD EMPLOYEE
				JButton addbt = new JButton("Add Employee");

				addbt.setLayout(null);
				addpanel.add(addbt);
				addbt.setBounds(560, 470, 260, 36);
				addbt.setFont(new Font("Serif", Font.BOLD, 30));
				addbt.setBackground(new Color(255, 102, 102));
				addbt.setForeground(Color.WHITE);
				addbt.setBorder(null);
				addbt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						afd2.setText(null);
						afd3.setText(null);
						afd4.setText(null);
						afd5.setText(null);
						afd6.setText(null);
						afd7.setText(null);
						afd8.setText(null);
						afd9.setText(null);
						afd10.setText(null);
						afd11.setText(null);
						afd12.setText(null);
						afd13.setText(null);
						afd14.setText(null);
						
						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
						
						addpanel.setVisible(true);

						addbt.addActionListener(new ActionListener() {

							public void actionPerformed(ActionEvent arg0) {
								
								try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection(
											"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
									PreparedStatement q = conn.prepareStatement(
											"insert into employeedetails values(?,?,?,?,?,?,?,?,?,?,?,?,?);");
									q.setString(1, afd12.getText());
									q.setString(2, afd13.getText());
									q.setString(3, afd2.getText());
									q.setString(4, afd3.getText());
									q.setString(5, afd4.getText());
									q.setString(6, afd5.getText());
									q.setString(7, afd6.getText());
									q.setString(8, afd7.getText());
									q.setString(9, afd8.getText());
									q.setString(10, afd9.getText());
									q.setString(11, afd10.getText());
									q.setString(12, afd11.getText());
									q.setString(13, afd14.getText());

									int x = q.executeUpdate();
									if (x > 0) {
										addpanel.setVisible(false);

										System.out.println("yes");
										JOptionPane.showMessageDialog(fr, "Employee Added Successfully", "Message",JOptionPane.INFORMATION_MESSAGE);

									}
									
								} catch (Exception e) {
									JOptionPane.showMessageDialog(fr, "You have entered Duplicate ID", "Alert",JOptionPane.INFORMATION_MESSAGE);
									System.out.println(e);
								}
							}
						}

						);

					}
				});

				
				// ####################################################################
				// UPDATE BUTTON
				
				JButton b4 = new JButton("Update data");
				leftPanel.add(b4);
				b4.setFont(f1);
				b4.setBounds(5, 290, 225, 50);
				b4.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b4.setBackground(Color.WHITE);
				b4.setBorder(new BevelBorder(BevelBorder.RAISED));
				b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				
				JLabel updateup = new JLabel("Update Employee Data");
				updateup.setHorizontalAlignment(JLabel.CENTER);
				updateup.setLayout(null);
				updateup.setBounds(0, 0, 950, 50);
				updateup.setForeground(Color.white);
				updateup.setOpaque(true);
				updateup.setBackground(new Color(0, 153, 115, 103));
				updateup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				upanel.add(updateup);
				
				// label for Entering the EID
				JLabel uSeid = new JLabel("Enter EID");
				uSeid.setLayout(null);
				upanel.add(uSeid);
				uSeid.setBounds(310, 340, 120, 30);
				uSeid.setFont(new Font("Serif", Font.BOLD, 26));
//				 Seid.setBackground(255, 102, 102);
				// text field of Seid
				JTextField uteid = new JTextField();
				uteid.setLayout(null);
				upanel.add(uteid);
				uteid.setBounds(450, 340, 170, 30);
				uteid.setFont(new Font("Serif", Font.BOLD, 26));
				uteid.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 115, 103)));

				// button for Searching
				JButton uSearch = new JButton("Search");
				uSearch.setLayout(null);
				upanel.add(uSearch);
				uSearch.setBounds(365, 395, 190, 32);
				uSearch.setFont(new Font("Serif", Font.BOLD, 30));
				uSearch.setBackground(new Color(0, 153, 115));
				uSearch.setForeground(Color.WHITE);
				uSearch.setBorder(null);
				uSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				// Label for Employee Profile
				JLabel ul1 = new JLabel("Update Employee Profile");
				u1panel.add(ul1);
				ul1.setBounds(4, 4, 946, 30);
				ul1.setFont(f);
				ul1.setBorder(new MatteBorder(0, 0, 2, 0, new Color(0, 204, 204)));

				// label for Employee Name
				JLabel ul2 = new JLabel("Employee Name :");
				u1panel.add(ul2);
				ul2.setBounds(12, 80, 460, 30);
				ul2.setFont(f1);
				ul2.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));

				// textfield for label Employee Name
				JTextField ufd2 = new JTextField();
				u1panel.add(ufd2);
				ufd2.setBounds(200, 78, 190, 30);
				ufd2.setBackground(Color.WHITE);
				ufd2.setFont(f2);
				ufd2.setBorder(null);

				// label l3 for the EMployee Department
				JLabel ul3 = new JLabel("Department :");
				u1panel.add(ul3);
				ul3.setBounds(12, 125, 460, 30);
				ul3.setFont(f1);
				ul3.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd3 for label Employee Department
				JTextField ufd3 = new JTextField();
				u1panel.add(ufd3);
				ufd3.setBounds(200, 123, 190, 30);
				ufd3.setBackground(Color.WHITE);
				ufd3.setFont(f2);
				ufd3.setBorder(null);

				// label el4 for the Employee Education
				JLabel ul4 = new JLabel("Education :");
				u1panel.add(ul4);
				ul4.setBounds(12, 170, 460, 30);
				ul4.setFont(f1);
				ul4.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd4 for labelEmployee Education
				JTextField ufd4 = new JTextField();
				u1panel.add(ufd4);
				ufd4.setBounds(200, 168, 190, 30);
				ufd4.setBackground(Color.WHITE);
				ufd4.setFont(f2);
				ufd4.setBorder(null);

				// label ul5 for the Employee project
				JLabel ul5 = new JLabel("Current Project :");
				u1panel.add(ul5);
				ul5.setBounds(12, 215, 460, 30);
				ul5.setFont(f1);
				ul5.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd5
				JTextField ufd5 = new JTextField();
				u1panel.add(ufd5);
				ufd5.setBounds(200, 213, 190, 30);
				ufd5.setBackground(Color.WHITE);
				ufd5.setFont(f2);
				ufd5.setBorder(null);

				// label l6 for the Employee skills
				JLabel ul6 = new JLabel("Employee Skills :");
				u1panel.add(ul6);
				ul6.setBounds(12, 260, 460, 30);
				ul6.setFont(f1);
				ul6.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd6
				JTextField ufd6 = new JTextField();
				u1panel.add(ufd6);
				ufd6.setBounds(200, 258, 190, 30);
				ufd6.setBackground(Color.WHITE);
				ufd6.setFont(f2);
				ufd6.setBorder(null);

				// label l7 for the Employee lang
				JLabel ul7 = new JLabel("Language Known :");
				u1panel.add(ul7);
				ul7.setBounds(12, 305, 460, 30);
				ul7.setFont(f1);
				ul7.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd7
				JTextField ufd7 = new JTextField();
				u1panel.add(ufd7);
				ufd7.setBounds(200, 304, 190, 30);
				ufd7.setBackground(Color.WHITE);
				ufd7.setFont(f2);
				ufd7.setBorder(null);

				// lable l8 for the Employee Contact
				JLabel ul8 = new JLabel("Contact No :");
				u1panel.add(ul8);
				ul8.setBounds(12, 350, 460, 30);
				ul8.setFont(f1);
				ul8.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// textfield ufd8
				JTextField ufd8 = new JTextField();
				u1panel.add(ufd8);
				ufd8.setBounds(200, 348, 190, 30);
				ufd8.setBackground(Color.WHITE);
				ufd8.setFont(f2);
				ufd8.setBorder(null);

				// label l9 for the Employee Email address
				JLabel ul9 = new JLabel("Email address :");
				u1panel.add(ul9);
				ul9.setBounds(12, 395, 460, 30);
				ul9.setFont(f1);
				ul9.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// textfield ufd9
				JTextField ufd9 = new JTextField();
				u1panel.add(ufd9);
				ufd9.setBounds(200, 393, 190, 30);
				ufd9.setBackground(Color.WHITE);
				ufd9.setFont(f2);
				ufd9.setBorder(null);

				// label l10 for the Employee Date of Joining
				JLabel ul10 = new JLabel("Your DOJ :");
				u1panel.add(ul10);
				ul10.setBounds(12, 440, 460, 30);
				ul10.setFont(f1);
				ul10.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd10
				JTextField ufd10 = new JTextField();
				u1panel.add(ufd10);
				ufd10.setBounds(200, 438, 190, 30);
				ufd10.setBackground(Color.WHITE);
				ufd10.setFont(f2);
				ufd10.setBorder(null);

				// label l11 for the Employee Address
				JLabel ul11 = new JLabel("House Address:");
				u1panel.add(ul11);
				ul11.setBounds(12, 485, 460, 30);
				ul11.setFont(f1);
				ul11.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				// text field ufd11
				JTextField ufd11 = new JTextField();
				u1panel.add(ufd11);
				ufd11.setBounds(200, 483, 190, 30);
				ufd11.setBackground(Color.WHITE);
				ufd11.setFont(f2);
				ufd11.setBorder(null);
				
				

				// label l12 for the Employee ID
				JLabel ul12 = new JLabel("Employee Id:");
				u1panel.add(ul12);
				ul12.setBounds(570, 210, 300, 60);
				ul12.setFont(f3);
				ul12.setForeground(Color.RED);
				// text field ufd12
				JTextField ufd12 = new JTextField();
				u1panel.add(ufd12);
				ufd12.setBounds(570, 280, 280, 30);
				ufd12.setBackground(Color.WHITE);
				ufd12.setForeground(new Color(0, 204, 204));
				ufd12.setFont(f3);
				ufd12.setBorder(new MatteBorder(0, 0, 2, 0, new Color(0, 204, 204)));
				
				
				// label for Employee salary
				JLabel ul13 = new JLabel("Net Salary");
				u1panel.add(ul13);
				ul13.setBounds(12, 530, 460, 30);
				ul13.setBorder(new MatteBorder(0, 0, 2, 0, new Color(224, 235, 235)));
				ul13.setFont(f1);
				
				// label for Employee salary
				JTextField ufd13 = new JTextField();
				u1panel.add(ufd13);
				ufd13.setBounds(200, 530, 190, 30);
				ufd13.setFont(f2);
				

				JButton upbt = new JButton("Update Data");
				upbt.setLayout(null);
				u1panel.add(upbt);
				upbt.setBounds(560, 470, 260, 36);
				upbt.setFont(new Font("Serif", Font.BOLD, 30));
				upbt.setBackground(new Color(255, 102, 102));
				upbt.setForeground(Color.WHITE);
				upbt.setBorder(null);
				upbt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
						
						upanel.setVisible(true);
						uteid.setText(null);
						// background Image.
						ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminEmp_img.png"));
						Image img = bg_image.getImage();
						Image temp_img = img.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
						bg_image = new ImageIcon(temp_img);
						JLabel ulogo = new JLabel("", bg_image, JLabel.CENTER);
						ulogo.setLayout(null);
						ulogo.setBounds(380, 120, 170, 170);
						upanel.add(ulogo);

						uSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								try {
									String uuid = uteid.getText();
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection(
											"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
									PreparedStatement q = conn
											.prepareStatement("select * from employeedetails where empid=?");
									q.setString(1, uuid);
									ResultSet r = q.executeQuery();
									while (r.next()) {
										epropanel.setVisible(false);
										infopropanel.setVisible(false);
										addpanel.setVisible(false);
										upanel.setVisible(false);
										u1panel.setVisible(false);
										dpanel.setVisible(false);
										reviewpanel.setVisible(false);
										reviewinpanel.setVisible(false);
										feedpanel1.setVisible(false);
										feedpanel.setVisible(false);
										projectpanel.setVisible(false);
										payrollpanel.setVisible(false);
										  leavepanel.setVisible(false);
										  homepanel.setVisible(false);
										
										u1panel.setVisible(true);

										ufd2.setText(r.getString("empName"));
										ufd3.setText(r.getString("Dept"));
										ufd4.setText(r.getString("Education"));
										ufd5.setText(r.getString("CurrentProject"));
										ufd6.setText(r.getString("EmployeeSkills"));
										ufd7.setText(r.getString("language"));
										ufd8.setText(r.getString("ContactNo"));
										ufd9.setText(r.getString("EmailAdd"));
										ufd10.setText(r.getString("Doj"));
										ufd11.setText(r.getString("House_add"));
										ufd12.setText(r.getString("empid"));
										ufd13.setText(r.getString("Salary"));
										
										upbt.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) 
											{
												try {
                                                      
													Class.forName("com.mysql.cj.jdbc.Driver");
													Connection conn = DriverManager.getConnection(
															"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC",
															"root", "");
													PreparedStatement q = conn.prepareStatement("UPDATE employeedetails  set empName=?,Dept=?,Education=?,CurrentProject=?,EmployeeSkills=?,language=?,ContactNo=?,EmailAdd=?,Doj=?,House_add=?,Salary=?,empid=? where empid=?");
													q.setString(12, ufd12.getText());
													q.setString(1, ufd2.getText());
													q.setString(2, ufd3.getText());
													q.setString(3, ufd4.getText());
													q.setString(4, ufd5.getText());
													q.setString(5, ufd6.getText());
													q.setString(6, ufd7.getText());
													q.setString(7, ufd8.getText());
													q.setString(8, ufd9.getText());
													q.setString(9, ufd10.getText());
													q.setString(10, ufd11.getText());
													q.setString(11, ufd13.getText());
											        q.setString(13, uteid.getText());
													int x = q.executeUpdate();
													if (x > 0) {
														JOptionPane.showMessageDialog(fr,
																"Employee Data updated Succesfully", "Message",
																JOptionPane.INFORMATION_MESSAGE);
														u1panel.setVisible(false);
														upanel.setVisible(true);
														System.out.println("yes");
														uteid.setText(null);

													}
												} catch (Exception e) {
													JOptionPane.showMessageDialog(fr,"Some Error Occured", "ALert",JOptionPane.INFORMATION_MESSAGE);
													System.out.println(e);
												}
											}
										});
									}
								} catch (Exception e) {
									System.out.println(e);
								}
							}

							private String StringvalueOf(int int1) {
								// TODO Auto-generated method stub
								return null;
							}
						});

					}

				}

				);
//	       *****************************************************************************************************
//	       REMOVE BUTTONwwW
				JButton b5 = new JButton("Remove Employee");
				leftPanel.add(b5);
				b5.setFont(f1);
				b5.setBounds(5, 340, 225, 50);
				b5.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b5.setBackground(Color.WHITE);
				b5.setBorder(new BevelBorder(BevelBorder.RAISED));
				b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel removeup = new JLabel("Remove Employee Data");
				removeup.setHorizontalAlignment(JLabel.CENTER);
				removeup.setLayout(null);
				removeup.setBounds(0, 0, 950, 50);
				removeup.setForeground(Color.white);
				removeup.setOpaque(true);
				removeup.setBackground(new Color(0, 153, 115, 103));
				removeup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				dpanel.add(removeup);

				// label for Entering the EID
				JLabel dSeid = new JLabel("Enter EID");
				dSeid.setLayout(null);
				dpanel.add(dSeid);
				dSeid.setBounds(310, 340, 120, 30);
				dSeid.setFont(new Font("Serif", Font.BOLD, 26));
//				 Seid.setBackground(255, 102, 102);
				// text field of Seid
				JTextField dteid = new JTextField();
				dteid.setLayout(null);
				dpanel.add(dteid);
				dteid.setBounds(450, 340, 170, 30);
				dteid.setFont(new Font("Serif", Font.BOLD, 26));
				dteid.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 115, 103)));

				// button for Searching
				JButton rm = new JButton("Delete");
				rm.setLayout(null);
				dpanel.add(rm);
				rm.setBounds(365, 395, 190, 32);
				rm.setFont(new Font("Serif", Font.BOLD, 30));
				rm.setBackground(new Color(0, 153, 115));
				rm.setForeground(Color.WHITE);
				rm.setBorder(null);
				rm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
			
						dpanel.setVisible(true);
						dteid.setText(null);

						// background Image.
						ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminEmp_img.png"));
						Image img = bg_image.getImage();
						Image temp_img = img.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
						bg_image = new ImageIcon(temp_img);
						JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
						logo.setLayout(null);
						logo.setBounds(380, 120, 170, 170);
						dpanel.add(logo);

						rm.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								try {
									String duid = dteid.getText();
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
									PreparedStatement q = conn
											.prepareStatement("Delete From employeeDetails where empid=?");
									q.setString(1, duid);
									int x = q.executeUpdate();
									if (x > 0) {
										System.out.println("removed");
										JOptionPane.showMessageDialog(fr, "Employee Removed Succesfully", "Message",JOptionPane.INFORMATION_MESSAGE);
										
									}
								} 
								catch (Exception e) {
									JOptionPane.showMessageDialog(fr, "Wrong ID entered Try again", "Alert",JOptionPane.INFORMATION_MESSAGE);
									System.out.println(e);
								}
							}
						});

					}

				}

				);
//				  *************************************************GIVING FEEDBACK********************************

				JButton b6 = new JButton(" Give Feedback");
				leftPanel.add(b6);
				b6.setFont(f1);
				b6.setBounds(5, 390, 225, 50);
				b6.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b6.setBackground(Color.WHITE);
				b6.setBorder(new BevelBorder(BevelBorder.RAISED));
				b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				JLabel b6up = new JLabel("Evaluate Your Employee");
				b6up.setHorizontalAlignment(JLabel.CENTER);
				b6up.setLayout(null);
				b6up.setBounds(0, 0, 970, 50);
				b6up.setForeground(Color.white);
				b6up.setOpaque(true);
				b6up.setBackground(new Color(0, 153, 115, 103));
				b6up.setFont(new Font("DIALOG", Font.PLAIN, 29));
				feedpanel1.add(b6up);
				// label for Entering the EID

				
				JLabel geid = new JLabel("Enter EID");
				geid.setLayout(null);
				feedpanel1.add(geid);
				geid.setBounds(310, 340, 120, 30);
				geid.setFont(new Font("Serif", Font.BOLD, 26));
//			 reid.setBackground(255, 102, 102);

				// text field of gteid
				JTextField gteid = new JTextField();
				gteid.setLayout(null);
				feedpanel1.add(gteid);
				gteid.setBounds(450, 340, 170, 30);
				gteid.setFont(new Font("Serif", Font.BOLD, 26));
				gteid.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 115,103)));

				// button for Searching
				JButton gSearch = new JButton("Search");
				gSearch.setLayout(null);
				feedpanel1.add(gSearch);
				gSearch.setBounds(365, 395, 190, 32);
				gSearch.setFont(new Font("Serif", Font.BOLD, 30));
				gSearch.setBackground(new Color(0, 153, 115));
				gSearch.setForeground(Color.WHITE);
				gSearch.setBorder(null);
				gSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel gfb0 = new JLabel("Employee id");
				gfb0.setBounds(10, 30, 150, 40);
				gfb0.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb0.setForeground(new Color(30, 123, 123));
				gfb0.setFont(f1);
				feedpanel.add(gfb0);

				JLabel gfd0 = new JLabel();
				gfd0.setBounds(170, 30, 150, 40);
				gfd0.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfd0.setForeground(new Color(30, 123, 123));
				gfd0.setFont(f1);
				feedpanel.add(gfd0);
				
				JLabel gfb1 = new JLabel("Workspace Behaviour");
				gfb1.setBounds(420, 30, 250, 40);
				gfb1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb1.setForeground(new Color(30, 123, 123));
				gfb1.setFont(f1);

				JSlider gsl1 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
				gsl1.setBounds(680, 30, 200, 40);
				gsl1.setBackground(Color.white);
				gsl1.setMajorTickSpacing(1);
				gsl1.setPaintTicks(true);
				gsl1.setPaintLabels(true);
				gsl1.setForeground(Color.black);

				JLabel gsl1value = new JLabel();
				gsl1value.setBounds(890, 30, 100, 40);
				gsl1value.setFont(new Font("DIALOG", Font.PLAIN, 17));

				gsl1.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						JSlider gs1source = (JSlider) e.getSource();
						gsl1.setForeground(Color.RED);
						gsl1value.setText("Rated :" + gs1source.getValue());
					}
				});
				feedpanel.add(gsl1value);
				feedpanel.add(gsl1);
				feedpanel.add(gfb1);
				JLabel gfb2 = new JLabel("Leading Skill");
				gfb2.setBounds(420, 90, 250, 40);
				gfb2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb2.setForeground(new Color(30, 123, 123));
				gfb2.setFont(f1);

				JSlider gsl2 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
				gsl2.setBounds(680, 90, 200, 40);
				gsl2.setBackground(Color.white);
				gsl2.setMajorTickSpacing(1);
				gsl2.setPaintTicks(true);
				gsl2.setPaintLabels(true);
				gsl2.setForeground(Color.black);

				JLabel gsl2value = new JLabel();
				gsl2value.setBounds(890, 90, 100, 40);
				gsl2value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				gsl2.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						JSlider gs2source = (JSlider) e.getSource();
						gsl2.setForeground(Color.RED);
						gsl2value.setText("Rated :" + gs2source.getValue());
					}
				});
				feedpanel.add(gsl2value);
				feedpanel.add(gsl2);
				feedpanel.add(gfb2);
//		     ***************feedback Growth Opprounties**************************** 
				JLabel gfb3 = new JLabel("Developing Approach");
				gfb3.setBounds(420, 150, 250, 40);
				gfb3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb3.setForeground(new Color(30, 123, 123));
				gfb3.setFont(f1);

			    JSlider gsl3 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
				gsl3.setBounds(680, 150, 200, 40);
				gsl3.setBackground(Color.white);
				gsl3.setMajorTickSpacing(1);
				gsl3.setPaintTicks(true);
				gsl3.setPaintLabels(true);
				gsl3.setForeground(Color.black);

				JLabel gsl3value = new JLabel();
				gsl3value.setBounds(890, 150, 100, 40);
				gsl3value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				gsl3.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						JSlider s3source = (JSlider) e.getSource();
						gsl3.setForeground(Color.RED);
						gsl3value.setText("Rated :" + s3source.getValue());
					}
				});
				feedpanel.add(gsl3value);
				feedpanel.add(gsl3);
				feedpanel.add(gfb3);

				// ************** Work From Home****************************
				JLabel gfb4 = new JLabel("Overall Growth");
				gfb4.setBounds(420, 210, 250, 40);
				gfb4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb4.setForeground(new Color(30, 123, 123));
				gfb4.setFont(f1);

				JSlider gsl4 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
				gsl4.setBounds(680, 210, 200, 40);
				gsl4.setBackground(Color.white);
				gsl4.setMajorTickSpacing(1);
				gsl4.setPaintTicks(true);
				gsl4.setPaintLabels(true);
				gsl4.setForeground(Color.black);

				JLabel gsl4value = new JLabel();
				gsl4value.setBounds(890, 210, 100, 40);
				gsl4value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				gsl4.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						JSlider gsl4source = (JSlider) e.getSource();
						gsl4.setForeground(Color.RED);
						gsl4value.setText("Rated :" + gsl4source.getValue());
					}
				});
				feedpanel.add(gsl4value);
				feedpanel.add(gsl4);
				feedpanel.add(gfb4);
				// ************** Overall Job Stasification***************************
				JLabel gfb5 = new JLabel("Overall Rating");
				gfb5.setBounds(420, 270, 250, 40);
				gfb5.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb5.setForeground(new Color(30, 123, 123));
				gfb5.setFont(f1);

				JSlider gsl5 = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
				gsl5.setBounds(680, 270, 200, 40);
				gsl5.setBackground(Color.white);
				gsl5.setMajorTickSpacing(1);
				gsl5.setPaintTicks(true);
				gsl5.setPaintLabels(true);
				gsl5.setForeground(Color.black);

				JLabel gsl5value = new JLabel();
				gsl5value.setBounds(890, 270, 100, 40);
				gsl5value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				gsl5.addChangeListener(new ChangeListener()

				{
					@Override
					public void stateChanged(ChangeEvent e) {
						JSlider gsl5source = (JSlider) e.getSource();
						gsl5.setForeground(Color.RED);
						gsl5value.setText("Rated :" + gsl5source.getValue());
					}
				});
				feedpanel.add(gsl5value);
				feedpanel.add(gsl5);
				feedpanel.add(gfb5);

//	       ***********Text box for any remark********

				JLabel gfb6 = new JLabel("**Any Remark for Employee");
				gfb6.setBounds(420, 330, 480, 20);
				feedpanel.add(gfb6);

				JTextArea gfb7 = new JTextArea();
				gfb7.setBounds(420, 350, 480, 150);
				gfb7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				gfb7.setBackground(new Color(234, 250, 250));
				feedpanel.add(gfb7);

				JButton gfsub = new JButton("Submit Feedback");
				gfsub.setBounds(520, 560, 200, 40);
				gfsub.setBackground(new Color(0, 153, 115));
				gfsub.setForeground(Color.WHITE);
				gfsub.setFont(f1);
				feedpanel.add(gfsub);
				b6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						gteid.setText(null);
						reviewinpanel.setVisible(false);
						reviewpanel.setVisible(false);
						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
				
						feedpanel1.setVisible(true);
						
					
						// background Image.
						ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminEmp_img.png"));
						Image img = bg_image.getImage();
						Image temp_img = img.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
						bg_image = new ImageIcon(temp_img);
						JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
						logo.setLayout(null);
						logo.setBounds(380, 120, 170, 170);
						feedpanel1.add(logo);

						gSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								gfd0.setText(gteid.getText());
								gsl1.setValue(0);
								gsl2.setValue(0);
								gsl3.setValue(0);
								gsl4.setValue(0);
								gsl5.setValue(0);
								gsl1value.setText(null);
								gsl2value.setText(null);
								gsl3value.setText(null);
								gsl4value.setText(null);
								gsl5value.setText(null);
								gfb7.setText(null);
								
								gsl1.setForeground(Color.black);
								gsl2.setForeground(Color.black);
								gsl3.setForeground(Color.black);
								gsl4.setForeground(Color.black);
								gsl5.setForeground(Color.black);
								epropanel.setVisible(false);
								infopropanel.setVisible(false);
								addpanel.setVisible(false);
								upanel.setVisible(false);
								u1panel.setVisible(false);
								dpanel.setVisible(false);
								reviewpanel.setVisible(false);
								reviewinpanel.setVisible(false);
								feedpanel1.setVisible(false);
								feedpanel.setVisible(false);
								projectpanel.setVisible(false);
								payrollpanel.setVisible(false);
								  leavepanel.setVisible(false);
								  homepanel.setVisible(false);
								
								feedpanel.setVisible(true);

								ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/admingivefeed.png"));
								Image img = bg_image.getImage();
								Image temp_img = img.getScaledInstance(400, 500, Image.SCALE_SMOOTH);
								bg_image = new ImageIcon(temp_img);
								JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
								logo.setLayout(null);
								logo.setBounds(0, 100, 400, 500);
								feedpanel.add(logo);

								gfsub.addActionListener(new ActionListener() {

									public void actionPerformed(ActionEvent arg0) {

										try {

											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root","");
											PreparedStatement q = conn.prepareStatement("insert into a_To_e_feedback values(?,?,?,?,?,?,?);");
											q.setString(1, gteid.getText());
											q.setInt(2, gsl1.getValue());
											q.setInt(3, gsl2.getValue());
											q.setInt(4, gsl3.getValue());
											q.setInt(5, gsl4.getValue());
											q.setInt(6, gsl5.getValue());
											q.setString(7, gfb7.getText());

											int x = q.executeUpdate();

											if (x > 0) {

												feedpanel.setVisible(false);
												JOptionPane.showMessageDialog(fr, "FeedBack Recored", "Message",
														JOptionPane.INFORMATION_MESSAGE);

											}
										} catch (Exception e) {
											JOptionPane.showMessageDialog(fr, "Already Feedback Given", "Alert",
													JOptionPane.INFORMATION_MESSAGE);
											System.out.println(e);
										}

									}
								});
							}
						});
					}
				});
				// Connection to database :

				JButton b7 = new JButton("Project Team's");
				leftPanel.add(b7);
				b7.setFont(f1);
				b7.setBounds(5, 440, 225, 50);
				b7.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b7.setBackground(Color.WHITE);
				b7.setBorder(new BevelBorder(BevelBorder.RAISED));
				b7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel projectup = new JLabel("Complete Project Details");
				projectup.setHorizontalAlignment(JLabel.CENTER);
				projectup.setLayout(null);
				projectup.setBounds(0, 0, 970, 50);
				projectup.setForeground(Color.white);
				projectup.setOpaque(true);
				projectup.setBackground(new Color(0, 153, 115, 103));
				projectup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				projectpanel.add(projectup);
				
				DefaultTableModel model = new DefaultTableModel();
			    JTable jtbl = new JTable(model);
			   jtbl.setCellSelectionEnabled(true);
			    jtbl.getTableHeader().setReorderingAllowed(false);
			    model.addColumn("Pid");
		        model.addColumn("PName");
		        model.addColumn("PStart");
		        model.addColumn("PEnd");
		        model.addColumn("PMemberID");
		        model.addColumn("PMember");
		        model.addColumn("PDescription");
		        JScrollPane sp = new JScrollPane(jtbl);
		        sp.setBounds(40, 200, 900, 300);
		        projectpanel.add(sp);
		        
		        JLabel j2=new JLabel("Rows:");
				j2.setBounds(230,130,60,30);
				j2.setFont(f1);
				j2.setLayout(null);
				
				JSpinner j3=new JSpinner(new SpinnerNumberModel(1,1,999999,1));
				j3.setBounds(300,130,40,30);
				
				JButton j6=new JButton("Update");
				j6.setBounds(520,130,120,30);
				j6.setBackground(Color.LIGHT_GRAY);
				j6.setFont(f2);
				j6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				j6.setLayout(null);
				projectpanel.add(j6);
				projectpanel.add(j3);
				projectpanel.add(j2);
				
				j6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int rows =(int) j3.getValue();
						model.setRowCount(rows);
					}
				});
				
		        JButton projectUpdate = new JButton("Update Project Details");
				projectUpdate.setBounds(350, 550, 300, 40);
				projectUpdate.setBackground(new Color(0, 153, 115));
				projectUpdate.setForeground(Color.WHITE);
				projectUpdate.setFont(f1);
				projectpanel.add(projectUpdate);
		        
		        
				b7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
                        model.setRowCount(0);
                        epropanel.setVisible(false);
        				infopropanel.setVisible(false);
        				addpanel.setVisible(false);
        				upanel.setVisible(false);
        				u1panel.setVisible(false);
        				dpanel.setVisible(false);
        				reviewpanel.setVisible(false);
        				reviewinpanel.setVisible(false);
        				feedpanel1.setVisible(false);
        				feedpanel.setVisible(false);
        				projectpanel.setVisible(false);
        				payrollpanel.setVisible(false);
        				  leavepanel.setVisible(false);
        				  homepanel.setVisible(false);
        				  
						projectpanel.setVisible(true);
 
						try 
						{

							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection(
									"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");

							PreparedStatement pstm = conn.prepareStatement("SELECT * FROM projectdetails");
							ResultSet Rs = pstm.executeQuery();
							while (Rs.next()) {
								model.addRow(new Object[] { Rs.getString(1), Rs.getString(2), Rs.getString(3),
										Rs.getString(4), Rs.getString(5), Rs.getString(6), Rs.getString(7) });
							}
						} 
						catch (Exception e) 
						{
							System.out.println(e.getMessage());
						}

						projectUpdate.addActionListener(new ActionListener() {
							@SuppressWarnings("deprecation")
							public void actionPerformed(ActionEvent arg0) {

								epropanel.setVisible(false);
								infopropanel.setVisible(false);
								addpanel.setVisible(false);
								upanel.setVisible(false);
								u1panel.setVisible(false);
								dpanel.setVisible(false);
								reviewpanel.setVisible(false);
								reviewinpanel.setVisible(false);
								feedpanel1.setVisible(false);
								feedpanel.setVisible(false);
								projectpanel.setVisible(false);
								payrollpanel.setVisible(false);
								  leavepanel.setVisible(false);
								  homepanel.setVisible(false);
								
								projectpanel.setVisible(true);
									int rows=jtbl.getRowCount();

									
									    
									    try
									    {
									    	Class.forName("com.mysql.cj.jdbc.Driver");
											Connection conn = DriverManager.getConnection(
													"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");

											PreparedStatement q1 = conn.prepareStatement("Delete from projectdetails");
											int x1 = q1.executeUpdate();
											PreparedStatement q = conn.prepareStatement("Insert into projectdetails values (?,?,?,?,?,?,?)");
											for(int row = 0; row<rows; row++)
											{
												model.fireTableDataChanged();
											    String ch0 = (String)jtbl.getValueAt(row, 0);
											    String ch1 = (String)jtbl.getValueAt(row, 1);
											    String ch2 = (String)jtbl.getValueAt(row, 2);
											    String ch3 = (String)jtbl.getValueAt(row, 3);
											    String ch4 = (String)jtbl.getValueAt(row, 4);
											    String ch5 =  (String)jtbl.getValueAt(row, 5);
											    String ch6 =  (String)jtbl.getValueAt(row, 6);
									       
									        q.setString(1, ch0);
									        q.setString(2, ch1);
									        q.setString(3, ch2);
									        q.setString(4, ch3);
									        q.setString(5, ch4);
									        q.setString(6, ch5);
									        q.setString(7, ch6);
									        int x = q.executeUpdate();
									        
									        
									      }
									    
							
												JOptionPane.showMessageDialog(fr, "Project Data Updated", "Message",
														JOptionPane.INFORMATION_MESSAGE);
									        
									    }
									    catch(Exception e)
									    {
									    	JOptionPane.showMessageDialog(fr, "Try again ", "Alert",
													JOptionPane.INFORMATION_MESSAGE);
									    	System.out.println(e.getMessage());
									    	
									    }
									}
									
							
						
						}
						);
					}

				}

				);
//	       ******************************************Checking What Employee think about company EMPLOYEEE REVIEW   **************************
				JButton b8 = new JButton(" Check Review's");
				leftPanel.add(b8);
				b8.setFont(f1);
				b8.setBounds(5, 490, 225, 50);
				b8.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b8.setBackground(Color.WHITE);
				b8.setBorder(new BevelBorder(BevelBorder.RAISED));
				b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel reviewup = new JLabel(" Check Employee Feedback's");
				reviewup.setHorizontalAlignment(JLabel.CENTER);
				reviewup.setLayout(null);
				reviewup.setBounds(0, 0, 970, 50);
				reviewup.setForeground(Color.white);
				reviewup.setOpaque(true);
				reviewup.setBackground(new Color(0, 153, 115, 103));
				reviewup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				reviewpanel.add(reviewup);
				
				JLabel reviewup1 = new JLabel("Employee Feedback");
				reviewup1.setHorizontalAlignment(JLabel.CENTER);
				reviewup1.setLayout(null);
				reviewup1.setBounds(0, 0, 970, 50);
				reviewup1.setForeground(Color.white);
				reviewup1.setOpaque(true);
				reviewup1.setBackground(new Color(0, 153, 115, 103));
				reviewup1.setFont(new Font("DIALOG", Font.PLAIN, 29));
				reviewinpanel.add(reviewup1);
				

				// label for Entering the EID
				JLabel reid = new JLabel("Enter EID");
				reid.setLayout(null);
				reviewpanel.add(reid);
				reid.setBounds(310, 340, 120, 30);
				reid.setFont(new Font("Serif", Font.BOLD, 26));
//			 reid.setBackground(255, 102, 102);

				// text field of rteid
				JTextField rteid = new JTextField();
				rteid.setLayout(null);
				reviewpanel.add(rteid);
				rteid.setBounds(450, 340, 170, 30);
				rteid.setFont(new Font("Serif", Font.BOLD, 26));
				rteid.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0, 153, 115, 103)));

				// button for Searching
				JButton rSearch = new JButton("Search");
				rSearch.setLayout(null);
				reviewpanel.add(rSearch);
				rSearch.setBounds(365, 395, 190, 32);
				rSearch.setFont(new Font("Serif", Font.BOLD, 30));
				rSearch.setBackground(new Color(0, 153, 115));
				rSearch.setForeground(Color.WHITE);
				rSearch.setBorder(null);
				
				rSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

//			  *************************************FEEDBACK Option***************************
				JLabel fb1 = new JLabel("Campus Management");
				fb1.setBounds(420, 90, 250, 40);
				fb1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb1.setForeground(new Color(30, 123, 123));
				fb1.setFont(f1);
				JLabel sl1value = new JLabel();
				sl1value.setBounds(690, 90, 100, 40);
				sl1value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				reviewinpanel.add(sl1value);
				reviewinpanel.add(fb1);

				JLabel fb2 = new JLabel("WorkSpace Environment");
				fb2.setBounds(420, 150, 250, 40);
				fb2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb2.setForeground(new Color(30, 123, 123));
				fb2.setFont(f1);

				JLabel sl2value = new JLabel();
				sl2value.setBounds(690, 150, 100, 40);
				sl2value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				reviewinpanel.add(sl2value);
				reviewinpanel.add(fb2);

//			     ***************feedback Growth Opprounties**************************** 
				JLabel fb3 = new JLabel("Growth Opprounties");
				fb3.setBounds(420, 210, 250, 40);
				fb3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb3.setForeground(new Color(30, 123, 123));
				fb3.setFont(f1);

				JLabel sl3value = new JLabel();
				sl3value.setBounds(690, 210, 100, 40);
				sl3value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				reviewinpanel.add(sl3value);
				reviewinpanel.add(fb3);

				// ************** Work From Home****************************
				JLabel fb4 = new JLabel("Work From Home");
				fb4.setBounds(420, 270, 250, 40);
				fb4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb4.setForeground(new Color(30, 123, 123));
				fb4.setFont(f1);

				JLabel sl4value = new JLabel();
				sl4value.setBounds(690, 270, 100, 40);
				sl4value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				reviewinpanel.add(sl4value);
				reviewinpanel.add(fb4);

				// ************** Overall Job Stasification***************************
				JLabel fb5 = new JLabel("Overall Statisfaction");
				fb5.setBounds(420, 330, 250, 40);
				fb5.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb5.setForeground(new Color(30, 123, 123));
				fb5.setFont(f1);

				JLabel sl5value = new JLabel();
				sl5value.setBounds(690, 330, 100, 40);
				sl5value.setFont(new Font("DIALOG", Font.PLAIN, 17));
				reviewinpanel.add(sl5value);
				reviewinpanel.add(fb5);

//		       ***********Text box for any remark********

				JLabel fb6 = new JLabel("** Reasons for giving this rating");
				fb6.setBounds(420, 390, 480, 20);
				reviewinpanel.add(fb6);

				JTextArea fb7 = new JTextArea();
				fb7.setBounds(420, 450, 480, 60);
				fb7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(30, 123, 123)));
				fb7.setBackground(new Color(234, 250, 250));
				reviewinpanel.add(fb7);

				//
				b8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						payrollpanel.setVisible(false);
						leavepanel.setVisible(false);
						homepanel.setVisible(false);
						
						reviewpanel.setVisible(true);
						rteid.setText(null);
						// background Image.
						ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/AdminEmp_img.png"));
						Image img = bg_image.getImage();
						Image temp_img = img.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
						bg_image = new ImageIcon(temp_img);
						JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
						logo.setLayout(null);
						logo.setBounds(380, 120, 170, 170);
						reviewpanel.add(logo);

						rSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								
								
								// background Image.
								ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/empreview.png"));
								Image img = bg_image.getImage();
								Image temp_img = img.getScaledInstance(400, 550, Image.SCALE_SMOOTH);
								bg_image = new ImageIcon(temp_img);
								JLabel logo = new JLabel("", bg_image, JLabel.CENTER);
								logo.setLayout(null);
								logo.setBounds(0, 50, 400, 550);
								reviewinpanel.add(logo);

								try {

									String uid = rteid.getText();
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection(
											"jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC", "root", "");
									PreparedStatement q = conn.prepareStatement("select * from empfeedback where eid=?");
									q.setString(1, uid);
									ResultSet r = q.executeQuery();
									if (r.next()) {
										
										epropanel.setVisible(false);
										infopropanel.setVisible(false);
										addpanel.setVisible(false);
										upanel.setVisible(false);
										u1panel.setVisible(false);
										dpanel.setVisible(false);
										reviewpanel.setVisible(false);
										reviewinpanel.setVisible(false);
										feedpanel1.setVisible(false);
										feedpanel.setVisible(false);
										projectpanel.setVisible(false);
										payrollpanel.setVisible(false);
										  leavepanel.setVisible(false);
										  homepanel.setVisible(false);
//		        		       	    *********make it true**
										reviewinpanel.setVisible(true);
										
										sl1value.setText("Rated" + String.valueOf(r.getInt("campusManage")));
										sl2value.setText("Rated" + String.valueOf(r.getInt("workspace")));
										sl3value.setText("Rated" + String.valueOf(r.getInt("growth")));
										sl4value.setText("Rated" + String.valueOf(r.getInt("Workhome")));
										sl5value.setText("Rated" + String.valueOf(r.getInt("overall")));
										fb7.setText(r.getString("emptext"));

									}
									else
									{
										JOptionPane.showMessageDialog(fr, "Id doesn't exist ", "Alert",JOptionPane.INFORMATION_MESSAGE);
									}
								} 
								catch (Exception e) 
								{
									System.out.println(e);
								}
							}
						});

					}

				}

				);
				
				JButton b9= new JButton("Payroll");
				leftPanel.add(b9);
				b9.setFont(f1);
				b9.setBounds(5, 540, 225, 50);
				b9.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				b9.setBackground(Color.WHITE);
				b9.setBorder(new BevelBorder(BevelBorder.RAISED));
				b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				JLabel payup = new JLabel("Complete Payroll Details");
				payup.setHorizontalAlignment(JLabel.CENTER);
				payup.setLayout(null);
				payup.setBounds(0, 0, 970, 50);
				payup.setForeground(Color.white);
				payup.setOpaque(true);
				payup.setBackground(new Color(0, 153, 115,103));
				payup.setFont(new Font("DIALOG", Font.PLAIN, 29));
				payrollpanel.add(payup);
				
				DefaultTableModel modelp = new DefaultTableModel();
			    JTable jtblp = new JTable(modelp);
			   jtblp.setCellSelectionEnabled(true);
			    jtblp.getTableHeader().setReorderingAllowed(false);
			    modelp.addColumn("Eid");
			    modelp.addColumn("Name");
		        modelp.addColumn("Salary");
		        modelp.addColumn("BasicPay");
		        modelp.addColumn("HRA");
		        modelp.addColumn("Conveyence");
		        modelp.addColumn("Pf");
		        modelp.addColumn("ESI");
		        modelp.addColumn("Tax");
		        modelp.addColumn("Net Salary");
		        JScrollPane psp = new JScrollPane(jtblp);
		        psp.setBounds(40, 100, 900, 400);
		        payrollpanel.add(psp);
		        
                b9.addActionListener(new ActionListener()
                		{
                	public void actionPerformed(ActionEvent args0)
                	{
                		epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						payrollpanel.setVisible(false);
						leavepanel.setVisible(false);
						homepanel.setVisible(false);
						
						payrollpanel.setVisible(true);
                		try {
      			    	  
         			          Class.forName("com.mysql.cj.jdbc.Driver");
         					  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
         					 PreparedStatement d=conn.prepareStatement("delete from payroll");
         					 d.executeUpdate();
      
         					  PreparedStatement q=conn.prepareStatement("select * from employeedetails");
         					  ResultSet r=q.executeQuery();
         					  while(r.next())
         					  {     
         							long Salary=r.getLong("Salary");
         							String eeid=r.getString("empid");
         							String eename=r.getString("empName");
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
         							if(Salary>=50000 && Salary<100000)
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

         							
               					  PreparedStatement q2=conn.prepareStatement("insert into payroll values(?,?,?,?,?,?,?,?,?,?)");
               					  q2.setString(1, eeid);
               					  q2.setString(2, eename);
               					  q2.setLong(3, Salary);
               					  q2.setLong(4, Basicpay);
               					  q2.setLong(5, hra);
               					  q2.setLong(6, other);
               					  q2.setLong(7, pf);
               					  q2.setLong(8, esi);
               					  q2.setLong(9, tax);
               					  q2.setLong(10, netAmount);
               					  int x=q2.executeUpdate();
               					  
         							
         			           }
         					  modelp.setRowCount(0);
         					  PreparedStatement q3=conn.prepareStatement("select * from payroll");
         					  ResultSet rsp=q3.executeQuery();
         					  while(rsp.next())
         					  {
         						  modelp.addRow(new Object[] { rsp.getString(1), rsp.getString(2), rsp.getLong(3),
         								  rsp.getLong(4), rsp.getLong(5), rsp.getLong(6), rsp.getLong(7), rsp.getLong(8), rsp.getLong(9),rsp.getLong(10)});
         					  }
         			       }
         			       catch(Exception e)
         			       {
         			    	   System.out.println(e);
         			       }
         				}

                	
                		});
              //leave*****
    			JButton leave=new JButton("Leave Approval");
    			leave.setBounds(5, 590, 225, 50);
    			leave.setBackground(Color.WHITE);
    			leave.setFont(f1);
    			leave.setBorder(new BevelBorder(BevelBorder.RAISED));
    			leave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    			leave.setLayout(null);
    			leftPanel.add(leave);
    			
    			//leave button working
    			 JLabel leaveup = new JLabel("Employee Leave Information");
    				leaveup.setHorizontalAlignment(JLabel.CENTER);
    				leaveup.setLayout(null);
    				leaveup.setBounds(0, 0, 1260, 50);
    				leaveup.setForeground(Color.white);
    				leaveup.setOpaque(true);
    				leaveup.setBackground(new Color(0, 153, 115, 103));
    				leaveup.setFont(new Font("DIALOG", Font.PLAIN, 29));
    				leavepanel.add(leaveup);
    			
    			JLabel li5=new JLabel(" Leave Id");
    			li5.setBounds(200,170,100,30);
    			li5.setFont(f1);
    			li5.setLayout(null);
    			
    			JTextField lid5=new JTextField();
    			lid5.setBounds(310,170,150,30);
    			lid5.setEditable(false);
    			lid5.setFont(f1);
    			lid5.setBackground(Color.WHITE);
    			lid5.setLayout(null);
    			
    			JLabel l5=new JLabel("Name");
    			l5.setBounds(50,260,80,30);
    			l5.setFont(f1);
    			l5.setLayout(null);
    			
    			JTextField ld5=new JTextField();
    			ld5.setBounds(150,260,150,30);
    			ld5.setFont(f1);
    			ld5.setEditable(false);
    			ld5.setBackground(Color.WHITE);
    			ld5.setLayout(null);
    			
    			JLabel l6=new JLabel("Type");
    			l6.setBounds(350,260,80,30);
    			l6.setFont(f1);
    			l6.setLayout(null);
    			
    			String role[]= {"Medical","Personal"};
    			JComboBox<String> ld6=new JComboBox<>(role);
    			ld6.setBounds(450,260,150,30);
    			ld6.setEditable(false);
    			ld6.setBackground(Color.WHITE);
    		
    			JLabel l7=new JLabel("From");
    			l7.setBounds(50,320,80,30);
    			l7.setFont(f1);
    			l7.setLayout(null);
    		
    			UtilDateModel model1 =new UtilDateModel();
    			JDatePanelImpl datePanel1=new JDatePanelImpl(model1);
    			JDatePickerImpl datePicker1=new JDatePickerImpl(datePanel1);
    			datePicker1.setBounds(150,320,150,30);
    		
    			
    			UtilDateModel model2 =new UtilDateModel();
    			JDatePanelImpl datePanel2=new JDatePanelImpl(model2);
    			JDatePickerImpl datePicker2=new JDatePickerImpl(datePanel2);
    			datePicker2.setBounds(450,320,150,30);
    			
    			JLabel l9=new JLabel("No of Days");
    			l9.setBounds(50,380,100,30);
    			l9.setFont(f1);
    			l9.setLayout(null);
    		
    			JTextField ld9=new JTextField();
    			ld9.setBounds(150,380,150,30);
    			ld9.setFont(f1);
    			ld9.setEditable(false);
    			ld9.setBackground(Color.WHITE);
    			ld9.setLayout(null);
    		
    			JLabel l10=new JLabel("Reason");
    			l10.setBounds(350,380,80,30);
    			l10.setFont(f1);
    			l10.setLayout(null);
    		
    			JTextField ld10=new JTextField();
    			ld10.setBounds(450,380,150,30);
    			ld10.setFont(f1);
    			ld10.setEditable(false);
    			ld10.setBackground(Color.WHITE);
    			ld10.setLayout(null);
    			
    			DefaultTableModel lmodel=new DefaultTableModel();
    			JTable ljt=new JTable(lmodel);
    			lmodel.addColumn("ID");
    			lmodel.addColumn("EmpId");
    			lmodel.addColumn("Name");
    			lmodel.addColumn("Type");
    			lmodel.addColumn("From");
    			lmodel.addColumn("To");
    			lmodel.addColumn("No. of Days");
    			lmodel.addColumn("Reason");
    			lmodel.addColumn("Request");
    			JScrollPane lpg=new JScrollPane(ljt);
    			lpg.setBounds(650,120,600,450);
    			lpg.setBorder(new MatteBorder(2,2,2,2,new Color(115,115,165)));
    			
    			ljt.addMouseListener(new MouseAdapter() {
    				public void mouseClicked(MouseEvent m) {
    					int row=ljt.getSelectedRow();
    					
    					ld5.setText("");
    					ld6.setSelectedIndex(-1);
    					datePicker1.getJFormattedTextField().setText("");
    					datePicker2.getJFormattedTextField().setText("");
    					ld9.setText("");
    					ld10.setText("");
    					lid5.setText((String)ljt.getValueAt(row, 0));
    					ld5.setText((String)ljt.getValueAt(row, 2));
    					ld6.setSelectedItem((String)ljt.getValueAt(row, 3));
    					datePicker1.getJFormattedTextField().setText((String)ljt.getValueAt(row, 4));
    					datePicker2.getJFormattedTextField().setText((String)ljt.getValueAt(row, 5));
    					ld9.setText((String)ljt.getValueAt(row, 6));
    					ld10.setText((String)ljt.getValueAt(row, 7));
    					
    				}
    			});
    			
    			JButton approve=new JButton("Approve");
    			approve.setBounds(200,480,150,30);
    			approve.setForeground(Color.WHITE);
    			approve.setBackground(new Color(0, 153, 115));
    			approve.setFont(f1);
    			approve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    			approve.setLayout(null);
    			
    			JButton disapprove=new JButton("Disapprove");
    			disapprove.setBounds(400,480,150,30);
    			disapprove.setForeground(Color.WHITE);
    			disapprove.setBackground(new Color(0, 153, 115));
    			disapprove.setFont(f1);
    			disapprove.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    			disapprove.setLayout(null);
    			
    			approve.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					try {
    						
    						JOptionPane.showMessageDialog(fr, "Leave Approved ...", "Message", JOptionPane.INFORMATION_MESSAGE);
    						if(ljt.getSelectedRow() != -1) {
    							lmodel.removeRow(ljt.getSelectedRow());
    						}
    						
    						
    						Class.forName("com.mysql.cj.jdbc.Driver");
    						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
    						PreparedStatement q=con.prepareStatement("update empleave set Request=? where Sno=?");
    						q.setString(1, "Approved");
    						q.setString(2, lid5.getText());
    						q.executeUpdate();
    						
    						lid5.setText("");
    						ld5.setText("");
    						ld6.setSelectedIndex(-1);
    						datePicker1.getJFormattedTextField().setText("");
    						datePicker2.getJFormattedTextField().setText("");
    						ld9.setText("");
    						ld10.setText("");
    					}
    					catch(Exception se)
    					{
    						System.out.println(se);
    					}
    				}
    			});
    			
    			disapprove.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					try {
    						
    						JOptionPane.showMessageDialog(fr, "Leave not Approved ...", "Message", JOptionPane.INFORMATION_MESSAGE);
    						if(ljt.getSelectedRow() != -1) {
    							lmodel.removeRow(ljt.getSelectedRow());
    						}
    						
    						Class.forName("com.mysql.cj.jdbc.Driver");
    						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
    						PreparedStatement q=con.prepareStatement("update empleave set Request=? where Sno=?");
    						q.setString(1, "Not Approved");
    						q.setString(2, lid5.getText());
    						q.executeUpdate();
    						
    						lid5.setText("");
    						ld5.setText("");
    						ld6.setSelectedIndex(-1);
    						datePicker1.getJFormattedTextField().setText("");
    						datePicker2.getJFormattedTextField().setText("");
    						ld9.setText("");
    						ld10.setText("");
    					}
    					catch(Exception se)
    					{
    						System.out.println(se);
    					}
    				}
    			});
    			
    			leave.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					lmodel.setRowCount(0);
    					try {
    						Class.forName("com.mysql.cj.jdbc.Driver");
    						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
    						
    						PreparedStatement q1=con.prepareStatement("select * from empleave where Request=?");
    						q1.setString(1,"Pending");
    						ResultSet r1=q1.executeQuery();
    						while(r1.next()) {
    							lmodel.addRow(new Object[] {r1.getString(1), r1.getString(2), r1.getString(3), r1.getString(4), r1.getString(5), r1.getString(6), r1.getString(7), r1.getString(8), r1.getString(9)});
    						}
    					}
    					catch(Exception se)
    					{
    						System.out.println(se);
    					}
    					
    					epropanel.setVisible(false);
						infopropanel.setVisible(false);
						addpanel.setVisible(false);
						upanel.setVisible(false);
						u1panel.setVisible(false);
						dpanel.setVisible(false);
						reviewpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						feedpanel1.setVisible(false);
						feedpanel.setVisible(false);
						projectpanel.setVisible(false);
						reviewinpanel.setVisible(false);
						payrollpanel.setVisible(false);
						  leavepanel.setVisible(false);
						  homepanel.setVisible(false);
						
    					leavepanel.setVisible(true);
      					leavepanel.add(li5);
    					leavepanel.add(l5);
    					leavepanel.add(l6);
    					leavepanel.add(l7);
    					leavepanel.add(l9);
    					leavepanel.add(l10);
    					leavepanel.add(approve);
    					leavepanel.add(disapprove);
    					leavepanel.add(lid5);
    					leavepanel.add(ld5);
    					leavepanel.add(ld6);
    					ld6.setSelectedIndex(-1);
    					leavepanel.add(datePicker1);
    					leavepanel.add(datePicker2);
    					leavepanel.add(ld9);
    					leavepanel.add(ld10);
    					leavepanel.add(lpg);
    				}
    			});
    			
				JButton outbtn = new JButton("Log Out");
				leftPanel.add(outbtn);
				outbtn.setFont(f1);
				outbtn.setBounds(5, 660, 225, 50);
				outbtn.setBorder(new MatteBorder(0, 0, 8, 0, Color.pink));
				outbtn.setBackground(new Color(255, 77, 77));
				outbtn.setForeground(Color.BLUE);
				outbtn.setBorder(new BevelBorder(BevelBorder.RAISED));
				outbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				outbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						fr.setVisible(false);
						new Log();
					}
				});

			}
		});
	}

	public static void main(String args[]) {
		createAdminFrame();
	}
}
