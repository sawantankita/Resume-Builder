package test;

import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Container;

import javax.swing.border.Border;

public class welcome extends JFrame
{    
int i=0;
Container ct=getContentPane();

public void createWindow()
{      

	//JFrame
	JFrame frame = new JFrame();
	setTitle("RESUME BUILDER");
	setLocationRelativeTo(null);
	
	
	//Background Image
	
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Om\\eclipse-workspace\\miniproject\\src\\test\\icons\\bg01.jpg"));
	background.setLayout(new FlowLayout());
	
	
	
	//label

	JLabel textlabel = new JLabel("<html>RESUME<br/><p>&emsp BUILDER</p></html>",SwingConstants.CENTER);  
	textlabel.setPreferredSize(new Dimension(620,500));
	textlabel.setForeground(Color.blue);
	Font font = new Font("Algerian", Font.BOLD,65);
	textlabel.setFont(font);
	textlabel.setHorizontalAlignment(JLabel.CENTER);
	ct.add(textlabel);
	background.add(textlabel);
	ct.add(background);
	
	
	//progress bar
	
	JProgressBar jb;
	jb=new JProgressBar(0,1000);
	jb.setBounds(100,400,20,20);
    jb.setValue(0);
    jb.setStringPainted(true);
    ct.add(jb);
	jb.setSize(550,25);
	ct.setLayout(new FlowLayout());
	
	jb.setStringPainted(true);
	jb.setString("LOADING ...");
	jb.setForeground(Color.green);
	
	//Iteration
	
        while (i <= 1000) 
		{
			jb.setValue(i);
            i += 5;
			try {
				Thread.sleep(20);
				if(i == 1000) {
					new login();
					this.dispose();
				}
            }
			catch (Exception e) {}
        }
}


public static void main(String ... args)
{   
	welcome w = new welcome();
	

	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	w.setPreferredSize(new Dimension(800,480));
	w.pack();
	w.setVisible(true); 
	
	
	w.createWindow(); 
	
	
} 
}