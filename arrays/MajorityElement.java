package arrays;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int i;
        for( i =0; i<n; i++) {
            count = 0;
            for(int j=0; j<n; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }if(count > n/2) {
                    break;
                }
            }
            if(count > n/2) {
                break;
            }
        }
        if(count > n/2) {
            System.out.println("Majority Element is : "+arr[i]);
        }else{
            System.out.println("No majority element exists.");
        }
    }
}
//    Compelxity Analysis:
//        Time Complexity: O(n*n).
//        A nested loop is needed where both the loops traverse the array from start to end, so the time complexity is O(n^2).
//        Auxiliary Space : O(1).
//        As no extra space is required for any operation so the space complexity is constant.
