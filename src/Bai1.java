import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");

        String name = sn.nextLine();
        System.out.print("Xin chào " + name);
        sn.close();
    }
}
