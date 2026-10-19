
import java.util.Scanner;

public class ml14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int zeros = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                zeros++;
            } else if (x > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println(zeros + " " + positive + " " + negative);
    }
}
