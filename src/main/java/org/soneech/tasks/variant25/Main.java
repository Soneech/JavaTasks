package org.soneech.tasks.variant25;

public class Main {
    public static void main(String[] args) {
        StackList<Integer> stack = new StackList<>();
        stack.push(5);
        stack.push(4);
        stack.push(18);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(34);
        stack.push(15);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
