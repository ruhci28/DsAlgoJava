package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void  mergeSort(int[] arr,int l, int high) {
        if(high > l) {
            int middle = (l+high)/2;
            mergeSort(arr,l,middle);
            mergeSort(arr,middle+1,high);
            merge(arr, l, middle, high);
        }

    }
    static void merge(int[] arr,int l, int middle, int high){
         int size1 = middle - l + 1;
         int size2 = high - middle;

         int[] L = new int[size1];
         int[] R = new int[size2];

         for(int i = 0; i < size1; i++){
             L[i] = arr[l+i];
         }
         for(int i = 0; i < size2; i++){
             R[i]  = arr[middle+1+i];
         }
         int i = 0;
         int j = 0;
         int k = l;
         while(i < size1 && j < size2) {
             if(L[i] < R[j]){
                 arr[k] = L[i];
                 i++;
             }else{
                 arr[k] = R[j];
                 j++;
             }
             k++;
         }
         while(i < size1){
             arr[k] = L[i];
             i++;
             k++;
         }
         while(j < size2){
             arr[k] = R[j];
             j++;
             k++;
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        mergeSort(arr,0,n-1);
        System.out.println("Sorted Array is : "+Arrays.toString(arr));
    }
}
//    Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity
//    can be expressed as following recurrence relation.
//        T(n) = 2T(n/2) + \Theta(n)
//    The above recurrence can be solved either using Recurrence Tree method or Master method.
//    It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
//    Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best)
//    as merge sort always divides the array into two halves and take linear time to merge two halves.

//    Auxiliary Space: O(n)
//
//        Algorithmic Paradigm: Divide and Conquer
//
//        Sorting In Place: No in a typical implementation
//
//        Stable: Yes

//    Applications of Merge Sort
//
//    Merge Sort is useful for sorting linked lists in O(nLogn) time.In the case of linked lists,
//    the case is different mainly due to the difference in memory allocation of arrays and linked lists.
//    Unlike arrays, linked list nodes may not be adjacent in memory. Unlike an array, in the linked list,
//    we can insert items in the middle in O(1) extra space and O(1) time. Therefore merge operation of merge
//    sort can be implemented without extra space for linked lists.
//        In arrays, we can do random access as elements are contiguous in memory.
//        Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i],
//        we can directly access the memory at (x + i*4). Unlike arrays, we can not do random access in the linked list.
//        Quick Sort requires a lot of this kind of access.
//        In linked list to access i’th index, we have to travel each and every node from the head to i’th node as
//        we don’t have a continuous block of memory. Therefore, the overhead increases for quicksort.
//        Merge sort accesses data sequentially and the need of random access is low.
//
//        Inversion Count Problem
//        Used in External Sorting
