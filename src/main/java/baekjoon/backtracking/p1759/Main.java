package baekjoon.backtracking.p1759;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        String[] alphabet = scanner.nextLine().split(" ");
        Arrays.sort(alphabet);

        go(l, alphabet, "", 0);
    }

    private static void go(int l, String[] alphabet, String password, int idx) {
        if (password.length() == l) {
            if (check(password)) {
                System.out.println(password);
            }
            return;

        } else if (alphabet.length <= idx) {
            return;
        }

        go(l, alphabet, password + alphabet[idx], idx + 1);
        go(l, alphabet, password, idx + 1);
    }

    private static boolean check(String password) {
        // 자음
        int consonant = 0;
        // 모음
        int vowel = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        return vowel >= 1 && consonant >= 2;
    }
}
