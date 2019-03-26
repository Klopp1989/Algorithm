package com.run.demo06;

public class SingleList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        if(head == null) {
            head = node;
        } else {
            Node last = head;
            while(last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    public int size() {
        int length = 0;
        if(head != null) {
            length++;
            Node next = head;
            while(next.getNext() != null) {
                length++;
                next = next.getNext();
            }
        }
        return length;
    }

    public void print() {
        Node next = head;
        if(next != null) {
            System.out.print(next.getData() + " ");
        }
        while(next.getNext() != null) {
            next = next.getNext();
            System.out.print(next.getData() + " ");
        }
    }


}
