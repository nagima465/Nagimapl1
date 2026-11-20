
import java.util.Scanner;

public class hz12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int petya = in.nextInt();

        int position = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= petya) {
                position++;
            }
        }

        System.out.println(position);
    }
}
