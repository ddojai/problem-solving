package baekjoon.dp.p9095.recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            int ans = 0;
            for (int i = 1; i <= 3; i++) {
                ans += go(i, n);
            }

            System.out.println(ans);
        }
    }

    private static int go(int sum, int n) {
        if (sum > n) {
            return 0;
        } else if (sum == n) {
            return 1;
        }

        int total = 0;
        for (int i = 1; i <= 3; i++) {
            total += go(sum + i, n);
        }
        return total;
    }
}
