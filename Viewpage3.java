package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * TODO:
 * 	Search --> DONE
 * 	Resolution
 * 	Register-> login
 * 	Attach photo n save...
 */

public class Viewpage3 extends JFrame implements ActionListener {
	public JLabel labelEmail, labelMobile, labelWeb, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	public ImageIcon i1,i2,i3,i4,i5;
	public JTextField tf1, tf2, tfmo;
	public JTextArea ta1,ta2,ta3,ta4,ta5,ta6,ta7, eduTA, skillsTA;
	public JButton b1,b2,b3,b4;
	public String filename;
	
	public Viewpage3() {
		setLayout(null);
		setSize(1366, 900);
		setVisible(true);
		setTitle("View page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//getContentPane().setBackground(new Color(102,153,0));
		Font f1=new Font("Century Gothic", Font.BOLD,18);
		Font f2=new Font("Century Gothic", Font.BOLD,35);
		Font f3=new Font("Century Gothic", Font.BOLD,14);
		Font f4=new Font("Century Gothic", Font.PLAIN,12);
		
			// i1=new ImageIcon("bg3.jpg");
			// i2=new ImageIcon("r3.PNG");
		i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\bg3.jpeg");
		i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\r3.PNG");
		// i3=new ImageIcon("msg2.png");
		// i4=new ImageIcon("call1.png");
		// i5=new ImageIcon("loc1.png");
		
		
		l1=new JLabel();
		l2=new JLabel();
		
		l3=new JLabel(" insert pic here");
		l4=new JLabel("First Name");
		l5=new JLabel("occupation");
		
		l6=new JLabel("CONTACT: ");
			// l7=new JLabel();
			// l8=new JLabel();
			// l9=new JLabel();
		/*l10=new JLabel("SKILLS: ");
		l11=new JLabel("ABOUT ME: ");
		l12=new JLabel("QUALIFICATION: ");
		l13=new JLabel("WORK EXPEREINCE: ");
		l14=new JLabel("CERTIFICATION/PROJECT: ");
		l15=new JLabel("INTERESTED DOMAINS: ");*/
		l10 = new JLabel("Education");
		l11 = new JLabel("Work Experience");
		l12 = new JLabel("Personal Skill");
		
			// tf1=new JTextField("abc@gmail.com"); // email
			// tf2=new JTextField("987654321"); // mobile
		ta1=new JTextArea("plot no 9,"+"\n gokuldham colony,"+"\n gandhi road,"+"\n mumbai");
		ta2 = new JTextArea("B. Tech in Computer Engineering" + "\n2022-2024 (expected)");
		ta3=new JTextArea("Software Developer" + "\nInfosys" + "\n2021-present");
		ta3.setFont(f3);
		ta4=new JTextArea("Python" + "\nJava" + "\nC++");

			// ta5=new JTextArea("Web Development"+"\nIt included html,mongodb"+"\nwww.certi.com");
		ta6=new JTextArea("I am a hardworking, disciplined "+"\nindividual with robust problem-"+"\nsolving skills and proven" + "\nexperience in software" + "\ndevelopment.");
		eduTA = new JTextArea("Bachelor of Technology\n2021-2024\nPCCOE, Pune");
			// ta7=new JTextArea("web development"+" | backend | "+"\n ui design");
		
		l1.setIcon(i1);
		l2.setIcon(i2);
			// l7.setIcon(i3);
			// l8.setIcon(i4);
			// l9.setIcon(i5);
		l4.setFont(f2);
		l5.setFont(f1);
		l6.setFont(f3);
		l10.setFont(new Font("Century Gothic", Font.BOLD, 16));
		l11.setFont(new Font("Century Gothic", Font.BOLD, 16));
		l12.setFont(new Font("Century Gothic", Font.BOLD, 16));
		// l13.setFont(f3);
		// l14.setFont(f3);
		// l15.setFont(f3);
		
		labelEmail = new JLabel("abc@gmail.com");
		labelEmail.setFont(f4);
		labelEmail.setForeground(Color.WHITE);
		labelEmail.setBounds(95, 190, 130, 40);

		labelMobile = new JLabel("9876543210");
		labelMobile.setFont(f4);
		labelMobile.setForeground(Color.WHITE);
		labelMobile.setBounds(95, 175, 130, 40);

		labelWeb = new JLabel("linkedin.com");
		labelWeb.setFont(f4);
		labelWeb.setForeground(Color.WHITE);
		labelWeb.setBounds(95, 208, 150, 40);

		eduTA.setBackground(new Color(0,0,0,0));
		eduTA.setFont(f3);
		eduTA.setForeground(Color.WHITE);
		eduTA.setBounds(335, 325, 230, 80);

		b1=new JButton("Save");
		b2=new JButton("Print");
		b3=new JButton("Back");
		b4=new JButton("Exit");
		
			// tf1.setOpaque(true);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		//ta3.setOpaque(false);
		ta3.setBackground(new Color(0,0,0,0));
		ta4.setBackground(new Color(0,0,0,0));
		
			// ta5.setBackground(new Color(0,0,0,0));
			// ta5.setForeground(Color.WHITE);
		ta6.setBackground(new Color(0,0,0,0));
		// ta7.setBackground(new Color(0,0,0,0));
		
			// tf1.setBackground(new Color(0,0,0,0));
			// tf2.setBackground(new Color(0,0,0,0));
		ta1.setBackground(new Color(0,0,0,0));
		
		
		b1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			//l2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		/*l12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l15.setBorder(BorderFactory.createLineBorder(Color.BLACK));*/
		
		
			// tf2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
			// tf1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
		/*ta1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ta2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ta3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ta4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ta5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ta6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ta7.setBorder(BorderFactory.createLineBorder(Color.BLACK));*/
			
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		l3.setForeground(Color.BLACK);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l6.setForeground(Color.WHITE);
		l10.setForeground(new Color(33, 41, 73));
		l11.setForeground(new Color(33, 41, 73));
		l12.setForeground(new Color(33, 41, 73));
		ta3.setForeground(Color.WHITE);
		// l13.setForeground(Color.BLACK);
		// l14.setForeground(Color.BLACK);
		// l15.setForeground(Color.BLACK);
		
		skillsTA = new JTextArea("Python" + "\nC/C++" + "\nJava" + "\nWeb Development" + "\nAndroid Development");
		skillsTA.setBackground(new Color(0,0,0,0));
		skillsTA.setForeground(Color.WHITE);
		skillsTA.setFont(f3);
		skillsTA.setBounds(335, 565, 150, 100);
		
		b1.setBounds(10,150,100,50);		//upper btns
		b2.setBounds(10,250,100,50);		
		b3.setBounds(10,350,100,50);	
		b4.setBounds(10,450,100,50);
		
		l1.setBounds(0,0,1900,800);
		l2.setBounds(500,30,500,750);	//resume lbl
		
		l3.setBounds(375,65,100,100);	// photo lbls -> done
		l4.setBounds(40,10,200,130);	//first_nm -> done
		l5.setBounds(40,60,130,100);	//occupation -> done
		
		l6.setBounds(70,155,150,30);	//contacts 
			// l7.setBounds(230,240,70,40);		//msg
			// l8.setBounds(230,280,70,40);		//phno
			// l9.setBounds(230,320,70,40);		//add

		l10.setBounds(327,268,100,50);	// education
		l11.setBounds(115,391,200,40);	// work exp
		l12.setBounds(327,508,100,50);	// personal skills 
		// l13.setBounds(250,370,150,30);	//work exp
		// l14.setBounds(250,500,200,30);	//certi/project exp
		// l15.setBounds(20,480,180,30);	//interested domains exp
				
			// tf1.setBounds(95,192,130,40);	//msg tb
			// tf2.setBounds(95,175,130,40);	//phno tb
		ta1.setBounds(300,320,130,80);	//add tb
		ta2.setBounds(20,430,150,50);	//skils tb
		ta3.setBounds(80,450,150,100);	//abt me tb
		ta4.setBounds(0,270,70,40);	//qualification tb 
			// ta5.setBounds(250,550,230,80);	//work exp tb
		ta6.setBounds(70,270,230,80);	//certi/project tb
		ta6.setFont(f4);
		ta6.setForeground(Color.WHITE);
		// ta7.setBounds(20,520,150,50);	//interested domains tb
		
		add(l1);
		l1.add(l2);
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l2.add(l3);
		l2.add(l4);
		l2.add(l5);
		l2.add(l6);
			// l2.add(l7);
			// l2.add(l8);
			// l2.add(l9);
		l2.add(labelEmail);
		l2.add(labelMobile);
		l2.add(labelWeb);
		l2.add(eduTA);
		l2.add(skillsTA);
		// l2.add(tf2);
		// l2.add(ta1);

		l2.add(l10);
		// l2.add(ta2);
		l2.add(l11);
		l2.add(ta3);
		l2.add(l12);
		// l2.add(ta4);

		/**
		 * l10:ta2, l11:ta3, l12:ta4 completed;
		*/
		
		// l2.add(l13);
			// l2.add(ta5);
		// l2.add(l14);
		l2.add(ta6);
		// l2.add(l15);
		// l2.add(ta7);
		
		tfmo = new JTextField("Enter ph no");
		addPlaceholderStyle(tfmo);
		tfmo.setBounds(10,50,150,30);
		tfmo.setOpaque(false);
		l1.add(tfmo);
				
		b1.addActionListener(this);
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);
	}
	
	public void addPlaceholderStyle(JTextField t1){
		Font f1=tfmo.getFont();
		f1=f1.deriveFont(Font.ITALIC);
		t1.setFont(f1);
		t1.setForeground(Color.gray); 
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s1=ae.getActionCommand();
		String mno = tfmo.getText().trim();
		if(s1.equals("Save")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
				Statement stmt = conn.createStatement();
				String sql = "SELECT * FROM personaldetails WHERE mobile='"+ mno +"'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next() == true) {
					l4.setText(rs.getString(1)+" "+rs.getString(2)); // fname
					l5.setText(" "); // lname
					labelEmail.setText(rs.getString(5)); // email
					labelMobile.setText(rs.getString(4)); // mno
					ta1.setText(rs.getString(7)); // addr
					skillsTA.setText(rs.getString(18)+"\n"+rs.getString(19)); // skill_name 18 & 19
					ta6.setText(rs.getString(8)); // intro
					labelWeb.setText(rs.getString(6));
					eduTA.setText(rs.getString(9)+"\n"+rs.getString(10)+"\n"+rs.getString(11)); // edu
					ta3.setText(rs.getString(12)+"\n"+rs.getString(13)+"\n"+rs.getString(14)); // work exp
						// ta6.setText(rs.getString(15)+"\n"+rs.getString(16)); // cert
						// ta7.setText(rs.getString(20)); // domains
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
				e.printStackTrace();
			}
			//JOptionPane.showMessageDialog(this,"Save");
		}
		if(s1.equals("Print")) {
			Print p = new Print();
			p.print(l2);
			JOptionPane.showMessageDialog(this,"Saved to File");
		}
		if(s1.equals("Back")) {
			new template();
			this.dispose();
				
		}
		if(s1.equals("Exit")) {
			this.dispose();
			JOptionPane.showMessageDialog(this,"Thank You!");
		}
	}
	public static void main(String args[]) {
		Viewpage3 cv7 = new Viewpage3();
	}					
}