package arrays;

import java.util.Scanner;
// Simple Method
public class OddNumberOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        for(i =0; i<n;i++) {
            int count =0;
            for(int j=0; j<n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(!(count%2 == 0)) {
                break;
            }
        }
        System.out.println(arr[i]);
    }
}

// Bitwise and hashing methods remainings
