
import java.util.Scanner;

public class Bai1 {

    static void soLanXuatHien(int arr[], int n) {
        boolean arr2[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (arr2[i]) {
                continue;
            }
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr2[j] = true;
                    cnt++;
                }
            }
            System.out.println("So " + arr[i] + ": " + cnt + " lan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.print("Nhap mang : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Bai1.soLanXuatHien(arr, n);
    }

}
