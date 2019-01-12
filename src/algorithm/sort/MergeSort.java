package algorithm.sort;

import java.io.*;

/**
 * Reference : 윤성우의 열혈 자료구조 (CH.10) - 도서
 */
public class MergeSort {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = {3, 2, 4, 1, 7, 6, 5};
        mergeSort(list, 0, list.length - 1);

        for (int n : list) {
            bw.write(n + " ");
        }
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            mergeTwoArea(arr, left, mid, right);
        }
    }

    private static void mergeTwoArea(int[] arr, int left, int mid, int right) {
        int fIdx = left;
        int rIdx = mid + 1;

        int[] sortArr = new int[right + 1];
        int sIdx = left;

        while (fIdx <= mid && rIdx <= right) {
            if (arr[fIdx] <= arr[rIdx]) {
                sortArr[sIdx] = arr[fIdx++];
            } else {
                sortArr[sIdx] = arr[rIdx++];
            }
            sIdx++;
        }

        if (fIdx > mid) {
            for (int i = rIdx; i <= right; i++, sIdx++)
                sortArr[sIdx] = arr[i];
        } else {
            for (int i = fIdx; i <= mid; i++, sIdx++)
                sortArr[sIdx] = arr[i];
        }

        if (right + 1 - left >= 0) System.arraycopy(sortArr, left, arr, left, right + 1 - left);
    }
}
