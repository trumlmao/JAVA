package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.print.DocFlavor.STRING;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.Phong_DAO;
import db.db;
import model.Model_Phong;

import javax.swing.ListSelectionModel;
import javax.swing.Popup;
import javax.swing.PopupFactory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.spi.FileSystemProvider;

public class JF_PHONG extends JFrame {
	
	private DefaultTableModel tableModel = new DefaultTableModel();
	private Connection connect = null;
	private JPanel contentPane;
	
	private JTextField Jtf_Phong_LoaiPhong;
	JFrame JF_PHONG;
	private JTextField Jtf_GiuongDon;
	private JTextField Jtf_GiuongDoi;
	private JTable table;
	private JTextField Jtf_Phong_MaPhong;
	private JComboBox Jcb_Phong_Tang;
	private JComboBox Jcb_PHONG_TinhTrang ;
	private JTextArea Jta_PHONG_GhiChu ;
	Phong_DAO Phong_DAO = new Phong_DAO();
	Model_Phong Model_Phong = new Model_Phong();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_PHONG frame = new JF_PHONG();
					
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
	
	
	public JF_PHONG() {
		setTitle("QUẢN LÝ PHÒNG\r\n");
		
		Vector VPhong = new Vector();
		 Vector title_Phong = new Vector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 1025, 770);
		Toolkit toolKit = getToolkit();
		Dimension size = toolKit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MAIN");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("BACK");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mian mainframe = new mian();
				mainframe.JF_MAIN.setLocationRelativeTo(null);
				mainframe.JF_MAIN.setVisible(true);
				
				dispose();
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("FUNC");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Xem Đặt Phòng");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datphong datphong = new datphong();
				datphong.show();
				datphong.setLocationRelativeTo(null);
				String maphong = table.getValueAt(table.getSelectedRow(), 0).toString();
				
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.setBounds(0, 0, 364, 701);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Phòng :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 126, 100, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Loại Phòng :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(35, 171, 100, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblTng = new JLabel("Tầng :");
		lblTng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTng.setBounds(35, 216, 100, 35);
		panel.add(lblTng);
		
		JLabel lblGhiCh = new JLabel("Ghi Chú :");
		lblGhiCh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGhiCh.setBounds(35, 390, 100, 40);
		panel.add(lblGhiCh);
		
		Jtf_Phong_MaPhong = new JTextField();
		Jtf_Phong_MaPhong.setBounds(145, 131, 190, 30);
		panel.add(Jtf_Phong_MaPhong);
		Jtf_Phong_MaPhong.setColumns(10);
		
		Jtf_Phong_LoaiPhong = new JTextField();
		Jtf_Phong_LoaiPhong.setColumns(10);
		Jtf_Phong_LoaiPhong.setBounds(145, 176, 190, 30);
		panel.add(Jtf_Phong_LoaiPhong);
		
		Jcb_Phong_Tang = new JComboBox();
		Jcb_Phong_Tang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jcb_Phong_Tang.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		Jcb_Phong_Tang.setBounds(145, 224, 93, 21);
		panel.add(Jcb_Phong_Tang);
		
		Jta_PHONG_GhiChu = new JTextArea();
		Jta_PHONG_GhiChu.setBounds(35, 440, 319, 150);
		panel.add(Jta_PHONG_GhiChu);
		
		JButton Jbt_PHONG_Sua = new JButton("Sửa");
		Jbt_PHONG_Sua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.out.println("LONE");
				String maphong1 = table.getValueAt(table.getSelectedRow(), 0).toString();
				String maphong = Jtf_Phong_MaPhong.getText();
				String loaiphong = Jtf_Phong_LoaiPhong.getText();
				
				String tang = (String) Jcb_Phong_Tang.getSelectedItem();
				String giuongdon = Jtf_GiuongDon.getText();
				String giuongdoi = Jtf_GiuongDoi.getText();
				String tinhtrang = (String) Jcb_PHONG_TinhTrang.getSelectedItem();
				String ghichu = Jta_PHONG_GhiChu.getText();
				int kq = 0;
				System.out.println("LONE2");
			try {
				
				Connection conn = db.getConnection();
				String sql = "Update Phong "+" SET "
						+ " MaPhong "+" = " +"'"+ maphong +"'" +","
						+" MaLoaiPhong "+" = " +"'"+ loaiphong+"'"+","
						+" MaTang "+" = " +"'"+ tang+"'"+","
						+" GiuongDon "+" = " +"'"+ giuongdon+"'"+","
						+" GiuongDoi "+" = " +"'"+ giuongdoi+"'"+","
						+" Tinhtrang "+" = " +"'"+ tinhtrang+"'"+","
						+" GhiChu "+" = " +"'"+ ghichu+"'\n"
						+" WHERE MaPhong = '"+maphong1+"'";
				System.out.println(sql);
				Statement stm = conn.createStatement();
				
				kq = stm.executeUpdate(sql);
				conn.close();
			} catch (SQLException | ClassNotFoundException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			}
		});
		Jbt_PHONG_Sua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Jbt_PHONG_Sua.setBounds(35, 621, 100, 30);
		panel.add(Jbt_PHONG_Sua);
		
		Jcb_PHONG_TinhTrang = new JComboBox();
		Jcb_PHONG_TinhTrang.setModel(new DefaultComboBoxModel(new String[] {"Trống", "Đang Sử Dụng", "Lau Dọn"}));
		Jcb_PHONG_TinhTrang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jcb_PHONG_TinhTrang.setBounds(145, 346, 151, 33);
		panel.add(Jcb_PHONG_TinhTrang);
		
		JButton Jbt_PHONG_Them = new JButton("Thêm");
		
		Jbt_PHONG_Them.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Jbt_PHONG_Them.setBounds(145, 621, 100, 30);
		panel.add(Jbt_PHONG_Them);
		
		JButton Jbt_PHONG_Xoa = new JButton("Xóa");
		Jbt_PHONG_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int Phong_choned = table.getSelectedRow();
				if(Phong_choned == -1) {
					JOptionPane.showMessageDialog(rootPane, " Bạn chau chọn dòng để xóa ");
				}else {
					
					int kq = 0;
					try {
						Connection conn = db.getConnection();
						String maphong = table.getValueAt(table.getSelectedRow(), 0).toString();
						String sql = "DELETE FROM Phong WHERE MaPhong = '"+ maphong+"'";
						Statement stm = conn.createStatement();
						
						kq  = stm.executeUpdate(sql);
						System.out.println("xoa");
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
						// TODO: handle exception
					}
					// TODO Auto-generated method stub
					;
					
					
					
					/*if (JOptionPane.showConfirmDialog(rootPane, " Bạn sắp xóa phòng : " + idPhong_choned, idPhong_choned, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
						
						Phong_DAO.delete(Model_Phong);
						table.setModel(new DefaultTableModel(VPhong,title_Phong));
						Jtf_Phong_MaPhong.setText("");
						Jtf_Phong_LoaiPhong.setText("");
						Jcb_Phong_Tang.setSelectedItem(0);
						Jtf_GiuongDon.setText("");
						Jtf_GiuongDoi.setText("");
						Jcb_PHONG_TinhTrang.setSelectedItem(0);
						Jta_PHONG_GhiChu.setText("");
					
					}*/
					
				}
				
			}
		});
		Jbt_PHONG_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Jbt_PHONG_Xoa.setBounds(254, 621, 100, 30);
		panel.add(Jbt_PHONG_Xoa);
		
		JLabel lblNewLabel_2 = new JLabel("QUẢN LÝ PHÒNG");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(35, 40, 300, 76);
		panel.add(lblNewLabel_2);
		
		JLabel lblTnhTrng = new JLabel("Tình Trạng :");
		lblTnhTrng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTnhTrng.setBounds(35, 345, 100, 35);
		panel.add(lblTnhTrng);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Giường Đơn");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(35, 255, 100, 35);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Giường Đôi");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(35, 300, 100, 35);
		panel.add(lblNewLabel_4);
		
		Jtf_GiuongDon = new JTextField();
		Jtf_GiuongDon.setColumns(10);
		Jtf_GiuongDon.setBounds(145, 255, 190, 30);
		panel.add(Jtf_GiuongDon);
		
		Jtf_GiuongDoi = new JTextField();
		Jtf_GiuongDoi.setColumns(10);
		Jtf_GiuongDoi.setBounds(145, 300, 190, 30);
		panel.add(Jtf_GiuongDoi);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		scrollPane.setBounds(374, 0, 626, 699);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Mã Phòng", "Loại Phòng", "Tầng", "Giường Đơn", "Giường Đôi", "Tình Trạng", "Ghi Chú"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = 	new JButton("REFHSES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "sa";
			    String password = "1";
			    String url = "jdbc:sqlserver://DESKTOP-AMLFFP5\\MSSQLSERVER01:1433;databaseName=QUANLYKHACHSAN;encrypt=true;trustServerCertificate=true;";
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            connect = DriverManager.getConnection(url, userName, password); 
		            System.out.println("THÀNH CÔNG");
					table.setModel(new DefaultTableModel());
					Statement st =connect.createStatement();
					String query = "select* from Phong";
					ResultSet rs = st.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					int cols = rsmd.getColumnCount();
					String[] colName  = new String[cols];
					for(int i = 0;i<cols;i++) {
						colName[i] = rsmd.getColumnName(i+1);
					}
					model.setColumnIdentifiers(colName);
					String MaPhong,MaloaiPhong,MaTang,GiuongDon,GiuongDoi,TinhTrang,GhiChu; 
					while(rs.next()) {
						MaPhong=rs.getString(1);
						MaloaiPhong = rs.getString(2);
						MaTang = rs.getString(3);
						GiuongDon = rs.getString(4);
						GiuongDoi = rs.getString(5);
						TinhTrang = rs.getString(6);
						GhiChu = rs.getString(7);
						String[] row= {MaPhong,MaloaiPhong,MaTang,GiuongDon,GiuongDoi,TinhTrang,GhiChu};
						model.addRow(row);
						
						
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String maphong = table.getValueAt(table.getSelectedRow(), 0).toString();
				String loaiphong = table.getValueAt(table.getSelectedRow(),1 ).toString();
				
				String tang = table.getValueAt(table.getSelectedRow(), 2).toString();
				
				Jtf_Phong_MaPhong.setText(maphong);
				Jtf_Phong_LoaiPhong.setText(loaiphong);
				Jcb_PHONG_TinhTrang.setSelectedItem(tang);
				
				
			}
		});
		
		btnNewButton.setBounds(35, 661, 85, 21);
		panel.add(btnNewButton);
		Jbt_PHONG_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String cm = e.getActionCommand();
				
				Vector Phong = new Vector<>();
				Phong.add(Jtf_Phong_MaPhong.getText());
				Phong.add(Jtf_Phong_LoaiPhong.getText());
				Phong.add(Jcb_Phong_Tang.getSelectedItem());
				Phong.add(Jtf_GiuongDon.getText());
				Phong.add(Jtf_GiuongDoi.getText());
				Phong.add(Jcb_PHONG_TinhTrang.getSelectedItem());
				Phong.add(Jta_PHONG_GhiChu.getText());
				
				String MaPhong = Jtf_Phong_MaPhong.getText();
				String MaLoaiPhong = Jtf_Phong_LoaiPhong.getText();
				String Matang = (String) Jcb_Phong_Tang.getSelectedItem();
				
				int GiuongDon = Integer.parseInt(Jtf_GiuongDon.getText());
				int GiuongDoi = Integer.parseInt(Jtf_GiuongDoi.getText());
				String TinhTrang =(String) Jcb_PHONG_TinhTrang.getSelectedItem();
				String GhiChu = Jta_PHONG_GhiChu.getText();
				Model_Phong Phong1  = new Model_Phong(MaPhong,MaLoaiPhong,Matang,GiuongDon,GiuongDoi,TinhTrang,GhiChu);
				Phong_DAO.insert(Phong1);
				
		}});
		
		
	}
		
	
		
	
	
	
	
	public void db() {
		
		
		String userName = "sa";
	    String password = "1";
	    String url = "jdbc:sqlserver://DESKTOP-AMLFFP5\\MSSQLSERVER01:1433;databaseName=QUANLYKHACHSAN;encrypt=true;trustServerCertificate=true;";

	    try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            connect = DriverManager.getConnection(url, userName, password); 
	            System.out.println("THÀNH CÔNG");

	  } catch (Exception e)
	  {
	     e.printStackTrace();
	  }
	}	
}
	

	


