package baekjoon.lecture.beginner.dp.p2156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] d = new int[n + 1];
        d[1] = arr[1];
        if (n >= 2) {
            d[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            d[i] = d[i-1];
            if (d[i] < d[i-2] + arr[i]) {
                d[i] = d[i-2] + arr[i];
            }
            if (d[i] < d[i-3] + arr[i] + arr[i-1]) {
                d[i] = d[i-3] + arr[i] + arr[i-1];
            }
        }

        int ans = d[1];
        for (int i=2; i<=n; i++) {
            ans = Math.max(ans, d[i]);
        }
        System.out.println(ans);

    }
}
