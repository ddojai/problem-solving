package baekjoon.string.p10820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int lower = 0;
            int upper = 0;
            int digit = 0;
            int space = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if ('a' <= c && c <= 'z') {
                    lower++;
                } else if ('A' <= c && c <= 'Z') {
                    upper++;
                } else if ('0' <= c && c <= '9') {
                    digit++;
                } else if (c == ' '){
                    space++;
                }
            }
            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
    }
}
