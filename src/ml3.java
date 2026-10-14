
import java.util.Scanner;

public class ml3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        for (long i = a; i <= b; i++) {
            if (i >= 0) {
                long root = (long) Math.sqrt(i);

                if (root * root == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
