package baekjoon.io.p11721;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = input.length() / 10;
        for (int i = 0; i < count; i++) {
            int startIndex = i * 10;
            int endIndex = startIndex + 10;
            String subString = input.substring(startIndex, endIndex);
            System.out.println(subString);
        }

        int etc = input.length() % 10;
        if (etc != 0)
        {
            int startIndex = count * 10;
            String subString = input.substring(startIndex);
            System.out.println(subString);
        }
    }
}