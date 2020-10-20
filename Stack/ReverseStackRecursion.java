package Stack;

import java.util.Scanner;

// we use recursion in two functions in this program.

public class ReverseStackRecursion {
    static void insertAtBottom(int n,MyStack stack) throws Exception {
        if(stack.isEmpty()){
            stack.push(n);
            return;
        }else{
            int a = (int) stack.pop();
            insertAtBottom(n,stack);
            stack.push(a);
        }

    }
    static void reverseStack(MyStack stack) throws Exception {
        if (!stack.isEmpty()) {
            int n = (int) stack.pop();
            reverseStack(stack);
            insertAtBottom(n,stack);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<Integer>();
        System.out.println("Enter size of stack");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            int n = sc.nextInt();
            stack.push(n);
        }
        reverseStack(stack);
        System.out.println("Reverse stack is : ");
        stack.print();
    }
}
