package Seaerching;

import java.util.Scanner;

public class InterpolationRecurssion {
    static int InterpolationSearch(int[] arr,int low, int high,int x) {
        if ( low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) {
                    return low;
                } else {
                    return -1;
                }
            }
            int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));
            if (arr[pos] == x) {
                return pos;
            } else if (arr[pos] > x) {
                InterpolationSearch(arr, low, pos - 1, x);
            } else if (arr[pos] < x) {
                InterpolationSearch(arr, pos + 1, high, x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the arrays");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int indexFound = InterpolationSearch(arr, 0, n-1,x);
        System.out.println(indexFound);


    }
}
