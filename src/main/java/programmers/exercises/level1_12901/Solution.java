package programmers.exercises.level1_12901;

/**
 * 코딩테스트 연습 -> 연습문제 -> 2016년
 */
public class Solution {
    public String solution(int a, int b) {
        int[] dayPerMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int total = b;
        if (a > 1)
        {
            for (int i = 0; i < a - 1; i++) {
                total += dayPerMonth[i];
            }
        }
        int index = (4 + total) % 7;

        return week[index];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(5, 24);
        System.out.println(result);
    }
}
