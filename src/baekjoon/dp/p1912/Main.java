package baekjoon.dp.p1912;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] d = new int[n];
        d[0] = a[0];
        int ans = d[0];
        for (int i = 1; i < n; i++) {
            if (d[i - 1] + a[i] > a[i]) {
                d[i] = d[i - 1] + a[i];
            } else {
                d[i] = a[i];
            }
            if (d[i] > ans) {
                ans = d[i];
            }
        }

        System.out.println(ans);
    }
}
