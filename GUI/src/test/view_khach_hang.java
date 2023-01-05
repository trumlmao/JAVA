package test;



	
	
	

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.GridLayout;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.BorderFactory;
	import javax.swing.BoxLayout;
	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.JTree;
	import javax.swing.border.Border;
	import javax.swing.border.TitledBorder;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.tree.DefaultMutableTreeNode;

	

	public class view_khach_hang extends JFrame {

		public view_khach_hang() {
			// TODO Auto-generated constructor stub
			model_khach_hang model = new model_khach_hang();
			this.init();
			this.setVisible(true);
		}
		public void  init() {
			this.setTitle("Bán vé tàu");

			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//phần khách hàng
			
			JPanel jPanel_khach_hang = new JPanel();
			JPanel jPanel_tra_cuu = new  JPanel();
			JPanel jPanel_hien_thi = new  JPanel();
			JPanel jPanel_nhapthongtin = new  JPanel();

			//Phan tra cứu
			jPanel_tra_cuu.setLayout( new GridLayout(6, 1));
				//chọn loại loại phuong tien
						JPanel jPanel_chon_phuongtien = new JPanel();
						jPanel_chon_phuongtien.setLayout(new BoxLayout(jPanel_chon_phuongtien,BoxLayout.Y_AXIS));
						Border bor = BorderFactory.createEtchedBorder(Color.blue,Color.blue);
						TitledBorder titledBorder = new TitledBorder(bor,"chọn loại vé");
						jPanel_chon_phuongtien.setBorder(titledBorder);
						
						JRadioButton jCheckBox_tau = new JRadioButton("Tàu");
						JRadioButton jCheckBox_xe_khach = new JRadioButton("Xe Khách");
						ButtonGroup buttonGroup = new ButtonGroup();
						buttonGroup.add(jCheckBox_xe_khach);
						buttonGroup.add(jCheckBox_tau);
						
						jPanel_chon_phuongtien.add(jCheckBox_tau);
						jPanel_chon_phuongtien.add(jCheckBox_xe_khach);
						jPanel_tra_cuu.add(jPanel_chon_phuongtien);
			//chon dia diem
						JLabel jLabel_dia_diem = new JLabel();
						jLabel_dia_diem.setLayout(new GridLayout(2,1));
						//nơi đi
						JLabel jLabel_noi_di = new JLabel("nơi đi");
						JComboBox<Object> jComboBox_noi_đi = new JComboBox<>();
						//sau này add du liệu từ  csdl sang\
						jComboBox_noi_đi.addItem("Đà Nẵng");
						jComboBox_noi_đi.addItem("Hà nội");
			//nơi đến
						JLabel jLabel_noi_den = new JLabel("nơi đến");
						JComboBox<Object> jComboBox_noi_den = new JComboBox<>();
						jComboBox_noi_den.addItem("Đà Nẵng");
					
						jComboBox_noi_den.addItem("Hà nội");
						
						jLabel_dia_diem.add(jLabel_noi_di);
						jLabel_dia_diem.add(jComboBox_noi_đi);
						jLabel_dia_diem.add(jLabel_noi_den);
						jLabel_dia_diem.add(jComboBox_noi_den);
						jPanel_tra_cuu.add(jLabel_dia_diem);
			//bảng các xe
						DefaultTableModel table_xe = new DefaultTableModel();
						table_xe.addColumn("tên xe");
						table_xe.addColumn("nơi đi");
						table_xe.addColumn("nơi đến");
						table_xe.addColumn("giá tiền");
						final JTable jTable_xe = new JTable(table_xe);
						table_xe.addRow(new String[] {"Sĩ Hùng","Đà Nẵng","Quảng Bình","200"});
						table_xe.addRow(new String[] {"Sĩ Hùng","Đà Nẵng","Quảng Bình","200"});
						table_xe.addRow(new String[] {"Sĩ Hùng","Đà Nẵng","Quảng Bình","200"});
						JScrollPane bang_xe = new JScrollPane(jTable_xe);
						jPanel_tra_cuu.add(bang_xe);
						
			//nhập thông tin
		
						jPanel_nhapthongtin.setLayout(new GridLayout(4,1,20,20));
			
			//nhập tên
						
						JPanel jPanel_name = new JPanel();
						JLabel jLabel_name = new JLabel("họ và tên : ");
						jLabel_name.setForeground(Color.RED);
						JTextField jTextField_name = new JTextField(20);
						jPanel_name.add(jLabel_name);
						jPanel_name.add(jTextField_name);
						
						jPanel_nhapthongtin.add(jPanel_name);
			//nhap số điện thoại 
						
						JPanel jPanel_sdt = new JPanel();
						JLabel jLabel_sdt = new JLabel("Số điện thoại : ");
						jLabel_sdt.setForeground(Color.RED);
						JTextField jTextField_sdt = new JTextField(10);
						jPanel_sdt.add(jLabel_sdt);
						jPanel_sdt.add(jTextField_sdt);
						jPanel_nhapthongtin.add(jPanel_sdt);
								
			// nhập Cccd 
						JPanel jPanel_Cccd = new JPanel();
						JLabel jLabel_Cccd = new JLabel(" Căn cước công dân : ");
						jLabel_Cccd.setForeground(Color.RED);
						JTextField jTextField_Cccd = new JTextField(12);
						jPanel_Cccd.add(jLabel_Cccd);
						jPanel_Cccd.add(jTextField_Cccd);
						jPanel_nhapthongtin.add(jPanel_Cccd);
						
						
			// hiện thị 
			DefaultTableModel table_hienthi = new DefaultTableModel();
			table_hienthi.addColumn("STT");
			table_hienthi.addColumn("họ và tên");
			table_hienthi.addColumn("số điện thoại");
			table_hienthi.addColumn("căn cước công dân");
			table_hienthi.addColumn("tên xe");
			table_hienthi.addColumn("số ghế");
			
			final JTable jTable_hienthi = new JTable(table_hienthi);
			table_hienthi.addRow(new String[] {"01","Dương Anh Dũng","0376019074","044203006107","02"});
			JScrollPane sc = new JScrollPane(jTable_hienthi);
			jPanel_hien_thi.add(sc);
			
			//thêm vào
			
			jPanel_khach_hang.setLayout(new BorderLayout());

			
			
			
			this.setLayout(new BorderLayout());
			this.add(jPanel_tra_cuu,BorderLayout.WEST);
			this.add(jPanel_nhapthongtin,BorderLayout.CENTER);
			this.add(jPanel_hien_thi,BorderLayout.EAST);
			
			
			this.pack();
		}
	}

