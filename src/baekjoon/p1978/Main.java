package baekjoon.p1978;

import java.io.*;

/**
 * 소수찾기
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] numList = input.split(" ");
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(numList[i]);
                if (num <= 1) continue;

                boolean isPrime = true;
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    cnt++;
                }
            }

            bw.write(String.valueOf(cnt));

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}