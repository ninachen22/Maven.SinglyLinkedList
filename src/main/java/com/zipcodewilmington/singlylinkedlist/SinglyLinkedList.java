package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int length = 0;

    public SinglyLinkedList() {
    }

    public void add(T data) {
        Node nodeToAdd = new Node(data, null);
        if (length == 0) {
            this.head = nodeToAdd;
        } else {
            tail.setNext(nodeToAdd);
        }
        tail = nodeToAdd;
        length++;
    }

    public void remove(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.getNext();
            length--;
        } else {
            for (int i = 0; i < length; i++) {
                if (i + 1 == index && index != length - 1) {
                    temp.next = temp.next.getNext();
                    length--;
                }
                if (i + 1 == index && index == length - 1) {
                    temp.next = null;
                    tail = temp;
                    length--;
                    break;
                }
            }
        }
    }

    public int getLength() {
        return length;
    }

    public T getValue(int index) {
        Node current = head;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                return (T) current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < length; i++) {
            sb.append(temp.data + ", ");
            temp = temp.getNext();
        }
        return sb.toString();
    }
}
