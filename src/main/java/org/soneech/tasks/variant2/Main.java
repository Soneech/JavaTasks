package org.soneech.tasks.variant2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int size;

        System.out.println("Введите кол-во элементов в map:");
        size = scanner.nextInt();
        System.out.println("Введите значения для map:");
        for (int i = 0; i < size; i++) {
            map.put(scanner.nextInt(), scanner.nextLine());
        }

        Map<String, Integer> reversedMap = Reverser.reverse(map);
        Iterator<Map.Entry<String, Integer>> iterator = reversedMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}
