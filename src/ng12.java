
import java.util.Scanner;

public class ng12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sides = 2 * n;
        int batches = (sides + k - 1) / k;
        int time = batches * m;

        System.out.println(time);
    }
}
