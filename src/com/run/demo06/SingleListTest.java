package com.run.demo06;

public class SingleListTest {

    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.add(new Node(4));
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));

        System.out.println(list.size());
        list.print();
    }
}
