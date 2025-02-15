import java.util.Scanner;

public class Cv_Dt_Hcn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Nhập hai cạnh của hình chữ nhật
		System.out.print("Nhập chiều dài: ");
		double chieuDai = scan.nextDouble();
		
		System.out.print("Nhập chiều rộng: ");
		double chieuRong = scan.nextDouble();
		
		//Tính chu vi và diện tích
		double chuVi = 2 * (chieuDai + chieuRong);
		double dienTich = chieuDai * chieuRong;
		
		// Xuất kết quả
		System.out.println("\n Kết quả:");
		System.out.println("Chu vi hình chữ nhật: " + chuVi);
		System.out.println("Diện tích hình chữ nhật: " + dienTich);
		
		// Đóng Scanner
		scan.close();
	}

}
