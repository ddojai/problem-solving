package programmers.learn.courses30.lessons154539;

import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/154539
 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        //모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i); //하강곡선일 때
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}

//    numbers	result
//[2, 3, 3, 5]	[3, 5, 5, -1]
//    [9, 1, 5, 3, 6, 2]	[-1, 5, 6, 6, -1, -1]