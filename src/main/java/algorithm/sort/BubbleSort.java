package algorithm.sort;

/**
 * Reference : 윤성우의 열혈 자료구조 (CH.10) - 도서
 */
public class BubbleSort {
    private static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};

        bubbleSort(arr, arr.length);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
