package org.soneech.tasks.variant22;

import java.util.List;

public abstract class Sorter<T extends Comparable<T>> {
    public abstract List<Comparable<T>> sort(List<Comparable<T>> unsortedList);

    public int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }
}
