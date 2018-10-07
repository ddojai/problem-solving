package baekjoon.lecture.beginner.datastructure1.string.p10824;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().trim().split(" ");

        long a = Long.parseLong(split[0] + split[1]);
        long b = Long.parseLong(split[2] + split[3]);

        System.out.println(a + b);
    }
}
