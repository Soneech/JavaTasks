package org.soneech.tasks.variant26;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();
        array.add(15);
        array.add(16);
        array.add(-38);
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
        array.add(1);
        array.add(-3);
        array.add(5);
        System.out.println(array);
        /*
        Integer newNumber = new Integer(36);
        array.add(newNumber);
        System.out.println(array);
        array.remove(newNumber);
        System.out.println(array);
        */
    }
}
