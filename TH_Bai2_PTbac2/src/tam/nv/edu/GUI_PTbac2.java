package tam.nv.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI_PTbac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtA;
	private JLabel lblNhpSB;
	private JTextField txtB;
	private JLabel lblNhpSC;
	private JTextField txtC;
	private JLabel lblPhngTrnhBc;
	private JTextField txtPT;
	private JLabel lblX;
	private JTextField txtKqX;
	private JLabel lblNhpSC_2;
	private JTextField txtKqY;
	private JButton btnTinh;
	private JTextField txtThongbao;
	
	public GUI_PTbac2() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 429);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(99, 55, 86, 20);
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setBounds(182, 52, 222, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(99, 104, 86, 20);
		contentPane.add(lblNhpSB);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(182, 101, 222, 31);
		contentPane.add(txtB);
		
		lblNhpSC = new JLabel("Nhập số c:");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(99, 149, 86, 20);
		contentPane.add(lblNhpSC);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(182, 146, 222, 31);
		contentPane.add(txtC);
		
		lblPhngTrnhBc = new JLabel("PTB2 có dạng:");
		lblPhngTrnhBc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhngTrnhBc.setBounds(73, 206, 112, 20);
		contentPane.add(lblPhngTrnhBc);
		
		txtPT = new JTextField();
		txtPT.setForeground(Color.RED);
		txtPT.setEnabled(false);
		txtPT.setColumns(10);
		txtPT.setBounds(182, 197, 222, 44);
		contentPane.add(txtPT);
		
		lblX = new JLabel("x1 =");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX.setBounds(142, 268, 43, 20);
		contentPane.add(lblX);
		
		txtKqX = new JTextField();
		txtKqX.setForeground(Color.RED);
		txtKqX.setEnabled(false);
		txtKqX.setColumns(10);
		txtKqX.setBounds(182, 265, 77, 31);
		contentPane.add(txtKqX);
		
		lblNhpSC_2 = new JLabel("x2 =");
		lblNhpSC_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC_2.setBounds(288, 268, 42, 20);
		contentPane.add(lblNhpSC_2);
		
		txtKqY = new JTextField();
		txtKqY.setForeground(Color.RED);
		txtKqY.setEnabled(false);
		txtKqY.setColumns(10);
		txtKqY.setBounds(327, 265, 77, 31);
		contentPane.add(txtKqY);
		
		btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XulyPTB2();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(471, 152, 86, 74);
		contentPane.add(btnTinh);
		
		txtThongbao = new JTextField();
		txtThongbao.setForeground(Color.GREEN);
		txtThongbao.setEnabled(false);
		txtThongbao.setColumns(10);
		txtThongbao.setBounds(99, 304, 305, 31);
		txtThongbao.setBorder(null);
		txtThongbao.setBackground(null);
		contentPane.add(txtThongbao);
	}

	void XulyPTB2() {
		double a = Double.parseDouble(txtA.getText());
		double b = Double.parseDouble(txtB.getText());
		double c = Double.parseDouble(txtC.getText());
		double delta = b*b - 4*a*c;
		DecimalFormat df = new DecimalFormat("#.#");
		txtPT.setText(String.valueOf(a)+ "x^2 + "+ String.valueOf(b)+ "x + "+ String.valueOf(c));
		if(delta > 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			txtThongbao.setText("PT có 2 nghiệm phân biệt");
			txtKqX.setText(String.valueOf(df.format(x1)));
			txtKqY.setText(String.valueOf(df.format(x2)));
		}else if(delta == 0) {
			double x = -b/(2*a);
			txtThongbao.setText("PT có nghiệm kép");
			txtKqX.setText(String.valueOf(df.format(x)));
			txtKqY.setText(String.valueOf(df.format(x)));
		}else {
			txtThongbao.setText("PT vô nghiệm");
			txtPT.setText("");
			txtKqX.setText("");
			txtKqY.setText("");
		}
	}

}
