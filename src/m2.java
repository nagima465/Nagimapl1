import java.util.Scanner;

public class m2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int d4 = n % 10;
        int d3 = (n / 10) % 10;
        int d2 = (n / 100) % 10;
        int d1 = (n / 1000) % 10;

        System.out.println(1 + Math.abs(d1 - d4) + Math.abs(d2 - d3));
    }
}