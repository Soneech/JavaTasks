package org.soneech.tasks.variant25;


import java.util.Stack;

public class StackList<E> {
    private int size;
    private Node<E> top;

    public StackList() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public E peek() {
        return top.getData();
    }

    public E pop() {
        E item = top.getData();
        top = top.getNext();
        return item;
    }

    public E push(E item) {
        Node<E> node = new Node<>(item, top);
        top = node;
        size++;
        return item;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<E> items = new Stack<>();
        Node<E> node = top;

        while(node != null) {
            items.push(node.getData());
            node = node.getNext();
        }

        while(!items.isEmpty()) {
            stringBuilder.append(items.pop()).append(" ");
        }
        return stringBuilder.toString();
    }
}

class Node<E> {
    private E data;
    private Node<E> next;
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
