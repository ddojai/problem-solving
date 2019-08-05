package codility.Sorting.MaxProductOfThree;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int posIdx1 = -1, posIdx2 = -1, posIdx3 = -1, negIdx1 = -1, negIdx2 = -1;
        int posMinIdx1 = -1, posMinIdx2 = -1;
        int negMaxIdx1 = -1, negMaxIdx2 = -1, negMaxIdx3 = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                if (posMinIdx1 == -1) {
                    posMinIdx1 = i;
                } else {
                    if (posMinIdx2 == -1) {
                        posMinIdx2 = i;
                    } else {
                        if (A[posMinIdx2] > A[i]) {
                            posMinIdx2 = i;
                        }
                    }

                    if (A[posMinIdx1] > A[posMinIdx2]) {
                        int temp = posMinIdx1;
                        posMinIdx1 = posMinIdx2;
                        posMinIdx2 = temp;
                    }
                }

                if (posIdx1 == -1) {
                    posIdx1 = i;
                } else if (posIdx2 == -1) {
                    posIdx2 = i;
                    if (A[posIdx1] < A[posIdx2]) {
                        int temp = posIdx1;
                        posIdx1 = posIdx2;
                        posIdx2 = temp;
                    }
                } else {
                    if (posIdx3 == -1) {
                        posIdx3 = i;
                    } else {
                        if (A[posIdx3] < A[i]) {
                            posIdx3 = i;
                        }
                    }

                    if (A[posIdx1] < A[posIdx3]) {
                        int temp = posIdx1;
                        posIdx1 = posIdx3;
                        posIdx3 = posIdx2;
                        posIdx2 = temp;
                    } else if (A[posIdx2] < A[posIdx3]) {
                        int temp = posIdx2;
                        posIdx2 = posIdx3;
                        posIdx3 = temp;
                    }
                }
            } else if (A[i] < 0) {
                if (negIdx1 == -1) {
                    negIdx1 = i;
                } else {
                    if (negIdx2 == -1) {
                        negIdx2 = i;
                    } else {
                        if (A[negIdx2] > A[i]) {
                            negIdx2 = i;
                        }
                    }

                    if (A[negIdx1] > A[negIdx2]) {
                        int temp = negIdx1;
                        negIdx1 = negIdx2;
                        negIdx2 = temp;
                    }
                }

                if (negMaxIdx1 == -1) {
                    negMaxIdx1 = i;
                } else if (negMaxIdx2 == -1) {
                    negMaxIdx2 = i;
                    if (A[negMaxIdx1] < A[negMaxIdx2]) {
                        int temp = negMaxIdx1;
                        negMaxIdx1 = negMaxIdx2;
                        negMaxIdx2 = temp;
                    }
                } else {
                    if (negMaxIdx3 == -1) {
                        negMaxIdx3 = i;
                    } else {
                        if (A[negMaxIdx3] < A[i]) {
                            negMaxIdx3 = i;
                        }
                    }

                    if (A[negMaxIdx1] < A[negMaxIdx3]) {
                        int temp = negMaxIdx1;
                        negMaxIdx1 = negMaxIdx3;
                        negMaxIdx3 = negMaxIdx2;
                        negMaxIdx2 = temp;
                    } else if (A[negMaxIdx2] < A[negMaxIdx3]) {
                        int temp = negMaxIdx2;
                        negMaxIdx2 = negMaxIdx3;
                        negMaxIdx3 = temp;
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;
        if (posIdx3 != -1)
        {
            // 양수 3개 이상일 경우
            int resultA = A[posIdx1] * A[posIdx2] * A[posIdx3];
            if (result < resultA) {
                result = resultA;
            }
        }
        if (posIdx1 != -1 && negIdx2 != -1)
        {
            // 양수1개 음수 2이상일 경우
            int resultB = A[posIdx1] * A[negIdx1] * A[negIdx2];
            if (result < resultB) {
                result = resultB;
            }
        }
        if (negMaxIdx1 != -1 && posMinIdx2 != -1)
        {
            // 양수2 음수1개 이상일 경우
            // 음수중 제일 큰 값 1개
            // 양수 제일 작은값 2개
            int resultC = A[negMaxIdx1] * A[posMinIdx1] * A[posMinIdx2];
            if (result < resultC) {
                result = resultC;
            }
        }

        if (negMaxIdx3 != -1) {
            // 모두 음수일 경우 고려 x
            // 음수중 제일 큰 값 3개
            int resultD = A[negMaxIdx1] * A[negMaxIdx2] * A[negMaxIdx3];
            if (result < resultD) {
                result = resultD;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        int[] list = {-3, 1, 2, -2, 5, 6};
        Solution solution = new Solution();
        int result = solution.solution(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
