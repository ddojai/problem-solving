package baekjoon.graph.p10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void dfs(int[] edge, boolean[] check, int x) {
        if (check[x]) {
            return;
        }
        check[x] = true;
        dfs(edge, check, edge[x]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] split = br.readLine().split(" ");

            int[] edge = new int[n + 1];
            for (int i = 0; i < n; i++) {
                edge[i + 1] = Integer.parseInt(split[i]);
            }

            boolean[] check = new boolean[n + 1];
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    dfs(edge, check, i);
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
