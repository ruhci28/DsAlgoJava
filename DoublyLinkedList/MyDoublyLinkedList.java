package DoublyLinkedList;

public class MyDoublyLinkedList<E> {
    Node head;
//    Insertion
//    A node can be added in four ways
//  1) At the front of the DLL
//  2) After a given node.
//  3) At the end of the DLL
//  4) Before a given node.
     void add(E data){
        Node toAdd = new Node(data);
        if(head == null){
            head = toAdd;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = toAdd;
            toAdd.prev = temp;
        }
    }
    void addAtFront(E data){
         Node toAdd = new Node(data);

            Node temp = head;
            toAdd.next = temp;
            temp.prev = toAdd;
            head = toAdd;
    }
    void addAfterAGivenNode(E data, E data2){
         Node toAdd = new Node(data);
         Node temp = head;
        if(head == null){
            head = toAdd;
        }
        else {
            while(temp.data != data2){
                temp = temp.next;
            }
            toAdd.next = temp.next;
            temp.next = toAdd;
            toAdd.prev = temp;
        }

    }
    void addBeforeAGivenNode(E data, E data2) {
         Node toAdd = new Node(data);
         Node temp = head;
         while(temp.next.data != data2 ) {
             temp = temp.next;
         }
         toAdd.next = temp.next;
         temp.next = toAdd;
         toAdd.prev = temp;
    }
     void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static class Node<E>{
        E data;
        Node prev;
        Node next;
        public Node(E data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    
}
