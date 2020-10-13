package CircularLinkedLIst;

public class MyCLLImplementation {
    public static void main(String[] args) {
        MyCircularLinkedList<Integer> mcll = new MyCircularLinkedList<Integer>();
        mcll.add(3);
        mcll.print();
        mcll.insertAtBeginning(5);
        mcll.insertAtEnd(6);
        mcll.insertionBtwNode(8,3);
        mcll.insertAtEnd(12);
        System.out.println(mcll.length());
        mcll.print();

    }
}
