package leetcode.easy.destination_city;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/destination-city/
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(1));
        }
        for (List<String> path : paths) {
            set.remove(path.get(0));
        }
        Iterator<String> iter = set.iterator();

        return iter.next();
    }
}
