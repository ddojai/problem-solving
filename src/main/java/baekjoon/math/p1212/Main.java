package baekjoon.math.p1212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.nextLine();

        if (octal.equals("0")) {
            System.out.println(0);
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < octal.length(); i++) {
            int n = octal.charAt(i) - '0';
            StringBuilder sub = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                int remainder = n % 2;
                if (n > 0) {
                    n /= 2;
                }
                sub.insert(0, remainder);
            }
            stringBuilder.append(sub.toString());
        }

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                System.out.println(stringBuilder.substring(i));
                break;
            }
        }
    }
}
