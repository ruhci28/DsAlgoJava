package arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        int totalSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        int missingNumber = totalSum - sum;
        System.out.println("Missing Number is : "+ missingNumber);
    }
}
//    Complexity Analysis:
//        Time Complexity: O(n).
//        Only one traversal of the array is needed.
//        Space Complexity: O(1).
//        No extra space is needed
