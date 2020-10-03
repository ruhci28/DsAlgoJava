package LinkedList;

public class MergeSortInLinkedList {
    node head = null;
    static class node{
        int val;
        node next;

        public node(int val){
            this.val = val;
            next = null;
        }
    }
    node sortedMerge(node a , node b){
        node result = null;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }

        if(a.val <= b.val){
            result = a ;
            result.next = sortedMerge(a.next,b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    node mergeSort(node head){
        if(head == null || head.next == null){
            return head;
        }

        node middle = getMiddle(head);
        node nextMiddle = middle.next;

        middle.next = null;
        node left = mergeSort(head);
        node right = mergeSort(nextMiddle);

        node sortedList = sortedMerge(left,right);
        return  sortedList;
    }
    node getMiddle(node head){
        if(head == null){
            return head;
        }
        node fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    void push(int new_data)
    {
        node new_node = new node(new_data);

        new_node.next = head;

        head = new_node;
    }


    void printList(node headref)
    {
        while (headref != null) {
            System.out.print(headref.val + " ");
            headref = headref.next;
        }
    }


    public static void main(String[] args) {
      MergeSortInLinkedList li = new MergeSortInLinkedList();
        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);
        li.head = li.mergeSort(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.printList(li.head);
    }
}
