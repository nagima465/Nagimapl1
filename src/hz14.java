
import java.util.Scanner;

public class hz14 {

    public static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int k = in.nextInt();

        k = k % n;

        if (k < 0) {
            k += n;
        }

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
