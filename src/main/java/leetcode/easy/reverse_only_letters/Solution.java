package leetcode.easy.reverse_only_letters;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int rareIdx = S.length() - 1;
        for (int foreIdx = 0; foreIdx < rareIdx; foreIdx++) {
            if (Character.isLetter(arr[foreIdx])) {
                while (foreIdx < rareIdx) {
                    if (Character.isLetter(arr[rareIdx])) {
                        char temp = arr[foreIdx];
                        arr[foreIdx] = arr[rareIdx];
                        arr[rareIdx] = temp;
                        rareIdx--;
                        break;
                    }
                    rareIdx--;
                }
            }
        }

        return String.valueOf(arr);
    }
}
