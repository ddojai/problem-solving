package leetcode.easy.reformat_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 * https://leetcode.com/problems/reformat-date/
 */
public class Solution {
    public String reformatDate(String date) {
        String[] split = date.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split[0].length() - 2; i++) {
            sb.append(split[0].charAt(i));
        }
        int day = Integer.parseInt(sb.toString());

        Date dateFormat = null;
        try {
            dateFormat = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(split[1]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(Objects.requireNonNull(dateFormat));
        int month = cal.get(Calendar.MONTH) + 1;
        int year = Integer.parseInt(split[2]);

        return String.format("%d-%02d-%02d", year, month, day);
    }
}
