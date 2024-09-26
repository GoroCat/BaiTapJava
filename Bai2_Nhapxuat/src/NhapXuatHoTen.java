/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class NhapXuatHoTen {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		
		Scanner banPhim;
		banPhim = new Scanner(System.in);
		System.out.print("Họ tên:");
		hoTen= banPhim.nextLine();
		System.out.print("Tuổi:");
		tuoi= banPhim.nextInt();
		System.out.print("Chiều Cao:");
		chieuCao= banPhim.nextDouble();
		System.out.print("Cân nặng:");
		canNang= banPhim.nextDouble();
		System.out.println("Name: " +hoTen);
		System.out.println("Age: " +tuoi);
		System.out.println("Height(m): " +chieuCao);
		System.out.println("Weight(kg): " +canNang);
		}
}
