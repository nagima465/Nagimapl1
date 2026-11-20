
import java.util.Scanner;

public class hz13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = a - 1; i < b; i++) {
            int temp = arr[i];
            arr[i] = arr[b - 1];
            arr[b - 1] = temp;
            b--;
        }

        for (int i = c - 1; i < d; i++) {
            int temp = arr[i];
            arr[i] = arr[d - 1];
            arr[d - 1] = temp;
            d--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
