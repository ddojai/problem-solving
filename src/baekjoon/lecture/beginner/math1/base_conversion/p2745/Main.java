package baekjoon.lecture.beginner.math1.base_conversion.p2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        String n = split[0];
        int b = Integer.parseInt(split[1]);

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(n.length() - i - 1);
            int num;
            if ('A' <= c && c <= 'Z') {
                num = c - 'A' + 10;
            } else {
                num = c - '0';
            }
            sum += (num * Math.pow(b, i));
        }

        System.out.println(sum);
    }
}
