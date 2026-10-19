
import java.util.Scanner;

public class ml4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        int d = sc.nextInt();

        int count = 0;

        while (x > 0) {
            long digit = x % 10;

            if (digit == d) {
                count++;
            }

            x = x / 10;
        }

        System.out.println(count);
    }
}
