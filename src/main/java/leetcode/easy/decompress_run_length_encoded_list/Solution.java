package leetcode.easy.decompress_run_length_encoded_list;

import java.util.ArrayList;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                ret.add(val);
            }
        }

        return ret.stream().mapToInt(i -> i).toArray();
    }
}
