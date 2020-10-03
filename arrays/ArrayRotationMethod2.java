package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationMethod2 {
    public static void rotateArray(int[] arr, int size, int d) {
        for(int i =0;i<d;i++){
            int temp = arr[0];
            for(int j =0; j< size-1;j++){
                arr[j]=arr[j+1];
            }
            arr[size-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
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
        rotateArray(arr,n,d);
    }

}
