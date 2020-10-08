package GOCC;

import java.util.Arrays;
import java.util.Scanner;

public class XORQuery {
    public static int[] adds(int[] arr, int element, int size){
        int newArr[] = new int[size+1];
        for(int i = 0; i < size;i++){
            newArr[i] = arr[i];
        }
        newArr[size] = element;
        return newArr;

    }
    public static void sort(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
                for(int j = i; j < size; j++) {
                    if(arr[j]<arr[i]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[1];
        int noOfQueries = sc.nextInt();
        while(noOfQueries>0){

            int TypeOfOperation = sc.nextInt();
            int element= sc.nextInt();
            if(TypeOfOperation == 1){
               arr =  adds(arr,element,arr.length);
            }else if (TypeOfOperation == 2) {
                for(int i =0; i < arr.length; i++){
                    arr[i] = arr[i]^element;
                }
            }
            noOfQueries--;
        }
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
