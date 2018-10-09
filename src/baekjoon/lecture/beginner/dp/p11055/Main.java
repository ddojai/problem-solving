package baekjoon.lecture.beginner.dp.p11055;

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
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j] + a[i]) {
                    d[i] = d[j] + a[i];
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }

        System.out.println(ans);
    }
}
