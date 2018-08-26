package baekjoon.p4948;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 1929번 베르트랑 공준
 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
 * 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
 * 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
 * n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int input;
            int max = 0;
            List<Integer> inputList = new ArrayList<>();
            do {
                input = Integer.parseInt(br.readLine());
                if (input != 0) {
                    inputList.add(input);
                }
                if (input > max) {
                    max = input;
                }
            } while (input != 0);

            int end = 2 * max;
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

            for (int n : inputList) {
                int cnt = 0;
                for (int i = n + 1; i <= 2 * n; i++) {
                    if (list[i] == 0) {
                        cnt++;
                    }
                }
                bw.write(cnt + "\n");
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}