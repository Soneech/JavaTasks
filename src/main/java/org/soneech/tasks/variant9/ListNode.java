package org.soneech.tasks.variant9;

public class ListNode {
    private int data;
    private ListNode previous;
    private ListNode next;

    public int getData() {
        return data;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }

    public ListNode(int data, ListNode previous) {
        this.data = data;
        this.previous = previous;
        this.next = null;
    }
}
