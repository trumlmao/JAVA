package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cas implements ActionListener {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cas window = new cas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cas() {
		initialize();
	}
	private float x1,x2,cm ;
	int dl;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 348, 139);
		frame.getContentPane().add(textArea);
		
		JButton NUM_7 = new JButton("7");
		NUM_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
			}
		});
		NUM_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_7.setBounds(10, 159, 60, 45);
		frame.getContentPane().add(NUM_7);
		
		JButton NUM_8 = new JButton("8");
		NUM_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
			}
		});
		NUM_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_8.setBounds(80, 159, 60, 45);
		frame.getContentPane().add(NUM_8);
		
		JButton NUM_9 = new JButton("9");
		NUM_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
			}
		});
		NUM_9.setRolloverEnabled(false);
		NUM_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_9.setBounds(150, 159, 60, 45);
		frame.getContentPane().add(NUM_9);
		
		JButton NUM_4 = new JButton("4");
		NUM_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
			}
		});
		NUM_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_4.setBounds(10, 214, 60, 45);
		frame.getContentPane().add(NUM_4);
		
		JButton NUM_5 = new JButton("5");
		NUM_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
			}
		});
		NUM_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_5.setBounds(80, 214, 60, 45);
		frame.getContentPane().add(NUM_5);
		
		JButton NUM_6 = new JButton("6");
		NUM_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
			}
		});
		NUM_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_6.setBounds(150, 214, 60, 45);
		frame.getContentPane().add(NUM_6);
		
		JButton NUM_1 = new JButton("1");
		NUM_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
			}
		});
		NUM_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_1.setBounds(10, 269, 60, 45);
		frame.getContentPane().add(NUM_1);
		
		JButton NUM_2 = new JButton("2");
		NUM_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
			}
		});
		NUM_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_2.setBounds(80, 269, 60, 45);
		frame.getContentPane().add(NUM_2);
		
		JButton NUM_3 = new JButton("3");
		NUM_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
			}
		});
		NUM_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_3.setBounds(150, 269, 60, 45);
		frame.getContentPane().add(NUM_3);
		
		JButton CLOE = new JButton("CLOSE");
		CLOE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		CLOE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CLOE.setBounds(237, 159, 121, 45);
		frame.getContentPane().add(CLOE);
		
		JButton NUM_PLUS = new JButton("+");
		NUM_PLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d = textArea.getText();dl = d.length();
				x1 = Float.parseFloat(d);
				cm = 1;
				 textArea.append("+");
			}
		});
		NUM_PLUS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_PLUS.setBounds(237, 214, 51, 45);
		frame.getContentPane().add(NUM_PLUS);
		
		JButton NUM_BY = new JButton("*");
		NUM_BY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String d = textArea.getText();
				dl = d.length();
				x1 = Float.parseFloat(d);
				cm = 3;
				 textArea.append("*");
			}
		});
		NUM_BY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_BY.setBounds(307, 214, 51, 45);
		frame.getContentPane().add(NUM_BY);
		
		JButton NUM_DIV = new JButton("/");
		NUM_DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String d = textArea.getText();dl = d.length();
				x1 = Float.parseFloat(d);
				cm = 4;
				textArea.append("/");
				 
			}
		});
		NUM_DIV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_DIV.setBounds(307, 269, 51, 45);
		frame.getContentPane().add(NUM_DIV);
		
		JButton NUM_la = new JButton("-");
		NUM_la.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d = textArea.getText();
				x1 = Float.parseFloat(d);
				cm = 2;
				 textArea.append("-");
			}
		});
		NUM_la.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_la.setBounds(237, 269, 51, 45);
		frame.getContentPane().add(NUM_la);
		
		JButton NUM_EQUAr = new JButton("=");
		NUM_EQUAr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d = textArea.getText();
				d = d.substring(dl+1,d.length());
				
				x2 = Float.parseFloat(d);
				float c ;
				if (cm == 1) {
					c = x1 + x2;
					textArea.append("=" + Float.toString(c));
				}else if (cm == 2){
					c = x1 - x2;
					textArea.append("=" + Float.toString(c));
				}else if (cm == 3){
					c = x1 * x2;
					textArea.append("=" + Float.toString(c));
				}else if (cm == 4){
					c = x1 / x2;
					textArea.append("=" + Float.toString(c));
				}
			}
		});
		NUM_EQUAr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_EQUAr.setBounds(247, 324, 111, 45);
		frame.getContentPane().add(NUM_EQUAr);
		
		JButton NUM_0 = new JButton("0");
		NUM_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
			}
		});
		NUM_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_0.setBounds(80, 324, 60, 45);
		frame.getContentPane().add(NUM_0);
		
		JButton NUM_DEl = new JButton("DEL");
		NUM_DEl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d = textArea.getText();
				d = d.substring(0,d.length()-1);
				textArea.setText(d);
			}
		});
		NUM_DEl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		NUM_DEl.setBounds(150, 324, 87, 45);
		frame.getContentPane().add(NUM_DEl);
		
	}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String s = e.getActionCommand();
			System.out.println(s);
}
}
