package programmers.learn.courses30.lessons154539;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/154539
 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            // numbers에 마지막 값은 j = i + 1 이라 for문 돌지 않음 (뒷 큰수가 없음)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                }
            }
            // 1 ≤ numbers[i] ≤ 1,000,000 이기 때문에 0인 경우는 뒷 큰수가 없는 경우.
            if (answer[i] == 0) {
                // 뒷 큰수가 없는 경우 -1로 저장
                answer[i] = -1;
            }
        }
        return answer;
    }
}

//    numbers	result
//[2, 3, 3, 5]	[3, 5, 5, -1]
//    [9, 1, 5, 3, 6, 2]	[-1, 5, 6, 6, -1, -1]