package Queue;

import LinkedList.MyLinkedList.Node;

public class MyQueue<E> {
    private Node<E> head, rear;
    public void enqueue(E data){
        Node<E> toAdd = new Node(data);
        if(head == null){
            head = rear = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }
    public E dequeue(){
        Node<E> temp = head;
        head = head.next;
        if(head == null){
            rear = null;
            return null;
        }
        return temp.data;
    }

}
