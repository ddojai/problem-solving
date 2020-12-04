package leetcode.easy.water_bottles;

/**
 * https://leetcode.com/problems/water-bottles/
 */
public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = 0;
        int emptyBottles = 0;
        do {
            answer += numBottles;
            emptyBottles += numBottles;
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        } while (numBottles > 0);

        return answer;
    }
}
