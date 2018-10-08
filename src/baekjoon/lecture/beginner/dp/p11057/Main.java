package baekjoon.lecture.beginner.dp.p11057;

import java.util.Scanner;

public class Main {

    private static final int MOD = 10007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] d = new int[n + 1][10];

        for (int i = 0; i <= 9; i++) {
            d[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    d[i][j] += d[i-1][k];
                    d[i][j] %= MOD;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= 9; i++) ans += d[n][i];
        System.out.println(ans % MOD);
    }
}
