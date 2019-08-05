package baekjoon.Permutation.p6603;

import java.util.*;

public class Main {
    private static final int LOTTO_CNT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int[] a = new int[n];
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();

                if (i < n - LOTTO_CNT) {
                    d[i] = 0;
                } else {
                    d[i] = 1;
                }
            }

            List<List<Integer>> ans = new ArrayList<>();
            do {
                List<Integer> list = new ArrayList<>(LOTTO_CNT);
                for (int i = 0; i < n; i++) {
                    if (d[i] == 1) {
                        list.add(a[i]);
                    }
                }
                ans.add(list);
            } while (nextPermutation(d, n));

            ans.sort((o1, o2) -> {
                int o1Size = o1.size();
                int o2Size = o2.size();
                int i = 0;
                while (i < o1Size && i < o2Size) {
                    int t1 = o1.get(i);
                    int t2 = o2.get(i);
                    if (t1 < t2) return -1;
                    else if (t1 > t2) return 1;
                    i++;
                }
                if (i == o1Size && i != o2Size) return -1;
                else if (i != o1Size && i == o2Size) return 1;
                return 0;
            });

            for (List<Integer> lotto : ans) {
                for (int num : lotto) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    private static boolean nextPermutation(int[] a, int n) {
        int i = n - 1;
        while (i > 0 && a[i - 1] >= a[i]) i -= 1;
        if (i <= 0) return false;
        int j = n - 1;
        while (a[j] <= a[i - 1]) j -= 1;
        swap(a, j, i - 1);
        j = n - 1;

        while (i < j) {
            swap(a, i, j);
            i += 1;
            j -= 1;
        }
        return true;
    }

    private static void swap(int[] a, int aIdx, int bIdx) {
        int temp = a[aIdx];
        a[aIdx] = a[bIdx];
        a[bIdx] = temp;
    }
}

