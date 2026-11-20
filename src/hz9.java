
import java.util.Scanner;

public class hz9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int temp = a[n - 1];

        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
