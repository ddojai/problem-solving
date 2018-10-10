package baekjoon.lecture.beginner.math1.base_conversion.p11005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        do {
            int remain = n % b;
            if (remain < 10) {
                sb.insert(0, remain);
            } else {
                sb.insert(0, (char)('A' + remain - 10));
            }

        } while ((n = n / b) > 0);

        System.out.println(sb.toString());
    }
}
