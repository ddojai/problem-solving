package hackerrank.tut.ctci.linked_lists_detect_a_cycle;

public class Solution {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        boolean hasCycle = false;
        int[] list = new int[101];
        list[head.data] = 1;
        Node node = head.next;
        while (node != null) {
            if (list[node.data] == 1) {
                hasCycle = true;
                break;
            } else {
                list[node.data] = 1;
            }
            node = node.next;
        }

        return hasCycle;
    }
}
