import java.util.Scanner;

public class Bai4 {
    public static int dienTich(int chieuDai, int chieuRong) {
        return chieuDai * chieuRong;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int a = sn.nextInt();

        System.out.print("Nhập chiều rộng ");
        int b = sn.nextInt();

        int res = dienTich(a,b);
        System.out.println("Diện tích hình chữ nhật là: " + res);
        sn.close();
    }
}
