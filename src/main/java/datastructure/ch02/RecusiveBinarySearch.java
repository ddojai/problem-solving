package datastructure.ch02;

public class RecusiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int idx = bSearchRecur(arr, 0, arr.length - 1, 7);

        if (idx == -1)
            System.out.println("탐색실패");
        else
            System.out.printf("타겟 저장 인덱스 : %d \n", idx);


        idx = bSearchRecur(arr, 0, arr.length - 1, 4);
        if (idx == -1)
            System.out.println("탐색실패");
        else
            System.out.printf("타겟 저장 인덱스 : %d \n", idx);
    }

    private static int bSearchRecur(int[] arr, int first, int last, int target) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return bSearchRecur(arr, first, mid - 1, target);
        } else {
            return bSearchRecur(arr, mid + 1, last, target);
        }
    }
}
