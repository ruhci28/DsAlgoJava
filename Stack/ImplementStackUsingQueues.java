package Stack;

import java.util.*;

public class ImplementStackUsingQueues {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();
        static int currSize;
        public Stack(){
            currSize = 0;
        }
        static void push(int a){
            q1.add(a);
            currSize++;
        }
        static int pop(){
            if (q1.isEmpty())
                return -1;
            while(q1.size() != 1) {
                q2.add(q1.peek());
                q1.remove();
            }
            int temp = q1.peek();
            q1.remove();
            currSize--;
            Queue q = q1;
            q1 = q2;
            q2 = q;
            return temp;
        }
        static int top(){
            if (q1.isEmpty())
                return -1;
            while(q1.size() != 1) {
                q2.add(q1.peek());
                q1.remove();
            }
            int temp = q1.peek();
            q1.remove();
            q2.add(temp);
            Queue q = q1;
            q1 = q2;
            q2 = q;
            return temp;
        }
        static int size(){
            return currSize;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}
