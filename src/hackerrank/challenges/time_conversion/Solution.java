package hackerrank.challenges.time_conversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

// Easy
public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String arr[] = s.split(":");
        String hour = arr[0];
        String min = arr[1];
        String sec = arr[2].substring(0, 2);
        String format = arr[2].substring(2);

        if (format.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
            }
        } else {
            // PM
            if (!hour.equals("12")) {
                int hourToInt = Integer.parseInt(arr[0]) + 12;
                hour = String.valueOf(hourToInt);
            }
        }

        return hour + ":" + min + ":" + sec;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
