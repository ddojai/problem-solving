package baekjoon.bruteforce.p15649;

import java.util.Scanner;

public class Main {
    private static boolean[] c = new boolean[10];
    private static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        go(0, n, m);
    }

    private static void go(int idx, int n, int m) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (c[i]) continue;
            c[i] = true; a[idx] = i;
            go(idx + 1, n, m);
            c[i] = false;
        }
    }
}
