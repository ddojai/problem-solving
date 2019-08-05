package yoonsw.java.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        for (String s : list)
            System.out.print(s + '\t');
        System.out.println();

        Collections.sort(list);

        for (String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}
