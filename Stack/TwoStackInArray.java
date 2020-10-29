package Stack;
import java.util.*;
public class TwoStackInArray {
    static  int[] arr;
    static int top1 =-2, top2 = -1;
    static void push1(int x){
        top1 = top1 + 2;
        arr[top1] = x;
        return;
    }
    static void push2(int x){
        top2 = top2 + 2;
        arr[top2] = x;
        return;
    }
    static int pop1(){
        int temp;
        if(top1 == 0){
            temp = arr[top1];
            arr[top1] = 0;
            return temp;
        }
        temp = arr[top1];
        arr[top1] = 0;
        top1 = top1 - 2;
        return temp;
    }
    static int pop2(){
        int temp;
        if(top2 == 1){
            temp = arr[top2];
            arr[top2] = 0;
            return temp;
        }
        temp = arr[top2];
        arr[top2] = 0;
        top2 = top2 - 2;
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array (must be greater or equal to 2)");
//        int size = sc.nextInt();
        arr = new int[9];
        push1(5);
        push2(4);
        push1(7);
        push1(2);
        push1(3);
//        push1(8);
        push1(97);
        push2(4);
        push2(17);
        System.out.println(Arrays.toString(arr));
        System.out.println(pop2());
        System.out.println(pop1());
    }
}
