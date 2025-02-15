import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSinhVien {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<SinhVien> dsSinhVien = new ArrayList<>();
		
		while (true) {
			System.out.println("\n Nhập thông tin sinh viên:");
			
			//Nhập họ và tên
			System.out.println("Nhập họ và tên: ");
			String hoTen = scan.nextLine();
			
			//Nhậm.out.println("Nhập điểm trung bình: ");
			double diemTB = scan.nextDouble();
			scan.nextLine();
			
			//Thêm sinh viên vào danh sách
			dsSinhVien.add(new SinhVien(hoTen, diemTB));
			
			//Hỏi người dùng muốn nhập thêm không
			System.out.println("Bạn có muốn nhập thêm sinh viên? (Y/N): ");
			String tiepTuc = scan.nextLine().trim().toLowerCase();
			if (tiepTuc.equals("N") || tiepTuc.equals("n")) {
				break;
			}
		}
		
		//Hiển thị danh sách sinh viên
		System.out.println("\n Danh sách sinh viên:");
		for (SinhVien sv : dsSinhVien) {
			sv.hienThiThongTin();
		}
		
		//Đóng scanner
		scan.close();
	}
}
