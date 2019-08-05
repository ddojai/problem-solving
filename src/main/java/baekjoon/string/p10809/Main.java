package baekjoon.string.p10809;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for (char c = 'a'; c <= 'z'; c++)
        {
            int index = input.indexOf(String.valueOf(c));
            bw.write(index + " ");
        }

        bw.flush();
        bw.close();
    }
}