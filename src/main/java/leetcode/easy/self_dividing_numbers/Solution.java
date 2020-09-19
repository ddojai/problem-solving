package leetcode.easy.self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String numStr = String.valueOf(i);
            boolean isSelfDividingNumber = true;
            for (int j = 0; j < numStr.length(); j++) {
                int n = Integer.parseInt(String.valueOf(numStr.charAt(j)));
                if (n == 0 || i % n != 0) {
                    isSelfDividingNumber = false;
                    break;
                }
            }
            if (isSelfDividingNumber) {
                list.add(i);
            }
        }

        return list;
    }
}
