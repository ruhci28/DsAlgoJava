package arrays;

import java.util.Arrays;
import java.util.Comparator;
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
    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });  // End of function call sort().
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
//        System.out.println(Arrays.toString(arr));
        int kthElement = 1;
        int same = 0;
        for(int i = 1; i < size; i++){
            if(arr[i] != arr[same]) {
                same = i;
                kthElement++;
            }
        }

        int[][] arrayMain = new int[kthElement][2];
        arrayMain[0][0] = arr[0];
        arrayMain[0][1] = 0;
        int j = 0;
        for(int i = 0; i < size; i++){
            if(arrayMain[j][0] != arr[i]){
                j++;
                arrayMain[j][0] = arr[i];

            }
            arrayMain[j][1] += 1;
        }
        sortbyColumn(arrayMain,1);
        for(int i = 0; i < kthElement; i++){
            System.out.println(arrayMain[i][0]+" "+ arrayMain[i][1]);
        }
    }
}
