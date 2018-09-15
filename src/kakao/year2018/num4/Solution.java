package kakao.year2018.num4;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] food_times = {3, 1, 2};
        long k = 5;
        int result = solution.solution(food_times, k);
        System.out.println(result);
    }

    public int solution(int[] food_times, long k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        int sum = 0;
        for (int i = 0; i < food_times.length; i++) {
            sum += food_times[i];
            map.put(i + 1, food_times[i]);
        }

        if (k >= sum) {
            return -1;
        }

        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();

        do {
            if (iter.hasNext()) {
                Integer key = iter.next();
//                System.out.println(key);
                if (map.get(key) > 0) {
                    map.put(key, map.get(key) - 1);
                } else {
                    continue;
                }
                k--;
            } else {
//                set = map.keySet();
                iter = set.iterator();
            }
        } while (k > 0);

        int idx = 1;
        if (iter.hasNext()) {
            idx = iter.next();
        }

        return idx;
    }
}