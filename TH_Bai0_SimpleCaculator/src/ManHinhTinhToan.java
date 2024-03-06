
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ManHinhTinhToan extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(67, 53, 61, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(67, 92, 61, 20);
		contentPane.add(lblNhpB);
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(138, 48, 308, 30);
		contentPane.add(txtA);
		txtA.setColumns(10);
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(138, 87, 308, 30);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng
				XuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCong.setBounds(44, 158, 96, 39);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý trừ
				XuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTru.setBounds(168, 158, 96, 39);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu ly nhan
				XuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNhan.setBounds(294, 158, 96, 39);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu ly chia
				XuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnChia.setBounds(421, 158, 96, 39);
		contentPane.add(btnChia);
		
		txtKQ = new JTextField();
		txtKQ.setForeground(Color.RED);
		txtKQ.setBackground(Color.WHITE);
		txtKQ.setEnabled(false);
		txtKQ.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(138, 220, 308, 30);
		contentPane.add(txtKQ);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(67, 225, 61, 20);
		contentPane.add(lblKtQu);
		
	}
	//Hàm xử lý
	void XuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		if(!isNumeric(str_soA) && !isNumeric(str_soB)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập 2 số a, b");
		}else if(!isNumeric(str_soA)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập số a");
			}else if(!isNumeric(str_soB)) {
				JOptionPane.showMessageDialog(rootPane, "Nhập số b");
				}else {
					double ketqua = Double.parseDouble(str_soA) + Double.parseDouble(str_soB);
					txtKQ.setText(String.valueOf(ketqua));
					}
	}
	
	void XuLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		if(!isNumeric(str_soA) && !isNumeric(str_soB)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập 2 số a, b");
		}else if(!isNumeric(str_soA)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập số a");
			}else if(!isNumeric(str_soB)) {
				JOptionPane.showMessageDialog(rootPane, "Nhập số b");
				}else {
					double ketqua = Double.parseDouble(str_soA) - Double.parseDouble(str_soB);
					txtKQ.setText(String.valueOf(ketqua));
					}
	}
	void XuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		if(!isNumeric(str_soA) && !isNumeric(str_soB)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập 2 số a, b");
		}else if(!isNumeric(str_soA)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập số a");
			}else if(!isNumeric(str_soB)) {
				JOptionPane.showMessageDialog(rootPane, "Nhập số b");
				}else {
					double ketqua = Double.parseDouble(str_soA) * Double.parseDouble(str_soB);
					txtKQ.setText(String.valueOf(ketqua));
					}
				
	}
	void XuLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		if(!isNumeric(str_soA) && !isNumeric(str_soB)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập 2 số a, b");
		}else if(!isNumeric(str_soA)) {
			JOptionPane.showMessageDialog(rootPane, "Nhập số a");
			}else if(!isNumeric(str_soB)) {
				JOptionPane.showMessageDialog(rootPane, "Nhập số b");
				}else {
					double ketqua = Double.parseDouble(str_soA) / Double.parseDouble(str_soB);
					txtKQ.setText(String.valueOf(ketqua));
					}
			
	}
	boolean isNumeric(String str) {
	      try  
	      {  
	        double d = Double.parseDouble(str);
	      }  
	      catch(NumberFormatException nfe)  
	      {  
	        return false;  
	      }  
	      return true;  
    }
}
