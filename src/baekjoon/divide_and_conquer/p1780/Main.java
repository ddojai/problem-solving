package baekjoon.divide_and_conquer.p1780;

import java.io.*;

/**
 * 2740 행렬 곱셈
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputA = br.readLine().split(" ");
        int aN = Integer.parseInt(inputA[0]);
        int aM = Integer.parseInt(inputA[1]);

        int[][] a = new int[aN][aM];
        for (int i = 0; i < aN; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < aM; j++) {
                a[i][j] = Integer.parseInt(values[j]);
            }
        }

        String[] inputB = br.readLine().split(" ");
        int bM = Integer.parseInt(inputB[0]);
        int bK = Integer.parseInt(inputB[1]);

        int[][] b = new int[bM][bK];
        for (int i = 0; i < bM; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < bK; j++) {
                b[i][j] = Integer.parseInt(values[j]);
            }
        }

        if (aM != bM) {
            try {
                throw new Exception("invalid input");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int m = aM;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] result = new int[aN][bK];
        for (int i = 0; i < aN; i++) {
            for (int j = 0; j < bK; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += (a[i][k] * b[k][j]);
                }
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}