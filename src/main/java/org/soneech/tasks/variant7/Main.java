package org.soneech.tasks.variant7;

public class Main {
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        int[] numbers1 = new int[] {1, 3, 5, 7};
        int[] numbers2 = new int[] {1, 2, 3, 4, 5};
        for(int n: numbers1)
            list1.add(n);
        for(int n: numbers2)
            list2.add(n);
    }
}
