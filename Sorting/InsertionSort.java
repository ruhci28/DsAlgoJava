package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr, int size){
        for(int i = 1; i < size; i ++ ) {
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    for(int k = i; k > j; k-- ) {
                        arr[k] = arr[k-1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,size);
        System.out.println("Sorted array is as follow : " + Arrays.toString(arr));
    }
}

//    Time Complexity: O(n*2)
//Auxiliary Space: O(1)
//Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
//
//        Algorithmic Paradigm: Incremental Approach
//
//        Sorting In Place: Yes
//
//        Stable: Yes
//
//        Online: Yes
//
//        Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.

//    How to implement Insertion Sort for Linked List?
//        Below is simple insertion sort algorithm for linked list.
//
//        1) Create an empty sorted (or result) list
//        2) Traverse the given list, do following for every node.
//        ......a) Insert current node in sorted way in sorted or result list.
//        3) Change head of given linked list to head of sorted (or result) list.