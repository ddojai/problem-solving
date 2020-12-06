package leetcode.easy.largest_perimeter_triangle;

import java.util.Arrays;

/**
 * Time limit 걸려서 못풀고 솔루션 참고
 * https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i + 1] > A[i + 2])
                return A[i] + A[i + 1] + A[i + 2];
        return 0;
    }
}
