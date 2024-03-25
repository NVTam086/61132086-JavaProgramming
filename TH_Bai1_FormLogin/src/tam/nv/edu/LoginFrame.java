package tam.nv.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTDN;
	private JPasswordField txtMK;
	
	//Create the frame.
	public LoginFrame() {
		setTitle("Đăng nhập hệ thống quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(42, 50, 124, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(42, 98, 124, 28);
		contentPane.add(lblMtKhu);
		
		txtTDN = new JTextField();
		txtTDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTDN.setBounds(176, 49, 237, 36);
		contentPane.add(txtTDN);
		txtTDN.setColumns(10);
		
		txtMK = new JPasswordField();
		txtMK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMK.setBounds(176, 97, 237, 36);
		contentPane.add(txtMK);
		
		JButton btnDN = new JButton("Đăng nhập");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XulyDangNhap();
			}
		});
		btnDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDN.setBounds(159, 183, 151, 46);
		contentPane.add(btnDN);
	}

	void XulyDangNhap() {
		//Lấy về tên đăng nhập và mật khẩu
		String strTen = txtTDN.getText();
		String strMK = txtMK.getText();
		//Xu lý
		if(strTen.equals("63cntt") && strMK.equals("123")) {
			//hiện trang chủ
			new HomeFrame().setVisible(true);
			//ẩn form đăng nhập
			this.setVisible(false);
		}else {
			//báo lỗi
			txtTDN.setText("");
			txtMK.setText("");
			JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
