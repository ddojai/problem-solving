package leetcode.easy.divisor_game;

/**
 * https://leetcode.com/problems/divisor-game/
 */
public class Solution {
    public boolean divisorGame(int N) {
        /*
        boolean isAlice = false;
        while (N > 1) {
            N = N - 1;
            isAlice = !isAlice;
        }

        return isAlice;
        */
        return N % 2 == 0;
    }
}
