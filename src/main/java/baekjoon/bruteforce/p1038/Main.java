package baekjoon.bruteforce.p1038;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1038
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = -1;
        long result = -1;
        for (long i = 0L; i < Long.MAX_VALUE; i++) {
            boolean isDecrease = isDecrease(i);
            if (isDecrease) {
                count++;
            }
            if (count == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static boolean isDecrease(long num) {
        if (num <= 10) {
            return true;
        }

        boolean isDecrease = true;
        long prev = -1;
        while (num != 0) {
            long n = num % 10;
            if (prev == -1) {
                prev = n;
            } else {
                if (prev < n) {
                    prev = n;
                }
                else {
                    isDecrease = false;
                    break;
                }
            }
            num /= 10;
        }

        return isDecrease;
    }
}