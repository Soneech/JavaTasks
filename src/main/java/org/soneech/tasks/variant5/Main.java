package org.soneech.tasks.variant5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws EmptyException {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alyssa", 22);
        map.put("Char", 25);
        map.put("Dan", 25);
        map.put("Jeff", 20);
        map.put("Kasey", 20);
        map.put("Kim", 20);
        map.put("Morgan", 25);
        map.put("Ryan", 25);
        map.put("Stef", 22);
        Map<String, Integer> emptyMap = new HashMap<>();
        System.out.println(rarest(map));
        //System.out.println(rarest(emptyMap));
    }

    public static int rarest(Map<String, Integer> map) throws EmptyException {
        if (map.isEmpty()) {
            throw new EmptyException("Map is empty!");
        }

        Object[] values = map
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(((o1, o2) -> o1.getValue().compareTo(o2.getValue())))
                .map(Map.Entry::getKey).toArray();
        return (int) values[0];
    }
}
