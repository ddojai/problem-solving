package programmers.sort.level1_42748;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
 */
public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(arr);
            answer[n] = arr[k - 1];
        }
        return answer;
    }
}
