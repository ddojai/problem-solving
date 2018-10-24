package baekjoon.bruteforce.p15652;

import java.util.Scanner;

public class Main {
    private static boolean[] c = new boolean[10];
    private static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        go(0, 1, n, m);
    }

    private static void go(int idx, int start, int n, int m) {
        if (idx == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(a[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }
        for (int i = start; i <= n; i++) {
            a[idx] = i;
            go(idx + 1, i, n, m);
        }
    }
}
