package baekjoon.etc.p2581;

import java.io.*;

/**
 * 2581번 소수
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 프로그램을 작성하시오.
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최소값은 61이 된다.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int start = Integer.parseInt(br.readLine().trim());
            int end = Integer.parseInt(br.readLine().trim());

            int sum = 0;
            int min  = 0;
            for (int i = start; i <= end; i++) {
                if (i <= 1) continue;

                boolean isPrime = isPrime(i);
                if (isPrime) {
                    sum += i;
                    if (min == 0) {
                        min = i;
                    }
                }
            }

            if (sum == 0) {
                bw.write(String.valueOf(-1));
            } else {
                bw.write(sum + "\n");
                bw.write(String.valueOf(min));
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}