package org.soneech.tasks.variant26;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    private static int CAPACITY = 10;
    private int size = 0;
    private Object[] array;

    public MyArrayList() {
        array = new Object[CAPACITY];
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(array[0]);
    }

    @Override
    public boolean contains(Object o) {
        for (Object object: array) {
            if (object == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            private int index = -1;
            @Override
            public boolean hasNext() {
                return index + 1 < array.length && array[index + 1] != null;
            }

            @Override
            public T next() {
                return (T) array[++index];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size >= CAPACITY) {
            ensureCapacity();
        }
        array[size++] = t;
        return true;
    }

    public void ensureCapacity() {
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        array = Arrays.copyOf(array, CAPACITY);
    }

    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {  // тут может косяк
            if (array[i].equals(o)) {
                flag = true;
            }

            if (flag) {
                array[i] = array[i + 1];
            }
        }
        if (flag) {
            array[--size] = null;
        }
        return flag;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index < size && index >= 0) {
            return (T) array[index];
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        Object object = null;
        if (index < size && index >= 0) {
            object = get(index);
            for(int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            array[--size] = null;
        }
        return (T) object;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stringBuilder.append(array[i]).append(" ");
            }
            else {
                stringBuilder.append(array[i]);
            }
        }
        return stringBuilder.toString();
    }
}
