
import java.util.Scanner;

public class Bai5 {

    static String formatName(String s) {
        StringBuilder formatted = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
                if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    formatted.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    formatted.append(Character.toLowerCase(c));
                }
            }
        }
        return formatted.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String formattedName = formatName(s);
        System.out.println("Ten da chinh sua: " + formattedName);
    }

}
