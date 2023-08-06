
import java.util.Scanner;


public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        if (n <= 1) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }
    }
}
