import java.util.Scanner;

public class V_KhoiLapPhuong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Nhập cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scan.nextDouble();
		
		//Tính thể tích
		double theTinh = Math.pow(canh,3); // V = a^3
		
		//Xuất kết quả
		System.out.print("\n Thể tích của khổi lập phương: V = " + canh + "^3 = " + theTinh);
		
		//Đóng scanner
		scan.close();
	}

}