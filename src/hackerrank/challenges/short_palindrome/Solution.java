package hackerrank.challenges.short_palindrome;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Medium
public class Solution {

    // Complete the shortPalindrome function below.
    static int shortPalindrome(String s) {
        long cnt = 0;
        int len = s.length();
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                for (int k = j + 1; k < len - 1; k++) {
                    for (int l = k + 1; l < len; l++) {
                        if (isPalindrome(s.charAt(i), s.charAt(j), s.charAt(k), s.charAt(l))) {
                            cnt++;
                        }
                    }
                }
            }
        }
        long modulo = 1000000007;
        return (int) (cnt % modulo);
    }

    private static boolean isPalindrome(char a, char b, char c, char d) {
        if (a == d) {
            if (b == c) {
                return true;
            }
        }
        return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = shortPalindrome(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
