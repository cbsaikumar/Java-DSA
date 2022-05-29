package com.company.linkedlist;

public class LL {
    private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val, head);
        if(this.head == null){
            this.tail = node;
        }
        this.head = node;
        size++;
    }

    public void insertLast(int val){
        if(size == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val, null);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        this.tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean insertAt(int val, int index) {
        if(index > size) return false;

        if(index == 0){
            insertFirst(val);
            return true;
        }
        if(index == size - 1){
            insertLast(val);
            return true;
        }
        Node temp = get(index);
        Node node = new Node(val, temp.next);
        temp.next = node;

        return true;
    }

    public Node get(int index) {
        Node temp = head;

        for(int i =0; i<index-1; i++){
            temp = temp.next;
        }

        return temp;
    }

    public boolean deleteFirst(){
        if(head == null) {
            System.out.println("Empty list");
            return false;
        }
        head = head.next;
        size--;
        return true;
    }

    public boolean deleteLast(){
        if(head == null) {
            System.out.println("Empty list");
            return false;
        }
        Node temp = get(size - 1);
        temp.next = null;
        size--;
        return true;
    }

    public boolean deleteAt(int index) {
        if(head == null) {
            System.out.println("Empty list");
            return false;
        }
        Node temp = get(index);
        temp.next = temp.next.next;
        size--;
        return true;
    }
}
