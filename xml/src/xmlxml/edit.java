package xmlxml;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class edit extends JFrame {

	private JPanel contentPane;
	private JTextField jtf_name;
	private JTextField jtf_age;

	public edit(String id,String name,int age) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtf_name = new JTextField();
		jtf_name.setColumns(10);
		jtf_name.setBounds(147, 39, 105, 19);
		contentPane.add(jtf_name);
		
		jtf_age = new JTextField();
		jtf_age.setColumns(10);
		jtf_age.setBounds(147, 68, 105, 19);
		jtf_age.setText(Integer.toString(age));
		contentPane.add(jtf_age);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(20, 13, 78, 19);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 42, 39, 19);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(20, 71, 39, 19);
		contentPane.add(lblAge);
		
		JLabel jlabel_id = new JLabel(id);
		jlabel_id.setBounds(147, 16, 78, 19);
		contentPane.add(jlabel_id);
		
		JButton btnNewButton = new JButton("Change");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change(id);
			}
		});
		btnNewButton.setBounds(69, 137, 85, 21);
		contentPane.add(btnNewButton);
	}
	public void change(String id) {
		String new_name = jtf_name.getText();
		int new_age = Integer.parseInt(jtf_age.getText());
		cr cr = new cr();
		cr.change(id,new_name,new_age);
}
}
