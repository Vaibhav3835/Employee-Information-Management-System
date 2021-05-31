package Gui;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.*;
import Gui.Emp;
import Gui.Adm;
public class Log {
	
	 Log() {
		EventQueue.invokeLater(new Runnable(){			
		public void run() {
			//frame
			JFrame frame =new JFrame("Employee Management System");
			
			//font
			Font f1=new Font("Serif",Font.BOLD,30);
			Font f2=new Font("Serif",Font.BOLD,20);
			Font f3=new Font("Serif",Font.BOLD,15);
			
			//Border
			Border b1= BorderFactory.createLineBorder(new Color(115,115,165),2);
			Border b2= BorderFactory.createLineBorder(Color.BLACK,2);
			
			
			   // Heading text
			   ImageIcon bg_image2 = new ImageIcon(this.getClass().getResource("/mainlogo.png"));
			   Image img2 =bg_image2.getImage();
			   Image temp_img1=img2.getScaledInstance(90,80,Image.SCALE_SMOOTH);
			   bg_image2=new ImageIcon(temp_img1);
			
			//label
			JLabel head=new JLabel("Employee Information Management System",bg_image2,JLabel.CENTER);
			head.setBounds(-10,0,1540,90);
			head.setFont(new Font("Serif" ,Font.BOLD,50));
			head.setOpaque(true);
			head.setBackground((new Color(0,0,0,90)));
			head.setForeground(Color.white);
			head.setHorizontalAlignment(JLabel.CENTER);
			head.setBorder(b1);
			head.setLayout(null);
			
			//login panel
			JPanel login=new JPanel();
			login.setBounds(520,200,500,350);
			login.setOpaque(false);
			login.setBackground(new Color(179, 204, 255));
			login.setLayout(null);
			
			//user id
			JLabel user1=new JLabel("User ID");
			user1.setBounds(100, 35, 150, 15);
			user1.setFont(f2);
			user1.setOpaque(false);
			user1.setLayout(null);
			
			JTextField user=new JTextField("");
			user.setBounds(100, 50, 300, 50);
			user.setFont(f2);
			user.setOpaque(false);
			user.setBackground(new Color(179, 204, 255));
			user.setBorder(new MatteBorder (0,0,3,0,Color.BLACK));
			user.setLayout(null);
			
			//password
			JLabel pass1=new JLabel("Password");
			pass1.setBounds(100,135,150,15);
			pass1.setOpaque(false);
			pass1.setFont(f2);
			pass1.setLayout(null);
			
			JPasswordField pass=new JPasswordField("");
			pass.setBounds(100,150,300,50);
			pass.setFont(f2);
			pass.setOpaque(false);
			pass.setBackground(new Color(179, 204, 255));
			pass.setBorder(new MatteBorder (0,0,3,0,Color.BLACK));
			pass.setEchoChar('*');
			pass.setLayout(null);
			
			//show/hide password
			JCheckBox check=new JCheckBox("Show Password");
			check.setBounds(315,210,130,30);
			check.setBackground(new Color(179, 204, 255));
			check.setOpaque(false);
			
			check.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(check.isSelected()) {
						pass.setEchoChar((char)0);
					}
					else {
						pass.setEchoChar('*');
					}
				}
			});
			
			//combo box having admin and employee
			String role[]= {"Admin","Employee"};
			JComboBox<String> cb=new JComboBox<>(role);
			cb.setBounds(100, 210, 100, 30);
			cb.setOpaque(false);
			
			//signin
			JButton signin=new JButton("Sign In");
			signin.setBounds(100,250,300,40);
			signin.setBackground(new Color(179, 204, 255));
			signin.setFont(f2);
			signin.setOpaque(false);
			signin.setBorder(b2);
			signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			signin.setLayout(null);
			
			signin.addMouseListener(new MouseAdapter() {
				Color color=signin.getBackground();
				public void mouseEntered(MouseEvent me) {
					signin.setBackground(Color.WHITE);
				}
				public void mouseExited(MouseEvent me) {
					signin.setBackground(color);
				}
			});
			
			
			//admin and employee page
			signin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(cb.getSelectedItem()=="Admin") {
						try {
							String userid=user.getText();
							String userpass=new String(pass.getPassword());
						
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
							PreparedStatement q=con.prepareStatement("select * from admindetails where username=?  and password=?");
							q.setString(1, userid);
							q.setString(2, userpass);
							ResultSet r=q.executeQuery();
							if(r.next()) {
								System.out.println("Login Successful.");
								frame.setVisible(false);
								Adm.createAdminFrame();
							}
							else
							{
								System.out.println("Login Unsuccessful.");
								JOptionPane.showMessageDialog(frame, "Wrong User ID or Password", "Warning", JOptionPane.WARNING_MESSAGE);
								user.setText("");
								pass.setText("");
							}
						}
						catch(Exception se)
						{
							System.out.println(se);
						}
					}
					else if(cb.getSelectedItem()=="Employee") {
						try {
							String userid=user.getText();
							String userpass=new String(pass.getPassword());
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
							PreparedStatement q=con.prepareStatement("select * from employeedetails where empid=? and epassword=?");
							q.setString(1, userid);
							q.setString(2, userpass);
							ResultSet r=q.executeQuery();
							if(r.next()) {
								System.out.println("Login Successful.");
								frame.setVisible(false);
								Emp.createEmpFrame(userid,userpass);
							}
							else{
								System.out.println("Login Unsuccessful.");
								JOptionPane.showMessageDialog(frame, "Wrong User ID or Password", "Warning", JOptionPane.WARNING_MESSAGE);
								user.setText("");
								pass.setText("");
							}
						}
						catch(Exception se)
						{
							System.out.println(se);
						}
					}
					
				}});
			
			
			login.add(user1);
			login.add(user);
			login.add(pass1);
			login.add(pass);
			login.add(check);
			login.add(cb);
			login.add(signin);
			
			// frame background image
			ImageIcon png=new ImageIcon(this.getClass().getResource("/bg1.jpg"));
			Image img= png.getImage();
			Image img1=img.getScaledInstance(1980,890,Image.SCALE_SMOOTH);
			png=new ImageIcon(img1);
			JLabel logo=new JLabel("",png,JLabel.CENTER);
			logo.setBounds(-10,0,1980,890);
			logo.setLayout(null);
			
			
			frame.add(login);
			frame.add(head);
			frame.add(logo);
			
			frame.setBounds(-10,0,1980,890);
			frame.setLayout(null);
			frame.setVisible(true);
			   frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}});}
	public static void main(String[] args) {
		new Log();
	}
	
}
