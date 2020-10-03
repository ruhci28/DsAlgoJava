package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversalArrayRotation {
    static void reverseArray(int[] arr,int low, int high){
        if(low <= high){
            int temp = arr[low];
            arr[low]  = arr[high];
            arr[high] = temp;
            reverseArray(arr,low+1,high-1);
        }
        return;
    }
    static int[] rotateArray(int[] arr, int size, int d){
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, size-1);
        reverseArray(arr,0,size-1);

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int[] arr = new int[size];
        for(int i = 0; i < size;  i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position by which the array needs to be rotated");
        int d = sc.nextInt();
        int[] rotatedArray  = rotateArray(arr,size,d);
        System.out.println(Arrays.toString(rotatedArray));
    }
}
//    Time Complexity : O(n)