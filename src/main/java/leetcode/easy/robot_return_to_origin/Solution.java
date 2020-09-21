package leetcode.easy.robot_return_to_origin;

/**
 * https://leetcode.com/problems/robot-return-to-origin/
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}
