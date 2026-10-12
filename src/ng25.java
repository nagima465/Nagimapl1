
import java.util.Scanner;

public class ng25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int bestTrips = 0;

        int best1 = 0, best5 = 0, best10 = 0, best20 = 0, best60 = 0;

        for (int t60 = 0; t60 <= n / 60 + 1; t60++) {
            for (int t20 = 0; t20 <= n / 20 + 1; t20++) {
                for (int t10 = 0; t10 <= n / 10 + 1; t10++) {
                    for (int t5 = 0; t5 <= n / 5 + 1; t5++) {
                        int trips = t60 * 60 + t20 * 20
                                + t10 * 10 + t5 * 5;

                        int t1 = Math.max(0, n - trips);
                        int totalTrips = trips + t1;
                        int cost = t60 * 440 + t20 * 230
                                + t10 * 125 + t5 * 70 + t1 * 15;

                        if (totalTrips >= n &&
                                (cost < bestCost ||
                                        (cost == bestCost && totalTrips > bestTrips))) {
                            bestCost = cost;
                            bestTrips = totalTrips;

                            best1 = t1;
                            best5 = t5;
                            best10 = t10;
                            best20 = t20;
                            best60 = t60;
                        }
                    }
                }
            }
        }

        System.out.println(best1 + " " + best5 + " " + best10
                + " " + best20 + " " + best60);
    }
}
