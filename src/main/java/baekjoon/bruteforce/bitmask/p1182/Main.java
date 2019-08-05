package baekjoon.bruteforce.bitmask.p1182;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int ans = 0;

        for (int i = 1; i < (1 << n); i++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                if ((i & (1 << k)) != 0) {
                    sum += a[k];
                }
            }
            if (sum == s) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
