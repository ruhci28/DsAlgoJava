package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
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
        System.out.println("Enter the index");
        int index = sc.nextInt();
        int prevArrayLength = arr.length;
        int newarr[] = new int[prevArrayLength+1];
        for(int i = 0; i<n; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = newElement;
        for(int i = index+1; i<=n; i++){
            newarr[i] = arr[i-1];
        }
        System.out.println("New Array is :");
        System.out.println(Arrays.toString(newarr));
    }
}
