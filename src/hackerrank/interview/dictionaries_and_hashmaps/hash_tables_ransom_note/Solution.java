package hackerrank.interview.dictionaries_and_hashmaps.hash_tables_ransom_note;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for (String key : magazine) {
            magazineMap.merge(key, 1, (a, b) -> a + b);
        }
        for (String key : note) {
            noteMap.merge(key, 1, (a, b) -> a + b);
        }

        System.out.println(magazineMap);
        System.out.println(noteMap);

        for (String key : noteMap.keySet()) {
            Integer noteCnt = noteMap.get(key);
            Integer magazineCnt = magazineMap.get(key);
            if (magazineCnt == null) {
                System.out.println("No");
                return;
            }
            if (noteCnt.compareTo(magazineCnt) > 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
