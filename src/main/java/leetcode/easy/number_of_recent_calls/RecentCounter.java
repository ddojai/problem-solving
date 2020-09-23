package leetcode.easy.number_of_recent_calls;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-recent-calls/
 */
class RecentCounter {
    private final Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.element() < t - 3000) {
            queue.remove();
        }

        return queue.size();
    }
}

