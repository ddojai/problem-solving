package baekjoon.Permutation.p10971;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }

        int[][] w = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = scanner.nextInt();
            }
        }

        int ans = 5000001;
        do {
            if (d[0] != 0) break;
            boolean ok = true;
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                if (w[d[i]][d[i + 1]] == 0) ok = false;
                else sum += w[d[i]][d[i + 1]];
            }
            if (ok && w[d[n - 1]][d[0]] != 0) {
                sum += w[d[n - 1]][d[0]];
                if (ans > sum) ans = sum;
            }

        } while (nextPermutation(d, n));

        System.out.println(ans);
    }

    private static boolean nextPermutation(int[] a, int n) {
        int i = n - 1;
        while (i > 0 && a[i - 1] >= a[i]) i -= 1;
        if (i <= 0) return false;
        int j = n - 1;
        while (a[j] <= a[i - 1]) j -= 1;
        swap(a, j, i - 1);
        j = n - 1;

        while (i < j) {
            swap(a, i, j);
            i += 1;
            j -= 1;
        }
        return true;
    }

    private static void swap(int[] a, int aIdx, int bIdx) {
        int temp = a[aIdx];
        a[aIdx] = a[bIdx];
        a[bIdx] = temp;
    }
}

