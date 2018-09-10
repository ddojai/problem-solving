package kakao.year2017.num1;

import java.io.*;
import java.util.stream.Stream;

/**
 * 30 min
 */
public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            String strArr1 = br.readLine();
            String strArr2 = br.readLine();

            int[] arr1 = Stream.of(strArr1.trim().split(",")).mapToInt(Integer::parseInt).toArray();
            int[] arr2 = Stream.of(strArr2.trim().split(",")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < arr1.length; i++) {
                int a = arr1[i];
                int b = arr2[i];
                int c = a | b;
                String binaryString = Integer.toBinaryString(c);
                for (int j = 0; j < binaryString.length(); j++) {
                    if (binaryString.charAt(j) == '1') {
                        bw.write("#");
                    } else {
                        bw.write(" ");
                    }
                }
                bw.write("\n");
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
5
9,20,28,18,11
30,1,21,17,28
*/

/*
6
46,33,33,22,31,50
27,56,19,14,14,10
*/