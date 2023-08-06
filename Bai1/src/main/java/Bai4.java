
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        double x, x1, x2, x3, x4, x5;
        double delta = b * b - 4 * a * c;

        if (delta == 0) {
            double y = -(b / 2 * a);
            if (y > 0) {
                x = Math.sqrt(y);
                x1 = -Math.sqrt(y);
                System.out.println("Nghiem thu 1 : x1 = " + x);
                System.out.println("Nghiem thu 2 : x2 = " + x1);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else if (delta > 0) {
            double y1 = (-b + Math.sqrt(delta)) / (2 * a);
            double y2 = (-b - Math.sqrt(delta)) / (2 * a);
            if (y1 > 0 && y2 > 0) {
                x2 = Math.sqrt(y1);
                x3 = -Math.sqrt(y1);
                x4 = Math.sqrt(y2);
                x5 = -Math.sqrt(y2);
                System.out.println("Nghiem thu 1 : x1 = " + x2);
                System.out.println("Nghiem thu 2 : x2 = " + x3);
                System.out.println("Nghiem thu 3 : x3 = " + x4);
                System.out.println("Nghiem thu 4 : x4 = " + x5);

            } else {

                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
