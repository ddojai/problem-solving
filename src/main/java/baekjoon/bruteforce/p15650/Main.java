package baekjoon.bruteforce.p15650;

import java.util.Scanner;

public class Main {

    private static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        go(1, 0, n, m);
    }

    private static void go(int index, int selected, int n, int m) {
        if (selected == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }

        if (index > n) return;
        a[selected] = index;
        go(index + 1, selected + 1, n, m);
        a[selected] = 0;
        go(index + 1, selected, n, m);
    }
}
