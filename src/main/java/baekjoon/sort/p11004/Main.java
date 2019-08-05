package baekjoon.sort.p11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        Collections.sort(list);

        System.out.println(list.get(k-1));
    }
}
