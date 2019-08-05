package baekjoon.math.p1476;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int s = scanner.nextInt();
        int m = scanner.nextInt();

        e--;
        s--;
        m--;

        for (int i = 0; ; i++) {
            if (i % 15 == e && i % 28 == s && i % 19 == m) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
