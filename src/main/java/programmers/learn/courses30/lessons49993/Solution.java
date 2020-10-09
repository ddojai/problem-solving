package programmers.learn.courses30.lessons49993;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 */
public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < skill.length(); i++) {
            list.add(skill.charAt(i));
        }
        loop: for (String skill_tree : skill_trees) {
            int idx = 0;
            for (int i = 0; i < skill_tree.length(); i++) {
                char ch = skill_tree.charAt(i);
                if (list.contains(ch)) {
                    if (list.get(idx) == ch) {
                        idx++;
                    } else {
                        continue loop;
                    }
                }
            }
            answer++;
        }

        return answer;
    }
}
