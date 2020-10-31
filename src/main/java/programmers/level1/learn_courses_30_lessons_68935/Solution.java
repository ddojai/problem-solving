package programmers.level1.learn_courses_30_lessons_68935;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Solution {
    public int solution(int n) {
        StringBuilder base3 = new StringBuilder();
        while (n > 0) {
            base3.insert(0, n % 3);
            n /= 3;
        }
        base3.reverse();

        return Integer.parseInt(base3.toString(), 3);
    }
}
