package baekjoon.dp.p10164;

import java.util.Scanner;

/**
 * 격자상의 경로
 * https://www.acmicpc.net/problem/10164
 *
 * 참고
 * https://www.youtube.com/watch?v=Opp57-EKyQU
 */
class Main {

    private static final int SIZE = 16;
    private static int[][] cache = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int ret;
        if (K == 0) {
            ret = solve(N, M);
        } else {
            int yy = (K + M - 1) / M;
            int xx = K % M;
            xx = (xx == 0) ? (M) : (xx);

            ret = solve(yy, xx) * solve(N - yy + 1, M - xx + 1);
        }

        System.out.println(ret);
    }

    private static int solve(int y, int x) {
        if (y == 1 || x == 1) return cache[y][x] = 1;
        if (cache[y][x] != 0) return cache[y][x];
        return solve(y - 1, x) + solve(y, x - 1);
    }
}