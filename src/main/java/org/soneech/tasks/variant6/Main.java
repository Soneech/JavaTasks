package org.soneech.tasks.variant6;

import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = TreeMultiset.create();
        multiset.addAll(Arrays.asList(
                "Farm", "Zoo", "Car", "Apple", "Bee", "Golf",
                "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"
        ));
        System.out.println(multiset);
    }
}
