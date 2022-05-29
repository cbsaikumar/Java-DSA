package com.company.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(5);
        ll.insertFirst(10);
        ll.insertLast(3);
        ll.insertFirst(19);
        ll.insertFirst(2);
        ll.insertLast(6);
        // 2 19 10 5 3 6
        ll.display();
        ll.insertAt(8, 3);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
