package baekjoon.tree.p1991;

import java.util.Scanner;

public class Main {
    private static void preOrder(int[][] a, int x) {
        if (x == -1) return;
        System.out.print((char) (x + 'A'));
        preOrder(a, a[x][0]);
        preOrder(a, a[x][1]);
    }

    private static void inOrder(int[][] a, int x) {
        if (x == -1) return;
        inOrder(a, a[x][0]);
        System.out.print((char) (x + 'A'));
        inOrder(a, a[x][1]);
    }

    private static void postOrder(int[][] a, int x) {
        if (x == -1) return;
        postOrder(a, a[x][0]);
        postOrder(a, a[x][1]);
        System.out.print((char) (x + 'A'));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[26][2];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int x = line.charAt(0) - 'A';
            char y = line.charAt(2);
            char z = line.charAt(4);
            if (y == '.') {
                a[x][0] = -1;
            } else {
                a[x][0] = y - 'A';
            }
            if (z == '.') {
                a[x][1] = -1;
            } else {
                a[x][1] = z - 'A';
            }
        }
        preOrder(a, 0);
        System.out.println();
        inOrder(a, 0);
        System.out.println();
        postOrder(a, 0);
        System.out.println();
    }
}
