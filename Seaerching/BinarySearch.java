package Seaerching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
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
        int high = arrayLength-1;
        int median = (arrayLength % 2 == 0) ? arrayLength/2 - 1: arrayLength/2;
        boolean test = false;
        int foundIndex = 0;
        while (!test) {
            if(key > arr[median]) {
                low = median + 1;
                median = (low + (high - low)/2);
            } else if (key == arr[median]){
                test = true;
                foundIndex = median+1;
            }
            else {
                high = median-1;
                median = (low + (high - low)/2);
            }
        }
        System.out.println("Found Element at place  "+foundIndex+" in array");
    }
}
