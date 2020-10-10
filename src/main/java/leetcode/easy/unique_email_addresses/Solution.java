package leetcode.easy.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String local = split[0];
            String domain = split[1];
            local = local.replace(".", "");
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            set.add(local+"@"+domain);
        }

        return set.size();
    }
}
