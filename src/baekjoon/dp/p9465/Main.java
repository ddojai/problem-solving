package baekjoon.dp.p9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[][] arr = new long[n + 1][2];
            String[] line1 = br.readLine().trim().split(" ");
            String[] line2 = br.readLine().trim().split(" ");
            for (int i = 1; i <= n; i++) {
                // 1 행
                arr[i][0] = Long.parseLong(line1[i - 1]);
                // 2 행
                arr[i][1] = Long.parseLong(line2[i - 1]);
            }

            long[][] d = new long[n + 1][3];

            for (int i = 1; i <= n; i++) {
                d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
                d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + arr[i][0];
                d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + arr[i][1];
            }

            long result = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
            System.out.println(result);
        }
    }
}
