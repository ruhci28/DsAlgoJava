package arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        boolean test = false;
        for(int i = 0; i<n; i++) {
            if(key == arr[i]){
                test = true;
                break;
            }
        }
        if(test) {
            System.out.println("Element found");
        } else {
            System.out.println("OOPS!! NO ELEMENT FOUND");
        }
    }
}
