package baekjoon.bruteforce.p2309;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/2309
 */
class Main {

    private static final int MAX = 9;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            int input = Integer.parseInt(br.readLine());
            inputList.add(input);
        }

        List<Integer> resultList = new ArrayList<>();
        pick(MAX, inputList, resultList, 7);

        br.close();
    }

    private static void pick(int n, List<Integer> inputList, List<Integer> resultList, int toPick) {
        if (toPick == 0) {
            int sum = 0;
            for (int num : resultList) {
                sum += num;
            }
            if (sum == 100) {
                print(resultList);
                System.exit(0);
            } else {
                return;
            }
        }

        int size = resultList.size();
        for (int next = size; next < n; ++next) {
            resultList.add(inputList.get(next));
            pick(n, inputList, resultList, toPick - 1);
            resultList.remove(resultList.size() - 1);
        }
    }

    private static void print(List<Integer> resultList) {
        // 정렬
        Collections.sort(resultList);
        // 출력
        for (int num : resultList) {
            System.out.println(num);
        }
    }
}