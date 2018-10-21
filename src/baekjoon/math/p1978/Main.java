package baekjoon.math.p1978;

import java.io.*;

/**
 * 소수찾기
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] numList = input.split(" ");
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(numList[i]);

            if (isPrimeNumber(num)) {
                cnt++;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cnt));
        bw.close();
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}