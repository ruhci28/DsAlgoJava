package DoublyLinkedList;

public class Reverse {
    public static void main(String[] args){
        MyDoublyLinkedList<Integer> dll = new MyDoublyLinkedList<Integer>();
        dll.add(1);
        dll.add(3);
        dll.add(13);
        dll.add(89);
        dll.add(100);
        System.out.println("Before Reversing the doubly linked list");
        dll.print();
        dll.reverse();
        System.out.println("After Reversing the doubly linked list");
        dll.print();
    }
}
