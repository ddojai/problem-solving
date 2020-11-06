package leetcode.easy.add_digits;

/**
 * https://leetcode.com/problems/add-digits
 */
public class Solution {
    public int addDigits(int num) {
        do {
            String s = String.valueOf(num);
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            num = sum;
        } while (num >= 10);

        return num;
    }
}
