package leetcode.easy.find_the_distance_value_between_two_arrays;

/**
 * n^2 -> nlogn 개선 가능
 * https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int answer = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }
}
