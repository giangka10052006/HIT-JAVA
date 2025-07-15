import java.util.Scanner;

public class Cau4 {
    // Hàm trả về mảng Fibonacci
    public static int[] FiBo(int n) {
        int[] fi = new int[n];
        if (n > 0) fi[0] = 1;
        if (n > 1) fi[1] = 1;

        for (int i = 2; i < n; i++) {
            fi[i] = fi[i - 1] + fi[i - 2];
        }
        return fi;
    }

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = nc.nextInt();

        int[] arr = FiBo(n);

        System.out.print("Dãy Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        nc.close();
    }
}
