
import java.util.Scanner;

public class ml2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        for (long i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
