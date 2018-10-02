package baekjoon.etc.p1676;

import java.io.*;

/**
 * 팩토리얼 0의 개수
 * https://www.acmicpc.net/problem/1676
 * 참고 : http://ksj14.tistory.com/entry/BackJoon1676-%ED%8C%A9%ED%86%A0%EB%A6%AC%EC%96%BC-0%EC%9D%98-%EA%B0%9C%EC%88%98
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            int two = 0, five = 0;
            for (int i = 2; i <= n; i *= 2) {
                two += n / i;
            }
            for (int i = 5; i <= n; i *= 5) {
                five += n / i;
            }

            int cnt = two < five ? two : five;
            bw.write(cnt + "");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}