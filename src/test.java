import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int tuoi = cn.nextInt();

        String name = "Đức Giang";
        double GPA = 3.48;

        System.out.printf("Tên: %s\n",name);
        System.out.printf("Tuổi: %d\n", tuoi);
        System.out.printf("GPA : %f\n", GPA);
        cn.close();
    }
}