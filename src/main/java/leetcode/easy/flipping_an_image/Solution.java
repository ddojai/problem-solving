package leetcode.easy.flipping_an_image;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] rows : A) {
            reverse(rows);
            invert(rows);
        }

        return A;
    }

    public static void reverse(int[] rows) {
        for (int i = 0; i < rows.length / 2; i++) {
            int temp = rows[i];
            rows[i] = rows[rows.length - i - 1];
            rows[rows.length - i - 1] = temp;
        }
    }

    public static void invert(int[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 0) {
                rows[i] = 1;
            } else {
                rows[i] = 0;
            }
        }
    }
}
