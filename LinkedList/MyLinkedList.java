package LinkedList;

public class MyLinkedList<E> {

     Node head;

    void add (E data){
        Node toAdd = new Node(data);

        if(isEmpty()){
            head = toAdd;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    void addNodeAtFront(E data){
        Node toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        toAdd.next = head;
        head = toAdd;
    }
    void addNodeAfterGivenNode(Node givenNode, E data) {
        Node toAdd = new Node(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        toAdd.next = givenNode.next;
        givenNode.next = toAdd;
    }
//    Given a ‘key’, delete the first occurrence of this key in linked list.
    void deleteGivenKey(E data) {
        Node temp = head, prev = temp;
        if(temp != null && temp.data == data ){
            head = temp.next;
        }
        while(temp.next != null &&  temp.data != data){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;

    }
    void deleteAtGivenPosition(int position) {
        Node temp = head;
        Node prev = null;
        if(position == 1){
            head = temp.next;
            return;
        }
        for(int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        if(temp.next == null){
            prev.next = null;
        }
        prev.next = temp.next;

    }
//    This may look a simple problem, but is interesting question as it has following cases to be handled.
//1) x and y may or may not be adjacent.
//2) Either x or y may be a head node.
//3) Either x or y may be last node.
//            4) x and/or y may not be present in linked list.
//
//    How to write a clean working code that handles all of the above possibilities.


    void swapNode(E data1, E data2) {
        Node temp = head;
        Node foundNode1 = null, prev1 = null, next1 = null;
        Node foundNode2 = null, prev2 = null, next2 = null;
        if (head.data == data1 || head.data == data2) {
            prev1 = head;
            foundNode1 = head;
            next1 = foundNode1.next;
            temp = temp.next;
            while(temp != null && (temp.data != data1 || temp.data != data2) ){
                prev2 = temp;
                temp = temp.next;
            }
            if(temp == null){
                return;
            }
            foundNode2 = temp;
            next2 = temp.next;
            prev2.next = head;
            head.next = next2;
            head = foundNode2;
            head.next = next1;
            return;

        }
        while(temp != null && temp.data != data1){
            prev1 = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        foundNode1 = temp;
        next1 = temp.next;
        temp = head;
        while(temp != null && temp.data != data2){
            prev2 = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        foundNode2 = temp;
        next2 = temp.next;
        prev1.next = foundNode2;
        foundNode2.next = next1;
        prev2.next = foundNode1;
        foundNode1.next = next2;


    }
//    Iterative Method
//
//    Initialize three pointers prev as NULL, curr as head and next as NULL.
//    Iterate trough the linked list. In loop, do following.
// Before changing next of current,
// store next node
//            next = curr->next
// Now change next of current
// This is where actual reversing happens
//    curr->next = prev

// Move prev and curr one step forward
//            prev = curr
//    curr = next

//    Time Complexity: O(n)
//    Space Complexity: O(1)
    void reverseIterative(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        head = curr;
    }

// TRY IT AFTER
//     1) Divide the list in two parts - first node and
//    rest of the linked list.
//   2) Call reverse for the rest of the linked list.
//            3) Link rest to first.
//            4) Fix head pointer
//    static Node reverseRecursive(Node head) {
//        if (head == null || head.next == null)
//            return head;
//
//
//    }

    void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean isEmpty(){
        return head == null;
    }
    int sizeIterative() {
        Node temp = head;
        int size = 0;
        if(isEmpty()) return 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
//    int getCount(head)
//    1) If head is NULL, return 0.
//    2) Else return 1 + getCount(head->next)
    int sizeRecursive(Node head) {
        if(head == null){
            return 0;
        } else {
           return 1 +  sizeRecursive(head.next);
        }
    }

    static class Node<E> {
        E data;
        Node next;
        public Node( E data) {
            this.data = data;
            next = null;
        }
    }
}
