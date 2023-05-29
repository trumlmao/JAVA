package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.JTabbedPane;


import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridLayout;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class mian {

	private JFrame JF_MAIN;
	private JTextField txtPanel;
	private JTextField txtTrng;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mian window = new mian();
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
		JTabbedPane tab = new javax.swing.JTabbedPane();
		JF_MAIN = new JFrame();
		JF_MAIN.setTitle("QUẢN LÝ KHACH SẠN");
		JF_MAIN.setBounds(100, 100, 1100, 700);
		JF_MAIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF_MAIN.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		JPanel JP_MENU = new JPanel();
		JP_MENU.setBorder(new LineBorder(new Color(0, 0, 0)));
		JF_MAIN.getContentPane().add(JP_MENU, BorderLayout.WEST);
		JP_MENU.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel PIC = new JPanel();
		JP_MENU.add(PIC);
		
		JButton JBT_MENU_PHONG = new JButton("PHÒNG");
		JBT_MENU_PHONG.addActionListener(new ActionListener() {
			private Component pnl_Phong;

			public void actionPerformed(ActionEvent e) {
				tab.setSelectedComponent(pnl_Phong);
			}
		});
		
		
		
	
			
		JP_MENU.add(JBT_MENU_PHONG);
		
		JButton JBtn_MENU_DSThue = new JButton("DANH SÁCH THUÊ");
		JBtn_MENU_DSThue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				da da = new da();
				da.setVisible(true);
				
			}
		});
		JP_MENU.add(JBtn_MENU_DSThue);
		
		JButton JBtn_MENU_Kho = new JButton("KHO");
		JP_MENU.add(JBtn_MENU_Kho);
		
		JButton btnNewButton = new JButton("DÁNH SÁCH HÓA ĐƠN");
		JP_MENU.add(btnNewButton);
		
		JButton JBtn_MENU_NhanVien = new JButton("Nhân VIên");
		
		
		JP_MENU.add(JBtn_MENU_NhanVien);
		
		JPanel panel = new JPanel();
		JF_MAIN.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel JPN_Phong = new JPanel();
		panel.add(JPN_Phong, "name_4570237664800");
		JPN_Phong.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		JPN_Phong.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("200px"),
				ColumnSpec.decode("98px"),
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("96px"),
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("96px"),
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("96px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("19px"),
				FormSpecs.RELATED_GAP_ROWSPEC,}));
		
		txtTrng = new JTextField();
		txtTrng.setBackground(new Color(128, 255, 128));
		txtTrng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTrng.setText("Trống");
		txtTrng.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(txtTrng, "2, 2, left, top");
		txtTrng.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "4, 2, left, top");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "6, 2, left, top");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "8, 2, left, top");
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_4599282007500");
		
		txtPanel = new JTextField();
		txtPanel.setText("PANEL 2");
		panel_2.add(txtPanel);
		txtPanel.setColumns(10);
		
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
