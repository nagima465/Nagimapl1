
import java.util.Scanner;

public class ml5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        while (x > 0) {
            int digit = x % 10;
            sum += digit;
            x = x / 10;
        }

        System.out.println(sum);
    }
}
