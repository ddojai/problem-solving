package kakao.year2018.num2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//        int N = 4;
//        int[] stages = {4,4,4,4,4};
        int[] result = solution.solution(N, stages);

        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> clearInfo = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            clearInfo.put(i, 0);
        }

        for (int stage : stages) {
            if (stage > N) {
                continue;
            }
            clearInfo.put(stage, clearInfo.get(stage) + 1);
        }

        Map<Integer, Double> failureRate = new HashMap<>();
        int totalCnt = stages.length;
        for (int i = 1; i <= N; i++) {
            int cnt = clearInfo.get(i);
            if (cnt > 0) {
                failureRate.put(i, (double)cnt / totalCnt);
                totalCnt -= cnt;
            } else {
                failureRate.put(i, (double) 0);
            }
        }

        List<Integer> resultList = sortByValue(failureRate);

        return resultList.stream().mapToInt(i->i).toArray();
    }

    private static List<Integer> sortByValue(Map<Integer, Double> map) {
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Double d1 = map.get(o1);
                Double d2 = map.get(o2);

                if (d1 > d2) {
                    return -1;
                } else if (d1 < d2) {
                    return 1;
                } else {
                    return o1 - o2;
                }
            }
        });

        return list;
    }
}