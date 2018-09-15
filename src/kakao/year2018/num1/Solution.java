package kakao.year2018.num1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] result = solution.solution(record);
        System.out.println(Arrays.toString(result));
    }

    public String[] solution(String[] record) {
        Map<String, String> userInfo = new HashMap<>();
        List<Event> eventList = new LinkedList<>();
        for (String input : record) {
            String[] split = input.split(" ");
            String event = split[0];
            String uid = split[1];
            String nickname;

            if (event.equals("Enter")) {
                nickname = split[2];
                userInfo.put(uid, nickname);
                eventList.add(new Event(uid, Event.EVENT_IN));

            } else if (event.equals("Change")) {
                nickname = split[2];
                userInfo.put(uid, nickname);
            } else {
                eventList.add(new Event(uid, Event.EVENT_OUT));
            }
        }

        List<String> resultList = new ArrayList<>();

        for (Event event : eventList) {
            String nickname = userInfo.get(event.uid);
            StringBuilder stringBuilder = new StringBuilder(nickname);
            if (event.event == Event.EVENT_IN) {
                stringBuilder.append("님이 들어왔습니다.");
            } else {
                stringBuilder.append("님이 나갔습니다.");
            }
            resultList.add(stringBuilder.toString());
        }

        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);

        return result;
    }

    class Event {
        private static final int EVENT_IN = 1;
        private static final int EVENT_OUT = 2;
        String uid;
        int event;

        Event(String uid, int event) {
            this.uid = uid;
            this.event = event;
        }
    }
}