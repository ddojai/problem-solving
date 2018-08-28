package baekjoon.p1158;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 11866번 조세퍼스 문제 0, 1158번 조세퍼스 문제
 * 조세퍼스 문제는 다음과 같다.
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다.
 * 이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다.
 * 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 * N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputList = br.readLine().split(" ");
            int n = Integer.parseInt(inputList[0]);
            int m = Integer.parseInt(inputList[1]);

            List<Integer> list = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }

            bw.write("<");

            int value;
            Iterator<Integer> iterator = list.iterator();
            while (list.size() > 1) {
                for (int i = 0; i < m - 1; i++) {
                    if (iterator.hasNext()) {
                        iterator.next();
                    } else {
                        iterator = list.iterator();
                        iterator.next();
                    }
                }

                if (iterator.hasNext()) {
                    value = iterator.next();
                } else {
                    iterator = list.iterator();
                    value = iterator.next();
                }
                bw.write(value + ", ");
                iterator.remove();
            }
            bw.write(list.get(0) + ">");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}