package datastructure;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int idx = bSearch(arr, 7);

        if (idx == -1)
            System.out.println("탐색실패");
        else
            System.out.printf("타겟 저장 인덱스 : %d \n", idx);


        idx = bSearch(arr, 4);
        if (idx == -1)
            System.out.println("탐색실패");
        else
            System.out.printf("타겟 저장 인덱스 : %d \n", idx);
    }

    private static int bSearch(int[] ar, int target) {
        int first = 0;
        int last = ar.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (target == ar[mid]) {
                return mid;
            } else {
                if (target < ar[mid])
                    last = mid - 1;
                else
                    first = mid + 1;
            }
        }
        return -1;
    }
}
