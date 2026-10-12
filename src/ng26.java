
import java.util.Scanner;

public class ng26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();
        long N = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (y > 1) {
            System.out.print(x + " " + (y - 1) + " ");
        }

        if (x > 1) {
            System.out.print((x - 1) + " " + y + " ");
        }

        if (y < N) {
            System.out.print(x + " " + (y + 1) + " ");
        }

        if (x < M) {
            System.out.print((x + 1) + " " + y);
        }
    }
}
