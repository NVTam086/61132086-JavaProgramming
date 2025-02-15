import java.util.Scanner;

public class PTB2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Nhập các hệ số a, b, c
		System.out.print("Nhập hế số a: ");
		double a = scan.nextDouble();

		System.out.print("Nhập hế số b: ");
		double b = scan.nextDouble();
		
		System.out.print("Nhập hế số c: ");
		double c = scan.nextDouble();
		
		//Tính delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		double canDelta = Math.sqrt(Math.abs(delta)); //Lấy căn delta, dùng abs() tránh lỗi khi delta âm
		
		//Xuất kết quả
		System.out.println("\n Delta = " + delta);
		System.out.println(" Căn Delta = " + canDelta);
		
		//Đóng scanner
		scan.close();
	}

}
