package GOCC;
//The maximum XOR value:Given an array  of N Integers. You are given q queries.
//Each query has 2 integers x and m. For each query,
// you are required to determine the array value that provides the
// maximum bitwise XOR value with x where the array value is not more than m.
//If there is no such value that satisfies then condition, then print -1.

import java.util.Scanner;

public class MaximumXORValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements of the array : ");
        for(int i =0; i < 5;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int m = sc.nextInt();
        int max = arr[0] ^ x;
        for(int i =0; i < 5 ; i++){
            if(arr[i] < m) {
                int temp = arr[i] ^ x;
                if(temp > max){
                    max = temp;
                }
            }else{
                continue;
            }
        }
        for(int i =0; i < 5; i++){
            System.out.println(arr[i]^x);
        }
        System.out.println("maximum xor value is : "+max);
    }

}
