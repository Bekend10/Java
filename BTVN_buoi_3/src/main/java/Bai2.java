
import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.print("Nhap mang : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap vi tri can them phan tu : ");
        int k = sc.nextInt();
        if(k < 0 || k > arr.length){
            System.out.println("Vi tri nhap khong le ! ");
            return;
        }
        System.out.print("Nhap gia tri can them : ");
        int m = sc.nextInt();
        
        int[] newArr = new int[n+1];
        
        for (int i = 0 , j = 0; i < n+1; i++) {
            if(i == k){
                newArr[k] = m;
            } 
            else{
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.print("Mang sau khi them : " + Arrays.toString(newArr));
       
        System.out.println();
        System.out.print("Nhap vi tri can xoa : ");
        int x = sc.nextInt();
        if(x < 0 || x > arr.length){
            System.out.println("Sai vi tri");
            return;
        }
        int []newArr2 = new int[n-1];
        for (int i = 0 , j = 0; i < n; i++) {
            if(i != x-1){
                newArr2[j] = arr[i];
                j++;
            }
        }
        System.out.print("Mang sau khi xoa : " +Arrays.toString(newArr2));   
    }   
}
