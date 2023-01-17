package org.soneech.tasks.variant9;

public class LinkedIntList {
    private ListNode begin;
    private ListNode end;

    public ListNode getBegin() {
        return begin;
    }

    public ListNode getEnd() {
        return end;
    }

    public void add(int data) {
        if (begin == null) {
            begin = new ListNode(data, null);
            end = begin;
        }
        else {
            ListNode newNode = new ListNode(data, end);
            end.setNext(newNode);
            end = newNode;
        }
    }

    public void removeDuplicates() {
        ListNode nodeI = begin;
        while(nodeI != null) {
            ListNode nodeJ = nodeI.getNext();
            while (nodeJ != null) {
                if (nodeI.getData() == nodeJ.getData()) {
                    nodeJ.getPrevious().setNext(nodeJ.getNext());
                    if (nodeJ.getNext() != null) {
                        nodeJ.getNext().setPrevious(nodeJ.getPrevious());
                    }
                }
                nodeJ = nodeJ.getNext();
            }
            nodeI = nodeI.getNext();
            if (nodeI != null) {
                end = nodeI;
            }
        }

    }

    public void print() {
        ListNode node = begin;
        while(node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void printReverse() {
        ListNode node = end;
        while(node != null) {
            System.out.print(node.getData() + " ");
            node = node.getPrevious();
        }
        System.out.println();
    }
}
