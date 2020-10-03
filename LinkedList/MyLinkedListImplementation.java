package LinkedList;

public class MyLinkedListImplementation {
    public static void main(String[] args){
        MyLinkedList<Integer> mll = new MyLinkedList();
        mll.add(2);
        mll.add(19);
        mll.add(28);
        mll.print();
        mll.addNodeAtFront(6);
        mll.print();
        mll.addNodeAfterGivenNode(mll.head.next, 3);
        mll.print();
        mll.deleteGivenKey(19);
        mll.print();
        mll.deleteAtGivenPosition(3);
        mll.print();
        mll.deleteAtGivenPosition(3);
        mll.print();
        mll.deleteAtGivenPosition(1);
        mll.print();
        System.out.println(mll.sizeIterative());
        System.out.println(mll.sizeRecursive(mll.head));
    }


}
