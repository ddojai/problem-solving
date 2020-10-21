package leetcode.easy.distribute_candies_to_people;

/**
 * https://leetcode.com/problems/distribute-candies-to-people/
 */
public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] answer = new int[num_people];
        int candy = 1;
        int index = 0;
        do {
            if (candies > candy) {
                answer[index] += candy;
                candies -= candy;
            } else {
                answer[index] += candies;
                break;
            }
            index++;
            candy++;
            if (index == num_people) {
                index = 0;
            }
        } while (true);

        return answer;
    }
}
