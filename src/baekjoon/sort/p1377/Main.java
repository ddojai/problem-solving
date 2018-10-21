package baekjoon.sort.p1377;

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

        List<Pair> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new Pair(Integer.parseInt(br.readLine()), i));
        }
        br.close();

        Collections.sort(list);

        int result = 0;
        for (int i = 0; i < n; i++) {
            Pair pair = list.get(i);
            int diff = pair.getIdx() - i;
            if (diff > result) {
                result = diff;
            }
        }

        System.out.println(result + 1);
    }
}

class Pair implements Comparable<Pair>{
    private int var;
    private int idx;

    Pair(int var, int idx) {
        this.var = var;
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(Pair o) {
        return var - o.var;
    }
}
