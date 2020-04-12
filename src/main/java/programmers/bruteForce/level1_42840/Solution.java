package programmers.bruteForce.level1_42840;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] answers) {
        int countA = 0;
        int countB = 0;
        int countC = 0;

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < answers.length; i++) {
            int indexA = i % 5;
            int indexB = i % 8;
            int indexC = i % 10;
            int answer = answers[i];
            if (a[indexA] == answer) {
                countA++;
            }
            if (b[indexB] == answer) {
                countB++;
            }
            if (c[indexC] == answer) {
                countC++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (countA >= countB && countA >= countC) {
            list.add(1);
        }
        if (countB >= countA && countB >= countC) {
            list.add(2);
        }
        if (countC >= countA && countC >= countB) {
            list.add(3);
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
