package test;

import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;


public class Viewpage4 extends JFrame implements ActionListener
{

	private JFrame frame;
	private JTextField t1, tfmo;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	JTextArea ta3, ta4, ta8, ta6, ta5, ta10;
	JLabel l2, l3;

	public Viewpage4() 
	{

		//frame = new JFrame("Resume Template4");
		setSize(1950, 950);
		setVisible(true);
		setTitle("Resume Template");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		ImageIcon i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\bg3.jpeg");
		//frame.getContentPane().setLayout(null);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0, 0, 1950, 950);
		l1.setForeground(Color.WHITE);
		add(l1);
		
		
		ImageIcon i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\r4.png");
		l2 = new JLabel();
		l2.setBackground(Color.WHITE);
		l2.setBounds(500, 0, 1500, 800);
		l2.setIcon(i2);
		l1.add(l2);
		
		l3 = new JLabel("Insert pic here");
		l3.setBackground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		l3.setBounds(20, 65, 130, 130);
		l2.add(l3);
		
		t1 = new JTextField("Name");
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t1.setBounds(210, 97, 270, 40);
		t1.setBorder(null);
		t1.setColumns(20);
		l2.add(t1);
		
		
		t2 = new JTextField("Occupation");
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		//t2.setFont(new Font("Century Gothic", Font.BOLD, 18));		
		t2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		t2.setForeground(Color.BLUE);
		t2.setBounds(210, 140, 270, 30);
		t2.setBorder(null);
		t2.setColumns(20);
		l2.add(t2);
		
		JLabel l4 = new JLabel("Pro Skills");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		//l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l4.setBounds(40, 250, 80, 30);
		l2.add(l4);
		
		ta3 = new JTextArea("C\nC++\nJava\nPython\nSQL");
		ta3.setBackground(new Color(37, 67, 98));
		ta3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta3.setForeground(Color.WHITE);
		ta3.setBounds(40, 293, 100, 135);
		l2.add(ta3);
		
		JLabel l5 = new JLabel("About me");
		l5.setForeground(Color.WHITE);
		//l5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		l5.setBounds(40, 445, 100, 30);
		l2.add(l5);
		
		ta4 = new JTextArea("Experienced graphic\ndesigner with 8 years of \nexperience. Excited to \nhelp your company.");
		ta4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta4.setBounds(40, 480, 120, 135);
		ta4.setBackground(new Color(37, 67, 98));
		ta4.setForeground(Color.WHITE);
		ta4.setOpaque(false);
		l2.add(ta4);
		
		JLabel l6 = new JLabel("Contact");
		l6.setForeground(new Color(255, 255, 255));
		l6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		//l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l6.setBounds(40, 600, 90, 20);
		l2.add(l6);
		
		t3 = new JTextField("123-456-7890");
		t3.setForeground(Color.WHITE);
		t3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t3.setBounds(40, 625, 90, 19);
		t3.setBackground(new Color(37, 67, 98));
		t3.setBorder(null);
		t3.setColumns(10);
		l2.add(t3);
		
		t4 = new JTextField("abc@gmail.com");
		t4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t4.setForeground(Color.WHITE);
		t4.setBounds(40, 648, 96, 19);
		t4.setBackground(new Color(37, 67, 98));
		t4.setBorder(null);
		t4.setColumns(20);
		l2.add(t4);
		
		ta5 = new JTextArea("Shaitan gali,khatra\nmahal, andher nagar,\nsamshan ke samne");
		ta5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta5.setBounds(38, 670, 130, 60);
		ta5.setForeground(Color.WHITE);
		ta5.setBackground(new Color(37, 67, 98));
		l2.add(ta5);
		
		JLabel l7 = new JLabel("Interested Domain");
		l7.setForeground(new Color(37, 67, 98));
		//l7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l7.setFont(new Font("Century Gothic", Font.BOLD, 18));
		l7.setBounds(220, 263, 175, 15);
		l2.add(l7);
		
		ta6 = new JTextArea("Software Development, Web Development\nIOT, Testing and Automation");
		ta6.setForeground(new Color(37, 67, 98));
		ta6.setBackground(new Color(242,242,242,255));
		ta6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ta6.setBounds(220, 288, 230, 50);
		l2.add(ta6);
		
		
		JLabel l8 = new JLabel("Education");
		l8.setBackground(new Color(242, 242, 242, 255));
		l8.setForeground(new Color(37, 67, 98));
		//l8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l8.setFont(new Font("Century Gothic", Font.BOLD, 18));
		l8.setBounds(220, 350, 90, 20);
		l2.add(l8);
		
		ta8 = new JTextArea("Bachelor of Design/n2012-2015\nWardiere University\nThere are many variations of passages\navailable");
		ta8.setBackground(new Color(242, 242, 242, 255));
		ta8.setForeground(new Color(37, 67, 98));
		ta8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta8.setBounds(220, 380, 250, 75);
		l2.add(ta8);
		
		JLabel l9 = new JLabel("Work Experience");
		l9.setBackground(new Color(242, 242, 242, 255));
		l9.setForeground(new Color(37, 67, 98));
		//l9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l9.setFont(new Font("Century Gothic", Font.BOLD, 18));
		l9.setBounds(220, 530, 160, 25);
		l2.add(l9);
		
		ta10 = new JTextArea("2012-2020 - XYZ Company\n Graphics and Web Designer\n There are many variation\n Working with the wider development team.");
		ta10.setBackground(new Color(242, 242, 242, 255));
		ta10.setForeground(new Color(37, 67, 98));
		ta10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ta10.setBounds(220, 560, 250, 75);
		l2.add(ta10);
		
		JButton b1 = new JButton("SAVE");
		//b1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b1.setForeground(Color.WHITE);
		//b1.setBackground(new Color(240, 240, 240));
		b1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		b1.setContentAreaFilled(false);
		b1.setBounds(23, 100, 85, 30);
		l1.add(b1);
		b1.addActionListener(this);	
		
		JButton b2 = new JButton("PRINT");
		//b2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b2.setForeground(Color.WHITE);
		//b2.setBackground(new Color(240, 240, 240));
		//b2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		b2.setContentAreaFilled(false);
		b2.setBounds(23, 170, 85, 30);
		l1.add(b2);
		b2.addActionListener(this);	
		
		JButton b3 = new JButton("BACK");
		//b3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b3.setForeground(Color.WHITE);
		//b3.setBackground(new Color(240, 240, 240));
		//b3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		b3.setContentAreaFilled(false);
		b3.setBounds(23, 240, 85, 30);
		l1.add(b3);
		b3.addActionListener(this);	
		
		JButton b4 = new JButton("EXIT");
		//b4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b4.setForeground(Color.WHITE);
		//b4.setBackground(new Color(240, 240, 240));
		//b4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		b4.setContentAreaFilled(false);
		b4.setBounds(23, 310, 85, 30);
		l1.add(b4);
		b4.addActionListener(this);
		
		tfmo = new JTextField("Enter ph no");
		addPlaceholderStyle(tfmo);
		tfmo.setBounds(10,50,150,30);
		tfmo.setOpaque(false);
		l1.add(tfmo);

	}
	
	public void addPlaceholderStyle(JTextField t1){
		Font f1=tfmo.getFont();
		f1=f1.deriveFont(Font.ITALIC);
		t1.setFont(f1);
		t1.setForeground(Color.gray); 
	}
		public void actionPerformed(ActionEvent ae)
		{
			String s1=ae.getActionCommand();
			String mno = tfmo.getText().trim();
			if(s1.equals("SAVE")) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
					Statement stmt = conn.createStatement();
					String sql = "SELECT * FROM personaldetails WHERE mobile='"+ mno +"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next() == true) {
						t1.setText(rs.getString(1)+" "+rs.getString(2)); // fname
						t2.setText(" "); // lname
						t4.setText(rs.getString(5)); // email
						t3.setText(rs.getString(4)); // mno
						ta5.setText(rs.getString(7)); // addr
						ta3.setText(rs.getString(18)+"\n"+rs.getString(19)); // skill_name 18 & 19
						ta4.setText(rs.getString(8)); // intro
						ta8.setText(rs.getString(9)+"\n"+rs.getString(10)+"\n"+rs.getString(11)); // edu
						ta10.setText(rs.getString(12)+"\n"+rs.getString(13)+"\n"+rs.getString(14)); // work exp
						//ta6.setText(rs.getString(15)+"\n"+rs.getString(16)); // cert
						ta6.setText(rs.getString(20)); // domains
						//Blob blob;
						byte b[];				
						b = rs.getBytes("image");
						ImageIcon ico = new ImageIcon(b);
						Image img = ico.getImage();
						ImageIcon icoF = new ImageIcon(img);
						l3.setIcon(icoF);
					} else {
						JOptionPane.showMessageDialog(this,"Invalid Mobile.");
					}
					
				} catch(Exception e) {
					
				}
				JOptionPane.showMessageDialog(this,"Save");
					
			}
			if(s1.equals("PRINT")) {
				Print p = new Print();
				p.print(l2);
				JOptionPane.showMessageDialog(this,"Saved to File");	
			}
			if(s1.equals("BACK")) {
				new template();
				this.dispose();
			}
			if(s1.equals("EXIT")) {
				this.dispose();
				JOptionPane.showMessageDialog(this,"Thank You!");
			}
		}	
		
//		public static void main(String args[]){
//			Viewpage4 cv8 = new Viewpage4(); 
//		}
}
