package LinkedList;

public class SwapNodes {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList();
        mll.add(10);
        mll.add(15);
        mll.add(12);
        mll.add(13);
        mll.add(20);
        mll.add(14);
        mll.print();
        mll.swapNode(10,20);
        mll.print();
    }
}

