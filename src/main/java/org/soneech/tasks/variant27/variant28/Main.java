package org.soneech.tasks.variant27.variant28;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfNum(12840));
        System.out.println(sumOfNum(1110));
    }

    public static int sumOfNum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumOfNum(n / 10);
    }
}
