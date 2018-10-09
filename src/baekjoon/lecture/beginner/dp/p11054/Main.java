package baekjoon.lecture.beginner.dp.p11054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 증가 수열
        int[] d1 = new int[n];
        for (int i = 0; i < n; i++) {
            d1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d1[i] < d1[j] + 1) {
                    d1[i] = d1[j] + 1;
                }
            }
        }

        // 감소 수열
        int[] d2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            d2[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[i] && d2[i] < d2[j] + 1) {
                    d2[i] = d2[j] + 1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (ans < d1[i] + d2[i] - 1) {
                ans = d1[i] + d2[i] - 1;
            }
        }

        System.out.println(ans);
    }
}
