
import java.util.Scanner;

public class hz15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int destroyed = 0;
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < n; ) {
                int j = i;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                int length = j - i;

                if (length >= 3) {
                    destroyed += length;

                    for (int k = j; k < n; k++) {
                        a[k - length] = a[k];
                    }

                    n -= length;
                    changed = true;
                    break;
                }

                i = j;
            }
        }

        System.out.println(destroyed);
    }
}
