
import java.util.Scanner;

public class ng21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println(x1 + " " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
    }
}
