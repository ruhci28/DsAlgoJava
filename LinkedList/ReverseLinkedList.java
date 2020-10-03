package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        mll.add(4);
        mll.print();
        mll.reverseIterative();
        mll.print();
//        mll.reverseRecursive(mll.head);
//        mll.print();

    }
}
