package baekjoon.bruteforce.p1182;

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

        int ans = go(n, s, a, 0, 0);

        if (s == 0) {
            ans--;
        }

        System.out.println(ans);
    }

    private static int go(int n, int s, int[] a, int index, int sum) {
        if (n == index) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }

        return go(n, s, a, index + 1, sum + a[index]) + go(n, s, a, index + 1, sum);
    }
}
