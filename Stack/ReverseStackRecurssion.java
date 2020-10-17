package Stack;

import java.util.Scanner;

public class ReverseStackRecurssion {
    static void reverseStack(MyStack stack) throws Exception {
        int n = (int) stack.pop();
        if (!stack.isEmpty()) {
            reverseStack(stack);
        }
        stack.push(n);
        stack.print();
        return;
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
