package org.soneech.tasks.variant1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        System.out.println("Введите кол-во чисел в 1ом списке:");
        int size1 = scanner.nextInt();
        System.out.println("Числа для 1го списка:");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        System.out.println("Введите кол-во чисел в 2ом списке:");
        int size2 = scanner.nextInt();
        System.out.println("Числа для 2го списка:");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        List<Integer> newList = alternate(list1, list2);
        System.out.println(newList);
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new LinkedList<>();
        while(!list1.isEmpty() || !list2.isEmpty()) {
            if (!list1.isEmpty())
                list.add(list1.remove(0));
            if (!list2.isEmpty())
                list.add(list2.remove(0));
        }
        return list;
    }
}
