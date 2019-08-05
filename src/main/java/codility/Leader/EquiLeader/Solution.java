package codility.Leader.EquiLeader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int half = A.length / 2;
        int leader = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.merge(num, 1, (a, b) -> a + b);
            if (half < map.get(num)) {
                leader = num;
            }
        }

        int numOfEquiLeaders = 0;
        if (map.get(leader) != null) {
            int totalLeaderCnt = map.get(leader);
            int leaderCnt = 0;
            for (int i = 0; i < A.length; i++) {
                int halfPrev = (i + 1) / 2;
                int halfNext = (A.length - 1 - i) / 2;
                if (A[i] == leader) {
                    leaderCnt++;
                }
                if (leaderCnt > halfPrev && (totalLeaderCnt - leaderCnt) > halfNext) {
                    numOfEquiLeaders++;
                }
            }
        }

        return numOfEquiLeaders;
    }

    public static void main(String[] args) throws IOException {
        int list[] = {4, 3, 4, 4, 4, 2};
//        int list[] = {1, 2};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
