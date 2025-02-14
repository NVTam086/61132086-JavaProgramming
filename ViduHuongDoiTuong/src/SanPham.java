
public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private int donGia;
	
	public SanPham(String maSP, String tenSP, String loaiSP, int donGia) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "Mã SP: " + maSP + ", Tên SP: " + tenSP + ", Loại SP: " + loaiSP + ", Đơn giá: " + donGia;
	}

	public String getMaSP() {
		return maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public int getDonGia() {
		return donGia;
	}
	

}
