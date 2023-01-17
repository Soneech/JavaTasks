package org.soneech.tasks.variant14;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стеков:");
        int size = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        System.out.println("Заполните 1-ый стек:");

        for (int i = 0; i < size; i++) {
            stack1.push(scanner.nextInt());
        }
        System.out.println("Заполните 2-ый стек:");
        for (int i = 0; i < size; i++) {
            stack2.push(scanner.nextInt());
        }

        System.out.println(equals(stack1, stack2));
        System.out.println("Стеки после проверки:");
        System.out.println(stack1);
        System.out.println(stack2);
    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        boolean result = true;
        Stack<Integer> temp = new Stack<>();
        while (!stack1.isEmpty()) {
            if (stack1.peek().equals(stack2.peek())) {
                temp.push(stack1.pop());
                stack2.pop();
            }
            else {
                result = false;
                break;
            }
        }

        while (!temp.isEmpty()) {
            int number = temp.pop();
            stack1.push(number);
            stack2.push(number);
        }
        return result;
    }
}
