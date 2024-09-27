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
    }
    public static void PTB2() {
    }
    public static void tinhTienDien() {
    }
}