package arrays;

import java.util.Scanner;

public class SearchInSortedPivoted {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int key = sc.nextInt();
        int pivotedIndex =0;
        for(int i = 0; i < n; i++) {
            if(arr[i+1]<arr[i]){
                pivotedIndex = i+1;
                break;
            }
        }
        int index=-1;
        if((key >= arr[pivotedIndex]) && (key <= arr[n-1])) {
            index = binarySearchR(arr,pivotedIndex,n-1,key);
        }
        else{
            index = binarySearchR(arr,0,pivotedIndex-1,key);
        }
        System.out.println("Element found at index :"+index);
    }
}
