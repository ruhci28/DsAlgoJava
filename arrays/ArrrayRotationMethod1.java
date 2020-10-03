package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrrayRotationMethod1 {
    public static void rotateArray(int[] arr, int size, int d) {
        int[] temp = new int[d];
        for(int i = 0; i< d;i++){
            temp[i]=arr[i];
        }
        for(int i = 0; i < (size-d); i++){
            arr[i] = arr[i+d];
        }
        for(int i=0 ; i < d;i++) {
            arr[size-d+i] = temp[i];
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
