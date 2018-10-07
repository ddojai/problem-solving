package baekjoon.lecture.beginner.datastructure1.string.p10820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            int cntLower = 0;
            int cntUpper = 0;
            int cntNum = 0;
            int cntBlank = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    cntLower++;
                } else if (c >= 'A' && c <= 'Z') {
                    cntUpper++;
                } else if (c >= '0' && c <= '9') {
                    cntNum++;
                } else {
                    cntBlank++;
                }
            }
            System.out.print(cntLower + " " + cntUpper + " " + cntNum + " " + cntBlank);
            System.out.println();
        }
    }
}
