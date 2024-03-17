package linkedlist;

import java.util.LinkedList;

public class Practice {
}

class LinkList {
    Node head;

    class Node {
        int data; // Changed from String to int
        Node next;

        Node(int data) { // Changed parameter type from String to int
            this.data = data;
            this.next = null;
        }
    }

    //add first
    public void addFirst(int data) { // Changed parameter type from String to int
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(int data) { // Changed parameter type from String to int
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.print();
        list.addFirst(1); // Changed parameter from String to int
        list.addFirst(2); // Changed parameter from String to int
        list.addFirst(3); // Changed parameter from String to int
        list.print();
    }
}
