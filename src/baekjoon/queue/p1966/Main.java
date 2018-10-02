package baekjoon.queue.p1966;

import java.io.*;
import java.util.*;

/**
 * 1966번 프린터 큐
 * 여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.
 *
 * 현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
 * 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
 * 예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.
 *
 * 여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                String[] inputList = br.readLine().split(" ");
                // 총 문서 갯수
                int n = Integer.parseInt(inputList[0]);
                // 출력하려는 문서 idx
                int m = Integer.parseInt(inputList[1]);

                String[] documents = br.readLine().split(" ");
                LinkedList<Integer> queue = new LinkedList<>();
                for (String document : documents) {
                    queue.offerLast(Integer.parseInt(document));
                }

                int cnt = 0;

                while (true) {
                    // 인쇄할 문서
                    Integer value = queue.peekFirst();
                    boolean isPrint = true;
                    for (int idx = 1; idx < queue.size(); idx++) {
                        // 중요도 체크
                        Integer element = queue.get(idx);
                        if (value < element) {
                            // 인쇄하려는 문서의 중요도가 낮다면
                            value = queue.pollFirst();
                            // 문서 맨 앞으로 이동
                            queue.offerLast(value);
                            m--;
                            if (m < 0) {
                                m = queue.size() - 1;
                            }
                            isPrint = false;
                            break;
                        }
                    }

                    if (isPrint) {
                        queue.pollFirst();
                        n--;
                        m--;
                        cnt++;

                        if (m < 0) {
                            break;
                        }
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