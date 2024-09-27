import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng: ");
        int soDien = scanner.nextInt();
        double tienDien;
        if (soDien <= 50) 
        {
            tienDien = soDien * 1000;
        } else 
        	{
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        	}
        System.out.println("Số tiền điện phải trả: " + tienDien + " VNĐ");
    }
}