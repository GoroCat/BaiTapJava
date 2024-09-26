import java.util.Scanner;
public class CV_HCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài hình chữ nhật:");
		double chieudai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng của hình chữ nhật");
		double chieurong = scanner.nextDouble();
		double chuvi = 2 * (chieudai + chieurong);
		System.out.print("Chu vi hình chữ nhật là: "+chuvi);
	}
}
