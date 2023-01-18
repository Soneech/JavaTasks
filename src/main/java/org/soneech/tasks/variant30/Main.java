package org.soneech.tasks.variant30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isDegreeTwo(number));
    }

    public static boolean isDegreeTwo(int n) {
        if (n == 1)
            return true;
        if (n % 2 == 0)
            return isDegreeTwo(n / 2);
        return false;
    }
}
