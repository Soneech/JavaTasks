package org.soneech.tasks.variant2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Reverser {
    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> reversedMap = new HashMap<>();

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> element = iterator.next();

            if(!reversedMap.containsKey(element.getValue())) {
                reversedMap.put(element.getValue(), element.getKey());
            }
        }

        return reversedMap;
    }
}
