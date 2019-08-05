package baekjoon.sort.p11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Long> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(br.readLine()));
        }

        Collections.sort(list);

        long ans = list.get(0);
        int ans_cnt = 1;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (!list.get(i - 1).equals(list.get(i))) {
                cnt = 1;
            } else {
                cnt++;
                if (cnt > ans_cnt) {
                    ans = list.get(i);
                    ans_cnt = cnt;
                }
            }
        }

        System.out.println(ans);
    }
}
