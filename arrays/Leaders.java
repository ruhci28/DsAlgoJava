package arrays;

import java.util.Scanner;

//An element is leader if it is greater than all the elements to its right side
// Method 1
// Time Complexity: O(n*n) of this method
//public class Leaders {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i=0; i < n-1;i++){
//            int temp = arr[i];
//            boolean test = true;
//            for(int j=i+1;j<n;j++) {
//                if(temp < arr[j]){
//                    test = false;
//                    break;
//                }
//            }
//            if(test){
//                System.out.println(temp);
//            }
//        }
//        System.out.println(arr[n-1]);
//
//    }
//}
// Method 2 (Scan from right)
// Scan all the elements from right to left in an array and keep track of maximum till now. When maximum changes its value, print it.
// Time Complexity: O(n)
public class Leaders{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[n-1];
        for(int i = n-1; i>= 0;i--) {
            if(arr[i]>=max){
                max = arr[i];
                System.out.println(max);

            }
        }
    }
}