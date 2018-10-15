package baekjoon.lecture.beginner.graph1.p11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            split = br.readLine().split(" ");
            int u = Integer.parseInt(split[0]);
            int v = Integer.parseInt(split[1]);
            a[u].add(v);
            a[v].add(u);
        }
        boolean[] check = new boolean[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                dfs(a, check, i);
                ans += 1;
            }
        }
        System.out.println(ans);
    }

    private static void dfs(ArrayList<Integer>[] a, boolean[] check, int x) {
        check[x] = true;
        for (int y : a[x]) {
            if (!check[y]) {
                dfs(a, check, y);
            }
        }
    }
}
