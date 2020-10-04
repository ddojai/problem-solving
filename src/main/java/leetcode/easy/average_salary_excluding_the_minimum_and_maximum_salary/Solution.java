package leetcode.easy.average_salary_excluding_the_minimum_and_maximum_salary;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }

        return (double) sum / (salary.length - 2);
    }
}
