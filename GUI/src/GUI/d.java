package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;
class view extends JFrame
{
    private JTree tree;
    public view()
    {
        //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //create the child nodes
        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
        //add the child nodes to the root node
        root.add(vegetableNode);
        root.add(fruitNode);

        //create the tree by passing in the root node
        tree = new JTree(root);
        this.add(tree);
        
        
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
      					JLabel jLabel_phong2 = new JLabel();
      					jLabel_phong2.setLayout(new GridLayout(2,1));
      					//nơi đi
      					JLabel jLabel_noi_di = new JLabel(" noi di");
      					JComboBox<Object> jComboBox_noi_đi = new JComboBox<>();
      					//sau này add du liệu từ  csdl sang\
      					jComboBox_noi_đi.addItem("Đà Nẵng");
      					jComboBox_noi_đi.addItem("Hà nội");
      					//nơi đến
      					JLabel jLabel_phong = new JLabel("Phòng ");
      					JComboBox<Object> jComboBox_phong = new JComboBox<>();
      					jComboBox_phong.addItem("101");
      					jComboBox_phong.addItem("102");
      					jComboBox_phong.addItem("103");
      					jComboBox_phong.addItem("104");
      					jComboBox_phong.addItem("105");
      					jComboBox_phong.addItem("106");
      					jComboBox_phong.addItem("107");
      					
      					
      					
      					jLabel_phong2.add(jLabel_phong);
      					jLabel_phong2.add(jComboBox_phong);
      					jLabel_phong2.add(jLabel_noi_di);
      					jLabel_phong2.add(jComboBox_noi_đi);
      					
      					jPanel_tra_cuu.add(jLabel_phong2);
      		//nhập thông tin
      		jPanel_nhapthongtin.setLayout(new GridLayout(4,1));
      		
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
      					JTextField jTextField_sdt = new JTextField(20);
      					jPanel_sdt.add(jLabel_sdt);
      					jPanel_sdt.add(jTextField_sdt);
      					jPanel_nhapthongtin.add(jPanel_sdt);
      							
      					
      					

      			
      		//thêm vào
      		
      		jPanel_khach_hang.setLayout(new GridLayout(2,4));
      		jPanel_khach_hang.add(tree);
      		jPanel_khach_hang.add(jPanel_tra_cuu);
      		jPanel_khach_hang.add(jPanel_nhapthongtin);
      		jPanel_khach_hang.add(jPanel_hien_thi);
      		
      		
      		JTabbedPane myTabled=new JTabbedPane();
				JPanel pnTab1=new JPanel();
				pnTab1.add(jPanel_khach_hang);
				JPanel pnTab2=new JPanel();
				pnTab2.setBackground(Color.ORANGE);
				pnTab2.add(new JButton("Tabbed 2"));
				myTabled.add(pnTab1,"Tab1");
				myTabled.add(pnTab2,"Tab2");
      		
      		JPanel jPanel = new JPanel();

      		jPanel.add(myTabled);

      	
      		
      		
      		
      		this.setLayout(new BorderLayout());
      		this.add(jPanel,BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");
        this.setLocationRelativeTo(null);
        this.setSize(3000, 1000);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new view();
            }
        });
    }
}