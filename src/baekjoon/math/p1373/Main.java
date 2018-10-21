package baekjoon.math.p1373;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());


        int end = stringBuilder.length();
        int start = end - 3;
        StringBuilder result = new StringBuilder();
        do {
            if (start < 0) {
                start = 0;
            }
            String sub = stringBuilder.substring(start, end);

            int sum = 0;
            for (int i = 0; i < sub.length(); i++) {
                // 오른쪽 끝 문자열 부터 체크
                int a = sub.charAt(sub.length() - i - 1) - '0';
                sum += (int) (a * Math.pow(2, i));
            }
            result.insert(0, sum);

            end = start;
            start = end - 3;
        } while (end > 0);

        System.out.println(result.toString());
    }
}
