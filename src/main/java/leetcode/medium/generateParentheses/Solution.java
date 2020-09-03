package leetcode.medium.generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/submissions/
 * https://www.youtube.com/watch?v=Bt11jaoqt_Y&list=PL2mzT_U4XxDm7p6g1o3KeQMsyRLfzSaVW&index=1
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0, 0, "", ret);
        return ret;
    }

    // close > open -> invalid
    public void process(int n, int open, int close, String str, List<String> ret) {
        // terminate
        if (open == n && close == n) {
            ret.add(str);
            return;
        }
        // recurse
        if (open < n) {
            process(n, open + 1, close, str + "(", ret);
        }
        if (open > close) {
            process(n, open, close + 1, str + ")", ret);
        }
    }
}
