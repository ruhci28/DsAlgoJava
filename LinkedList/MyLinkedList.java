package LinkedList;

public class MyLinkedList<E> {

     Node head;

    public void add (E data){
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
    public E lastElement() {
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        return (E) temp.data;
    }
    public E delete () throws Exception {
        Node temp = head;
        if(temp == null){
            throw new Exception("Cannot remove from empty list");
        }
        if(temp.next == null){
            E toRemove = (E) head.data;
            head = null;
            return toRemove;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }

        E returnValue = (E) temp.next.data;

        temp.next = null;
        return returnValue;

    }
//    Given a ‘key’, delete the first occurrence of this key in linked list.
    public void deleteGivenKey(E data) {
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
        Node last = null;
        Node foundNode1 = null, prev1 = null;
        Node foundNode2 = null, prev2 = null;
        if (head.data == data1 || head.data == data2) {
//            System.out.println("vh");
            prev1 = null;
            E searchData;
            foundNode1 = head;
            if(head.data == data1){
                searchData = data2;
            }else {
                searchData = data1;
            }
//            temp = temp.next;
            while(temp.next.next != null ){
                if(temp.next.data == searchData){
                    prev2 = temp;
                    foundNode2 = temp.next;
                }
                temp = temp.next;
//                System.out.println("inside while");
            }
        } else{
            while(temp.next.next != null){
//                if(temp.next.data == data1){
//                    foundNode1 = temp.next;
//                    prev1 = temp;
//                }else if(temp.next.data == data2){
//                    foundNode2 = temp.next;
//                    prev2 = temp;
//                }
                if(temp.next.data == data1 || temp.next.data == data2){
                    if(foundNode1 == null){
                        foundNode1 = temp.next;
                        prev1 = temp;
                    }else{
                        foundNode2 = temp.next;
                        prev2 = temp;
                    }
                }
                temp = temp.next;
            }
        }
        if(temp.next.data == data1 || temp.next.data == data2){
            last = temp.next;
//            if(temp.next.data == data1){
//                foundNode1 = temp.next;
//                prev1 = temp;
//            }else if(temp.next.data == data2){
//                foundNode2 = temp.next;
//                prev2 = temp;
//            }
            foundNode2 = temp.next;
            prev2 = temp;
        }
        last = temp.next;
        if(foundNode1 == null || foundNode2 == null) {
//            System.out.println('r');
            return;
        }
        if(foundNode1.data == head.data && prev1 == null){
            Node temp1 = head;
            head = head.next;
            temp1.next = head.next;
            head.next =  temp1;
            return;

        }
        if(foundNode1 == prev2)
        {
            prev2.next = foundNode2.next;
            foundNode2.next = prev1.next;
            prev1.next = foundNode2;
            return;

        }

        if(foundNode1.data == head.data){
//            System.out.println('e');
            Node temp1 = foundNode1;
            prev2.next = foundNode2.next;
            foundNode2.next = head.next;
            head = foundNode2;
            temp1.next = prev2.next;
            prev2.next = foundNode1;
            return;
        }
        if(foundNode2.data == last.data){
//            System.out.println('d');
//            if(foundNode1.data == last.data){
//                prev2.next = foundNode2.next;
//                prev1.next = foundNode2;
//                foundNode2.next = null;
//                last.next = prev2.next;
//                prev2.next = last;
//            }else {
                prev1.next = foundNode1.next;
                prev2.next = foundNode1;
                foundNode1.next = null;
                last.next = prev1.next;
                prev1.next = last;

//            }
            return;
        }
        if(foundNode1 != prev2){
          prev1.next = foundNode1.next;
          prev2.next = foundNode2.next;
          foundNode2.next = prev1.next;
          prev1.next = foundNode2;
          foundNode1.next = prev2.next;
          prev2.next = foundNode1;
        }else{
            prev2.next = foundNode2.next;
            foundNode2.next = prev1.next;
            prev1.next = foundNode2;
        }
        return;
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

    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
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
//  METHOD 1
    public static boolean detectAndRemoveLoop(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head, fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while((fast != slow) && (fast != null) && (fast.next != null)){
            if(slow == fast) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow == fast) {
            slow = head;
            while(fast.next != slow.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
            return true;
        }
        return false;
    }

    public static class Node<E> {
        public E data;
        public Node next;
        public Node( E data) {
            this.data = data;
            next = null;
        }
    }
}
