package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;

public class r extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					r frame = new r();
					frame.setSize(600, 700);
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
	public r() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel MENU = new JPanel();
		getContentPane().add(MENU, BorderLayout.WEST);
		MENU.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel function_1 = new JPanel();
		MENU.add(function_1);
		function_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton fuc1_JBT_1 = new JButton("Chức năng 1");
		function_1.add(fuc1_JBT_1);
		
		JButton btnNewButton = new JButton("Chức năng 2");
		function_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		function_1.add(btnNewButton_1);
		
		JPanel function_2 = new JPanel();
		MENU.add(function_2);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setRowHeaderView(panel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton JBT_menu_khachhang = new JButton("Khách Hàng");
		menuBar.add(JBT_menu_khachhang);
		
		JButton JBT_menu_Phong = new JButton("Nhân Viên");
		menuBar.add(JBT_menu_Phong);
		
		
	}

}
