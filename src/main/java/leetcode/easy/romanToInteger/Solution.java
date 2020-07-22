package leetcode.easy.romanToInteger;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 'V') {
                sum += 5;
            } else if (curr == 'L') {
                sum += 50;
            } else if (curr == 'D') {
                sum += 500;
            } else if (curr == 'M') {
                sum += 1000;
            } else if (curr == 'I') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'V') {
                        sum += 4;
                        i++;
                    } else if (next == 'X') {
                        sum += 9;
                        i++;
                    }
                    else {
                        sum += 1;
                    }
                } else {
                    sum += 1;
                }
            } else if (curr == 'X') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'L') {
                        sum += 40;
                        i++;
                    } else if (next == 'C') {
                        sum += 90;
                        i++;
                    }
                    else {
                        sum += 10;
                    }
                } else {
                    sum += 10;
                }
            } else if (curr == 'C') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'D') {
                        sum += 400;
                        i++;
                    } else if (next == 'M') {
                        sum += 900;
                        i++;
                    }
                    else {
                        sum += 100;
                    }
                } else {
                    sum += 100;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.romanToInt("III");
        System.out.println(result);

        result = solution.romanToInt("IV");
        System.out.println(result);

        result = solution.romanToInt("IX");
        System.out.println(result);

        result = solution.romanToInt("LVIII");
        System.out.println(result);

        result = solution.romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
