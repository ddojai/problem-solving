package baekjoon.p10166;

import java.util.*;

/**
 * 관중석
 * https://www.acmicpc.net/problem/10166
 *
 * 참고
 * https://www.youtube.com/watch?v=Ym1hpXcA_Eo
 */
class Main {

    private static int[][] seat = new int[2000][2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();

        int ret = 0;
        for (int i = from; i <= to; ++i) {
            for (int j = 0; j < i; ++j) {
                int g = gcd(i, j);
                int up = j / g;
                int down = i / g;
                if (seat[up][down] == 0) {
                    seat[up][down] = 1;
                    ++ret;
                }
            }
        }

        System.out.println(ret);
    }

    private static int gcd(int a, int b) {
        return (b != 0) ? gcd(b, a % b) : (a);
    }
}