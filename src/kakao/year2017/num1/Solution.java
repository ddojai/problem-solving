package kakao.year2017.num1;

/**
 * 코드 출처
 * http://javaplant.tistory.com/4?category=784551
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[]{9, 20, 28, 18, 11};
        arr2 = new int[]{30, 1, 21, 17, 28};
        printArr(decodeScreetMap(5, arr1, arr2));

        arr1 = new int[]{46, 33, 33, 22, 31, 50};
        arr2 = new int[]{27, 56, 19, 14, 14, 10};
        printArr(decodeScreetMap(6, arr1, arr2));
    }

    private static String[] decodeScreetMap(int n, int[] arr1, int[] arr2) {
        String[] retArr = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(arr1[i]|arr2[i]));
            if (binaryString.length() < n) {
                for (int j = 0; j < n - binaryString.length(); j++) {
                    binaryString.append(0);
                }
            }
            retArr[i] = binaryString.toString().replace("0", " ").replace("1", "#");
        }
        return retArr;
    }

    private static void printArr(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String str: arr) {
            sb.append(", \"").append(str).append("\"");
        }
        System.out.println(sb.toString().replaceFirst(", ", ""));
    }
}