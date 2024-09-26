import java.util.Scanner;

public class VND_NT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tiền cần quy đổi (VNĐ):");
		double vnd = scanner.nextDouble();
		double tygia = 0.000041 ;
		double usd = vnd * tygia;
		System.out.print(vnd+"VNĐ = "+usd+"USD");
	}

}
