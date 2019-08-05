package baekjoon.graph.p1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int v = Integer.parseInt(split[2]);

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            Set<Integer> set = map.get(a);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(b);
            map.put(a, set);

            set = map.get(b);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(a);
            map.put(b, set);
        }

        int[] check = new int[n+1];
        dfs(map, check, v);

        System.out.println();

        check = new int[n+1];
        bfs(map, check, v);
    }

    private static void dfs(Map<Integer, Set<Integer>> map, int[] check, int a) {
        check[a] = 1;
        System.out.print(a + " ");
        Set<Integer> set = map.get(a);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int b : list) {
            if (check[b] == 0) {
                dfs(map, check, b);
            }
        }
    }

    private static void bfs(Map<Integer, Set<Integer>> map, int[] check, int start) {

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offerLast(start);
        check[start] = 1;

        while (!queue.isEmpty()) {
            Integer a = queue.pollFirst();
            System.out.print(a + " ");
            Set<Integer> set = map.get(a);
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            for (int b : list) {
                if (check[b] == 0) {
                    queue.offerLast(b);
                    check[b] = 1;
                }
            }
        }
    }
}
