package Queue;

import java.util.Stack;

public class QueueUsingStackDeQueueCostly {
    static class Queue {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void enque(int a) {
            stack1.push(a);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) {
                    System.out.println("Queue is Empty ");
                    System.exit(0);
                }
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.enque(1);
        q.enque(5);
        q.enque(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
//    Complexity Analysis:
//
//        Time Complexity:
//        Push operation: O(1).
//        Same as pop operation in stack.
//        Pop operation: O(N).
//        In the worst case we have empty whole of stack 1 into stack 2
//        Auxiliary Space: O(N).
//        Use of stack for storing values.

//    Asked in: Inmobi, Accolite, Adobe, Amazon, DE Shaw, Flipkart, Goldman Sachs, InfoEdge, MakeMyTrip, Microsoft, Oracle
