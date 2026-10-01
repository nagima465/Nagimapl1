import java.util.Scanner;

public class pl12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hours = (n / 60) % 24;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}
