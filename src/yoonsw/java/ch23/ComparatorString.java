package yoonsw.java.ch23;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("Box");
        tree.add("Rabbit");
        tree.add("Robot");

        for (String s : tree)
            System.out.print(s + '\t');
        System.out.println();
    }
}

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
