package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementByFreqUsingSorting {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr,low,high);
            quickSort(arr, low,pi-1);
            quickSort(arr,pi+1, high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,size-1);
        int[][] arrayMain = new int[size][2];
        for(int i = 0; i < size; i++){
            arrayMain[i][0] = arr[i];
            arrayMain[i][1] = 0;
        }
        for(int i = 0; i < size; i++){
            System.out.println(arrayMain[i][0]+" , "+arrayMain[i][1]);
        }
        for(int i =1; i < size; i++){
            if(arrayMain[i][0] == arrayMain[i-1][0]){
                arrayMain[i-1][1]++;
            }
        }
        for(int i = 0; i < size; i++){
            System.out.println(arrayMain[i][0]+" , "+arrayMain[i][1]);
        }

    }
}
