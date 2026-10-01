import java.util.Scanner;

public class pl20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int day = (h - a + (a - b) - 1) / (a - b) + 1;

        System.out.println(day);
    }
}