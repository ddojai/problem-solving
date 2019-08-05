package yoonsw.java.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // key만 담고 있는 컬랙션 인스턴스 생성
        Set<Integer> ks = map.keySet();

        // 전체 key 출력
        for (Integer n : ks)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // 전체 value 출력
        for (Integer n : ks)
            System.out.print(map.get(n).toString() + '\t');
        System.out.println();

        // 전체 value 출력 (반복자 기반)
        for (Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()).toString() + '\t');
        System.out.println();
    }
}
