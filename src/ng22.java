
import java.util.Scanner;
import java.util.Arrays;

public class ng22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
            return;
        }

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        a = sides[0];
        b = sides[1];
        c = sides[2];

        if (a * a + b * b == c * c) {
            System.out.println("right");
        } else if (a * a + b * b > c * c) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}
