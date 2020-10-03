package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    static void merge(int[] mn, int[] n, int x, int y) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements enter in the big array");
        int m = sc.nextInt();
        System.out.println("Enter the length of small array");
        int n = sc.nextInt();
        int[] bigArray = new int[m+n];
        int[] smallArray = new int[n];
        System.out.println("Enter element in big array");
        for (int i = 0; i < m; i++) {
            bigArray[i] = sc.nextInt();
        }
        System.out.println("Enter element in small array");
        for(int i = 0; i < n; i++) {
            smallArray[i] = sc.nextInt();
        }
        int j =0;
        for(int i = 0; i < n; i++) {
            while(smallArray[i]>bigArray[j] && bigArray[j] !=0){
                j++;
            }
            for(int k = (m-1)+i; k >= j; k--) {
                 bigArray[k+1] = bigArray[k];
            }
            bigArray[j] = smallArray[i];
        }
        System.out.println(Arrays.toString(bigArray));

    }
}
//    Time Complexity: O(m+n)