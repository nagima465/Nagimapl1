
import java.util.Scanner;

public class hz5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        boolean found = false;

        for (int i = 1; i < n; i++) {
            if ((a[i] > 0 && a[i - 1] > 0) ||
                    (a[i] < 0 && a[i - 1] < 0)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
