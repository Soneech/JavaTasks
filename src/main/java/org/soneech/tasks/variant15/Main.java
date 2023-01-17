package org.soneech.tasks.variant15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер стека:");
        int size = scanner.nextInt();
        System.out.println("Введите значения для стека:");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            stack.push(scanner.nextInt());
        }

        splitStack(stack);
        System.out.println("Результат:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new PriorityQueue<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }
}
