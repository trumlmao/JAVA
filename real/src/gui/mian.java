package gui;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTabbedPane;


import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Frame;
import javax.swing.JLabel;



public class mian {

	JFrame JF_MAIN;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mian window = new mian();
					window.JF_MAIN.setLocationRelativeTo(null);
					window.JF_MAIN.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mian() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
		JF_MAIN = new JFrame();
		JF_MAIN.setTitle("QUẢN LÝ KHACH SẠN");
		JF_MAIN.setBounds(100, 100, 1024, 768);
		JF_MAIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF_MAIN.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel JP_MENU = new JPanel();
		JP_MENU.setBorder(new LineBorder(new Color(0, 0, 0)));
		JF_MAIN.getContentPane().add(JP_MENU, BorderLayout.WEST);
		JP_MENU.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton JBT_MENU_PHONG = new JButton("PHÒNG");
		JBT_MENU_PHONG.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JBT_MENU_PHONG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JF_PHONG Phong = new JF_PHONG();  
			Phong.setVisible(true);
			JF_MAIN.dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ KHÁCH SẠN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		JP_MENU.add(lblNewLabel);
			
		JP_MENU.add(JBT_MENU_PHONG);
		
		JButton JBtn_MENU_DSThue = new JButton("DANH SÁCH THUÊ");
		JBtn_MENU_DSThue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JP_MENU.add(JBtn_MENU_DSThue);
		
		JButton JBtn_MENU_Kho = new JButton("KHO");
		JBtn_MENU_Kho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JP_MENU.add(JBtn_MENU_Kho);
		
		JButton btnNewButton = new JButton("DÁNH SÁCH HÓA ĐƠN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JP_MENU.add(btnNewButton);
		
		JButton JBtn_MENU_NhanVien = new JButton("Nhân VIên");
		JBtn_MENU_NhanVien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		JP_MENU.add(JBtn_MENU_NhanVien);
		
		JMenuBar menuBar = new JMenuBar();
		JF_MAIN.setJMenuBar(menuBar);
		
		JMenu JMenu_MAIN = new JMenu("MAIN");
		JMenu_MAIN.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(JMenu_MAIN);
		
		JMenuItem lone = new JMenuItem("Main");
		lone.setHorizontalAlignment(SwingConstants.CENTER);
		JMenu_MAIN.add(lone);
		
		JMenu JMENU_PHÒNG = new JMenu("PHÒNG");
		JMENU_PHÒNG.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(JMENU_PHÒNG);
		
		JMenuItem JMn_PHONG_DSPhong = new JMenuItem("Danh Sách Phòng");
		JMn_PHONG_DSPhong.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		JMn_PHONG_DSPhong.setHorizontalAlignment(SwingConstants.CENTER);
		JMENU_PHÒNG.add(JMn_PHONG_DSPhong);
		
		JMenu JMENU_NhanVien = new JMenu("Nhân Viên");
		JMENU_NhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(JMENU_NhanVien);
		
		JMenuItem JMn_NhanVien_DSnv = new JMenuItem("Danh Sách Nhân Viên");
		JMENU_NhanVien.add(JMn_NhanVien_DSnv);
	}
}
