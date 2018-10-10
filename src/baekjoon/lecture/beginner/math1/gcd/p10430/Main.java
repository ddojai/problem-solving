package baekjoon.lecture.beginner.math1.gcd.p10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String numList[] = input.split(" ");
        int a = Integer.parseInt(numList[0]);
        int b = Integer.parseInt(numList[1]);
        int c = Integer.parseInt(numList[2]);

        System.out.println((a + b) % c);
        System.out.println((a % c + b % c) % c);
        System.out.println((a * b) % c);
        System.out.println((a % c * b % c) % c);
    }
}
