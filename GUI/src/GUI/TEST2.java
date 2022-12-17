package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TEST2 extends JFrame {
	public TEST2() {
		this.setTitle("TEST");
		this.setSize(600,400);
		this.setLocation(100,100);
		
		
		
		BorderLayout  flow = new BorderLayout(15,15);
		FlowLayout flow1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout flow2 = new FlowLayout();
		
		
		this.setLayout(flow);
		//this.setLayout(flow);
		
		/*for (int i =0; i <10; i++) {
			JButton Jb1 = new JButton(i + "");
			this.add(Jb1);
		}*/
		
		
		
		
		
		JButton Jb1 = new JButton("Jb1");
		JButton Jb2 = new JButton("Jb2");
		JButton Jb3 = new JButton("Jb3");
		
		this.add(Jb1,BorderLayout.NORTH);
		this.add(Jb2,BorderLayout.SOUTH);
		this.add(Jb3,BorderLayout.EAST);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new TEST2();
	}
}
