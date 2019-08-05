package hackerrank.interview.warmup.repeated_string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    private static long repeatedString(String s, long n) {
        long cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                cnt++;
            }
        }

        long repeat = n / s.length();

        long ans = repeat * cnt;

        int reminder = (int) (n % s.length());
        for (int i = 0; i < reminder; i++) {
            if (s.charAt(i) == 'a') {
                ans++;
            }
        }

        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
