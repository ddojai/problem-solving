package baekjoon.etc.p2748;

import java.io.*;

/**
 * 2748번 피보나치 수 2
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
 *
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int num = Integer.parseInt(br.readLine());

            long[] cache = new long[num + 1];

            long sum = fib(num, cache);

            bw.write(String.valueOf(sum));

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long fib(int num, long[] cache) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            if (cache[num] == 0) {
                cache[num] = fib(num - 1, cache) + fib(num - 2, cache);
            }
            return cache[num];
        }
    }
}