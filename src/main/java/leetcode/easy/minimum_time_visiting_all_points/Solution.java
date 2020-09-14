package leetcode.easy.minimum_time_visiting_all_points;

/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 * 1266. Minimum Time Visiting All Points
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] start = points[0];
        int seconds = 0;
        for (int i = 1; i < points.length; i++) {
            int[] point = points[i];
            seconds += (Math.max(Math.abs(start[0] - point[0]), Math.abs(start[1] - point[1])));
            start[0] = point[0];
            start[1] = point[1];
        }

        return seconds;
    }
}
