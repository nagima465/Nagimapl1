import java.util.Scanner;

public class pl13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hours = (n / 3600) % 24;
        int minutes = (n / 60) % 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}