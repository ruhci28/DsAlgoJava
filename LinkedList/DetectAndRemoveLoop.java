package LinkedList;

public class DetectAndRemoveLoop {
    public static void main(String[] args){
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.head = new MyLinkedList.Node(50);
        list.head.next = new MyLinkedList.Node(20);
        list.head.next.next = new MyLinkedList.Node(15);
        list.head.next.next.next = new MyLinkedList.Node(4);
        list.head.next.next.next.next = new MyLinkedList.Node(10);

        list.head.next.next.next.next.next = list.head.next.next;
//        loop is present so print function will get caught into infinite loop
//        list.print();
        list.detectAndRemoveLoop(list.head);
        System.out.println("Linked List after removing loop : ");
        list.print();
    }
}
