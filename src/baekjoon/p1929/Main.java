package baekjoon.p1929;

import java.io.*;

/**
 * 1929번 소수 구하기 (에라토스테네스의 체)
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);

            int[] list = new int[end + 1];
            // 0 과 1 제외
            list[0] = 1; list[1] = 1;

            // end 의 루트 값 이하까지의 배수만 지워도 됨
            int sqrt = (int) Math.sqrt(end);

            for (int i = 2; i <= sqrt; i++) {
                if (list[i] == 0) {
                    for (int j = 2; i * j <= end; j++) {
                        // i의 배수 삭제
                        list[i * j] = 1;
                    }
                }
            }

            for (int i = start; i <= end; i++) {
                if (list[i] == 0) {
                    bw.write(i + "\n");
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}