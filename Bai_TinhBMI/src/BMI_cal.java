import java.util.Scanner;

public class BMI_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Ho ten: ");
		String hoTen= banPhim.nextLine();
		
		System.out.print("Chieu cao(m): ");
		double chieuCao = banPhim.nextDouble();
		System.out.print("Can nang(kg): ");
		double canNang = banPhim.nextDouble();
		
		double bmi = canNang/ (chieuCao*chieuCao);
		System.out.print("Ban " + hoTen);
		System.out.print("Chi so BMI cua ban = " + bmi);
		
		if (bmi<18.5)
			System.out.println(" =>Thieu can");
		
		else if (bmi<25)
			System.out.println(" =>Can nang binh thuong");
		
		else if (bmi<30)
			System.out.println(" =>Thua can, tien beo phi");
		
		else if (bmi<35)
		System.out.println(" =>Beo phi do 1");
		
		else if (bmi<40)
		System.out.println(" =>Beo phi do 2");
		
		else System.out.println("Beo phi do 3");
	}

}
