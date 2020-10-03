package Seaerching;
// Jump Search
//For example, suppose we have an array arr[] of size n and block (to be jumped) size m.
// Then we search at the indexes arr[0], arr[m], arr[2m]…..arr[km] and so on.
// Once we find the interval (arr[km] < x < arr[(k+1)m]), we perform a linear search operation from the index km to find the element x.
//In the worst case, we have to do n/m jumps and if the last checked value is greater than the element to be searched for,
// we perform m-1 comparisons more for linear search.
// Therefore the total number of comparisons in the worst case will be ((n/m) + m-1).
// The value of the function ((n/m) + m-1) will be minimum when m = √n.
// Therefore, the best step size is m = √n.


import java.util.Scanner;

public class MyJumpSearch {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = (int)Math.sqrt((double)n);

        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

         int j =0;
         int s = 0;
         int foundindex  = 0;
        while(j<n) {
           if(arr[j]>x){
               s = j - m;
               break;
           } else if(arr[j] == x){
               foundindex = j;
               break;
           }
           else {
               j += m;
           }
        }
        for(int i =s;i<j;i++) {
            if(arr[i] == x){
                foundindex = i;
                break;
            }
        }
        System.out.println("Element found at index : "+foundindex);
    }
}
//    Time Complexity : O(√n)
//     Auxiliary Space : O(1)
//Important points:
//
//        Works only sorted arrays.
//        The optimal size of a block to be jumped is (√ n). This makes the time complexity of Jump Search O(√ n).
//        The time complexity of Jump Search is between Linear Search ( ( O(n) ) and Binary Search ( O (Log n) ).
//        Binary Search is better than Jump Search, but Jump search has an advantage that we traverse back only once (Binary Search may require up to O(Log n) jumps, consider a situation where the element to be searched is the smallest element or smaller than the smallest). So in a system where binary search is costly, we use Jump Search.
