package Queue;
import java.util.*;

public class QueueUsingStackInqueueCostly {
    static class Queue{
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        public void enque(int a ){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(a);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return;
        }
        public int dequeue(){
            if (stack1.isEmpty())
            {
                System.out.println("Q is Empty");
                System.exit(0);
            }
            return stack1.pop();
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.enque(3);
        System.out.println(q.dequeue());
        q.enque(4);
        q.enque(6);
        q.enque(43);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }

}
//    Complexity Analysis:
//
//        Time Complexity:
//        Push operation: O(N).
//        In the worst case we have empty whole of stack 1 into stack 2.
//        Pop operation: O(1).
//        Same as pop operation in stack.
//        Auxiliary Space: O(N).
//        Use of stack for storing values.
