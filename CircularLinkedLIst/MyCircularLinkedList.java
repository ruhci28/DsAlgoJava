package CircularLinkedLIst;

import LinkedList.MyLinkedList;

public class MyCircularLinkedList<E> {
    Node last;
    public void add(E data){
        Node toAdd = new Node(data);
        if(last == null) {
            last = toAdd;
            toAdd.next = toAdd;
        }
    }
    public void insertAtBeginning(E data){
        Node toAdd = new Node(data);
        if(last == null) {
            last = toAdd;
            toAdd.next = toAdd;
        }else {
            toAdd.next = last.next;
            last.next = toAdd;
        }
    }
    public void insertAtEnd(E data){
        Node toAdd = new Node(data);
        if(last == null) {
            last = toAdd;
            toAdd.next = toAdd;
        }else {
            toAdd.next = last.next;
            last.next = toAdd;
            last = toAdd;
        }
    }
    public void insertionBtwNode(E data,E data2){
        Node toAdd = new Node(data);

            Node temp = last.next;
            while(temp.data != data2){
                temp = temp.next;
            }
            toAdd.next = temp.next;
            temp.next = toAdd;
    }
    public void print() {
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
//        do while loop is better solution for traversing in circular linkedlist
//        if (last != null) {
//            do {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            while (temp != last);
//        }
    }
    static class Node<E> {
        E data;
        MyCircularLinkedList.Node next;
        public Node( E data) {
            this.data = data;
            next = null;
        }
    }

}
