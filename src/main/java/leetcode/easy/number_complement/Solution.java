package leetcode.easy.number_complement;

/**
 * https://leetcode.com/problems/number-complement/
 */
public class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char c: binaryString.toCharArray()){
            if(c == '1'){
                sb.append("0");
            }
            else{
                sb.append("1");
            }
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
