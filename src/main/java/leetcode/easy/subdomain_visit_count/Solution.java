package leetcode.easy.subdomain_visit_count;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] str = domain.split(" ");
            int visit = Integer.parseInt(str[0]);
            String subdomain = str[1];
            map.merge(subdomain, visit, Integer::sum);
            do {
                int idx = subdomain.indexOf(".");
                subdomain = subdomain.substring(idx + 1);
                map.merge(subdomain, visit, Integer::sum);
            } while (subdomain.indexOf(".") > 0);
        }

        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }

        return list;
    }
}
