package baekjoon.string.p11655;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                c = (char) (c + 13);
                if (c > 'z') {
                    c = (char) ('a' + (c - 'z' - 1));
                }
                input.setCharAt(i, c);
            } else if ('A' <= c && c <= 'Z') {
                c = (char) (c + 13);
                if (c > 'Z') {
                    c = (char) ('A' + (c - 'Z' - 1));
                }
                input.setCharAt(i, c);
            }
        }

        System.out.println(input.toString());
    }
}
