package Stack;

import java.util.Scanner;
import java.util.*;

public class SortStackRecursion {
    static void placeCorrect(Stack stack, int a ){
        if(stack.isEmpty()){
            stack.push(a);
            return;
        }
        else {
            int b = (int) stack.peek();
            if(a < b){
                stack.pop();
                placeCorrect(stack,a);
                stack.push(b);
            }else{
                stack.push(a);
            }
        }
    }
    static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int a = stack.pop();
            sort(stack);
            placeCorrect(stack,a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter size of stack");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            int n = sc.nextInt();
            stack.push(n);
        }
        System.out.println("Stack before sorting: "+stack);
        sort(stack);
        System.out.println("Stack after sorting : "+stack);

    }
}
//    Complexity Analysis:
//
//        Time Complexity: O(n2).
//        In the worst case for every sortstack(), sortedinsert() is called for ‘N’ times recursively for putting element to the right place
//        Auxiliary Space: O(N)
//        Use of stack data structure for storing values