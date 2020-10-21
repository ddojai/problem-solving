package leetcode.easy.intersection_of_two_arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);

        return set1.stream().mapToInt(Number::intValue).toArray();
    }
}
