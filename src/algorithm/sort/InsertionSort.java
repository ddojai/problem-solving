package algorithm.sort;

/**
 * Reference : 윤성우의 열혈 자료구조 (CH.10) - 도서
 */
public class InsertionSort {
    private static void insertionSort(int arr[], int n) {
        int j;
        for (int i = 1; i < n; i++) {
            int insData = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > insData) {
                    arr[j+1] = arr[j];
                }
                else
                    break;
            }
            arr[j+1] = insData;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};

        insertionSort(arr, arr.length);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
