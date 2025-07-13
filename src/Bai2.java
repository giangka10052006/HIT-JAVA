
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sn.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sn.nextInt();

        System.out.printf("Tông 2 số nguyên là: %d\n", a + b);
    }
}
