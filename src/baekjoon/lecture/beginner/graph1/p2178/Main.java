package baekjoon.lecture.beginner.graph1.p2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    private static void bfs(int[][] map, boolean[][] check, int[][] dist, int x, int y, int n, int m) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            x = pair.x;
            y = pair.y;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (map[nx][ny] == 1 && !check[nx][ny]) {
                        dist[nx][ny] = dist[x][y] + 1;
                        check[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String nStr = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = nStr.charAt(j) - '0';
            }
        }

        int[][] dist = new int[n][m];
        boolean[][] check = new boolean[n][m];

        dist[0][0] = 1;
        check[0][0] = true;

        bfs(map, check, dist, 0, 0, n, m);

        System.out.println(dist[n-1][m-1]);
    }
}
