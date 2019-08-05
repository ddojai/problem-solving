package codility.Leader.Dominator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return -1;
        }

        int half = A.length / 2;
        int dominator = 0;
        int idx = -1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            int cnt;
            if (map.get(num) == null) {
                cnt = 1;
                map.put(num, cnt);
            } else {
                cnt = map.get(num) + 1;
                map.put(num, cnt);
            }
            if (half < cnt) {
                dominator = num;
                idx = -2;
                break;
            }
        }

        if (idx == -2) {
            for (int i = 0; i < A.length; i++) {
                if (dominator == A[i]) {
                    idx = i;
                    break;
                }
            }
        }

        return idx;
    }

    public static void main(String[] args) throws IOException {
//        int list[] = {2, 1, 1, 3};
        int list[] = {3, 4, 3, 2, 3, -1, 3, 3};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
