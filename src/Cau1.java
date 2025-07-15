import java.util.Scanner;

public class Cau1{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int a = sn.nextInt();
        int tong = 0;
        while (a != 0)
        {
            int tmp = a % 10;
            tong += tmp;
            a /= 10;
        }

        System.out.printf("Tổng của số nguyên vừa nhập là: %d\n", tong);
        sn.close();
    }
}