package leetcode.easy.baseball_game;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    list.remove(list.size() - 1);
                    break;
                case "D":
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                case "+":
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                default:
                    list.add(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return sum;
    }
}
