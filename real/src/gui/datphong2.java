package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class datphong2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datphong2 frame = new datphong2();
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
	public datphong2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 903);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(511, 10, 530, 825);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông Tin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 101, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thuê Phòng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(254, 10, 101, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Khách Hàng");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(30, 56, 126, 36);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phòng");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(30, 102, 126, 36);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ngày Thuê");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(30, 148, 109, 36);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Số Người");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(30, 194, 109, 36);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(203, 56, 210, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 105, 210, 36);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(203, 151, 210, 36);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 197, 83, 36);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 410, 510, 405);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Tiền Phòng");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 21, 100, 30);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Tiền check in sớm");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(10, 59, 130, 30);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Tiền check in muộn");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2.setBounds(10, 99, 144, 30);
		panel_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Tiền Dịch Vụ");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_3.setBounds(10, 139, 100, 30);
		panel_1.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("TỔNG CỘNG");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_4.setBounds(10, 238, 100, 30);
		panel_1.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("Tiền Cọc");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_5.setBounds(10, 177, 100, 30);
		panel_1.add(lblNewLabel_6_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 22, 150, 30);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(200, 60, 150, 30);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(200, 100, 150, 30);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(200, 140, 150, 30);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(200, 180, 150, 30);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(200, 239, 150, 30);
		panel_1.add(textField_9);
		
		JButton btnNewButton = new JButton("Thanh Toán");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 365, 490, 30);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("(VND)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(360, 247, 60, 20);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_2 = new JLabel("GIá Thuê ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(30, 240, 160, 35);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_7 = new JLabel("Tiền Cọc");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_7.setBounds(30, 285, 160, 35);
		panel.add(lblNewLabel_1_7);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(420, 360, 100, 40);
		panel.add(btnNewButton_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(203, 243, 109, 36);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(203, 287, 210, 36);
		panel.add(textField_11);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Theo Giờ");
		rdbtnNewRadioButton.setBounds(318, 240, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Theo Ngày");
		rdbtnNewRadioButton_1.setBounds(318, 263, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 491, 825);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
