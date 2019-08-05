package baekjoon.bruteforce.p14888;

import java.util.Scanner;

class Pair {
    int min;
    int max;

    Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class Main {

    static Pair pair = new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE);

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

        go(a, 1, a[0], plus, minus, mul, div);

        System.out.println(pair.max);
        System.out.println(pair.min);
    }

    private static void go(int[] a, int idx, int cur, int plus, int minus, int mul, int div) {
        if (plus < 0 || minus < 0 || mul < 0 || div < 0) {
            return;
        }

        if (idx == a.length) {
            if (pair.max < cur) {
                pair.max = cur;
            }
            if (pair.min > cur) {
                pair.min = cur;
            }
            return;
        }

        go(a, idx + 1, cur + a[idx], plus - 1, minus, mul, div);
        go(a, idx + 1, cur - a[idx], plus, minus - 1, mul, div);
        go(a, idx + 1, cur * a[idx], plus, minus, mul - 1, div);
        go(a, idx + 1, cur / a[idx], plus, minus, mul, div - 1);
    }
}
