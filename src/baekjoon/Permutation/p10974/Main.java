package baekjoon.Permutation.p10974;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        boolean hasNext;
        do {
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();

            hasNext = nextPermutation(a, n);
        } while (hasNext);
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

