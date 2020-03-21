package baekjoon.math.p1712;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a/(c-b) + 1);
        }
    }
}
