package baekjoon.lecture.beginner.datastructure1.string.p11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            list.add(sb.substring(i));
        }

        Collections.sort(list);

        for (String str : list) {
            System.out.println(str);
        }
    }
}
