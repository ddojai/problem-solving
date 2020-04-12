package programmers.hash.level1_42576;

import java.util.HashMap;

public class Solution {
  /* my answer
  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String name : participant) {
      if (map.containsKey(name)) {
        int cnt = map.get(name) + 1;
        map.put(name, cnt);
      } else {
        map.put(name, 1);
      }
    }

    for (String name : completion) {
      int cnt = map.get(name) - 1;
      if (cnt < 1) {
        map.remove(name);
      } else {
        map.put(name, cnt);
      }
    }

    String answer = "";
    Set<String> set = map.keySet();
    for (String s : set) {
      answer = s;
    }
    return answer;
  }
  */

  // other answer
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
    for (String player : completion) hm.put(player, hm.get(player) - 1);

    for (String key : hm.keySet()) {
      if (hm.get(key) != 0) {
        answer = key;
      }
    }
    return answer;
  }
}
