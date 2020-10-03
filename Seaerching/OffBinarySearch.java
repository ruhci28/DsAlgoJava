package Seaerching;

import java.util.Scanner;

public class OffBinarySearch {
//    if we make this function static than we do not need to create an object of OffBinarySearch
    int binarySearchR(int a[], int low, int high, int foundElement) {
        if(high >= low) {
            int mid = low + (high-low)/2;
            if(a[mid] == foundElement){
                return mid;
            }else if(a[mid] > foundElement){
                return binarySearchR(a,low,mid-1,foundElement);
            } else {
                return binarySearchR(a,mid+1,high,foundElement);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        OffBinarySearch ob = new OffBinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int arrayLength = arr.length;
        int low = 0;
        int foundIndex = ob.binarySearchR(arr,low,arrayLength-1,key) +1;
        System.out.println("Found Element at place  "+foundIndex+" in array");

    }
}
// I am not understanding the below text this is out of bound but refer to it in future with better understanding of algorithm and time and space complexity

//    Time Complexity:
//        The time complexity of Binary Search can be written as
//
//        T(n) = T(n/2) + c
//        The above recurrence can be solved either using Recurrence T ree method or Master method. It falls in case II of Master Method and solution of the recurrence is Theta(Logn).
//
//        Auxiliary Space: O(1) in case of iterative implementation. In case of recursive implementation, O(Logn) recursion call stack space.
//
