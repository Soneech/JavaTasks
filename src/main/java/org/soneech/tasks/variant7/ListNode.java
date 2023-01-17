package org.soneech.tasks.variant7;

public class ListNode {
    private int data;
    private ListNode previous;
    private ListNode next;

    public int getData() {
        return data;
    }

    ListNode getPrevious() {
        return previous;
    }

    ListNode getNext() {
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
