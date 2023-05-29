package xmlxml;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import xmlxml.cr;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class sad extends JFrame {

	private JPanel contentPane;
	private JTextField Jtf_username;
	private JTextField Jtf_pass;
	private JTextField Jtf_name;
	private JTextField jtf_age;
	private JTextField jtf_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sad frame = new sad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sad() {
		xml_MODEL model = new xml_MODEL();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Jtf_username = new JTextField();
		Jtf_username.setBounds(98, 10, 420, 19);
		contentPane.add(Jtf_username);
		Jtf_username.setColumns(10);
		
		Jtf_pass = new JTextField();
		Jtf_pass.setColumns(10);
		Jtf_pass.setBounds(98, 39, 420, 19);
		contentPane.add(Jtf_pass);
		
		Jtf_name = new JTextField();
		Jtf_name.setColumns(10);
		Jtf_name.setBounds(98, 68, 420, 19);
		contentPane.add(Jtf_name);
		
		jtf_age = new JTextField();
		jtf_age.addKeyListener(new KeyAdapter() {
			
			int x;
			public void keyReleased(KeyEvent e) {
				try {
			        x = Integer.parseInt(jtf_age.getText());
			    } catch (NumberFormatException nfe) {
			    	jtf_age.setText("");
			    }
				
			}
		});
		jtf_age.setColumns(10);
		jtf_age.setBounds(98, 97, 420, 19);
		contentPane.add(jtf_age);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(10, 10, 78, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 39, 78, 19);
		contentPane.add(lblPass);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 68, 78, 19);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setBounds(10, 97, 78, 19);
		contentPane.add(lblAge);
		
		JButton btnNewButton = new JButton("GHI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write();
			}
		});
		btnNewButton.setBounds(187, 194, 85, 21);
		contentPane.add(btnNewButton);
		
		jtf_id = new JTextField();
		jtf_id.setColumns(10);
		jtf_id.setBounds(98, 126, 420, 19);
		contentPane.add(jtf_id);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 129, 78, 19);
		contentPane.add(lblId);
		
		JButton btnNewButton_1 = new JButton("write consolt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consoleread();
			}
		});
		btnNewButton_1.setBounds(282, 194, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("profile");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showprofile();
			}
		});
		btnNewButton_2.setBounds(187, 251, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr sr = new cr();
				String name = Jtf_name.getText();
				int age = Integer.parseInt(jtf_age.getText());
				sr.add(name, age);
			}
		});
		btnNewButton_3.setBounds(260, 294, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("change");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change();
			}
		});
		btnNewButton_4.setBounds(98, 305, 85, 21);
		contentPane.add(btnNewButton_4);
		
	}
	public void change() {
		String id = jtf_id.getText();
		xml_MODEL model = new xml_MODEL();
		cr cr = new cr();
		model = cr.read(id);
		edit edit = new edit(id,model.name,model.age);
		edit.setVisible(true);
	}
	public void write() {
		String id = jtf_id.getText();
		String username = Jtf_username.getText();
		String pass = Jtf_pass.getText();
		String name = Jtf_name.getText();
		int age = Integer.parseInt(jtf_age.getText());
		
		
		
	   cr cr =new cr();
	   cr.create(id, username, pass, name, age);
	    
	}
	public void consoleread() {
		cr cr = new cr();
		String id = jtf_id.getText();
		cr.read(id);
		
	}
	public void showprofile() {
		xml_MODEL model = new xml_MODEL();
		cr cr = new cr();
		String id = jtf_id.getText();
		model = cr.read(id);
		profile profile = new profile(model.id,model.name,model.age);
		profile.setVisible(true);
	}
}
