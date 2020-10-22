package leetcode.easy.day_of_the_week;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * https://leetcode.com/problems/day-of-the-week/
 */
public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String source = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(Objects.requireNonNull(date));

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);

        String answer = "";
        switch (dayNum) {
            case 1:
                answer = "Sunday";
                break;
            case 2:
                answer = "Monday";
                break;
            case 3:
                answer = "Tuesday";
                break;
            case 4:
                answer = "Wednesday";
                break;
            case 5:
                answer = "Thursday";
                break;
            case 6:
                answer = "Friday";
                break;
            case 7:
                answer = "Saturday";
                break;
        }

        return answer;
    }
}
