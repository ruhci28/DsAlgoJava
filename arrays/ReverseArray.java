package arrays;

import java.util.Arrays;
import java.util.Scanner;
// Reverse array without creating a new array
//1. creating a new array and copy the value from back
//2. swap the value of array without creating a new array
//3.  use the function java.util.Collections.reverse(List list) method.
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j =0;
        int t = arr.length - 1;
        while(j<=(t-j)){
          int temp = arr[j];
           arr[j] = arr[t-j];
           arr[t-j] = temp;
           j++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
//Reverse array using java.Collection.util.reverse(list List) method
//import java.util.*;
//
//public class reversingArray {
//
//    /*function reverses the elements of the array*/
//    static void reverse(Integer a[])
//    {
//        Collections.reverse(Arrays.asList(a));
//        System.out.println(Arrays.asList(a));
//    }
//
//    public static void main(String[] args)
//    {
//        Integer [] arr = {10, 20, 30, 40, 50};
//        reverse(arr);
//    }
//}