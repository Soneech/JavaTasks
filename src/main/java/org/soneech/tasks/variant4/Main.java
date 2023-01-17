package org.soneech.tasks.variant4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввдетие кол-во чисел в множестве:");
        int size = scanner.nextInt();

        Set<Integer> numbers = new HashSet<>();
        if (size != 0) {
            System.out.println("Введите значения для множества:");
            for (int i = 0; i < size; i++) {
                numbers.add(scanner.nextInt());
            }
        }
        System.out.println(hasOdd(numbers));
    }

    public static boolean hasOdd(Set<Integer> numbers) {
        for (Integer number: numbers) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
