package LinkedList;

public class MergeTwoSortedLinkedList {

    public static MyLinkedList.Node merge(MyLinkedList.Node head1, MyLinkedList.Node head2) {
        MyLinkedList.Node temp = new MyLinkedList.Node(0);

        MyLinkedList.Node tail = temp;

        while(true){

            if(head1 == null) {
                tail.next = head2;
                break;
            }
            if(head2 == null) {
                tail.next = head1;
                break;
            }
            int a = (int) head1.data;
            int b = (int) head2.data;

            if(a <= b) {
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }
        return temp.next;

    }


    public static void main(String[] args){
        MyLinkedList<Integer> llA = new MyLinkedList();
        MyLinkedList<Integer> llB  = new MyLinkedList();
        llA.add(1);
        llA.add(3);
        llA.add(9);
        llA.add(12);
        llB.add(2);
        llB.add(8);
        llB.add(16);
        llB.add(100);
        System.out.println("Before Merging: ");
        llA.print();
        llB.print();
        llA.head = merge(llA.head, llB.head);
        System.out.println("After merging : ");
        llA.print();
    }
}


