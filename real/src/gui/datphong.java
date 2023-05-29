package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class datphong extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datphong frame = new datphong();
					frame.setSize(700,600);
					frame.setLocationRelativeTo(null);
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
	public datphong() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 692, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thuê Phòng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(171, 10, 290, 40);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(94, 70, 0, 13);
		getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Khách Hàng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 127, 160, 35);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phòng");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(74, 172, 160, 35);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("GIá Thuê Theo Giờ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(74, 217, 160, 35);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giá Thuê Theo Ngày");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(74, 262, 160, 35);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ngày Thuê");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(74, 307, 170, 35);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("Số Người");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(74, 352, 160, 35);
		getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Tiền Cọc");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_7.setBounds(74, 397, 160, 35);
		getContentPane().add(lblNewLabel_1_7);
		
		JTextField textField = new JTextField();
		textField.setBounds(244, 127, 246, 35);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextField Jtf_Thue_Phong = new JTextField();
		Jtf_Thue_Phong.setColumns(10);
		Jtf_Thue_Phong.setBounds(244, 174, 123, 35);
		getContentPane().add(Jtf_Thue_Phong);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(244, 217, 123, 35);
		getContentPane().add(textField_2);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(244, 262, 123, 35);
		getContentPane().add(textField_3);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(244, 307, 246, 35);
		getContentPane().add(textField_4);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(244, 354, 62, 35);
		getContentPane().add(textField_6);
		
		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(244, 399, 246, 35);
		getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(316, 361, 37, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(363, 359, 40, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(390, 493, 100, 40);
		getContentPane().add(btnNewButton_2);
		
		
	}

}
