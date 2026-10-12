
import java.util.Scanner;

public class ng29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < values.length; i++) {
            while (x >= values[i]) {
                result += roman[i];
                x -= values[i];
            }
        }

        System.out.println(result);
    }
}
