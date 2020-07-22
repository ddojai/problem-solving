package leetcode.easy.implementStrstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean existNeedle = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        existNeedle = false;
                        break;
                    }
                }
                if (existNeedle) {
                    return i;
                }
            }
        }

        return -1;
    }
}
