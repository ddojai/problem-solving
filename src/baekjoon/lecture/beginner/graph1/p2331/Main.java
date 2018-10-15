package baekjoon.lecture.beginner.graph1.p2331;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, 1);
        String strA = String.valueOf(a);
        while (true) {
            int sum = 0;
            for (int i = 0; i < strA.length(); i++) {
                int num = strA.charAt(i) - '0';
                sum += Math.pow(num, p);
            }
            if (map.get(sum) == null) {
                map.put(sum, 1);
            } else {
                int cnt = map.get(sum);
                if (cnt >= 2) {
                    break;
                }
                map.put(sum, cnt + 1);
            }
            strA = String.valueOf(sum);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
