package org.soneech.tasks.variant22;

import java.util.Collections;
import java.util.List;

public class BubbleSorter<T extends Comparable<T>> extends Sorter<T> {
    @Override
    public List<Comparable<T>> sort(List<Comparable<T>> unsortedList) {
        for(int i = 1; i < unsortedList.size(); i++) {
            for(int j = 0; j < unsortedList.size() - i; j++) {
                if(compare((T) unsortedList.get(j), (T) unsortedList.get(j + 1)) > 0) {
                    Collections.swap(unsortedList, j, j + 1);
                }
            }
        }
        return unsortedList;
    }
}
