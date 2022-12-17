package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Test extends JFrame {
	
	public Test() {
		
	}
	public static void main(String[ ]args) {
		JFrame frame = new JFrame("TEST");
		frame.setSize(800,600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		while(true) {
			System.out.println("chuong trinh dang chay");
		}
		
	}
	
}