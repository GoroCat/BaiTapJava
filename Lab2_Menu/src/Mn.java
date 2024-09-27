import java.util.Scanner;

public class Mn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Chọn chức năng:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    PTB1();
                    break;
                case 2:
                    PTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("+-----------------------------------+");
        System.out.println("| 1. Giải phương trình bậc nhất     |");
        System.out.println("| 2. Giải phương trình bậc hai      |");
        System.out.println("| 3. Tính tiền điện                 |");
        System.out.println("| 4. Kết thúc                       |");
        System.out.println("+-----------------------------------+");
    }
    public static void PTB1() {
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
         } else {
             double x = -b / a;
             System.out.println("Phương trình có nghiệmx = " + x);
         }
    }
    public static void PTB2() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if (a == 0){
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");}
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm x = " + x);}
        	} else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
    public static void tinhTienDien() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        double tienDien;

        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.printf("Số tiền điện phải trả là: %.2f VND\n", tienDien);
    } 
}