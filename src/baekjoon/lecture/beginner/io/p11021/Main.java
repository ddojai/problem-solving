package baekjoon.lecture.beginner.io.p11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        for (int i = 0; i < count; i++) {
            String[] split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            System.out.println("Case #" + (i + 1) + ": " + (a + b));
        }
    }
}
