package leetcode.easy.number_of_students_doing_homework_at_a_given_time;

/**
 * https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}
