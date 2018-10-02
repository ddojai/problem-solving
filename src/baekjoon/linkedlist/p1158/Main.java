package baekjoon.linkedlist.p1158;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/1158
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputList = br.readLine().split(" ");
            int n = Integer.parseInt(inputList[0]);
            int m = Integer.parseInt(inputList[1]);

            List<Integer> list = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }

            bw.write("<");

            int value;
            Iterator<Integer> iterator = list.iterator();
            while (list.size() > 1) {
                for (int i = 0; i < m - 1; i++) {
                    if (iterator.hasNext()) {
                        iterator.next();
                    } else {
                        iterator = list.iterator();
                        iterator.next();
                    }
                }

                if (iterator.hasNext()) {
                    value = iterator.next();
                } else {
                    iterator = list.iterator();
                    value = iterator.next();
                }
                bw.write(value + ", ");
                iterator.remove();
            }
            bw.write(list.get(0) + ">");

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}