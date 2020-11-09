package leetcode.easy.employee_importance;

import java.util.*;

/**
 * Can't solve
 * https://leetcode.com/problems/employee-importance/discuss/925406/JAVA-Easy-understand-solution-beat-100
 */
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Employee[] memo = new Employee[2001];
        for (Employee e : employees) {
            memo[e.id] = e;
        }

        return dfs(memo, id);
    }

    private int dfs(Employee[] memo, int id) {
        int ans = 0;

        Employee e = memo[id];
        ans += e.importance;

        for (int subId : e.subordinates) {
            ans += dfs(memo, subId);
        }

        return ans;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}