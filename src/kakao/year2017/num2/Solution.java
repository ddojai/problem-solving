package kakao.year2017.num2;

/**
 * 코드 출처
 * http://javaplant.tistory.com/4?category=784551
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPoint("1S2D*3T"));    // 37
        System.out.println(getPoint("1D2S#10S"));   // 9
        System.out.println(getPoint("1D2S0T"));     // 3
        System.out.println(getPoint("1S*2T*3S"));   // 23
        System.out.println(getPoint("1D#2S*3S"));   // 5
        System.out.println(getPoint("1T2D3D#"));    // -4
        System.out.println(getPoint("1D2S3T*"));    // 59
    }

    private static int getPoint(String input) {
        int[] arr = new int[3];
        String tempNum = "";
        int idx = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                tempNum += c;
            } else {
                if (!"".equals(tempNum)) {
                    arr[idx++] = Integer.parseInt(tempNum);
                    tempNum = "";
                }

                switch (c) {
                    case 'S':
                        arr[idx - 1] = (int) Math.pow(arr[idx - 1], 1);
                        break;
                    case 'D':
                        arr[idx - 1] = (int) Math.pow(arr[idx - 1], 2);
                        break;
                    case 'T':
                        arr[idx - 1] = (int) Math.pow(arr[idx - 1], 3);
                        break;
                    case '*':
                        if (idx - 2 >= 0) {
                            arr[idx - 2] *= 2;
                        }
                        arr[idx - 1] *= 2;
                        break;
                    case '#':
                        arr[idx - 1] *= -1;
                        break;
                }
            }
        }
        return arr[0] + arr[1] + arr[2];
    }
}
