package datastructure.ch10;

public class SelectionSort {
    private static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2};

        selectionSort(arr, arr.length);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
