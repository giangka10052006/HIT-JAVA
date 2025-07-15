import java.util.Scanner;

public class Cau5 {
    public static int GiaoThua(int n){
        int gt = 1;
        for (int i = 1; i <= n;i++)
        {
            gt *= i;
        }
        return gt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int res = GiaoThua(n);

        System.out.print("Giao thừa của " + n + " là: " + res);
        sc.close();
    }
}
