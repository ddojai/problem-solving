package yoonsw.java.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComp comp = new StrComp();

        list.sort(comp);

        int idx = Collections.binarySearch(list, "Robot", comp);
        System.out.println(list.get(idx));
    }
}

class StrComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}