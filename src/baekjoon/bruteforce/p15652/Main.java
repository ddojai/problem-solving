package baekjoon.bruteforce.p15652;

import java.util.Scanner;

public class Main {

    private static int[] cnt = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        go(1, 0, n, m);
    }

    private static void go(int index, int selected, int n, int m) {
        if (selected == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= cnt[i]; j++) {
                    sb.append(i);
                    sb.append(" ");
                }
            }
            System.out.println(sb);
            return;
        }

        if (index > n) return;
        for (int i = m - selected; i >= 1; i--) {
            cnt[index] = i;
            go(index + 1, selected + i, n, m);
        }
        cnt[index] = 0;
        go(index + 1, selected, n, m);
    }
}