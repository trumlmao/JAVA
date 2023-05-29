package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import dao.NhanVien_DAO;
import db.db;
import gui.JF_PHONG;
import model.Model_NhanVien;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelListener;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class NhanVien {

	private JFrame JF_NhanVien;
	private JTable table_NhanVien;
	private JTextField Jtf_NhanVien_MaNv;
	private JTextField Jtf_Nhanvien_TenNv;
	private JTextField Jtf_NhanVien_GioiTinh;
	private JTextField Jtf_NhanVien_SoDienThoai;
	private JTextField Jtf_NhanVien_NamSInh;
	private JTextField Jtf_NhanVien_DiaChi;
	NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhanVien window = new NhanVien();
					window.JF_NhanVien.setLocationRelativeTo(null);
					window.JF_NhanVien.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NhanVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JF_NhanVien = new JFrame();
		JF_NhanVien.setBounds(50, 50, 1025, 770);
		JF_NhanVien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF_NhanVien.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 711);
		JF_NhanVien.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Nhân Viên :");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 181, 115, 34);
		panel.add(lblNewLabel);
		
		Jtf_NhanVien_MaNv = new JTextField();
		Jtf_NhanVien_MaNv.setBounds(141, 184, 209, 34);
		panel.add(Jtf_NhanVien_MaNv);
		Jtf_NhanVien_MaNv.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Nhân Viên :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 225, 115, 35);
		panel.add(lblNewLabel_1);
		
		Jtf_Nhanvien_TenNv = new JTextField();
		Jtf_Nhanvien_TenNv.setBounds(141, 228, 209, 35);
		panel.add(Jtf_Nhanvien_TenNv);
		Jtf_Nhanvien_TenNv.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Giới Tính         :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 270, 115, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số Điện Thoại :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 315, 115, 35);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Năm Sinh       : ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(10, 360, 115, 35);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Địa Chỉ           :");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(10, 405, 115, 35);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("Ghi Chú          :");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(10, 450, 115, 35);
		panel.add(lblNewLabel_1_6);
		
		JTextArea Jtf_Nhanvien_GhiChu = new JTextArea();
		Jtf_Nhanvien_GhiChu.setBounds(10, 495, 340, 108);
		panel.add(Jtf_Nhanvien_GhiChu);
		
		JLabel lblNewLabel_2 = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 10, 350, 161);
		panel.add(lblNewLabel_2);
		
		Jtf_NhanVien_GioiTinh = new JTextField();
		Jtf_NhanVien_GioiTinh.setColumns(10);
		Jtf_NhanVien_GioiTinh.setBounds(141, 273, 209, 35);
		panel.add(Jtf_NhanVien_GioiTinh);
		
		Jtf_NhanVien_SoDienThoai = new JTextField();
		Jtf_NhanVien_SoDienThoai.setColumns(10);
		Jtf_NhanVien_SoDienThoai.setBounds(141, 317, 209, 35);
		panel.add(Jtf_NhanVien_SoDienThoai);
		
		Jtf_NhanVien_NamSInh = new JTextField();
		Jtf_NhanVien_NamSInh.setColumns(10);
		Jtf_NhanVien_NamSInh.setBounds(141, 362, 209, 35);
		panel.add(Jtf_NhanVien_NamSInh);
		
		Jtf_NhanVien_DiaChi = new JTextField();
		Jtf_NhanVien_DiaChi.setColumns(10);
		Jtf_NhanVien_DiaChi.setBounds(141, 407, 209, 35);
		panel.add(Jtf_NhanVien_DiaChi);
		
		JButton Jbt_Nhanvien_Sua = new JButton("Sửa");
		Jbt_Nhanvien_Sua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Jbt_Nhanvien_Sua.setBounds(10, 639, 85, 25);
		panel.add(Jbt_Nhanvien_Sua);
		
		JButton Jbt_NhanVien_Them = new JButton("Thêm");
		Jbt_NhanVien_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cm = e.getActionCommand();
				Vector NhanVien = new Vector<>();
				NhanVien.add(Jtf_NhanVien_MaNv.getText());
				NhanVien.add(Jtf_Nhanvien_TenNv.getText());
				NhanVien.add(Jtf_NhanVien_GioiTinh.getText());
				NhanVien.add(Jtf_NhanVien_SoDienThoai.getText());
				NhanVien.add(Jtf_NhanVien_DiaChi.getText());
				NhanVien.add(Jtf_NhanVien_NamSInh.getText());
				NhanVien.add(Jtf_Nhanvien_GhiChu.getText());
				
				String Manv = Jtf_NhanVien_MaNv.getText();
				String TenNv = Jtf_Nhanvien_TenNv.getText();
				String GioiTinh = Jtf_NhanVien_GioiTinh.getText();
				String SoDt = Jtf_NhanVien_SoDienThoai.getText();
				String DiaChi = Jtf_NhanVien_DiaChi.getText();
				String NamSinh = Jtf_NhanVien_NamSInh.getText();
				String GhiChu = Jtf_Nhanvien_GhiChu.getText();
				
				Model_NhanVien NhanVien1 = new Model_NhanVien(Manv,TenNv,GioiTinh,SoDt,DiaChi,NamSinh,GhiChu);
				
				nhanVien_DAO.insert(NhanVien1);
			}
		});
		Jbt_NhanVien_Them.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Jbt_NhanVien_Them.setBounds(141, 639, 85, 25);
		panel.add(Jbt_NhanVien_Them);
		
		JButton Jbt_NhanVien_Xoa = new JButton("Xóa");
		Jbt_NhanVien_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int NhanVien_choned = table_NhanVien.getSelectedRow();
				if(NhanVien_choned == -1) {
					JRootPane rootPane = new JRootPane();
					JOptionPane.showMessageDialog(rootPane, " Bạn chau chọn dòng để xóa ");
					}else {
						
					int kq = 0;
					try {
						Connection conn = db.getConnection();
						String manv = table_NhanVien.getValueAt(table_NhanVien.getSelectedRow(), 0).toString();
						String sql = "DELETE FROM NhanVien WHERE MaNhanVien = '"+ manv+"'";
						Statement stm = conn.createStatement();
						
						kq  = stm.executeUpdate(sql);
						System.out.println("xoa");
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
						// TODO: handle exception
					}
					// TODO Auto-generated method stub
					;
					
					
				}
			}
		});
		Jbt_NhanVien_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Jbt_NhanVien_Xoa.setBounds(265, 639, 85, 25);
		panel.add(Jbt_NhanVien_Xoa);
		
		JButton JBT_GOD = new JButton("Refresh");
		
		JBT_GOD.setBounds(10, 613, 85, 21);
		panel.add(JBT_GOD);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(370, 0, 641, 711);
		JF_NhanVien.getContentPane().add(scrollPane);
		
		table_NhanVien = new JTable();
		table_NhanVien.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		
		
		JBT_GOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cm = e.getActionCommand();
				try {
					Connection conn = db.getConnection();
					table_NhanVien.setModel(new DefaultTableModel());
					Statement stm = conn.createStatement();
					String sql = "SELECT * from NhanVien";
					ResultSet rs = stm.executeQuery(sql);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model = (DefaultTableModel) table_NhanVien.getModel();
					
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					for(int i = 0 ; i<cols;i++) {
						colName[i] = rsmd.getColumnName(i+1);
					}
					model.setColumnIdentifiers(colName);
					String MaNhanVien,TenNhanVien,GioiTinh,SoDienThoai,NamSinh,DiaChi,GhiChu;
					while(rs.next()) {
						MaNhanVien = rs.getString(1);
						TenNhanVien = rs.getString(2);
						GioiTinh = rs.getString(3);
						SoDienThoai = rs.getString(4);
						NamSinh = rs.getString(5);
						DiaChi = rs.getString(6);
						
						GhiChu = rs.getString(7);
						String[] row = {MaNhanVien,TenNhanVien,GioiTinh,SoDienThoai,NamSinh,DiaChi,GhiChu};
						model.addRow(row);
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		scrollPane.setViewportView(table_NhanVien);
		
		JMenuBar menuBar = new JMenuBar();
		JF_NhanVien.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("MAIN");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mian mainframe = new mian();
				mainframe.JF_MAIN.setLocationRelativeTo(null);
				mainframe.JF_MAIN.setVisible(true);
				JF_NhanVien.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("PHONG");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_PHONG frame = new JF_PHONG();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				JF_NhanVien.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
