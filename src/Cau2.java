import java.util.Scanner;

public class Cau2{
    public static boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if( n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args){
        Scanner nc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên: ");
        int n = nc.nextInt();
        if (prime(n)){
            System.out.print(n + " là số nguyên tố");
        }
        else
        {
            System.out.print(n + " là không phải số nguyên tố");
        }
    }
}