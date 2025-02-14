import java.util.ArrayList;
import java.util.List;

public class CT {

	public static void main(String[] args) {
		// khai báo danh sách sản phẩm
		List<SanPham> dsSanPham;
		// thêm mới
		dsSanPham = new ArrayList<>();
		//Nhập 3 sản phẩm
		SanPham sp1 = new SanPham("0","Coca","Giải khát",10000);
		SanPham sp2 = new SanPham("1","Phở","Đồ ăn",30000);
		SanPham sp3 = new SanPham("2","Cơm","Đồ ăn",25000);
		//Thêm vào arraylist
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		System.out.println("Danh sách sản phẩm:");
		for(SanPham sp: dsSanPham)
			System.out.println(sp);
//		for(int i = 0; i<dsSanPham.size();i++) 
//		{
//			SanPham sp = dsSanPham.get(i);
//			System.out.println(sp.toString());
//		}
	}

}
