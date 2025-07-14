import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = nc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n;i++)
        {
            System.out.printf("a[%d] = " , i);
            a[i] = nc.nextInt();
        }

        int ma = a[0];
        int viTri = 0;
        for(int i = 0; i < n;i++)
        {
            if(a[i] > ma) {
                ma = a[i];
                viTri = i;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: " + ma);
        System.out.println("Phần tử lớn nhất của mảng ở vị trí là: a[" + viTri + "]");
    }
}
