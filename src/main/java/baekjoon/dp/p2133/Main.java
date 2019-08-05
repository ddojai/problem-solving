package baekjoon.dp.p2133;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] d = new long[n + 1];
        d[0] = 1;

        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 2] * 3;
            for (int j = i - 4; j >= 0; j-=2) {
                d[i] += d[j] * 2;
            }
        }

        System.out.println(d[n]);
    }
}