import java.util.Scanner;

public class DTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Họ tên sinh viên: ");
		        String hoTen = scanner.nextLine();
		        System.out.print("Điểm trung bình: ");
		        double diemTB = scanner.nextDouble();
		        System.out.println("Họ Tên: " + hoTen + "|ĐiểmTB: " + diemTB);

		        scanner.close();
		    }
		
	}

