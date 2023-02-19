package test;

import java.awt.*;

import javax.swing.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.awt.event.*;
import javax.swing.event.*;

import java.sql.*;
import java.util.ArrayList;
import java.io.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.awt.Font;
import java.awt.Color;


@SuppressWarnings("serial")
public class login extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2,t5;
	JPasswordField t3,t4,t6;
	ImageIcon i1,i2,i3,i4,i5,i6,i7;
	JRadioButton r1,r2;
	JPanel p1,p2,p3;
	ButtonGroup bg1;
	JCheckBox c1;
	CardLayout c;
	
	public login()
	{
		setSize(1600,900);
		setVisible(true);
		setLayout(null);
		setTitle("Login Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel();
		i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\bg1.jpg");
		l1.setIcon(i1);
		
		r1=new JRadioButton("Register");
		r2=new JRadioButton("Login");	
		
		r1.setOpaque(false); 
		r2.setOpaque(false);
		bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\register3.PNG");
		r1.setIcon(i2);
		i3=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\login6.PNG");
		r2.setIcon(i3);
		
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		
		p1=new JPanel();
		p1.setLayout(null);
		
		i4=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\user1.PNG");
		i5=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\mail2.PNG");
		i6=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\lock1.PNG");
		i7=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\confirm1.PNG");
			
		l2=new JLabel(i4);
		l3=new JLabel(i5);
		l4=new JLabel(i6);
		l5=new JLabel(i7);
		
		t1=new JTextField("Enter username");
		t2=new JTextField("Enter mail-id");
		t3=new JPasswordField("Enter password");
		t4=new JPasswordField("Confirm password");
			
		t1.setOpaque(false);
		t2.setOpaque(false);
		t3.setOpaque(false);
		t4.setOpaque(false);

		c1=new JCheckBox("I accept all terms & conditions");
		c1.setOpaque(false);
		
		b1=new JButton("Register");
		b1.setContentAreaFilled(false);
		b1.addActionListener(this);

		l1.setBounds(0,0,1950,950);  	
		r1.setBounds(500,40,400,150);
		r2.setBounds(900,35,400,150);
		
		c1.setForeground(Color.yellow);
		r1.setForeground(Color.white);
		r2.setForeground(Color.white);
		b1.setForeground(Color.white);
		
		Border g=BorderFactory.createLineBorder(Color.yellow,3);
		t1.setBorder(g);
		t3.setBorder(g);
		t2.setBorder(g);
		t4.setBorder(g); 
		
		b1.setBorder(g);
		
		Font f=new Font("Consolas",Font.BOLD,25);
		l2.setFont(f); t1.setFont(f);
		l3.setFont(f); t2.setFont(f);
		l4.setFont(f); t3.setFont(f);
		l5.setFont(f); t4.setFont(f);
		
		b1.setFont(f); 
		r1.setFont(f);
		r2.setFont(f);
		
		f=new Font("Consolas",Font.BOLD,20);
		c1.setFont(f);
			
		l2.setBounds(10,50,200,80);
		l3.setBounds(15,150,200,130);
		l4.setBounds(3,245,200,80);
		l5.setBounds(15,350,200,180);
		
//		l2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		l4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
//		l5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
			
		t1.setBounds(500,50,400,50);
		t2.setBounds(500,150,400,50);
		t3.setBounds(500,250,400,50);
		t4.setBounds(500,350,400,50);
		
		c1.setBounds(80,450,400,40); 
		b1.setBounds(200,550,300,50);
			
		p1.add(l2); p1.add(t1);
		p1.add(l3); p1.add(t2);
		p1.add(l4); p1.add(t3);
		p1.add(l5); p1.add(t4);
		p1.add(c1); p1.add(b1);
		
		p2=new JPanel();
		p2.setLayout(null);
		
		l6=new JLabel(i4);
		l7=new JLabel(i6);
		t5=new JTextField("Enter username");
		t6=new JPasswordField("Enter password");
		b2=new JButton("Login");
		b2.setContentAreaFilled(false);
		b2.addActionListener(this);
		
		c1.addActionListener(this);
		
		t5.setOpaque(false);
		t6.setOpaque(false);
		
		l6.setBounds(15,140,200,100);  
		l7.setBounds(3,255,200,80);
		
		t5.setBounds(500,150,400,50);
		t6.setBounds(500,250,400,50);
		b2.setBounds(200,400,300,50); 
		
		f=new Font("Consolas",Font.BOLD,25);
		l6.setFont(f);
		t5.setFont(f);
		t6.setFont(f);
		l7.setFont(f); 
		
		b2.setFont(f);
		
		l6.setForeground(Color.yellow);
		l7.setForeground(Color.yellow);
		b2.setForeground(Color.white);
		
		g=BorderFactory.createLineBorder(Color.yellow,3);
		t5.setBorder(g);
		t6.setBorder(g);
		b2.setBorder(g);
		
		p2.add(l6); 
		p2.add(t5);
		p2.add(t6);
		p2.add(l7); 
		p2.add(b2);
		
		c=new CardLayout();
		p3=new JPanel();
		p3.setLayout(c);
		p3.add(p1,"register");
		p3.add(p2,"login");

		p3.setBounds(350,150,1250,800);
		add(r1);
		add(r2); 
		add(p3);
		add(l1);
		p1.setOpaque(false);
		p2.setOpaque(false);
		p3.setOpaque(false);
		
		 addPlaceholderStyle(t1);
		 addPlaceholderStyle(t2);
         addPlaceholderStyle(t3);
		 addPlaceholderStyle(t4);
		 addPlaceholderStyle(t5);
		 addPlaceholderStyle(t6);
		
		 addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
		t1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t1FocusLost(evt);
            }
        });
		t2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t2FocusLost(evt);
            }
        });
		 t3.setEchoChar('\u0000');
        t3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               t3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t3FocusLost(evt);
            }
        });
		 t4.setEchoChar('\u0000');
        t4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               t4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t4FocusLost(evt);
            }
        });
		t5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t5FocusLost(evt);
            }
        });
		 t6.setEchoChar('\u0000');
		t6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               t6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t6FocusLost(evt);
            }
        });
		
				
	}
	public void addPlaceholderStyle(JTextField t1){
		Font f1=t1.getFont();
		f1=f1.deriveFont(Font.ITALIC);
		t1.setFont(f1);
		t1.setForeground(Color.gray); 
	}
	public void removePlaceholderStyle(JTextField t1){
		Font f1=t1.getFont();
		f1=f1.deriveFont(Font.PLAIN|Font.BOLD);
		t1.setFont(f1);
		t1.setForeground(Color.black);
	}
	
	 private void t1FocusGained(java.awt.event.FocusEvent evt) {                                   
        if(t1.getText().equals("Enter username")){
            t1.setText("");
            t1.requestFocus();
            removePlaceholderStyle(t1);   
        }
    } 
		private void t2FocusGained(java.awt.event.FocusEvent evt) {                                   
        if(t2.getText().equals("Enter mail-id")){
            t2.setText("");
            t2.requestFocus();
            removePlaceholderStyle(t2);   
        }
    } 
	

    private void t3FocusGained(java.awt.event.FocusEvent evt) {                                      
        if(t3.getText().equals("Enter password")){
            t3.setText("");
            t3.requestFocus();
            t3.setEchoChar('*');
            removePlaceholderStyle(t3);
        }
    }   
		 private void t4FocusGained(java.awt.event.FocusEvent evt) {                                      
        if(t4.getText().equals("Confirm password")){
            t4.setText("");
            t4.requestFocus();
            t4.setEchoChar('*');
            removePlaceholderStyle(t4);
        }
    }
	 private void t5FocusGained(java.awt.event.FocusEvent evt) {                                   
        if(t5.getText().equals("Enter username")){
            t5.setText("");
            t5.requestFocus();
            removePlaceholderStyle(t5);   
        }
    } 
	 private void t6FocusGained(java.awt.event.FocusEvent evt) {                                      
        if(t6.getText().equals("Enter password")){
            t6.setText("");
            t6.requestFocus();
            t6.setEchoChar('*');
            removePlaceholderStyle(t6);
        }
    } 

    private void t1FocusLost(java.awt.event.FocusEvent evt) {                             
        if(t1.getText().length()==0){
            addPlaceholderStyle(t1);
            t1.setText("Enter username");
        }
    } 
		private void t2FocusLost(java.awt.event.FocusEvent evt) {                             
        if(t2.getText().length()==0){
            addPlaceholderStyle(t2);
            t2.setText("Enter mail-id");
        }
    } 

    private void t3FocusLost(java.awt.event.FocusEvent evt) {                             
         if(t3.getText().length()==0){
            addPlaceholderStyle(t3);
            t3.setText("Enter password");
        }
	}
	private void t4FocusLost(java.awt.event.FocusEvent evt) {                             
         if(t4.getText().length()==0){
            addPlaceholderStyle(t4);
			 t4.setEchoChar('\u0000');
            t4.setText("Confirm password");
        }
   
    }   
	private void t5FocusLost(java.awt.event.FocusEvent evt) {                             
        if(t5.getText().length()==0){
            addPlaceholderStyle(t5);
            t5.setText("Enter username");
        }
    } 	
	private void t6FocusLost(java.awt.event.FocusEvent evt) {                             
         if(t6.getText().length()==0){
            addPlaceholderStyle(t6);
			 t6.setEchoChar('\u0000');
            t6.setText("Enter password");
        }
   
    } 

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {                                       
        this.requestFocusInWindow();
    }                                      

	public void actionPerformed(ActionEvent ae) {
		try {
			String s=ae.getActionCommand();
			if(r1.isSelected()) {
				c.show(p3,"register");
			}
			if(r2.isSelected()) {
				c.show(p3,"login");
			}
			if(ae.getSource()==b1) {
				String nm=t1.getText();
				String result = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5", "root" , "");
		            Statement stmt = conn.createStatement();
		            String uname, email, pass, cPass;
		            uname = t1.getText();
		            email = t2.getText();
		            pass = t3.getText().trim();
		            cPass = t4.getText().trim();
		            
		            jdbcInterface obj = (jdbcInterface) Naming.lookup("rmi://localhost:1099/db");
		            if(c1.isSelected()) {
		            	if(pass.equals(cPass)) {
		            		result = obj.Insert(uname, email, pass);
		            		JOptionPane.showMessageDialog(this,"Successfully Registered User: "+nm);
		            		new details1();
			            	this.dispose();
		            	} else {
		            		JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match.", "Invalid Password", JOptionPane.INFORMATION_MESSAGE);
		            	}	            	
		            } else {
		            	JOptionPane.showMessageDialog(null, "Please check the Terms and Conditions.", "T&C not checked.", JOptionPane.INFORMATION_MESSAGE);
		            }
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			if(ae.getSource()==b2)
			{
				String nm2=t5.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
		            Statement stmt = conn.createStatement();
		            jdbcInterface obj = (jdbcInterface) Naming.lookup("rmi://localhost:1099/db");
		            @SuppressWarnings("rawtypes")
					ArrayList result = obj.Search(nm2);
		            String pass = (String) result.get(2);
		            String uname = (String) result.get(0);
		            //System.out.println(pass.substring(8) + " " + uname.substring(9));
		            if(uname.substring(9).equals(t5.getText().trim())) {
		            	if (pass.substring(8).equals(t6.getText().trim())) {
		            		JOptionPane.showMessageDialog(this, "Your Login is Successful "+nm2);
		            		new details1();
		            		this.dispose();		            	
		            	} else {
		            		JOptionPane.showMessageDialog(this, "Invalid Password "+nm2);
		            	}
		            } else {
		            	JOptionPane.showMessageDialog(this, "Invalid username "+nm2);
		            }
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}	
		}catch(Exception e){}
	}	
	


//	public static void main(String args[]){
//		login cv1=new login();
//	}
}