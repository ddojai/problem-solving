package baekjoon.bruteforce.p14501;

import java.util.Scanner;

public class Main {

    private static int[] t;
    private static int[] p;
    private static int n;
    private static int ans = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        t = new int[n];
        p = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }

        go(0, 0);

        System.out.println(ans);
    }

    private static void go(int day, int sum) {
        if (day == n) {
            if (ans < sum) {
                ans = sum;
            }
            return;
        }
        if (day > n) {
            return;
        }

        // 상담 하는 경우
        go(day + t[day], sum + p[day]);

        // 상담 안하는 경우
        go(day + 1, sum);
    }
}
