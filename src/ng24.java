
import java.util.Scanner;

public class ng24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int b60 = n / 60;
        n = n % 60;

        int b10 = n / 10;
        n = n % 10;

        int b1 = n;

        System.out.println(b1 + " " + b10 + " " + b60);
    }
}
