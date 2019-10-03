package leetcode.problems.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int carry = 0;
        StringBuilder res = new StringBuilder();

        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {

            int p = i < len1 ? a.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res.insert(0, tmp % 2);
        }
        return (carry == 0) ? res.toString() : "1" + res;
    }
}
