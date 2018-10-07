package baekjoon.lecture.beginner.dp.p1463;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[num + 1];

        int result = go(num, arr);

        System.out.println(result);
    }

    private static int go(int num, int arr[]) {
        if (num == 1) {
            return 0;
        } else if (arr[num] != 0) {
            return arr[num];
        }

        arr[num] = go(num - 1, arr) + 1;
        if (num % 3 == 0) {
            int temp = go(num / 3, arr) + 1;
            if (temp < arr[num]) {
                arr[num] = temp;
            }
        }
        if (num % 2 == 0) {
            int temp = go(num / 2, arr) + 1;
            if (temp < arr[num]) {
                arr[num] = temp;
            }
        }

        return arr[num];
    }
}
