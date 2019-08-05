package baekjoon.Permutation.p14888;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int plus = scanner.nextInt();
        int minus = scanner.nextInt();
        int mul = scanner.nextInt();
        int div = scanner.nextInt();

        int[] d = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (plus > 0) {
                d[i] = 0;
                plus--;
            } else if (minus > 0) {
                d[i] = 1;
                minus--;
            } else if (mul > 0) {
                d[i] = 2;
                mul--;
            } else {
                d[i] = 3;
                div--;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
            int result = cal(a, d, n);
            if (result > max) {
                max = result;
            }
            if (result < min) {
                min = result;
            }

        } while (nextPermutation(d, n - 1));

        System.out.println(max);
        System.out.println(min);
    }

    private static int cal(int[] a, int[] d, int n) {
        int result = a[0];
        for (int i = 0; i < n - 1; i++) {
            if (d[i] == 0) {
                result += a[i+1];
            } else if (d[i] == 1) {
                result -= a[i+1];
            } else if (d[i] == 2) {
                result *= a[i+1];
            } else {
                result /= a[i+1];
            }
        }
        return result;
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
