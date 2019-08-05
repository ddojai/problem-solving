package codility.Sorting.Distinct;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int n : A) {
            set.add(n);
        }
        int count = set.size();

        return count;
    }

    public static void main(String[] args) throws IOException {

        int[] list = {0, 1, 0, 1, 1};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
