package leetcode.easy.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String temp = "";
            if (i % 3 == 0) {
                temp += "Fizz";
            }
            if (i % 5 == 0) {
                temp += "Buzz";
            }
            if (temp.isEmpty()) {
                temp = String.valueOf(i);
            }
            list.add(temp);
        }

        return list;
    }
}
