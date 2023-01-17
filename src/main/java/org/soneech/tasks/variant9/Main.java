package org.soneech.tasks.variant9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов списка:");
        int size = scanner.nextInt();

        System.out.println("Введите элементы списка:");
        LinkedIntList list = new LinkedIntList();

        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        list.removeDuplicates();
        System.out.println("Результат:");
        list.print();
        System.out.println("Reverse:");
        list.printReverse();
    }
}
