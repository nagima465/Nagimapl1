
import java.util.Scanner;

public class hz3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

            if (a[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
