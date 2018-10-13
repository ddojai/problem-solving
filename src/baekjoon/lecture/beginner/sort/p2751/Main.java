package baekjoon.lecture.beginner.sort.p2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(scanner.nextInt());
        }
        Collections.sort(data);
        for (int i = 0; i < n; i++) {
            System.out.println(data.get(i));
        }
    }
}