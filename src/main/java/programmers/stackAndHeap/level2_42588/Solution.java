package programmers.stackAndHeap.level2_42588;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
  public int[] solution(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    for (int height : heights) {
      stack.push(height);
    }

    int[] answer = new int[heights.length];
    int currIndex = heights.length - 1;
    while (!stack.empty()) {
      int target = stack.pop();
      int biggerIndex = 0;
      for (int i = currIndex - 1; i >= 0; i--) {
        if (heights[i] > target) {
          biggerIndex = i + 1;
          break;
        }
      }
      answer[currIndex] = biggerIndex;
      currIndex--;
    }

    return answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] heights = {6, 9, 5, 7, 4};
    int[] answer = solution.solution(heights);
    System.out.println(Arrays.toString(answer));
  }
}
