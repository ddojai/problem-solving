package baekjoon.backtracking.p6603;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int LOTTO_CNT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int k = scanner.nextInt();
            if (k == 0) break;

            int[] s = new int[k];
            for (int i = 0; i < k; i++) {
                s[i] = scanner.nextInt();
            }

            List<Integer> list = new ArrayList<>(LOTTO_CNT);

            go(s, 0, list);

            System.out.println();
        }
    }

    private static void go(int[] s, int i, List<Integer> list) {
        if (list.size() == LOTTO_CNT) {
            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        } else if (s.length <= i) {
            return;
        }

        list.add(s[i]);
        go(s, i + 1, list);
        list.remove(list.size() - 1);
        go(s, i + 1, list);
    }
}
