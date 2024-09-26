import java.util.Scanner;
public class A_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
    	double a = scanner.nextDouble();
    	System.out.print("Nhập hệ số b: ");
    	double b = scanner.nextDouble();
    	if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else
        {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }

	}

}
