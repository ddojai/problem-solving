package baekjoon.bruteforce.p11723;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int s = 0;

        while (m-- > 0) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];
            int x;
            switch (cmd) {
                case "add":
                    x = Integer.parseInt(input[1]);
                    s = s | (1 << x);
                    break;
                case "remove":
                    x = Integer.parseInt(input[1]);
                    s = s & ~ (1 << x);
                    break;
                case "check":
                    x = Integer.parseInt(input[1]);
                    int isExist = s & (1 << x);
                    if (isExist == 0) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(input[1]);
                    s = s ^ (1 << x);
                    break;
                case "all":
                    for (int i = 1; i <= 20; i++) {
                        s = s | (1 << i);
                    }
                    break;
                case "empty":
                    s = 0;
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
