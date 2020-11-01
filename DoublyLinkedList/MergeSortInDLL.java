package DoublyLinkedList;

import LinkedList.MergeSortInLinkedList;

public class MergeSortInDLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    void add(int data){
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
    Node merge(Node left, Node right) {
        if(left == null){
            return  right;
        }
        if(right == null){
            return left;
        }
        if(left.data <= right.data){
            left.next =  merge(left.next , right);
            left.next.prev = left;
            left.prev = null;
            return left;

        }else {
            right.next = merge(left,right.next);
            right.next.prev = right;
            right.prev = null;
            return right;

        }

    }
    Node sort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;
//        middle.prev = null;
        Node left = sort(head);
        Node right = sort(nextOfMiddle);

        Node sortedList = merge(left,right);
        return  sortedList;
    }
    Node getMiddle(Node head){
        Node fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    void print(){
        Node temp = head;
        Node prevtemp = temp.prev;
        while(temp != null){
            System.out.print(temp.data+" ");
            prevtemp = temp;
            temp = temp.next;

        }
        System.out.println();
        System.out.println("\nBackward Traversal using prev pointer");
        while (prevtemp != null) {
            System.out.print(prevtemp.data + " ");
            prevtemp = prevtemp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSortInDLL dll = new MergeSortInDLL();
        dll.add(100);
        dll.add(45);
        dll.add(54);
        dll.add(4);
        dll.add(1);
        dll.add(11);
        dll.add(10);
        dll.print();
        dll.head = dll.sort(dll.head);
        System.out.println("After Sorting");
        dll.print();
    }
}
