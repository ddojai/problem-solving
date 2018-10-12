package baekjoon.etc.p1676;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int five = 0;
        for (int i = 5; i <= n; i *= 5) {
            five += n / i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(five + "");
        bw.close();
    }
}