package baekjoon.p9020;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 9020번 골드바흐의 추측
 * 1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
 * 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 숫자를 골드바흐 숫자라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
 * 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 입력
            int count = Integer.parseInt(br.readLine());
            int max = 0;
            List<Integer> inputList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                int input = Integer.parseInt(br.readLine());
                inputList.add(input);
                if (input > max) {
                    max = input;
                }
            }

            // 에라토스테네스의 체
            int[] list = eratosthenes(max);

            // 골드바흐 파티션
            for (int n : inputList) {
                for (int i = n / 2; i >= 2; i--) {
                    if (list[i] == 0) {
                        int j = n - i;
                        if (list[j] == 0) {
                            bw.write(i + " " + j + "\n");
                            break;
                        }
                    }
                }
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 에라토스테네스의 체
     * 소수가 아닌 인덱스의 값을 1로 변경
     *
     * @param end
     * @return int[]
     */
    private static int[] eratosthenes(int end) {
        int[] list = new int[end + 1];
        // 0 과 1 제외
        list[0] = 1;
        list[1] = 1;

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
        return list;
    }
}