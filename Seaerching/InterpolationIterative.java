package Seaerching;

import java.util.Scanner;

public class InterpolationIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int low = 0;
        int high = n-1;
        while(low<= high && x > arr[low] && x < arr[high]) {
            if (low == high)
            {
                if (arr[low] == x) {
                    System.out.println(low);
                }else {
                    break;
                }
            }
            int pos = low + ((x-arr[low])*(high-low) / (arr[high]-arr[low]));
            if(arr[pos] == x){
                System.out.println(pos);
                break;
            }else if (arr[pos] > x) {
              high = pos-1;
            }else if(arr[pos] < x) {
                low = pos + 1;
            }
        }
    }

}
