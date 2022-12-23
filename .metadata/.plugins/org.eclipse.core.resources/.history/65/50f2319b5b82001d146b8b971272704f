package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.conttrol;
import model.CounterModel;


public class CounterView extends JFrame{
	private CounterModel countermodel;
	private JButton JButton_up;
	private JButton JButton_down;
	private JLabel JLabel_value;
	public CounterView() {
		this.countermodel = new CounterModel();
		this.init();
		this.setVisible(true);
		
	}
	public void init() {
		this.setTitle("Counter");
		
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener ac = new conttrol(this);
		
		JButton_up = new JButton("UP");
		JButton_up.addActionListener(ac);
		JButton_down = new JButton("DOWN");
		JButton_down.addActionListener(ac);
		JLabel_value = new JLabel(this.countermodel.getValue()+"", JLabel.CENTER);
		
		JPanel JP = new JPanel();
		JP.setLayout(new BorderLayout());
		JP.add(JButton_up,BorderLayout.WEST);
		JP.add(JButton_down,BorderLayout.EAST);
		JP.add(JLabel_value,BorderLayout.CENTER);
		
		
		this.setLayout(new BorderLayout());
		this.add(JP,BorderLayout.CENTER);
		
	}
	public void increment() {
		this.countermodel.increment();
		this.JLabel_value.setText((this.countermodel.getValue()+""));
		
	}
	public void decrement() {
		this.countermodel.decrement();
		this.JLabel_value.setText((this.countermodel.getValue()+""));
	}
}
