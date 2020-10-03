package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteSorted {
    static int binarySearchR(int a[], int low, int high, int foundElement) {
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
    static int deleteElement(int a[],int arrayLength, int deleteElement){
        int pos = binarySearchR(a,0,arrayLength-1,deleteElement);
        if(pos == -1){
            return -1;
        }
        for (int i = pos; i< arrayLength-1;i++){
            a[i]=a[i+1];
        }
        return arrayLength-1;

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
        System.out.println("Enter the element to be deleted");
        int key = sc.nextInt();
        int arrayLength = arr.length;
         arrayLength = deleteElement(arr,arrayLength,key);
        for (int i = 0; i  < arrayLength; i++)
            System.out.print(arr[i] + " ");

    }
}
