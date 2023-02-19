package test;

import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class template extends JFrame implements ActionListener
{
	ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	CardLayout c1;
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9;

	public template()
	{
		//getContentPane().setBackground(new Color(192,237,231));
		setLayout(null);
		setSize(1600, 950);
		setVisible(true);
		setTitle("Template Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Font f1=new Font("Century Gothic",Font.BOLD,30);
		
		i1=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\temp1.PNG");
		i2=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\temp2.PNG");
		i3=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\temp3.PNG");
		i4=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\temp4.PNG");
		i5=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\temp05.PNG");
		i6=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\bg2.jpg");
		i7=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\logout.PNG");
		i8=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\lr1.PNG");
		i9=new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\ra.PNG");
		
		l1=new JLabel();
		l1.setIcon(i6);
		l17=new JLabel("Choose a template");
					
		b1=new JButton(i8);
		b2=new JButton(i9);
		b3=new JButton(i7);
		
		b4=new JButton(i1);
		b5=new JButton(i2);
		b6=new JButton(i3);
		b7=new JButton(i4);
		b8=new JButton(i5);
			
		p1=new Panel();
		p1.setBounds(250,200,400,580);
		p1.setBackground(new Color(57,65,184,0));
		c1=new CardLayout();
		p1.setLayout(c1);
		
		b4.setIcon(i1);
		b5.setIcon(i2);
		b6.setIcon(i3);
		b7.setIcon(i4);
		b8.setIcon(i5);
			
		l17.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		b6.setContentAreaFilled(false);
		b7.setContentAreaFilled(false);
		b8.setContentAreaFilled(false);
		
		b1.setOpaque(false); 
		b2.setOpaque(false);
		b3.setOpaque(false);
		b4.setOpaque(false); 
		b5.setOpaque(false);
		b6.setOpaque(false);
		b7.setOpaque(false); 
		b8.setOpaque(false);
		
		
		
		
		l17.setForeground(Color.YELLOW);
		b1.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b2.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b3.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		
		b4.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b5.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b6.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b7.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		b8.setBorder(BorderFactory.createLineBorder(new Color(57,65,184,0)));
		
		
		
		l1.setBounds(0,0,1950,950);
		l17.setBounds(300,50,500,100);
		b1.setBounds(150,400,100,100);
		b2.setBounds(660,400,100,100);
		b3.setBounds(50,50,100,100);
				
		add(l1);
		l1.add(l17);	
		l1.add(b1);
		l1.add(b2);	
		l1.add(b3);
		

		p2=new Panel();
		p2.setBackground(new Color(82,114,173,0));
		p2.add(b4); 
		
		p3=new Panel();
		p3.setBackground(new Color(82,114,173,0));
		p3.add(b5);
			
		p4=new Panel();
		p4.setBackground(new Color(82,114,173,0));
		p4.add(b6); 
				
		p5=new Panel();
		p5.setBackground(new Color(82,114,173,0));
		p5.add(b7);
			
		p6=new Panel();
		p6.setBackground(new Color(82,114,173,0));
		p6.add(b8);
	
		p1.add(p2,"c1");
		p1.add(p3,"c1");
		p1.add(p4,"c1");
		p1.add(p5,"c1");
		p1.add(p6,"c1");
		
		l1.add(p1);		
		b1.addActionListener(this);
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);	
		b5.addActionListener(this);	
		b6.addActionListener(this);	
		b7.addActionListener(this);	
		b8.addActionListener(this);	
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			c1.previous(p1);
			
		}
		if(ae.getSource()==b2)
		
		{
			c1.next(p1);	
		}
		if(ae.getSource()==b3) {
			//new MT_pg2();
			new details1();
			this.dispose();	
		}
		if(ae.getSource()==b4) {
			new Viewpage5();
			this.dispose();			
		}
		if(ae.getSource()==b5)
		{
			new Viewpage();
			this.dispose();
		}
		if(ae.getSource()==b6)
		{
			new Viewpage2();
			this.dispose();	
			
		}
		if(ae.getSource()==b7)
		{
			new Viewpage4();
			this.dispose();	
			
		}
		if(ae.getSource()==b8)
		{
			new Viewpage3();
			this.dispose();
			
		}
	}
	
//	public static void main(String args[]){
//		template cv3=new template();
//	}
					
}
