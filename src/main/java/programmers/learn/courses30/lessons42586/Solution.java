package programmers.learn.courses30.lessons42586;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            queue.addLast(day);
        }

        List<Integer> list = new ArrayList<>();
        while (queue.size() != 0) {
            int cnt = 1;
            int day = queue.pollFirst();
            while (queue.size() != 0 && queue.peekFirst() <= day) {
                queue.pollFirst();
                cnt++;
            }
            list.add(cnt);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
