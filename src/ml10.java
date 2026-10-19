
import java.util.Scanner;

public class ml10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);
    }
}
