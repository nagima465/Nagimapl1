
import java.util.Scanner;

public class ml18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x != e && a * x * x * x + b * x * x + c * x + d == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
