package leetcode.easy.design_hashset;

/**
 * https://leetcode.com/problems/design-hashset/
 */
public class MyHashSet {
    int[] arr;
    /** Initialize your data structure here. */
    public MyHashSet() {
        arr = new int[1000001];
    }

    public void add(int key) {
        arr[key] = 1;
    }

    public void remove(int key) {
        arr[key] = 0;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key] == 1;
    }
}
