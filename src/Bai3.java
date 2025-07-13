import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int a = sn.nextInt();
        if (a % 2 == 0) {
            System.out.println("Chẵn");
        }
        else {
            System.out.println("Lẻ");
        }
    }
}
