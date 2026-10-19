
import java.util.Scanner;

public class ml15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
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
