
import java.util.Scanner;


public class Bai4 {
    static boolean isSymmetry(String s){
        int l = 0;
        int r = s.length()- 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Bai4.isSymmetry(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
