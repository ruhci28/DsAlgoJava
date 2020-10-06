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
        System.out.println("Enter the number of test cases : ");
        int T = sc.nextInt();
        for(int i = 0; i < T; i++ ) {
            System.out.println("Enter the no. of elements in the arrays : ");
            int N = sc.nextInt();
            int arr[] = new int[N];
            System.out.println("Enter the elements of the array : ");
            for(int j =0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println("Enter the number of queries : ");
            int q = sc.nextInt();
            for(int k = 0; k < q; q++) {
                int x = sc.nextInt();
                int m = sc.nextInt();
                boolean test = true;
                int max = -2147483648;
                for(int l = 0; l < N; l++) {
                    if(arr[l] < m){
                        int temp = arr[l] ^ x;
                        if(temp > max){
                            max = temp;
                        }
                        test = false;
                    }else{
                        continue;
                    }
                }
                for(int t = 0; t < N;t++){
                    System.out.println("..."+(arr[t]^x));
                }
                if(!test){
                    System.out.println(max);
                }else{
                    System.out.println("-1");
                }

            }

        }
    }

}
