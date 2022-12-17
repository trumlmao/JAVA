package GUI;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class caculator extends JFrame {
	public  caculator() {
		this.setTitle("caculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// chinh jtext 
		JTextField jtext = new JTextField(50);
		JPanel jp_head = new JPanel();
		jp_head.setLayout(new BorderLayout());
		jp_head.add(jtext,BorderLayout.CENTER);
		
		//jp_but chinh
		JPanel jp_but = new JPanel();
		jp_but.setLayout(new GridLayout(5,3));
	
		JButton Jb0 = new JButton("0");
		JButton Jb1 = new JButton("1");
		JButton Jb2 = new JButton("2");
		JButton Jb3 = new JButton("3");
		JButton Jb4 = new JButton("4");
		JButton Jb5 = new JButton("5");
		JButton Jb6 = new JButton("6");
		JButton Jb7 = new JButton("7");
		JButton Jb8 = new JButton("8");
		JButton Jb9 = new JButton("9");
		JButton Jb_cong = new JButton("+");
		JButton Jb_tru = new JButton("-");
		JButton Jb_nhan = new JButton("*");
		JButton Jb_chia = new JButton("/");
		JButton Jb_bang = new JButton("=");
		
		jp_but.add(Jb0);
		jp_but.add(Jb1);
		jp_but.add(Jb2);
		jp_but.add(Jb3);
		jp_but.add(Jb4);
		jp_but.add(Jb5);
		jp_but.add(Jb6);
		jp_but.add(Jb7);
		jp_but.add(Jb8);
		jp_but.add(Jb9);
		jp_but.add(Jb_cong);
		jp_but.add(Jb_tru);
		jp_but.add(Jb_nhan);
		jp_but.add(Jb_chia);
		jp_but.add(Jb_bang);
		
		
		
		//Sap xep Layout chinh
		this.setLayout(new BorderLayout());
		this.add(jp_but,BorderLayout.CENTER);
		this.add(jp_head,BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new caculator();
	}
}
