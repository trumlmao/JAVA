package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.model_khach_hang;

public class view extends JFrame{
	private model_khach_hang model;
	
	
	
	
	
	public view() {
		this.model = new model_khach_hang();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		
		this.setTitle("Khach_Hang");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//JP_KHACHHANG 
		//button
		JPanel JP_but = new JPanel();
		JButton JB_add = new JButton("Add");
		JButton JB_save = new JButton("Save");
		JP_but.add(JB_add);
		JP_but.add(JB_save);
		
		//Nhap ten
		JPanel JP_name = new JPanel();
		JLabel JLB_name = new JLabel("NAME: ");	
		JTextField JT_name = new JTextField(10);
		JP_name.add(JLB_name);
		JP_name.add(JT_name);
		//nhap cccd
		JPanel JP_cccd = new JPanel();
		JLabel JLB_cccd = new JLabel("CCCD: ");
		JTextField JT_cccd = new JTextField(10);
		JP_cccd.add(JLB_cccd);
		JP_cccd.add(JT_cccd);
		
		//nhap phong
		JPanel JP_phongkhach = new JPanel();
		JLabel JLB_phongkhach = new JLabel("PHONG: ");
		JTextField JT_phongkhach = new JTextField(3);
		JP_phongkhach.add(JLB_phongkhach);
		JP_phongkhach.add(JT_phongkhach);
		
		
		
		//nhap menu
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu mnuSEV = new JMenu("SEV");
		JMenu mnuSOM = new JMenu("SOME");
		menubar.add(mnuSEV);
		menubar.add(mnuSOM);
		JMenuItem mnuNhanvien = new JMenuItem("Khach hang");
		JMenuItem mnuPhong = new JMenuItem("nhanvien");
		mnuSEV.add(mnuNhanvien);
		mnuSEV.add(mnuPhong);
		
		

		//SHOW PHÒNG
		JPanel JF_phong = new JPanel();
		//sample data / table
		String[][] data = {{"123","dọn dẹp"," "," "},{"124","trống"," ",""},{"125","Sử dụng","VĂN A","0001"}};
		String[] colum = new String[]{"Phòng","Tình Trạng","Khách Hàng","CCCD"};
		JTable JTB_table = new JTable(data,colum);
		JF_phong.add(new JScrollPane(JTB_table));
		
		
		DefaultTableModel dm = new DefaultTableModel();
		
		
		//JP_khach hang North Layout set 
		JPanel JP_khachhang = new JPanel();
		JP_khachhang.setLayout(new GridLayout(4,1));
		JP_khachhang.add(JP_phongkhach);
		JP_khachhang.add(JP_name);
		JP_khachhang.add(JP_cccd);
		
		JP_khachhang.add(JP_but);
		
		
		
		
		
		
		
		this.setLayout(new BorderLayout());
		this.add(JP_khachhang,BorderLayout.WEST);
		
		this.add(JF_phong,BorderLayout.CENTER);
		this.setJMenuBar(menubar);
		this.pack();
		
	}
	
}
