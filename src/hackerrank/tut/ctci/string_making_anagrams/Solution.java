package hackerrank.tut.ctci.string_making_anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        /*
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < a.length(); i++)
        {
            char cA = a.charAt(i);
            if (mapA.get(cA) == null) {
                mapA.put(cA, 1);
            } else {
                mapA.put(cA, mapA.get(cA) + 1);
            }

            char cB = b.charAt(i);
            if (mapB.get(cB) == null) {
                mapB.put(cB, 1);
            } else {
                mapB.put(cB, mapB.get(cB) + 1);
            }
        }
         */
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
