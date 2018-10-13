package baekjoon.lecture.beginner.sort.p11651;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Position> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().trim().split(" ");
            list.add(new Position(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }
        br.close();

        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Position position : list) {
            bw.write(position.getX() + " " + position.getY() + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Position implements Comparable<Position> {
    private int x;
    private int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public int compareTo(Position o) {
        if (y == o.y) {
            return x - o.x;
        }
        return y - o.y;
    }
}