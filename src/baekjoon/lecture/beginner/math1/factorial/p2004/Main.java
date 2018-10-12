package baekjoon.lecture.beginner.math1.factorial.p2004;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();

        long two = 0, five = 0;
        for (long i = 2; i <= n; i *= 2) {
            two += n / i;
        }

        for (long i = 2; i <= m; i *= 2) {
            two -= m / i;
        }

        for (long i = 2; i <= n - m; i *= 2) {
            two -= (n - m) / i;
        }

        for (long i = 5; i <= n; i *= 5) {
            five += n / i;
        }

        for (long i = 5; i <= m; i *= 5) {
            five -= m / i;
        }

        for (long i = 5; i <= n - m; i *= 5) {
            five -= (n - m) / i;
        }

        long cnt = Math.min(two, five);

        System.out.println(cnt);
    }
}