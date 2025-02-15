
public class SinhVien {
	private String hoTen;
	private double diemTB;
	
	//Constructor
	public SinhVien(String hoTen, double diemTB) {
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	//Getter
	public String getHoTen() {
		return hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}
	
	//Hiển thị thông tin sinh viên
	public void hienThiThongTin() {
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Điểm trung bình: " + diemTB);
	}
	
}
