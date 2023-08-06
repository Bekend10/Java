
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        long P = 1;
        long result = 0;
        
        for (int i = 1 ; i <= n ; i++){
            sum += (float)1/i;
        }
  
        for (int i = 1; i <= n; i++) {
            P *= i;
            result += P;
        }
        System.out.println(sum);
        System.out.println(result);
    }
}
