package LinkedList;

public class AddTwoNumRepresentedByLinkedList {

//    Input:
//    List1: 5->6->3 // represents number 365
//    List2: 8->4->2 // represents number 248
//    Output:
//    Resultant list: 3->1->6 // represents number 613
//    Explanation: 365 + 248 = 613
//    unit = 1;
//    5 * unit = 5
//    unit = unit * 10 = 10;
//    6 * unit = 60 + 5 = 65
//    unit = unit * 10 = 100;
//    3 * unit = 300 + 65 = 365
    static long findNumber(MyLinkedList.Node head){
        int unit = 1;
        long sum = 0;
        MyLinkedList.Node temp = head;
        while(temp != null){
            sum = (unit * (int) temp.data ) + sum;
            unit = unit * 10;
            temp = temp.next;
        }
        return sum;
    }
    static MyLinkedList.Node add(MyLinkedList.Node ll1, MyLinkedList.Node ll2){
        long sum1, sum2, result;
        sum1 = findNumber(ll1);
        sum2 = findNumber(ll2);
        result = sum1 + sum2;
        MyLinkedList resultLL = new MyLinkedList();
        while(result != 0 ){
            int num = (int) (result%10);
            resultLL.add(num);
            result = result/10;
        }
        return resultLL.head;
    }
    public static void main(String[] args){
        MyLinkedList<Integer> ll1 = new MyLinkedList<>();
        MyLinkedList<Integer> ll2 = new MyLinkedList<>();
        ll1.add(4);
        ll1.add(8);
        ll1.add(9);
        ll1.add(7);
        ll1.add(2);
        ll2.add(5);
        ll2.add(8);
        ll2.add(4);
        ll2.add(2);
        MyLinkedList ll3 = new MyLinkedList();
        ll3.head = add(ll1.head, ll2.head);
        ll3.print();
    }
}
