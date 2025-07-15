import java.util.Scanner;

public class Cau3{
    // Hàm tìm UCLN
    public static int UCLN(int a, int b){
        while (b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    // hàm tìm BCNN
    public static int BCNN(int a, int b){
        return a / UCLN(a, b) * b;
    }

    public static void main(String[] args){
        Scanner nc = new Scanner(System.in);
        System.out.print("Nhập số đầu tiên: ");
        int a = nc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = nc.nextInt();

        int uoc = UCLN(a,b);
        int boi = BCNN(a,b);

        System.out.print("Ước chung lớn nhất là: " + uoc);
        System.out.print("Bội chung nhỏ nhất là: " + boi);
        nc.close();
    }
}