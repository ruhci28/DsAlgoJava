package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the new element");
        int newElement = sc.nextInt();
        int prevArrayLength = arr.length;
        int newarr[] = new int[prevArrayLength+1];
        boolean test = false;
        int i = 0;
        while (!test) {
            if(newElement <= arr[i]) {
                newarr[i]= newElement;
                newarr[i+1] = arr[i];

                i++;
                test = true;


            } else {
                newarr[i] = arr[i];
                i++;
            }
        }
        while(i<prevArrayLength) {
            newarr[i+1] = arr[i];
            i++;
        }
        System.out.println(Arrays.toString(newarr));

    }
}

// In above program i do not use capacity criteria. The below program is copied from geeks for geeks. It uses capacity criteria so refer to it
// for a new thinking of insertion in sorted array


//class Main {
//    // Inserts a key in arr[] of given
//    // capacity.  n is current size of arr[].
//    // This function returns n+1 if insertion
//    // is successful, else n.
//    static int insertSorted(int arr[], int n, int key, int capacity)
//    {
//        // Cannot insert more elements if n is already
//        // more than or equal to capcity
//        if (n >= capacity)
//            return n;
//
//        int i;
//        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
//            arr[i + 1] = arr[i];
//
//        arr[i + 1] = key;
//
//        return (n + 1);
//    }
//
//    /* Driver program to test above function */
//    public static void main(String[] args)
//    {
//        int arr[] = new int[20];
//        arr[0] = 12;
//        arr[1] = 16;
//        arr[2] = 20;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[5] = 70;
//        int capacity = arr.length;
//        int n = 6;
//        int key = 26;
//
//        System.out.print("\nBefore Insertion: ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//        // Inserting key
//        n = insertSorted(arr, n, key, capacity);
//
//        System.out.print("\nAfter Insertion: ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//}
//
