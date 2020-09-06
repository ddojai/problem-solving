package leetcode.easy.defangingAnIpAddress;

/**
 * string replace 사용
 * 1108. Defanging an IP Address
 * https://leetcode.com/problems/defanging-an-ip-address
 */
public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}