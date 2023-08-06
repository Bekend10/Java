
import java.util.Scanner;


public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
        int max = Math.min(a,Math.min(b/2, c/4));
        
        System.out.println(max*7);
    }
 
}
