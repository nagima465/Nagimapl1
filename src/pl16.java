import java.util.Scanner;

public class pl16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int totalKopecks = (a * 100 + b) * n;

        int rubles = totalKopecks / 100;
        int kopecks = totalKopecks % 100;

        System.out.println(rubles + " " + kopecks);
    }
}
