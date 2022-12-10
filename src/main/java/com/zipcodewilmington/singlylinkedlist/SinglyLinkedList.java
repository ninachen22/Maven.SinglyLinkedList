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
        if (index > length -1 || index < 0) { // || index < 0
            System.out.println("Index does not exist.");
        }
        if (index == 0) {
            head = head.getNext();
            length--;
        } else {
            for (int i = 0; i < length; i++) {
                if (i == index - 1 && index == length - 1) { //(i == index -1) v. (i+1 ==index)
                    temp.next = temp.next.getNext();
                    length--;
                }
                temp = temp.next;
//                if (i + 1 == index && index == length - 1) {
//                    temp.next = null;
//                    tail = temp;
//                    break;
//                }
            }
        }
    }


    public boolean contains(T data) {
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int find(T data) {
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int size() {
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

    public SinglyLinkedList copy() {
        Node temp = head;
        SinglyLinkedList newSll = new SinglyLinkedList();
        for (int i = 0; i < length; i++) {
            newSll.add(temp.data);
            temp = temp.next;
        }
        return newSll;
    }
//    public SinglyLinkedList sort() {
//
//    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < length; i++) {
            if (temp.next == null) {
                sb.append(temp.data);
            } else {
                sb.append(temp.data + ", ");
                temp = temp.getNext();
            }
        }
        return sb.toString();
    }
}
