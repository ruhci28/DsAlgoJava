package DoublyLinkedList;

public class MyDLLImplementation {
    public static void main(String[] args){
        MyDoublyLinkedList<Integer> dll = new MyDoublyLinkedList<Integer>();
        dll.add(4);
        dll.add(5);
        dll.addAtFront(10);
        dll.add(34);
        dll.addAfterAGivenNode(6,5);
        dll.addBeforeAGivenNode(43,34);
        dll.print();
        dll.delete(34);
        dll.print();
    }




}
