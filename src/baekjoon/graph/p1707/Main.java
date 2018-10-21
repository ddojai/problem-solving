package baekjoon.graph.p1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private static void dfs(ArrayList<Integer>[] edge, int[] color, int v, int c) {
        color[v] = c;
        for (int next : edge[v]) {
            if (color[next] == 0) {
                dfs(edge, color, next, 3 - c);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] split = br.readLine().split(" ");
            int v = Integer.parseInt(split[0]);
            int e = Integer.parseInt(split[1]);

            ArrayList<Integer>[] edge = (ArrayList<Integer>[]) new ArrayList[v + 1];
            for (int i = 1; i <= v; i++) {
                edge[i] = new ArrayList<>();
            }

            for (int i = 0; i < e; i++) {
                split = br.readLine().split(" ");
                int a = Integer.parseInt(split[0]);
                int b = Integer.parseInt(split[1]);
                edge[a].add(b);
                edge[b].add(a);
            }

            int[] color = new int[v + 1];

            for (int i = 1; i <= v; i++) {
                if (color[i] == 0) {
                    dfs(edge, color, i, 1);
                }
            }

            boolean isBipartite = true;
            breakOut:
            for (int i = 1; i <= v; i++) {
                for (int next : edge[i]) {
                    if (color[i] == color[next]) {
                        isBipartite = false;
                        break breakOut;
                    }
                }
            }
            System.out.println(isBipartite ? "YES" : "NO");
        }
        br.close();
    }
}
