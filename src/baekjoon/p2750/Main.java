package baekjoon.p2750;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] list = new int[count];
        for (int i = 0; i < count; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            bw.write(list[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}