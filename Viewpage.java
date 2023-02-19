package test;

import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Viewpage extends JFrame implements ActionListener
{
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	public ImageIcon i1,i2,i3,i4,i5;
	public JTextField tf1,tf2, tfmo;
	public JTextArea ta1,ta2,ta3,ta4,ta5,ta6,ta7;
	public JButton b1,b2,b3,b4;
	public String filename;
	
	public Viewpage()
	{
		setLayout(null);
		setSize(1950,950);
		setVisible(true);
		setTitle("View page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//getContentPane().setBackground(new Color(102,153,0));
		Font f1=new Font("Century Gothic",Font.BOLD,18);
		Font f2=new Font("Century Gothic",Font.BOLD,35);
		Font f3=new Font("Century Gothic",Font.BOLD,14);
		
		i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\bg3.jpeg");
		i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\r1.PNG");
		i3=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\msg2.png");
		i4=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\call1.PNG");
		i5=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\loc1.PNG");
		
		
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel("insert pic here");
		l4=new JLabel("First Name");
		l5=new JLabel("occupation");
		l6=new JLabel("CONTACTS: ");
		l7=new JLabel();
		l8=new JLabel();
		l9=new JLabel();
		l10=new JLabel("SKILLS: ");
		l11=new JLabel("ABOUT ME: ");
		l12=new JLabel("QUALIFICATION: ");
		l13=new JLabel("WORK EXPEREINCE: ");
		l14=new JLabel("CERTIFICATION/PROJECT: ");
		l15=new JLabel("INTERESTED DOMAINS: ");
		
		tf1=new JTextField("abc@gmail.com");
		tf2=new JTextField("987654321");
		ta1=new JTextArea("plot no 9,"+"\n gokuldham colony,"+"\n gadhi road,"+"\n mumbai");
		ta2=new JTextArea("photo/vedio "+"\nediting  rate:9/10");
		ta3=new JTextArea("i am an hardworking   "+"\ndisciplined person"+"\nwith technical background....");
		ta4=new JTextArea("B.TECH in computer enginnering"+"\n 2022 passout"+"\n9.2 cgpa");
		ta5=new JTextArea("software enginner"+"\n 6 months"+"\nat infosys");
		ta6=new JTextArea("web development"+"\n it included html,mongodb"+"\nwww.certi.com");
		ta7=new JTextArea("web development"+" | backend | "+"\n ui design");
		
		l1.setIcon(i1);
		l2.setIcon(i2);
		l7.setIcon(i3);
		l8.setIcon(i4);
		l9.setIcon(i5);
		l4.setFont(f2);
		l5.setFont(f1);
		l6.setFont(f3);
		l10.setFont(f3);
		l11.setFont(f3);
		l12.setFont(f3);
		l13.setFont(f3);
		l14.setFont(f3);
		l15.setFont(f3);
		
		b1=new JButton("Save");
		b2=new JButton("Print");
		b3=new JButton("Back");
		b4=new JButton("Exit");
		
		//b1.setOpaque(true);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
	//	ta3.setOpaque(false);
		ta3.setBackground(new Color(0,0,0,0));
		ta4.setBackground(new Color(0,0,0,0));
		ta5.setBackground(new Color(0,0,0,0));
		ta6.setBackground(new Color(0,0,0,0));
		ta7.setBackground(new Color(0,0,0,0));
		
		
		b1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		b4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		/*l12.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l14.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		l15.setBorder(BorderFactory.createLineBorder(Color.BLACK));*/
		
		
		tf2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
		tf1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
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
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l6.setForeground(Color.BLACK);
		l10.setForeground(Color.BLACK);
		l11.setForeground(Color.WHITE);
		ta3.setForeground(Color.WHITE);
		l12.setForeground(Color.BLACK);
		l13.setForeground(Color.BLACK);
		l14.setForeground(Color.BLACK);
		l15.setForeground(Color.BLACK);
		
		
		b1.setBounds(10,150,100,50);		//upper btns
		b2.setBounds(10,250,100,50);		
		b3.setBounds(10,350,100,50);	
		b4.setBounds(10,450,100,50);
		
		tfmo = new JTextField("Enter ph no");
		addPlaceholderStyle(tfmo);
		tfmo.setBounds(10,50,150,30);
		tfmo.setOpaque(false);
		
		addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                windowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            	
            }
        });
		tfmo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               // tfmoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
               // tfmoFocusLost(evt);
            }
        });
		
		l1.setBounds(0,0,1900,800);
		l2.setBounds(500,30,500,750);	//resume lbl
		l3.setBounds(100,80,100,100);	//photo lbls
		l4.setBounds(250,60,300,100);	//first_nm
		l5.setBounds(250,90,200,100);	//occupation
		l6.setBounds(20,230,100,50);	//contacts
		l7.setBounds(0,270,70,40);		//msg
		l8.setBounds(0,300,70,40);		//phno
		l9.setBounds(0,335,70,40);		//add
		l10.setBounds(20,390,100,50);	//skills
		l11.setBounds(20,590,100,40);	//abt me
		l12.setBounds(250,240,150,30);	//quali 
		l13.setBounds(250,370,150,30);	//work exp
		l14.setBounds(250,500,200,30);	//certi/project exp
		l15.setBounds(20,480,180,30);	//interested domains exp
				
		tf1.setBounds(80,270,130,40);	//msg tb
		tf2.setBounds(80,300,130,40);	//phno tb
		
		
		ta1.setBounds(80,335,130,80);	//add tb
		ta2.setBounds(20,430,150,50);	//skils tb
		ta3.setBounds(20,630,150,100);	//abt me tb
		ta4.setBounds(250,270,230,80);	//qualification tb
		ta5.setBounds(250,410,230,80);	//work exp tb
		ta6.setBounds(250,530,230,80);	//certi/project tb
		ta7.setBounds(20,520,150,50);	//interested domains tb
		
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
		l2.add(l7);
		l2.add(l8);
		l2.add(l9);
		l2.add(tf1);
		l2.add(tf2);
		l2.add(ta1);
		l2.add(l10);
		l2.add(ta2);
		l2.add(l11);
		l2.add(ta3);
		l2.add(l12);
		l2.add(ta4);
		l2.add(l13);
		l2.add(ta5);
		l2.add(l14);
		l2.add(ta6);
		l2.add(l15);
		l2.add(ta7);
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
	public void removePlaceholderStyle(JTextField t1){
		Font f1=tfmo.getFont();
		f1=f1.deriveFont(Font.PLAIN|Font.BOLD);
		t1.setFont(f1);
		t1.setForeground(Color.black);
	}
	 private void tfmoFocusGained(java.awt.event.FocusEvent evt) {                                   
        if(tfmo.getText().equals("Enter username")){
            tfmo.setText("");
            tfmo.requestFocus();
            removePlaceholderStyle(tfmo);   
        }
    }
	 private void tfmoFocusLost(java.awt.event.FocusEvent evt) {                                   
	        if(tfmo.getText().equals("")) {
	            tfmo.setText("Enter username");
	        }
	 }
	

	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		String mno = tfmo.getText().trim();
		
		// VIEW
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
					tf1.setText(rs.getString(5)); // email
					tf2.setText(rs.getString(4)); // mno
					ta1.setText(rs.getString(7)); // addr
					ta2.setText(rs.getString(18)+"\n"+rs.getString(19)); // skill_name 18 & 19
					ta3.setText(rs.getString(8)); // intro
					ta4.setText(rs.getString(9)+"\n"+rs.getString(10)+"\n"+rs.getString(11)); // edu
					ta5.setText(rs.getString(12)+"\n"+rs.getString(13)+"\n"+rs.getString(14)); // work exp
					ta6.setText(rs.getString(15)+"\n"+rs.getString(16)); // cert
					ta7.setText(rs.getString(20)); // domains
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
			
			JOptionPane.showMessageDialog(this,"Saved");
				
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
//	public static void main(String args[]){
//		Viewpage cv5=new Viewpage();
//	}
					
}