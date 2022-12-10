package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Node node = new Node(10);
//        System.out.println(node.toString());
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(10);
        sll.add(20);
        sll.add(30);
        sll.add(40);
        System.out.println(sll.getLength());
        System.out.println(sll.toString());
    }
}
