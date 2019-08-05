package baekjoon.bruteforce.p2231;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2231
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int result = 0;
        for (int i = 1; i < input; i++) {
            int sum = divisionSum(i);
            if (sum == input) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    private static int divisionSum(int num) {
        int sum = num;
        while (num != 0) {
            //num을 10으로 나눈 나머지를 sum에 더한다.
            sum += num % 10;
            //num을 10으로 나눈 값을 다시 num에 저장한다.
            num /= 10;
        }
        return sum;
    }
}