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
    Node merge(Node left, Node right){
        Node result = null;
        if(left == null){
            return  right;
        }
        if(right == null){
            return left;
        }
        if(left.data <= right.data){
            result = left;
            result.next = merge(left.next , right);
        }else {
            result = right;
            result.next = merge(left,right.next);
        }

        return result;
    }
    Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node middle = getMiddle(head);
        Node nextMiddle = middle.next;

        middle.next = null;
        middle.prev = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextMiddle);

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
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
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
        dll.head = dll.mergeSort(dll.head);
        dll.print();
    }
}
