package leetcode.medium.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // Approach 2: Sliding Window
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    /* timeout
    public int lengthOfLongestSubstring(String s) {
        int longestLength = 0;
        int currLength = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (map.containsKey(c)) {
                    map.clear();
                    currLength = 0;
                }
                map.put(c, 1);
                currLength++;
                if (currLength > longestLength) {
                    longestLength = currLength;
                }
            }
            map.clear();
            currLength = 0;
        }

        return longestLength;
    }
    */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("asjrgapa");
        System.out.println(result);
    }
}
