package arrays;

//Initialize A = arr[0..d-1] and B = arr[d..n-1]
//        1) Do following until size of A is equal to size of B
//
//        a)  If A is shorter, divide B into Bl and Br such that Br is of same
//        length as A. Swap A and Br to change ABlBr into BrBlA. Now A
//        is at its final place, so recur on pieces of B.
//
//        b)  If A is longer, divide A into Al and Ar such that Al is of same
//        length as B Swap Al and B to change AlArB into BArAl. Now B
//        is at its final place, so recur on pieces of A.
//
//        2)  Finally when A and B are of equal size, block swap them.
//
//        n = n-d + n -d + x
//        x = n -n -n + 2d
//        x = 2d-n

import java.util.Arrays;
import java.util.Scanner;

public class BlockSwapForArrayRotation {

    /*This function swaps d elements  starting at index firstIndex with d elements starting at index secondIndex */

    public static void swap(int arr[], int fi, int si, int d){
        int temp;
        for(int i = 0; i < d; i++) {
            temp = arr[fi+i];
            arr[fi+i] = arr[si+i];
            arr[si+i] = temp;
        }
    }

    // Wrapper over the recursive function RotateRec() It left rotates arr[] by d
    static void rotateArray(int[] arr, int size, int d) {
        leftRotateRec(arr,0, d, size );
    }

    public static void leftRotateRec(int arr[], int i, int d, int n){

        if(d == 0 || d == n){
            return;
        }
        if(d == n-d) {
            swap(arr, i, n-d+i, d);
            return;
        }
        if(d < n-d){
            swap(arr,i, n -d + i,d);
            leftRotateRec(arr,i,d,n-d);
        }
        else {
            swap(arr,i, d,n-d);
            leftRotateRec(arr,n-d+i,2*d - n,d);
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
        System.out.println("Array to be rotated by:");
        int d = sc.nextInt();
        rotateArray(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }
}



