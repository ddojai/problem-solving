package programmers.skillCheck.challengeId_314;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int curr = -1;
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            if (curr != value) {
                curr = value;
                list.add(curr);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}