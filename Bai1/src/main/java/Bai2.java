
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
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
