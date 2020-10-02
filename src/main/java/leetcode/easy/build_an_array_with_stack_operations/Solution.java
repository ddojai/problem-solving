package leetcode.easy.build_an_array_with_stack_operations;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/build-an-array-with-stack-operations/
 */
public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        List<Integer> targetList = Arrays.stream(target).boxed().collect(Collectors.toList());

        for (int i = 1; i <= target[target.length - 1]; i++) {
            if (targetList.contains(i)) {
                list.add("Push");
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }

        return list;
    }
}
