package test;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class details1 extends JFrame implements ActionListener {
	public JLabel l1,l2,l3,l4,l5,l6,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34;
	public ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
	public JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17;
	public JTextArea ta1,ta2,ta3;
	public JButton b1,b2,b3,b4,b5,b6;
	public String filename;
	
	public details1() {
		setLayout(null);
		setSize(1600, 900);
		setVisible(true);
		setTitle("Details Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(102,153,0));
		Font f1=new Font("Century Gothic",Font.BOLD,18);
		Font f2=new Font("Century Gothic",Font.BOLD,40);
			
		i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\five2.PNG");
		i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\two.PNG");
		i3=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\three.PNG");
		i4=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\four.PNG");
		i5=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\one.png");
		i6=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\six.PNG");
		
		i7=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\backicon.png");
		i8=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\searchicon.PNG");
		i9=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\saveicon.PNG");
		i10=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\viewicon.PNG");
		
		l1=new JLabel("Personal Details");
		l2=new JLabel("Work Experience(if any)");
		l3=new JLabel("Certificate/Project");
		l4=new JLabel("Skills/Languages");
		l5=new JLabel("     Education and Qualification");
		l6=new JLabel("Interested Domains");
		
		l8=new JLabel("First Name");
		l9=new JLabel("Last Name");
		l10=new JLabel("Address");
		l11=new JLabel("Phone no");
		l12=new JLabel("Gmail");
		l13=new JLabel("Linked-in");
		l14=new JLabel("DOB");
		l15=new JLabel("Introduction");
		l16=new JLabel(".");
		l17=new JLabel(".");
		l22=new JLabel(".");
		l18=new JLabel("Degree ");
		l19=new JLabel("Passing year");
		l20=new JLabel("Score");
		l21=new JLabel(".");
		l22=new JLabel(".");
		l23=new JLabel("Post");
		l24=new JLabel("Duration");
		l25=new JLabel("Company");
		l26=new JLabel("Name");
		l27=new JLabel("Description");
		l28=new JLabel("Link to view");
		l29=new JLabel(".");
		l30=new JLabel("Name");
		l31=new JLabel("Rate(out of 10)");
		l32=new JLabel(".");
		l33=new JLabel("Domains");
		l34=new JLabel(".");	
		
			//b1=new JButton("Attach Photo");
		b2=new JButton("Back",i7);
		b3=new JButton("Search",i8);
//		b4=new JButton("Save",i9);
		b4 = new JButton("Attach Photo & Save", i9);
		b5=new JButton("View Template",i10);
		b6=new JButton("Please enter all details");
		
		//b2.setOpaque(false);
		//b3.setOpaque(false);
		//b4.setOpaque(false);
		//b5.setOpaque(false);
		b6.setForeground(new Color(255, 255, 102));
			//b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
			//b1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b2.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b3.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b4.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102)));
		b6.setBackground(new Color(0, 0, 153));
			//b1.setBackground(new Color(0, 0, 153));
		b2.setBackground(new Color(0, 0, 153));
		b3.setBackground(new Color(0, 0, 153));
		b4.setBackground(new Color(0, 0, 153));
		b5.setBackground(new Color(0, 0, 153));
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();	
		ta1=new JTextArea();	//address
		ta2=new JTextArea();	//intro
		tf7=new JTextField();	//degree in quali
		tf8=new JTextField();
		tf9=new JTextField();
			
		tf10=new JTextField();	//post
		tf11=new JTextField();
		tf12=new JTextField();
		tf13=new JTextField();	//title
		tf14=new JTextField();
		tf15=new JTextField();	//url
		tf16=new JTextField();	//nm
		tf17=new JTextField();	//rate
		ta3=new JTextArea();	//domain
				
		l1.setIcon(i1);
		l2.setIcon(i2);
		l3.setIcon(i3);
		l4.setIcon(i4);
		l5.setIcon(i5);
		l6.setIcon(i6);		
		b6.setFont(f1);	
		
	//	l1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//l7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		l16.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l17.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l21.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l22.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l29.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l32.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l34.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
		l1.setBounds(05,90,400,120);
		l2.setBounds(600,90,380,140);
		l3.setBounds(580,300,330,150);
		l4.setBounds(600,530,300,150);
		l5.setBounds(60,520,280,150);
		l6.setBounds(1180,90,300,150);
	
		
		b2.setBounds(0,0,310,50);		//upper btns
		b3.setBounds(300,0,320,50);
		b4.setBounds(920,0,280,50);
		b5.setBounds(1200,0,350,50);
		b6.setBounds(620,0,310,50);	//plz enter details
	
		
		l8.setBounds(50,200,100,50);	//fnm
		l9.setBounds(200,200,100,50);	//lnm
		l14.setBounds(350,200,100,50);	//dob
		
		l11.setBounds(50,280,100,50);	//ph
		l12.setBounds(200,280,100,50);	//mail
		l13.setBounds(350,280,100,50);	//linkedin
		
		l23.setBounds(650,200,100,50);	//post
		l24.setBounds(800,200,100,50);	//dur
		l25.setBounds(950,200,100,50);	//comp
		
		l26.setBounds(650,410,100,50);	//tit
		l27.setBounds(800,410,100,50);	//desc
		l28.setBounds(950,410,100,50);	//url
		
		l10.setBounds(50,360,100,50);
		l15.setBounds(300,360,100,50);
		
		
		l16.setBounds(10,100,500,400);	//border for pd	
		l17.setBounds(10,550,500,200);	//border for edu n quali
		
		l22.setBounds(600,100,500,200);   //border for   work exp
		l21.setBounds(600,320,500,200);   //border for certi
		l29.setBounds(600,550,500,200);   //border for   skills
		l32.setBounds(1200,100,300,650);   //border for  int domains
		
		l18.setBounds(50,650,100,50);	//deg
		l19.setBounds(200,650,100,50);	//pass year
		l20.setBounds(350,650,100,50);	//scr
		
		l30.setBounds(650,650,100,50);	//nm
		l31.setBounds(800,650,100,50);	//rate
		l33.setBounds(1250,200,100,50);	//domain
		
		tf1.setBounds(50,240,100,30);
		tf2.setBounds(200,240,100,30);
		tf3.setBounds(350,240,100,30);
		
		tf4.setBounds(50,320,100,30);
		tf5.setBounds(200,320,100,30);
		tf6.setBounds(350,320,100,30);
		ta1.setBounds(50,400,150,50);
		ta2.setBounds(300,400,150,50);
		
		tf7.setBounds(50,690,100,30);	//degree 
		tf8.setBounds(200,690,100,30);
		tf9.setBounds(350,690,100,30);
		
		tf10.setBounds(650,240,100,30);
		tf11.setBounds(800,240,100,30);
		tf12.setBounds(950,240,100,30);
		
		
		
		tf13.setBounds(650,450,100,30);		//tit of certi
		tf14.setBounds(800,450,100,30);
		tf15.setBounds(950,450,100,30);
		
		tf16.setBounds(650,690,100,30);	//nm
		tf17.setBounds(800,690,100,30);	//rate
		ta3.setBounds(1250,240,150,50);//domain
		
		l34.setBounds(1250,380,200,250);		//pic lbl
		
			//b1.setBounds(1270,680,150,50);
			//b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		//add(l7);
		
		
		add(l8);
		add(l9);
		add(tf1);
		add(tf2);
		add(l16);
		add(l14);
		add(tf3);
		
		add(l11);
		add(l12);
		add(l13);
		add(tf4);
		add(tf5);
		add(tf6);
		
		add(l10);
		add(l15);
		add(ta1);
		add(ta2);

		add(l17);
		add(l18);
		add(l19);
		add(l20);
		add(l21);
		add(l22);
		add(l23);
		add(l24);
		add(l25);
		add(l26);
		add(l27);
		add(l28);
		add(l29);
		add(l30);
		add(l31);
		add(l32);
		add(l33);
		add(l34);
		
		add(tf7);
		add(tf8);
		add(tf9);
		add(tf10);
		add(tf11);
		add(tf12);
		add(tf13);
		add(tf14);
		add(tf15);
		add(tf16);
		add(tf17);
		add(ta3);
			//add(b1);
	}
	public FileInputStream testFun() throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File f=chooser.getSelectedFile();
		filename=f.getAbsolutePath();
		Image getabsolutePath=null;
		ImageIcon icon = new ImageIcon(filename);
		Image image =icon.getImage().getScaledInstance(l34.getWidth(), l34.getHeight(),Image.SCALE_SMOOTH);
		FileInputStream fis = new FileInputStream(filename);
		System.out.print(filename);
		l34.setIcon(icon);
		return fis;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
//		if(s1.equals("Attach Photo")) {
//			//this.dispose();
//			
//			//Sample1 window = new Sample1();
//			JFileChooser chooser = new JFileChooser();
//			chooser.showOpenDialog(null);
//			File f=chooser.getSelectedFile();
//			filename=f.getAbsolutePath();
//			Image getabsolutePath=null;
//			ImageIcon icon = new ImageIcon(filename);
//			Image image =icon.getImage().getScaledInstance(l34.getWidth(), l34.getHeight(),Image.SCALE_SMOOTH);
//			try {
//				fis = new FileInputStream(filename);
//				System.out.print(filename);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//			l34.setIcon(icon);
//		}
		if(s1.equals("Back")) {
			new login();
			this.dispose();
		}
		if(s1.equals("Search")) {
			String mno = tf4.getText().trim();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
				Statement stmt = conn.createStatement();
				String sql = "SELECT * FROM personaldetails WHERE mobile='"+ mno +"'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next() == true) {
					tf1.setText(rs.getString(1));
					tf2.setText(rs.getString(2));
					tf3.setText(rs.getString(3));
					tf5.setText(rs.getString(5));
					tf6.setText(rs.getString(6));
					
					ta1.setText(rs.getString(7));
					ta2.setText(rs.getString(8));
					
					tf7.setText(rs.getString(9));
					tf8.setText(rs.getString(10));
					tf9.setText(rs.getString(11));
					tf10.setText(rs.getString(12));
					tf11.setText(rs.getString(13));
					tf12.setText(rs.getString(14));
					tf13.setText(rs.getString(15));
					tf14.setText(rs.getString(16));
					tf15.setText(rs.getString(17));
					tf16.setText(rs.getString(18));
					tf17.setText(rs.getString(19));
					ta3.setText(rs.getString(20));
					
					
					byte b[];				
					b = rs.getBytes("image");
					ImageIcon ico = new ImageIcon(b);
					Image img = ico.getImage();
					ImageIcon icoF = new ImageIcon(img);
					l34.setIcon(icoF);
					
				} else {
					JOptionPane.showMessageDialog(this,"Invalid Mobile.");
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this,"User Found");
		}
		if(s1.equals("Attach Photo & Save")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
				PreparedStatement ps=conn.prepareStatement("INSERT INTO personaldetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1, tf1.getText().trim());
				ps.setString(2, tf2.getText().trim());
				ps.setString(3, tf3.getText().trim());
				ps.setString(4, tf4.getText().trim());
				ps.setString(5, tf5.getText().trim());
				ps.setString(6, tf6.getText().trim());
				ps.setString(7, ta1.getText().trim());
				ps.setString(8, ta2.getText().trim());
				ps.setString(9, tf7.getText().trim());
				ps.setString(10, tf8.getText().trim());
				ps.setString(11, tf9.getText().trim());
				ps.setString(12, tf10.getText().trim());
				ps.setString(13, tf11.getText().trim());
				ps.setString(14, tf12.getText().trim());
				ps.setString(15, tf13.getText().trim());
				ps.setString(16, tf14.getText().trim());
				ps.setString(17, tf15.getText().trim());
				ps.setString(18, tf16.getText().trim());
				ps.setString(19, tf17.getText().trim());
				ps.setString(20, ta3.getText().trim());
				
				FileInputStream fin = testFun();
				ps.setBinaryStream(21,  fin, fin.available());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved Successfully");
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		if(s1.equals("View Template")) {
			new template();
			this.dispose();
		}
	}
	
//	public static void main(String args[]) {
//		details1 cv4=new details1();
//	}					
}
