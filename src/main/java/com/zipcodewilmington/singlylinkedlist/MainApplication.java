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
        System.out.println(sll.size());
        System.out.println(sll.toString());
//        System.out.println(sll.getValue(3));
//
//        System.out.println(sll.contains(20));
//        System.out.println(sll.contains(200));
//        System.out.println(sll.find(30));
//        System.out.println(sll.copy());
//        System.out.println("remove tests");
//        sll.remove(0);
//        sll.remove(1);
//        sll.remove(2);
//        sll.remove(3);
//        sll.remove(4);
//        sll.remove(-2);
//        System.out.println(sll.toString());
        sll.sort();
        System.out.println(sll);
    }
}
