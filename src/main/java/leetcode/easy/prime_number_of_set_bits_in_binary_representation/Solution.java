package leetcode.easy.prime_number_of_set_bits_in_binary_representation;

import java.util.*;

/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class Solution {
    public int countPrimeSetBits(int L, int R) {
        int answer = 0;
        for (int i = L; i <= R; i++) {
            String binaryString = Integer.toBinaryString(i);
            int cnt = getBitCount(binaryString);
            if (isPrime(cnt)) {
                answer++;
            }
        }

        return answer;
    }

    private int getBitCount(String binaryString) {
        int cnt = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isPrime(int n) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);

        return list.contains(n);
    }
}
