package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            for(int j = i; j < size; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,size);
    }
}
//    Time Complexity: O(n2) as there are two nested loops.
//
//        Auxiliary Space: O(1)
//        The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.