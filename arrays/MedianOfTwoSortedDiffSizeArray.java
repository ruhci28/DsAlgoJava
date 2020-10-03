package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedDiffSizeArray {

    static int[] mergeArray(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength) {
      int[] newArray = new int[firstArrayLength+secondArrayLength];
      int j=0,k =0,i=0;
      for( i =0; i< firstArrayLength+secondArrayLength; i++){
          if( j < firstArrayLength && k < secondArrayLength && firstArray[j]<=secondArray[k]){
              newArray[i]=firstArray[j];
              j++;
          } else if(j < firstArrayLength && k < secondArrayLength && firstArray[j]>secondArray[k]){
              newArray[i] = secondArray[k];
              k++;
          }else {
              break;
          }
      }
      if(j<firstArrayLength){
          for(int x = j; x < firstArrayLength; x++){
              newArray[i] = firstArray[x];
              i++;
          }

      }else if (k < secondArrayLength) {
          for(int x = k; x<secondArrayLength; x++) {
              newArray[i] = secondArray[x];
              i++;
          }
      }
      return newArray;
    }
    static int findMedian(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength) {
        int[] mergedArray = mergeArray(firstArray,secondArray,firstArrayLength,secondArrayLength);
        int size = mergedArray.length;
        int median = 0;
        if(size % 2 == 0){
            median = (mergedArray[size/2-1] + mergedArray[size/2])/2;
        }else {
            median = mergedArray[size/2];
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first array");
        int firstArrayLength = sc.nextInt();
        System.out.println("Enter length of the second array");
        int secondArrayLength = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[secondArrayLength];
        for(int i = 0; i < firstArrayLength; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.println("Enter second array elements");
        for(int i =0; i<secondArrayLength; i++) {
            secondArray[i] = sc.nextInt();
        }
        int median = findMedian(firstArray,secondArray,firstArrayLength,secondArrayLength);
        System.out.println("Median of two sorted array is : "+median);
    }
}
