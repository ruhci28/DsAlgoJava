package Seaerching;

import java.util.Scanner;

public class TernarySearchIteration {
    static int findElement(int[] arr, int low, int high,int x) {
        while(low <= high) {
            int mid1 = low + (high - low)/3;
            int mid2 = high - (high - low)/3;

            if(arr[mid1] == x){
                return mid1;
            }
            if(arr[mid2] == x){
                return mid2;
            }
            if(x < arr[mid1]){
                high = mid1-1;
            } else if(x > arr[mid1] && x < arr[mid2]) {
                low = mid1 + 1;
                high = mid2 -1;
            } else if (x > arr[mid2]) {
                low = mid2 +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the element :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int x = sc.nextInt();
        int foundIndex = findElement(arr,0,size-1,x);
        System.out.println("Element found at index : "+ foundIndex);
    }
}

//    Time Complexity:  O(\log _{3} n), where n is the size of the array.
//     Uses: In finding the maximum or minimum of a unimodal function.