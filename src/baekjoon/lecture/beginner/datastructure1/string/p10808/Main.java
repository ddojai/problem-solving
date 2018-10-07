package baekjoon.lecture.beginner.datastructure1.string.p10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int[] cnt = new int[26];
        for (int i = 0; i < word.length(); i++) {
            cnt[word.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}
