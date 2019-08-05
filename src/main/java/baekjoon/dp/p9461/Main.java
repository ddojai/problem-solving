package baekjoon.dp.p9461;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        long[] d = new long[100];
        d[0] = 1;
        d[1] = 1;
        d[2] = 1;
        for (int i = 3; i < 100; i++) {
            d[i] = d[i - 2] + d[i - 3];
        }

        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(d[n - 1]);
        }
    }
}
