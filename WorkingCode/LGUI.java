package Gui;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.sql.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.DefaultCaret;
//import javax.swing.text.DefaultCaret;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import Gui.EmployeePage1;
import Gui.Adminpage;
@SuppressWarnings("unused")
public class LGUI   {
   @SuppressWarnings("rawtypes")
LGUI()
   {     //frame
	   JFrame fr=new JFrame("LOGIN");
	   fr.setSize(1990,890);
	   fr.setLayout(null);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   fr.setVisible(true);
//	   fr.pack();
	   //  fr.setResizable(true);
	
	   
	   // font 
	   Font f = new Font("Serif",Font.BOLD,60);
	   Font f1 = new Font("Serif",Font.BOLD,18);
	   Font f2 = new Font("Serif",Font.BOLD,21);
	   // header
	   JPanel heading = new JPanel();
	   heading.setLayout(null);
	   heading.setBackground(new Color(0,0,0,90));
	   heading.setBounds(0,0,1990,100);
	  
	 
	   // Heading text
	   ImageIcon bg_image1 = new ImageIcon(this.getClass().getResource("/mainlogo.png"));
	   Image img1 =bg_image1.getImage();
	   Image temp_img1=img1.getScaledInstance(90,80,Image.SCALE_SMOOTH);
	   bg_image1=new ImageIcon(temp_img1);
	  
	     JLabel name = new JLabel("Employee Information Mangement system",bg_image1,JLabel.CENTER);
	     name.setLayout(null);
	     name.setBounds(10,10,1500,80);
	     heading.add(name);
	     name.setFont(f);
	     name.setForeground(Color.WHITE);
	  
	 
	   // login panel
	   JPanel login = new JPanel();
	   login.setLayout(null);
	   login.setBackground(Color.LIGHT_GRAY);
	   login.setBounds(520,200,500,350);
	   login.setBorder(new MatteBorder(2,2,2,2,new Color(115,115,165)));

	   
	   // username
	   JLabel us= new JLabel("Enter User ID");
	   us.setBounds(100, 35, 150, 15);
	   us.setFont(f1);
	   us.setBorder(null);
	   us.setForeground(Color.black);
	   
	   JTextField username = new JTextField();
	   username.setBounds(100, 50, 300, 50);
	   username.setBorder(new MatteBorder(0,0,2,0,Color.red));
	   username.setBackground(Color.LIGHT_GRAY);
	   //username.setForeground(new Color(0,0,0,80));
	   username.setFont(f2);
	  
	   login.add(us);
	   login.add(username);
	   
	   
	   //password
	   JLabel up= new JLabel("Enter Password");
	   up.setBounds(100,135,150,15);
	   up.setFont(f1);
	   up.setBorder(null);
	   up.setForeground(Color.black);
	   
	   JPasswordField password = new JPasswordField("");
	   password.setBounds(100,150,300,50);
	   password.setBorder(new MatteBorder(0,0,2,0,Color.red));
	   password.setBackground(Color.LIGHT_GRAY);
	   password.setFont(f2);
	   login.add(password);
	   login.add(up);
	   password.setEchoChar('*');
	   
	   // box for selecting the admin and the employee
	   String user[]= {"admin","employee"};
	   @SuppressWarnings("unchecked")
	JComboBox cb= new JComboBox(user);
	   cb.setBounds(100, 210, 100, 30);
	   cb.setBackground(Color.LIGHT_GRAY);
	  // cb.setBorder(new MatteBorder(0,0,2,0,Color.red));
	   login.add(cb);
	   
	    //Check box for showing the password
	   JCheckBox Cbox= new JCheckBox("Show Password");
	   Cbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(Cbox.isSelected())
			
				password.setEchoChar((char)0);
			
			   else
			
				password.setEchoChar('*');
			
		}
		});
	   Cbox.setLayout(null);
	   Cbox.setBounds(340,210,130,30);
	   Cbox.setOpaque(false);
	   Cbox.setBackground(Color.WHITE);
	   login.add(Cbox);
	   
	  
	   
	   JButton signin = new JButton("Sign In");
	   signin.setLayout(null);
	   signin.setBounds(100,250,300,40);
	   signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   signin.setFont(f1);
	   signin.setBackground(new Color(115, 115, 165));
	   signin.setBorder(new RoundedBorder(15));
	   login.add(signin);
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   if(cb.getSelectedItem()=="admin")
					{
				try 
				{
					String uname=username.getText();
					String pass=new String(password.getPassword());
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
				  PreparedStatement q=conn.prepareStatement("select * from admindetails where username=? and password=?");
				  q.setString(1, uname);
				  q.setString(2, pass);
				  ResultSet r=q.executeQuery();
				  if(r.next())
				  {
					  System.out.println("Login Successfull.");
					  fr.setVisible(false);
					  Adminpage.createAdminFrame();
					  
				  }
				
				  else
				  {
					  System.out.println("Login Unsuccessfull.");
					  JOptionPane.showMessageDialog(fr, "UserID or password wrong", "Message", JOptionPane.INFORMATION_MESSAGE);
				  }
				}
				catch(Exception e)
				{
					System.out.println(e);
				}	
					}
				   else
				   {
					   try 
						{
						  String uname=username.getText();
						  String upass=new String(password.getPassword());
						  Class.forName("com.mysql.cj.jdbc.Driver");
						  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb?serverTimezone=UTC","root","");
						  PreparedStatement q=conn.prepareStatement("select * from employeedetails where empid=? and epassword=?");
						  q.setString(1, uname);
						  q.setString(2, upass);
						  ResultSet r=q.executeQuery();
						  if(r.next())
						  {
							  
							  System.out.println("Login Successfull.");
							  fr.setVisible(false);
							  EmployeePage1.createEmpFrame(uname,upass);
							  
						  }
						
						  else
						  {
							  System.out.println("Login Unsucessful");
						  JOptionPane.showMessageDialog(fr, "UserID or password wrong", "Message", JOptionPane.INFORMATION_MESSAGE);
						  }
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
				   }
			  }
		
		 });
		
		
		
	   
	// background Image.
	   ImageIcon bg_image = new ImageIcon(this.getClass().getResource("/bg1.jpg"));
	   Image img =bg_image.getImage();
	   Image temp_img=img.getScaledInstance(1990,890,Image.SCALE_SMOOTH);
	   bg_image=new ImageIcon(temp_img);
	   JLabel background= new JLabel("",bg_image,JLabel.CENTER);
	   
	    background.add(heading);
	    background.add(login);
	    background.setBounds(0,0,1990,890);
	    fr.add(background);
	   
	   
   }

  private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
  public static void main(String args[]) 
  {    
	new LGUI();
  }
}

