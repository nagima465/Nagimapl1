
import java.util.Scanner;

public class ng27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 100 >= 11 && n % 100 <= 14) {
            System.out.println(n + " bochek");
        } else if (n % 10 == 1) {
            System.out.println(n + " bochka");
        } else if (n % 10 >= 2 && n % 10 <= 4) {
            System.out.println(n + " bochki");
        } else {
            System.out.println(n + " bochek");
        }
    }
}
