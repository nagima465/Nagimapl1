import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalMinutes = 9 * 60 + n * 45 + ((n - 1) / 2) * 20 + ((n - 1) % 2) * 5;

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}
