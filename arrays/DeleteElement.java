package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
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
        int deleteElement = sc.nextInt();
        int prevArrayLength = arr.length;
        int[] newarr = new int[prevArrayLength-1];
        int i = 0;
        boolean test = true;
        while(test) {
            if(arr[i] != deleteElement) {
                newarr[i] = arr[i];
                i++;
            } else {
                i++;
                test = false;
                break;
            }
        }
        while(i<prevArrayLength) {
            newarr[i-1] = arr[i];
            i++;
        }
        System.out.println("New Array");
        System.out.println(Arrays.toString(newarr));
    }
}
