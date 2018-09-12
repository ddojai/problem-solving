package kakao.year2017.num3;

import java.util.LinkedHashMap;

/**
 * 코드 출처
 * http://javaplant.tistory.com/4?category=784551
 */
public class Solution {
    public static void main(String[] args) {
        // 50
        System.out.println(getCountTime(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        // 21
        System.out.println(getCountTime(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        // 60
        System.out.println(getCountTime(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        // 52
        System.out.println(getCountTime(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        // 16
        System.out.println(getCountTime(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        // 25
        System.out.println(getCountTime(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    private static int getCountTime(final int cacheSize, String[] cities) {
        int totalTime = 0;

        // 캐시가 없기 때문에 무조건 5초씩 걸림 length * 5 바로 리턴
        if (cacheSize == 0) return cities.length * 5;

        // 간단한 LRU MAP구현
        LinkedHashMap<String, Integer> lruMap = new LinkedHashMap<String, Integer>() {
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };

        // 계산
        for (String key : cities) {
            if (lruMap.containsKey(key.toUpperCase())) {
                totalTime += 1;
            } else {
                lruMap.put(key.toUpperCase(), 1); // 입력되는 value는 무의미
                totalTime += 5;
            }
        }

        return totalTime;
    }
}
